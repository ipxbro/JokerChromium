// MediaPlayerHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_player.mojom
//

package org.chromium.media.mojom;


public interface MediaPlayerHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaPlayerHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaPlayerHost, MediaPlayerHost.Proxy> MANAGER = MediaPlayerHost_Internal.MANAGER;


    void onMediaPlayerAdded(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported playerRemote, int playerId);


}
