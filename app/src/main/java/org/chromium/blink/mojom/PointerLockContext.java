// PointerLockContext.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/pointer_lock_context.mojom
//

package org.chromium.blink.mojom;


public interface PointerLockContext extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PointerLockContext, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PointerLockContext, PointerLockContext.Proxy> MANAGER = PointerLockContext_Internal.MANAGER;


    void requestMouseLockChange(
boolean unadjustedMovement, 
RequestMouseLockChangeResponse callback);

    interface RequestMouseLockChangeResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
