
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/contextualsearch/resolved_search_term.h

package org.chromium.chrome.browser.contextualsearch;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    QuickActionCategory.NONE, QuickActionCategory.ADDRESS, QuickActionCategory.EMAIL,
    QuickActionCategory.EVENT, QuickActionCategory.PHONE, QuickActionCategory.WEBSITE,
    QuickActionCategory.BOUNDARY
})
@Retention(RetentionPolicy.SOURCE)
public @interface QuickActionCategory {
  int NONE = 0;
  int ADDRESS = 1;
  int EMAIL = 2;
  int EVENT = 3;
  int PHONE = 4;
  int WEBSITE = 5;
  int BOUNDARY = 6;
}
