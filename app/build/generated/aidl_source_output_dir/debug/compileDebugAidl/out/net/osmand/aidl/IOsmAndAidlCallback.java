/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package net.osmand.aidl;
public interface IOsmAndAidlCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.osmand.aidl.IOsmAndAidlCallback
{
private static final java.lang.String DESCRIPTOR = "net.osmand.aidl.IOsmAndAidlCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.osmand.aidl.IOsmAndAidlCallback interface,
 * generating a proxy if needed.
 */
public static net.osmand.aidl.IOsmAndAidlCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.osmand.aidl.IOsmAndAidlCallback))) {
return ((net.osmand.aidl.IOsmAndAidlCallback)iin);
}
return new net.osmand.aidl.IOsmAndAidlCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_onSearchComplete:
{
data.enforceInterface(descriptor);
java.util.List<net.osmand.aidl.search.SearchResult> _arg0;
_arg0 = data.createTypedArrayList(net.osmand.aidl.search.SearchResult.CREATOR);
this.onSearchComplete(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onUpdate:
{
data.enforceInterface(descriptor);
this.onUpdate();
reply.writeNoException();
return true;
}
case TRANSACTION_onAppInitialized:
{
data.enforceInterface(descriptor);
this.onAppInitialized();
reply.writeNoException();
return true;
}
case TRANSACTION_onGpxBitmapCreated:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.AGpxBitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.AGpxBitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onGpxBitmapCreated(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateNavigationInfo:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.ADirectionInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.ADirectionInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updateNavigationInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onContextMenuButtonClicked:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.onContextMenuButtonClicked(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onVoiceRouterNotify:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.OnVoiceNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.OnVoiceNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onVoiceRouterNotify(_arg0);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements net.osmand.aidl.IOsmAndAidlCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     *  Callback for search requests.
     *
     *  @return resultSet - set of SearchResult
     */
@Override public void onSearchComplete(java.util.List<net.osmand.aidl.search.SearchResult> resultSet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(resultSet);
mRemote.transact(Stub.TRANSACTION_onSearchComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForUpdates() method.
     */
@Override public void onUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForOsmandInitListener() method.
     */
@Override public void onAppInitialized() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onAppInitialized, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} getBitmapForGpx() method.
     *
     *  @return bitmap - snapshot image of gpx track on map
     */
@Override public void onGpxBitmapCreated(net.osmand.aidl.gpx.AGpxBitmap bitmap) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bitmap!=null)) {
_data.writeInt(1);
bitmap.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGpxBitmapCreated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForNavigationUpdates() method.
     *
     *  @return directionInfo - update on distance to next turn and turns type.
     */
@Override public void updateNavigationInfo(net.osmand.aidl.navigation.ADirectionInfo directionInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((directionInfo!=null)) {
_data.writeInt(1);
directionInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateNavigationInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} buttons set with addContextMenuButtons() method.
     *
     *  @param buttonId - id of custom button
     *  @param pointId - id of point button associated with
     *  @param layerId - id of layer point and button associated with
     */
@Override public void onContextMenuButtonClicked(int buttonId, java.lang.String pointId, java.lang.String layerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(buttonId);
_data.writeString(pointId);
_data.writeString(layerId);
mRemote.transact(Stub.TRANSACTION_onContextMenuButtonClicked, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForVoiceRouterMessages() method.
     */
@Override public void onVoiceRouterNotify(net.osmand.aidl.navigation.OnVoiceNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onVoiceRouterNotify, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onSearchComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onAppInitialized = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onGpxBitmapCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_updateNavigationInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onContextMenuButtonClicked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onVoiceRouterNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
/**
     *  Callback for search requests.
     *
     *  @return resultSet - set of SearchResult
     */
public void onSearchComplete(java.util.List<net.osmand.aidl.search.SearchResult> resultSet) throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForUpdates() method.
     */
public void onUpdate() throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForOsmandInitListener() method.
     */
public void onAppInitialized() throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} getBitmapForGpx() method.
     *
     *  @return bitmap - snapshot image of gpx track on map
     */
public void onGpxBitmapCreated(net.osmand.aidl.gpx.AGpxBitmap bitmap) throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForNavigationUpdates() method.
     *
     *  @return directionInfo - update on distance to next turn and turns type.
     */
public void updateNavigationInfo(net.osmand.aidl.navigation.ADirectionInfo directionInfo) throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} buttons set with addContextMenuButtons() method.
     *
     *  @param buttonId - id of custom button
     *  @param pointId - id of point button associated with
     *  @param layerId - id of layer point and button associated with
     */
public void onContextMenuButtonClicked(int buttonId, java.lang.String pointId, java.lang.String layerId) throws android.os.RemoteException;
/**
     *  Callback for {@link IOsmAndAidlInterface} registerForVoiceRouterMessages() method.
     */
public void onVoiceRouterNotify(net.osmand.aidl.navigation.OnVoiceNavigationParams params) throws android.os.RemoteException;
}
