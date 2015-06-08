package com.google.cloud.genomics.grpc;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.genomics.v1.ReferenceServiceV1Grpc;
import com.google.genomics.v1.ReferenceServiceV1Grpc.ReferenceServiceV1BlockingStub;
import com.google.genomics.v1.ReferenceSet;
import com.google.genomics.v1.SearchReferenceSetsRequest;
import com.google.genomics.v1.SearchReferenceSetsResponse;
import com.google.genomics.v1.StreamVariantsRequest;
import com.google.genomics.v1.StreamVariantsResponse;
import com.google.genomics.v1.StreamingVariantServiceGrpc;
import com.google.genomics.v1.StreamingVariantServiceGrpc.StreamingVariantServiceBlockingStub;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.auth.ClientAuthInterceptor;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executors;

public class Example {
  public static void main(String[] args) throws Exception {
    String host = "genomics.googleapis.com";
    int port = 443;
    Channel channel = NettyChannelBuilder.forAddress(host, port)
        .negotiationType(NegotiationType.TLS)
        .streamWindowSize(1000000)
        .build();
    GoogleCredentials creds = GoogleCredentials.getApplicationDefault();
    creds = creds.createScoped(
        Arrays.asList("https://www.googleapis.com/auth/genomics"));
    ClientAuthInterceptor interceptor = new ClientAuthInterceptor(creds,
        Executors.newSingleThreadExecutor());
    channel = ClientInterceptors.intercept(channel, interceptor);

    // Regular RPC
    ReferenceServiceV1BlockingStub refStub =
        ReferenceServiceV1Grpc.newBlockingStub(channel);
    SearchReferenceSetsRequest request =
        SearchReferenceSetsRequest.newBuilder().build();
    SearchReferenceSetsResponse response = refStub.searchReferenceSets(request);
    for (ReferenceSet rs : response.getReferenceSetsList()) {
      System.out.println(rs.getId());
    }

    // Streaming RPC
    StreamingVariantServiceBlockingStub varStub =
        StreamingVariantServiceGrpc.newBlockingStub(channel);
    StreamVariantsRequest varRequest = StreamVariantsRequest.newBuilder()
        .setVariantSetId("10473108253681171589")
        .setReferenceName("17")
        .build();
    Iterator<StreamVariantsResponse> iter = varStub.streamVariants(varRequest);
    while (iter.hasNext()) {
      StreamVariantsResponse varResponse = iter.next();
      System.out.println("Response:");
      System.out.println(varResponse.toString());
      System.out.println();
    }
    System.out.println("Done");
  }
}
