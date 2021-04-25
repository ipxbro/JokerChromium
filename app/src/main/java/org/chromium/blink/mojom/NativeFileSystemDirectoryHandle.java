// NativeFileSystemDirectoryHandle.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/native_file_system_directory_handle.mojom
//

package org.chromium.blink.mojom;


public interface NativeFileSystemDirectoryHandle extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NativeFileSystemDirectoryHandle, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NativeFileSystemDirectoryHandle, NativeFileSystemDirectoryHandle.Proxy> MANAGER = NativeFileSystemDirectoryHandle_Internal.MANAGER;


    void getPermissionStatus(
boolean writable, 
GetPermissionStatusResponse callback);

    interface GetPermissionStatusResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermission(
boolean writable, 
RequestPermissionResponse callback);

    interface RequestPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, Integer> { }



    void getFile(
String basename, boolean create, 
GetFileResponse callback);

    interface GetFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, NativeFileSystemFileHandle> { }



    void getDirectory(
String basename, boolean create, 
GetDirectoryResponse callback);

    interface GetDirectoryResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, NativeFileSystemDirectoryHandle> { }



    void getEntries(
NativeFileSystemDirectoryEntriesListener listener);



    void removeEntry(
String basename, boolean recurse, 
RemoveEntryResponse callback);

    interface RemoveEntryResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<NativeFileSystemError> { }



    void resolve(
NativeFileSystemTransferToken possibleChild, 
ResolveResponse callback);

    interface ResolveResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<NativeFileSystemError, String[]> { }



    void transfer(
org.chromium.mojo.bindings.InterfaceRequest<NativeFileSystemTransferToken> token);


}
