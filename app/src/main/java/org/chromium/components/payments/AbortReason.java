
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/payments/core/journey_logger.h

package org.chromium.components.payments;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AbortReason.ABORTED_BY_USER, AbortReason.ABORTED_BY_MERCHANT,
    AbortReason.INVALID_DATA_FROM_RENDERER, AbortReason.MOJO_CONNECTION_ERROR,
    AbortReason.MOJO_RENDERER_CLOSING, AbortReason.INSTRUMENT_DETAILS_ERROR,
    AbortReason.NO_MATCHING_PAYMENT_METHOD, AbortReason.NO_SUPPORTED_PAYMENT_METHOD,
    AbortReason.OTHER, AbortReason.USER_NAVIGATION, AbortReason.MERCHANT_NAVIGATION, AbortReason.MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface AbortReason {
  int ABORTED_BY_USER = 0;
  int ABORTED_BY_MERCHANT = 1;
  int INVALID_DATA_FROM_RENDERER = 2;
  int MOJO_CONNECTION_ERROR = 3;
  int MOJO_RENDERER_CLOSING = 4;
  int INSTRUMENT_DETAILS_ERROR = 5;
  int NO_MATCHING_PAYMENT_METHOD = 6;
  int NO_SUPPORTED_PAYMENT_METHOD = 7;
  int OTHER = 8;
  int USER_NAVIGATION = 9;
  int MERCHANT_NAVIGATION = 10;
  int MAX = 11;
}
