// ClipboardHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/clipboard/clipboard.mojom
//

package org.chromium.blink.mojom;


public interface ClipboardHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ClipboardHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ClipboardHost, ClipboardHost.Proxy> MANAGER = ClipboardHost_Internal.MANAGER;


    void getSequenceNumber(
int buffer, 
GetSequenceNumberResponse callback);

    interface GetSequenceNumberResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Long> { }



    void isFormatAvailable(
int format, int buffer, 
IsFormatAvailableResponse callback);

    interface IsFormatAvailableResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void readAvailableTypes(
int buffer, 
ReadAvailableTypesResponse callback);

    interface ReadAvailableTypesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.String16[]> { }



    void readText(
int buffer, 
ReadTextResponse callback);

    interface ReadTextResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }



    void readHtml(
int buffer, 
ReadHtmlResponse callback);

    interface ReadHtmlResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<org.chromium.mojo_base.mojom.BigString16, org.chromium.url.mojom.Url, Integer, Integer> { }



    void readSvg(
int buffer, 
ReadSvgResponse callback);

    interface ReadSvgResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }



    void readRtf(
int buffer, 
ReadRtfResponse callback);

    interface ReadRtfResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString> { }



    void readImage(
int buffer, 
ReadImageResponse callback);

    interface ReadImageResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.skia.mojom.BitmapN32> { }



    void readFiles(
int buffer, 
ReadFilesResponse callback);

    interface ReadFilesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ClipboardFiles> { }



    void readCustomData(
int buffer, org.chromium.mojo_base.mojom.String16 type, 
ReadCustomDataResponse callback);

    interface ReadCustomDataResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }



    void writeText(
org.chromium.mojo_base.mojom.BigString16 text);



    void writeHtml(
org.chromium.mojo_base.mojom.BigString16 markup, org.chromium.url.mojom.Url url);



    void writeSvg(
org.chromium.mojo_base.mojom.BigString16 markup);



    void writeSmartPasteMarker(
);



    void writeCustomData(
java.util.Map<org.chromium.mojo_base.mojom.String16, org.chromium.mojo_base.mojom.BigString16> data);



    void writeBookmark(
String url, org.chromium.mojo_base.mojom.String16 title);



    void writeImage(
org.chromium.skia.mojom.BitmapN32 image);



    void commitWrite(
);


}
