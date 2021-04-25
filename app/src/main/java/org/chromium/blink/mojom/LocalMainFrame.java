// LocalMainFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface LocalMainFrame extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends LocalMainFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalMainFrame, LocalMainFrame.Proxy> MANAGER = LocalMainFrame_Internal.MANAGER;


    void animateDoubleTapZoom(
org.chromium.gfx.mojom.Point point, org.chromium.gfx.mojom.Rect rect);



    void setScaleFactor(
float scale);



    void closePage(

ClosePageResponse callback);

    interface ClosePageResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void pluginActionAt(
org.chromium.gfx.mojom.Point location, int action);



    void setInitialFocus(
boolean reverse);



    void enablePreferredSizeChangedMode(
);



    void zoomToFindInPageRect(
org.chromium.gfx.mojom.Rect rectInRootFrame);



    void installCoopAccessMonitor(
int reportType, org.chromium.mojo_base.mojom.UnguessableToken accessedWindow, org.chromium.network.mojom.CrossOriginOpenerPolicyReporter reporter, boolean endpointDefined, String reportedWindowUrl);



    void onPortalActivated(
PortalToken portalToken, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported portal, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported portalClient, TransferableMessage data, long traceId, 
OnPortalActivatedResponse callback);

    interface OnPortalActivatedResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void forwardMessageFromHost(
TransferableMessage message, org.chromium.url.internal.mojom.Origin sourceOrigin);


}
