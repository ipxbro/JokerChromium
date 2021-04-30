
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_tiles/tile_source.h

package org.chromium.chrome.browser.suggestions.tile;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TileSource.TOP_SITES, TileSource.SUGGESTIONS_SERVICE, TileSource.POPULAR,
    TileSource.POPULAR_BAKED_IN, TileSource.CUSTOM_LINKS, TileSource.ALLOWLIST, TileSource.HOMEPAGE,
    TileSource.EXPLORE, TileSource.REPEATABLE_QUERIES_SERVICE, TileSource.LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface TileSource {
  /**
   * Tile comes from the personal top sites list, based on local history.
   */
  int TOP_SITES = 0;
  /**
   * Tile comes from the suggestions service, based on synced history.
   */
  int SUGGESTIONS_SERVICE = 1;
  /**
   * Tile is regionally popular.
   */
  int POPULAR = 2;
  /**
   * Tile is a popular site baked into the binary.
   */
  int POPULAR_BAKED_IN = 3;
  /**
   * Tile is a custom link.
   */
  int CUSTOM_LINKS = 4;
  /**
   * Tile is on a custodian-managed allowlist.
   */
  int ALLOWLIST = 5;
  /**
   * Tile containing the user-set home page is replacing the home page button.
   */
  int HOMEPAGE = 6;
  /**
   * Tile comes from explore sites list.
   */
  int EXPLORE = 7;
  /**
   * Tile comes from the repeatable queries service, based on search history.
   */
  int REPEATABLE_QUERIES_SERVICE = 8;
  int LAST = 8;
}
