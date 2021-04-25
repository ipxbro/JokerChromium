// PictureInPictureSessionObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/picture_in_picture/picture_in_picture.mojom
//

package org.chromium.blink.mojom;


public interface PictureInPictureSessionObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PictureInPictureSessionObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PictureInPictureSessionObserver, PictureInPictureSessionObserver.Proxy> MANAGER = PictureInPictureSessionObserver_Internal.MANAGER;


    void onWindowSizeChanged(
org.chromium.gfx.mojom.Size size);



    void onStopped(
);


}
