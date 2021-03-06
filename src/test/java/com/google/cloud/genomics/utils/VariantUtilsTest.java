/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.genomics.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.api.services.genomics.model.VariantCall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class VariantUtilsTest {

  private List<String> emptyAlt = Arrays.asList();

  @Test
  public void testIsVariant() {
    // SNPs
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList("C"), (VariantCall[]) null)));

    // Insertions
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList("AC"), (VariantCall[]) null)));

    // Deletions NOTE: These are all the same mutation, just encoded in different ways.
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "CAG", Arrays.asList("C"), (VariantCall[]) null)));
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "AG", emptyAlt, (VariantCall[]) null)));
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "AG", null, (VariantCall[]) null)));

    // Multi-allelic sites
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList("C", "AC"), (VariantCall[]) null)));
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList("C", "G"), (VariantCall[]) null)));

    // Non-Variant Block Records
    assertTrue(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", emptyAlt, (VariantCall[]) null)));
    assertTrue(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", null, (VariantCall[]) null)));
    assertTrue(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList(VariantUtils.GATK_NON_VARIANT_SEGMENT_ALT), (VariantCall[]) null)));

    // A variant with a <NON_REF> alternate.
    assertFalse(VariantUtils.IS_NON_VARIANT_SEGMENT.apply(TestHelper.makeVariant("chr7", 200000,
        200001, "A", Arrays.asList("T", VariantUtils.GATK_NON_VARIANT_SEGMENT_ALT), (VariantCall[]) null)));
  }

  @Test
  public void testIsSNP() {
    assertTrue(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "A",
        Arrays.asList("C"), (VariantCall[]) null)));
    // Deletion
    assertFalse(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "CA",
        Arrays.asList("C"), (VariantCall[]) null)));
    // Insertion
    assertFalse(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "C",
        Arrays.asList("CA"), (VariantCall[]) null)));

    // SNP and Insertion
    assertFalse(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "C",
        Arrays.asList("A", "CA"), (VariantCall[]) null)));

    // Block Records
    assertFalse(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "A",
        emptyAlt, (VariantCall[]) null)));
    assertFalse(VariantUtils.IS_SNP.apply(TestHelper.makeVariant("chr7", 200000, 200001, "A", null,
        (VariantCall[]) null)));
  }
}
