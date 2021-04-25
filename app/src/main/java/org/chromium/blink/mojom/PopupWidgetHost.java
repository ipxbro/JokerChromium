// PopupWidgetHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/widget.mojom
//

package org.chromium.blink.mojom;


public interface PopupWidgetHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PopupWidgetHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PopupWidgetHost, PopupWidgetHost.Proxy> MANAGER = PopupWidgetHost_Internal.MANAGER;


    void requestClosePopup(
);



    void showPopup(
org.chromium.gfx.mojom.Rect initialRect, 
ShowPopupResponse callback);

    interface ShowPopupResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setPopupBounds(
org.chromium.gfx.mojom.Rect bounds, 
SetPopupBoundsResponse callback);

    interface SetPopupBoundsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
