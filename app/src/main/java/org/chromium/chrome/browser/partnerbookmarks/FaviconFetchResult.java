
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/bookmarks/partner_bookmarks_reader.h

package org.chromium.chrome.browser.partnerbookmarks;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    FaviconFetchResult.DEPRECATED_SUCCESS, FaviconFetchResult.FAILURE_SERVER_ERROR,
    FaviconFetchResult.FAILURE_ICON_SERVICE_UNAVAILABLE, FaviconFetchResult.FAILURE_NOT_IN_CACHE,
    FaviconFetchResult.FAILURE_CONNECTION_ERROR, FaviconFetchResult.SUCCESS_FROM_CACHE,
    FaviconFetchResult.SUCCESS_FROM_SERVER, FaviconFetchResult.FAILURE_WRITING_FAVICON_CACHE,
    FaviconFetchResult.UMA_BOUNDARY
})
@Retention(RetentionPolicy.SOURCE)
public @interface FaviconFetchResult {
  /**
   * Successfully fetched a favicon from cache or server. Deprecated, SUCCESS_FROM_CACHE and
   * SUCCESS_FROM_SERVER should be used.
   */
  int DEPRECATED_SUCCESS = 0;
  /**
   * Received a server error fetching the favicon.
   */
  int FAILURE_SERVER_ERROR = 1;
  /**
   * The icon service was unavailable.
   */
  int FAILURE_ICON_SERVICE_UNAVAILABLE = 2;
  /**
   * There was nothing in the cache, but we opted out of retrieving from server.
   */
  int FAILURE_NOT_IN_CACHE = 3;
  /**
   * Request sent out and a connection error occurred (no valid HTTP response received).
   */
  int FAILURE_CONNECTION_ERROR = 4;
  /**
   * Success fetching the favicon from the cache without reaching out to the server.
   */
  int SUCCESS_FROM_CACHE = 5;
  /**
   * Success fetching the favicon from server.
   */
  int SUCCESS_FROM_SERVER = 6;
  /**
   * Failed to write the favicon to cache, likely from attempting to add a duplicate.
   */
  int FAILURE_WRITING_FAVICON_CACHE = 7;
  /**
   * Boundary value for UMA.
   */
  int UMA_BOUNDARY = 8;
}
