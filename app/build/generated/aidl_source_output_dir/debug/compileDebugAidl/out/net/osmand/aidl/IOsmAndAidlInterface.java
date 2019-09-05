/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package net.osmand.aidl;
// NOTE: Add new methods at the end of file!!!

public interface IOsmAndAidlInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.osmand.aidl.IOsmAndAidlInterface
{
private static final java.lang.String DESCRIPTOR = "net.osmand.aidl.IOsmAndAidlInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.osmand.aidl.IOsmAndAidlInterface interface,
 * generating a proxy if needed.
 */
public static net.osmand.aidl.IOsmAndAidlInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.osmand.aidl.IOsmAndAidlInterface))) {
return ((net.osmand.aidl.IOsmAndAidlInterface)iin);
}
return new net.osmand.aidl.IOsmAndAidlInterface.Stub.Proxy(obj);
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
case TRANSACTION_addMapMarker:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapmarker.AddMapMarkerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapmarker.AddMapMarkerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addMapMarker(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeMapMarker:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapmarker.RemoveMapMarkerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapmarker.RemoveMapMarkerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeMapMarker(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateMapMarker:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapmarker.UpdateMapMarkerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapmarker.UpdateMapMarkerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateMapMarker(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addMapWidget:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapwidget.AddMapWidgetParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapwidget.AddMapWidgetParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addMapWidget(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeMapWidget:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapwidget.RemoveMapWidgetParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapwidget.RemoveMapWidgetParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeMapWidget(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateMapWidget:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapwidget.UpdateMapWidgetParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapwidget.UpdateMapWidgetParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateMapWidget(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addMapPoint:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.point.AddMapPointParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.point.AddMapPointParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addMapPoint(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeMapPoint:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.point.RemoveMapPointParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.point.RemoveMapPointParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeMapPoint(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateMapPoint:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.point.UpdateMapPointParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.point.UpdateMapPointParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateMapPoint(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addMapLayer:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.AddMapLayerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.AddMapLayerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addMapLayer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeMapLayer:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.RemoveMapLayerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.RemoveMapLayerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeMapLayer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateMapLayer:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.UpdateMapLayerParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.UpdateMapLayerParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateMapLayer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_importGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.ImportGpxParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.ImportGpxParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.importGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_showGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.ShowGpxParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.ShowGpxParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.showGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hideGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.HideGpxParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.HideGpxParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.hideGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveGpx:
{
data.enforceInterface(descriptor);
java.util.List<net.osmand.aidl.gpx.ASelectedGpxFile> _arg0;
_arg0 = new java.util.ArrayList<net.osmand.aidl.gpx.ASelectedGpxFile>();
boolean _result = this.getActiveGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_setMapLocation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.map.SetMapLocationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.map.SetMapLocationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setMapLocation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_calculateRoute:
{
data.enforceInterface(descriptor);
net.osmand.aidl.calculateroute.CalculateRouteParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.calculateroute.CalculateRouteParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.calculateRoute(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_refreshMap:
{
data.enforceInterface(descriptor);
boolean _result = this.refreshMap();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addFavoriteGroup:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.group.AddFavoriteGroupParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.group.AddFavoriteGroupParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addFavoriteGroup(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeFavoriteGroup:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.group.RemoveFavoriteGroupParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.group.RemoveFavoriteGroupParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeFavoriteGroup(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateFavoriteGroup:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.group.UpdateFavoriteGroupParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.group.UpdateFavoriteGroupParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateFavoriteGroup(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addFavorite:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.AddFavoriteParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.AddFavoriteParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addFavorite(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeFavorite:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.RemoveFavoriteParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.RemoveFavoriteParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeFavorite(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateFavorite:
{
data.enforceInterface(descriptor);
net.osmand.aidl.favorite.UpdateFavoriteParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.favorite.UpdateFavoriteParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateFavorite(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startGpxRecording:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.StartGpxRecordingParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.StartGpxRecordingParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.startGpxRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopGpxRecording:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.StopGpxRecordingParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.StopGpxRecordingParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.stopGpxRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_takePhotoNote:
{
data.enforceInterface(descriptor);
net.osmand.aidl.note.TakePhotoNoteParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.note.TakePhotoNoteParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.takePhotoNote(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startVideoRecording:
{
data.enforceInterface(descriptor);
net.osmand.aidl.note.StartVideoRecordingParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.note.StartVideoRecordingParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.startVideoRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startAudioRecording:
{
data.enforceInterface(descriptor);
net.osmand.aidl.note.StartAudioRecordingParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.note.StartAudioRecordingParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.startAudioRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopRecording:
{
data.enforceInterface(descriptor);
net.osmand.aidl.note.StopRecordingParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.note.StopRecordingParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.stopRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_navigate:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.NavigateParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.NavigateParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.navigate(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_navigateGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.NavigateGpxParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.NavigateGpxParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.navigateGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.RemoveGpxParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.RemoveGpxParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_showMapPoint:
{
data.enforceInterface(descriptor);
net.osmand.aidl.maplayer.point.ShowMapPointParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.maplayer.point.ShowMapPointParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.showMapPoint(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavDrawerItems:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navdrawer.SetNavDrawerItemsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navdrawer.SetNavDrawerItemsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setNavDrawerItems(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pauseNavigation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.PauseNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.PauseNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.pauseNavigation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_resumeNavigation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.ResumeNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.ResumeNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.resumeNavigation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopNavigation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.StopNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.StopNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.stopNavigation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_muteNavigation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.MuteNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.MuteNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.muteNavigation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unmuteNavigation:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.UnmuteNavigationParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.UnmuteNavigationParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.unmuteNavigation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_search:
{
data.enforceInterface(descriptor);
net.osmand.aidl.search.SearchParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.search.SearchParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.search(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_navigateSearch:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.NavigateSearchParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.NavigateSearchParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.navigateSearch(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerForUpdates:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
long _result = this.registerForUpdates(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_unregisterFromUpdates:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
boolean _result = this.unregisterFromUpdates(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavDrawerLogo:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setNavDrawerLogo(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setEnabledIds:
{
data.enforceInterface(descriptor);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
boolean _result = this.setEnabledIds(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDisabledIds:
{
data.enforceInterface(descriptor);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
boolean _result = this.setDisabledIds(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setEnabledPatterns:
{
data.enforceInterface(descriptor);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
boolean _result = this.setEnabledPatterns(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDisabledPatterns:
{
data.enforceInterface(descriptor);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
boolean _result = this.setDisabledPatterns(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_regWidgetVisibility:
{
data.enforceInterface(descriptor);
net.osmand.aidl.customization.SetWidgetsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.customization.SetWidgetsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.regWidgetVisibility(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_regWidgetAvailability:
{
data.enforceInterface(descriptor);
net.osmand.aidl.customization.SetWidgetsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.customization.SetWidgetsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.regWidgetAvailability(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_customizeOsmandSettings:
{
data.enforceInterface(descriptor);
net.osmand.aidl.customization.OsmandSettingsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.customization.OsmandSettingsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.customizeOsmandSettings(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getImportedGpx:
{
data.enforceInterface(descriptor);
java.util.List<net.osmand.aidl.gpx.AGpxFile> _arg0;
_arg0 = new java.util.ArrayList<net.osmand.aidl.gpx.AGpxFile>();
boolean _result = this.getImportedGpx(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_getSqliteDbFiles:
{
data.enforceInterface(descriptor);
java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> _arg0;
_arg0 = new java.util.ArrayList<net.osmand.aidl.tiles.ASqliteDbFile>();
boolean _result = this.getSqliteDbFiles(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_getActiveSqliteDbFiles:
{
data.enforceInterface(descriptor);
java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> _arg0;
_arg0 = new java.util.ArrayList<net.osmand.aidl.tiles.ASqliteDbFile>();
boolean _result = this.getActiveSqliteDbFiles(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_showSqliteDbFile:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.showSqliteDbFile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hideSqliteDbFile:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.hideSqliteDbFile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavDrawerLogoWithParams:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navdrawer.NavDrawerHeaderParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navdrawer.NavDrawerHeaderParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setNavDrawerLogoWithParams(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavDrawerFooterWithParams:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navdrawer.NavDrawerFooterParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navdrawer.NavDrawerFooterParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setNavDrawerFooterWithParams(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_restoreOsmand:
{
data.enforceInterface(descriptor);
boolean _result = this.restoreOsmand();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_changePluginState:
{
data.enforceInterface(descriptor);
net.osmand.aidl.plugins.PluginParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.plugins.PluginParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.changePluginState(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerForOsmandInitListener:
{
data.enforceInterface(descriptor);
net.osmand.aidl.IOsmAndAidlCallback _arg0;
_arg0 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerForOsmandInitListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBitmapForGpx:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.CreateGpxBitmapParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.CreateGpxBitmapParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.getBitmapForGpx(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copyFile:
{
data.enforceInterface(descriptor);
net.osmand.aidl.copyfile.CopyFileParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.copyfile.CopyFileParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.copyFile(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_registerForNavigationUpdates:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.ANavigationUpdateParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.ANavigationUpdateParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
long _result = this.registerForNavigationUpdates(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_addContextMenuButtons:
{
data.enforceInterface(descriptor);
net.osmand.aidl.contextmenu.ContextMenuButtonsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.contextmenu.ContextMenuButtonsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
long _result = this.addContextMenuButtons(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_removeContextMenuButtons:
{
data.enforceInterface(descriptor);
net.osmand.aidl.contextmenu.RemoveContextMenuButtonsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.contextmenu.RemoveContextMenuButtonsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeContextMenuButtons(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateContextMenuButtons:
{
data.enforceInterface(descriptor);
net.osmand.aidl.contextmenu.UpdateContextMenuButtonsParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.contextmenu.UpdateContextMenuButtonsParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateContextMenuButtons(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_areOsmandSettingsCustomized:
{
data.enforceInterface(descriptor);
net.osmand.aidl.customization.OsmandSettingsInfoParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.customization.OsmandSettingsInfoParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.areOsmandSettingsCustomized(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCustomization:
{
data.enforceInterface(descriptor);
net.osmand.aidl.customization.CustomizationInfoParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.customization.CustomizationInfoParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setCustomization(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerForVoiceRouterMessages:
{
data.enforceInterface(descriptor);
net.osmand.aidl.navigation.ANavigationVoiceRouterMessageParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.navigation.ANavigationVoiceRouterMessageParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
net.osmand.aidl.IOsmAndAidlCallback _arg1;
_arg1 = net.osmand.aidl.IOsmAndAidlCallback.Stub.asInterface(data.readStrongBinder());
long _result = this.registerForVoiceRouterMessages(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_removeAllActiveMapMarkers:
{
data.enforceInterface(descriptor);
net.osmand.aidl.mapmarker.RemoveMapMarkersParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.mapmarker.RemoveMapMarkersParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeAllActiveMapMarkers(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getGpxColor:
{
data.enforceInterface(descriptor);
net.osmand.aidl.gpx.GpxColorParams _arg0;
if ((0!=data.readInt())) {
_arg0 = net.osmand.aidl.gpx.GpxColorParams.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.getGpxColor(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements net.osmand.aidl.IOsmAndAidlInterface
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
     * Add map marker at given location.
     *
     * @param lat (double) -  latitude.
     * @param lon (double) - longitude.
     * @param name (String)- name of marker.
     */
@Override public boolean addMapMarker(net.osmand.aidl.mapmarker.AddMapMarkerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addMapMarker, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove map marker.
     *
     * If ignoreCoordinates is false the marker is only removed if lat/lon match the currently set values of the marker.
     * If ignoreCoordinates is true the marker is removed if the name matches, the values of lat/lon are ignored.
     *
     * @param lat (double) -  latitude.
     * @param lon (double) - longitude.
     * @param name (String)- name of marker.
     * @param ignoreCoordinates (boolean) - flag to determine whether lat/lon shall be ignored
     */
@Override public boolean removeMapMarker(net.osmand.aidl.mapmarker.RemoveMapMarkerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeMapMarker, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update map marker.
     *
     * If ignoreCoordinates is false the marker gets updated only if latPrev/lonPrev match the currently set values of the marker.
     * If ignoreCoordinates is true the marker gets updated if the name matches, the values of latPrev/lonPrev are ignored.
     *
     * @param latPrev (double) - latitude (current marker).
     * @param lonPrev (double) - longitude (current marker).
     * @param namePrev (String) - name (current marker).
     * @param latNew (double) - latitude (new marker).
     * @param lonNew (double) - longitude (new marker).
     * @param nameNew (String) - name (new marker).
     * @param ignoreCoordinates (boolean) - flag to determine whether latPrev/lonPrev shall be ignored
     */
@Override public boolean updateMapMarker(net.osmand.aidl.mapmarker.UpdateMapMarkerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateMapMarker, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add map widget to the right side of the main screen.
     * Note: any specified icon should exist in OsmAnd app resources.
     *
     * @param id (String) - widget id.
     * @param menuIconName (String) - icon name (configure map menu).
     * @param menuTitle (String) - widget name (configure map menu).
     * @param lightIconName (String) - icon name for the light theme (widget).
     * @param darkIconName (String) - icon name for the dark theme (widget).
     * @param text (String) - main widget text.
     * @param description (String) - sub text, like "km/h".
     * @param order (int) - order position in the widgets list.
     * @param intentOnClick (String) - onClick intent. Called after click on widget as startActivity(Intent intent).
     */
@Override public boolean addMapWidget(net.osmand.aidl.mapwidget.AddMapWidgetParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addMapWidget, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove map widget.
     *
     * @param (String) id - widget id.
     */
@Override public boolean removeMapWidget(net.osmand.aidl.mapwidget.RemoveMapWidgetParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeMapWidget, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update map widget.
     * Note: any specified icon should exist in OsmAnd app resources.
     *
     * @param id (String) - widget id.
     * @param menuIconName (String) - icon name (configure map menu).
     * @param menuTitle (String) - widget name (configure map menu).
     * @param lightIconName (String) - icon name for the light theme (widget).
     * @param darkIconName (String) - icon name for the dark theme (widget).
     * @param text (String) - main widget text.
     * @param description (String) - sub text, like "km/h".
     * @param order (int) - order position in the widgets list.
     * @param intentOnClick (String) - onClick intent. Called after click on widget as startActivity(Intent intent).
     */
@Override public boolean updateMapWidget(net.osmand.aidl.mapwidget.UpdateMapWidgetParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateMapWidget, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    * Add point to user layer.
    *
    * @param layerId (String) - layer id. Note: layer should be added first.
    * @param pointId (String) - point id.
    * @param shortName (String) - short name (single char). Displayed on the map.
    * @param fullName (String) - full name. Displayed in the context menu on first row.
    * @param typeName (String) - type name. Displayed in context menu on second row.
    * @param color (int) - color of circle's background.
    * @param location (ALatLon) - location of the point.
    * @param details (List<String>)- list of details. Displayed under context menu.
    * @param params (Map<String, String>) - optional map of params for point.
    */
@Override public boolean addMapPoint(net.osmand.aidl.maplayer.point.AddMapPointParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addMapPoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove point.
     *
     * @param layerId (String) - layer id.
     * @param pointId (String) - point id.
     */
@Override public boolean removeMapPoint(net.osmand.aidl.maplayer.point.RemoveMapPointParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeMapPoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update point.
     *
     * @param layerId (String) - layer id.
     * @param pointId (String) - point id.
     * @param updateOpenedMenuAndMap (boolean) - flag to enable folowing mode and menu updates for point
     * @param shortName (String) - short name (single char). Displayed on the map.
     * @param fullName (String) - full name. Displayed in the context menu on first row.
     * @param typeName (String) - type name. Displayed in context menu on second row.
     * @param color (String) - color of circle's background.
     * @param location (ALatLon)- location of the point.
     * @param details (List<String>) - list of details. Displayed under context menu.
     * @param params (Map<String, String>) - optional map of params for point.
     */
@Override public boolean updateMapPoint(net.osmand.aidl.maplayer.point.UpdateMapPointParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateMapPoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add user layer on the map.
     *
     * @param id (String) - layer id.
     * @param name (String) - layer name.
     * @param zOrder (float) - z-order position of layer. Default value is 5.5f
     * @param points Map<Sting, AMapPoint> - initial list of points. Nullable.
     * @param imagePoints (boolean) - use new style for points on map or not. Also default zoom bounds for new style can be edited.
     */
@Override public boolean addMapLayer(net.osmand.aidl.maplayer.AddMapLayerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addMapLayer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove user layer.
     *
     * @param id (String) - layer id.
     */
@Override public boolean removeMapLayer(net.osmand.aidl.maplayer.RemoveMapLayerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeMapLayer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update user layer.
     *
     * @param id (String) - layer id.
     * @param name (String) - layer name.
     * @param zOrder (float) - z-order position of layer. Default value is 5.5f
     * @param points Map<Sting, AMapPoint> - list of points. Nullable.
     * @param imagePoints (boolean) - use new style for points on map or not. Also default zoom bounds for new style can be edited.
     */
@Override public boolean updateMapLayer(net.osmand.aidl.maplayer.UpdateMapLayerParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateMapLayer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Import GPX file to OsmAnd (from URI or file).
     *
     * @param gpxUri (Uri) - URI created by FileProvider (preferable method).
     * @param file (File) - File which represents GPX track (not recomended, OsmAnd should have rights to access file location).
     * @param fileName (String) - Destination file name. May contain dirs.
     * @param color (String) - color of gpx. Can be one of: "red", "orange", "lightblue", "blue", "purple",
     *                    "translucent_red", "translucent_orange", "translucent_lightblue",
     *                    "translucent_blue", "translucent_purple"
     * @param show (boolean) - show track on the map after import
     */
@Override public boolean importGpx(net.osmand.aidl.gpx.ImportGpxParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_importGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Show GPX file on map.
     *
     * @param fileName (String) - file name to show. Must be imported first.
     */
@Override public boolean showGpx(net.osmand.aidl.gpx.ShowGpxParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_showGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Hide GPX file.
     *
     * @param fileName (String) - file name to hide.
     */
@Override public boolean hideGpx(net.osmand.aidl.gpx.HideGpxParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_hideGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get list of active GPX files.
     *
     * @return list of active gpx files.
     */
@Override public boolean getActiveGpx(java.util.List<net.osmand.aidl.gpx.ASelectedGpxFile> files) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readTypedList(files, net.osmand.aidl.gpx.ASelectedGpxFile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set map view to current location.
     *
     * @param latitude (double) - latitude of new map center.
     * @param longitude (double) - longitude of new map center.
     * @param zoom (float) - map zoom level. Set 0 to keep zoom unchanged.
     * @param animated (boolean) - set true to animate changes.
     */
@Override public boolean setMapLocation(net.osmand.aidl.map.SetMapLocationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setMapLocation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean calculateRoute(net.osmand.aidl.calculateroute.CalculateRouteParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_calculateRoute, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
       * Refresh the map (UI)
       */
@Override public boolean refreshMap() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_refreshMap, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
       * Add favorite group with given params.
       *
       * @param name (String)    - group name.
       * @param color (String)  - group color. Can be one of: "red", "orange", "yellow",
       *                "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
       * @param visible (boolean) - group visibility.
       */
@Override public boolean addFavoriteGroup(net.osmand.aidl.favorite.group.AddFavoriteGroupParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addFavoriteGroup, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    	 * Update favorite group with given params.
    	 *
    	 * @param namePrev (String) - group name (current).
    	 * @param colorPrev (String) - group color (current).
    	 * @param visiblePrev (boolean) - group visibility (current).
    	 * @param nameNew (String)  - group name (new).
    	 * @param colorNew (String)  - group color (new).
    	 * @param visibleNew (boolean) - group visibility (new).
    	 */
@Override public boolean removeFavoriteGroup(net.osmand.aidl.favorite.group.RemoveFavoriteGroupParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeFavoriteGroup, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    	 * Remove favorite group with given name.
    	 *
    	 * @param name (String) - name of favorite group.
    	 */
@Override public boolean updateFavoriteGroup(net.osmand.aidl.favorite.group.UpdateFavoriteGroupParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateFavoriteGroup, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    	 * Add favorite at given location with given params.
    	 *
    	 * @param lat (double) - latitude.
    	 * @param lon (double)  - longitude.
    	 * @param name (String)  - name of favorite item.
    	 * @param description (String)  - description of favorite item.
    	 * @param category (String)  - category of favorite item.
    	 * @param color (String)  - color of favorite item. Can be one of: "red", "orange", "yellow",
    	 *                    "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
    	 * @param visible (boolean) - should favorite item be visible after creation.
    	 */
@Override public boolean addFavorite(net.osmand.aidl.favorite.AddFavoriteParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addFavorite, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    	 * Update favorite at given location with given params.
    	 *
    	 * @param latPrev (double)  - latitude (current favorite).
    	 * @param lonPrev (double) - longitude (current favorite).
    	 * @param namePrev (String) - name of favorite item (current favorite).
    	 * @param categoryPrev (String) - category of favorite item (current favorite).
    	 * @param latNew (double)  - latitude (new favorite).
    	 * @param lonNew (double)  - longitude (new favorite).
    	 * @param nameNew (String)  - name of favorite item (new favorite).
    	 * @param descriptionNew (String) - description of favorite item (new favorite).
    	 * @param categoryNew (String) - category of favorite item (new favorite). Use only to create a new category,
    	 *                       not to update an existing one. If you want to  update an existing category,
    	 *                       use the {@link #updateFavoriteGroup(String, String, boolean, String, String, boolean)} method.
    	 * @param colorNew (String) - color of new category. Can be one of: "red", "orange", "yellow",
    	 *                       "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
    	 * @param visibleNew (boolean) - should new category be visible after creation.
    	 */
@Override public boolean removeFavorite(net.osmand.aidl.favorite.RemoveFavoriteParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeFavorite, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
       * Remove favorite at given location with given params.
       *
       * @param lat (double)  - latitude.
       * @param lon (double) - longitude.
       * @param name (String) - name of favorite item.
       * @param category (String) - category of favorite item.
       */
@Override public boolean updateFavorite(net.osmand.aidl.favorite.UpdateFavoriteParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateFavorite, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Start gpx recording.
     */
@Override public boolean startGpxRecording(net.osmand.aidl.gpx.StartGpxRecordingParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startGpxRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Stop gpx recording.
     */
@Override public boolean stopGpxRecording(net.osmand.aidl.gpx.StopGpxRecordingParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopGpxRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Take photo note.
     *
     * AudioVideoNotesPlugin must be enabled for taking photo notes
     *
     * @param lat (double) - latutude of photo note.
     * @param lon (double) - longitude of photo note.
     */
@Override public boolean takePhotoNote(net.osmand.aidl.note.TakePhotoNoteParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_takePhotoNote, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Start video note recording.
     *
     * AudioVideoNotesPlugin must be enabled for taking video notes
     *
     * @param lat (double) - latutude of video note point.
     * @param lon (double) - longitude of video note point.
     */
@Override public boolean startVideoRecording(net.osmand.aidl.note.StartVideoRecordingParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startVideoRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Start audio note recording.
     *
     * AudioVideoNotesPlugin must be enabled for taking audio notes
     *
     * @param lat (double) - latutude of audio note point.
     * @param lon (double) - longitude of audio note point.
     */
@Override public boolean startAudioRecording(net.osmand.aidl.note.StartAudioRecordingParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startAudioRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Stop Audio/Video recording.
     */
@Override public boolean stopRecording(net.osmand.aidl.note.StopRecordingParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Start navigation.
     *
     * @param startName (String) - name of the start point as it displays in OsmAnd's UI. Nullable.
     * @param startLat (double) - latitude of the start point. If 0 - current location is used.
     * @param startLon (double) - longitude of the start point. If 0 - current location is used.
     * @param destName (String) - name of the start point as it displays in OsmAnd's UI.
     * @param destLat (double) - latitude of a destination point.
     * @param destLon (double) - longitude of a destination point.
     * @param profile (String)  - One of: "default", "car", "bicycle", "pedestrian", "aircraft", "boat", "hiking", "motorcycle", "truck". Nullable (default).
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
@Override public boolean navigate(net.osmand.aidl.navigation.NavigateParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_navigate, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Start navigation using gpx file. User need to grant Uri permission to OsmAnd.
     *
     * @param gpxUri (Uri) - URI created by FileProvider.
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
@Override public boolean navigateGpx(net.osmand.aidl.navigation.NavigateGpxParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_navigateGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove GPX file.
     *
     * @param fileName (String) - file name to remove;
     */
@Override public boolean removeGpx(net.osmand.aidl.gpx.RemoveGpxParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Show AMapPoint on map in OsmAnd.
     *
     * @param layerId (String) - layer id. Note: layer should be added first.
     * @param pointId (String) - point id.
     * @param shortName (String) - short name (single char). Displayed on the map.
     * @param fullName (String) - full name. Displayed in the context menu on first row.
     * @param typeName (String) - type name. Displayed in context menu on second row.
     * @param color (int) - color of circle's background.
     * @param location (ALatLon) - location of the point.
     * @param details List<String> - list of details. Displayed under context menu.
     * @param params Map<String, String> - optional map of params for point.
     */
@Override public boolean showMapPoint(net.osmand.aidl.maplayer.point.ShowMapPointParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_showMapPoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for adding up to 3 items to the OsmAnd navigation drawer.
     *
     * @param appPackage - current application package.
     * @param names - list of names for items.
     * @param uris - list of uris for intents.
     * @param iconNames - list of icon names for items.
     * @param flags - list of flags for intents. Use -1 if no flags needed.
     */
@Override public boolean setNavDrawerItems(net.osmand.aidl.navdrawer.SetNavDrawerItemsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNavDrawerItems, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Put navigation on pause.
     */
@Override public boolean pauseNavigation(net.osmand.aidl.navigation.PauseNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_pauseNavigation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Resume navigation if it was paused before.
     */
@Override public boolean resumeNavigation(net.osmand.aidl.navigation.ResumeNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_resumeNavigation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Stop navigation. Removes target / intermediate points and route path from the map.
     */
@Override public boolean stopNavigation(net.osmand.aidl.navigation.StopNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopNavigation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Mute voice guidance. Stays muted until unmute manually or via the api.
     */
@Override public boolean muteNavigation(net.osmand.aidl.navigation.MuteNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_muteNavigation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Unmute voice guidance.
     */
@Override public boolean unmuteNavigation(net.osmand.aidl.navigation.UnmuteNavigationParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unmuteNavigation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Run search for POI / Address.
     *
     * @param searchQuery (String) - search query string.
     * @param searchType (int) - type of search. Values:
     *                   SearchParams.SEARCH_TYPE_ALL - all kind of search
     *                   SearchParams.SEARCH_TYPE_POI - POIs only
     *                   SearchParams.SEARCH_TYPE_ADDRESS - addresses only
     *
     * @param latitude (double) - latitude of original search location.
     * @param longitude (double) - longitude of original search location.
     * @param radiusLevel (int) - value from 1 to 7. Default value = 1.
     * @param totalLimit (int) - limit of returned search result rows. Default value = -1 (unlimited).
     */
@Override public boolean search(net.osmand.aidl.search.SearchParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_search, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Do search and start navigation.
     *
     * @param startName (String) - name of the start point as it displays in OsmAnd's UI. Nullable.
     * @param startLat (double) - latitude of the start point. If 0 - current location is used.
     * @param startLon (double) - longitude of the start point. If 0 - current location is used.
     * @param searchQuery (String) - Text of a query for searching a destination point. Sent as URI parameter.
     * @param searchLat (double) - original location of search (latitude). Sent as URI parameter.
     * @param searchLon (double) - original location of search (longitude). Sent as URI parameter.
     * @param profile (String) - one of: "default", "car", "bicycle", "pedestrian", "aircraft", "boat", "hiking", "motorcycle", "truck". Nullable (default).
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
@Override public boolean navigateSearch(net.osmand.aidl.navigation.NavigateSearchParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_navigateSearch, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to register for periodical callbacks from OsmAnd
     *
     * @param updateTimeMS (long)- period of time in millisecond after which callback is triggered
     * @param callback (IOsmAndCallback)- create and provide instance of {@link IOsmAndAidlCallback} interface
     * @return id (long) - id of callback in OsmAnd. Needed to unsubscribe from updates.
     */
@Override public long registerForUpdates(long updateTimeMS, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(updateTimeMS);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerForUpdates, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to unregister from periodical callbacks from OsmAnd
     *
     * @param callbackId (long)- id of registered callback (provided by OsmAnd
     * in {@link OsmAndAidlHelper#registerForUpdates(long, IOsmAndAidlCallback)})
     */
@Override public boolean unregisterFromUpdates(long callbackId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(callbackId);
mRemote.transact(Stub.TRANSACTION_unregisterFromUpdates, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for adding image to the top of Osmand's NavDrawer.
     *
     * @param imageUri (String)- image's URI.toString
     *
     * @deprecated
     * Use the {@link #setNavDrawerLogoWithParams(NavDrawerHeaderParams params)} method.
     */
@Override public boolean setNavDrawerLogo(java.lang.String imageUri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(imageUri);
mRemote.transact(Stub.TRANSACTION_setNavDrawerLogo, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for selected UI elements (like QuickSearch button) to show.
     *
     * @param ids (List<String>)- list of menu items keys from {@link OsmAndCustomizationConstants}
     */
@Override public boolean setEnabledIds(java.util.List<java.lang.String> ids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(ids);
mRemote.transact(Stub.TRANSACTION_setEnabledIds, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for selected UI elements (like QuickSearch button) to hide.
     *
     * @param ids (List<String>)- list of menu items keys from {@link OsmAndCustomizationConstants}
     */
@Override public boolean setDisabledIds(java.util.List<java.lang.String> ids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(ids);
mRemote.transact(Stub.TRANSACTION_setDisabledIds, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to show selected NavDrawer's menu items.
     *
     * @param patterns (List<String>) - list of menu items names from {@link OsmAndCustomizationConstants}
     */
@Override public boolean setEnabledPatterns(java.util.List<java.lang.String> patterns) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(patterns);
mRemote.transact(Stub.TRANSACTION_setEnabledPatterns, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to hide selected NavDrawer's menu items.
     *
     * @param patterns (List<String>)- list of menu items names from {@link OsmAndCustomizationConstants}
     */
@Override public boolean setDisabledPatterns(java.util.List<java.lang.String> patterns) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(patterns);
mRemote.transact(Stub.TRANSACTION_setDisabledPatterns, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Register OsmAnd widgets for visibility.
     *
     * @param widgetKey ()- widget id.
     * @param appModKeys - list of OsmAnd Application modes widget active with. Could be "null" for all modes.
     */
@Override public boolean regWidgetVisibility(net.osmand.aidl.customization.SetWidgetsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_regWidgetVisibility, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Register OsmAnd widgets for availability.
     *
     * @param widgetKey (String) - widget id.
     * @param appModKeys (List<String>)- ist of OsmAnd Application modes widget active with. Could be "null" for all modes.
     */
@Override public boolean regWidgetAvailability(net.osmand.aidl.customization.SetWidgetsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_regWidgetAvailability, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add custom parameters for OsmAnd settings to associate with client app.
     *
     * @param sharedPreferencesName (String)- string with name of clint's app for shared preferences key
     * @param bundle (Bundle)- bundle with keys from Settings IDs {@link OsmAndCustomizationConstants} and Settings params
     */
@Override public boolean customizeOsmandSettings(net.osmand.aidl.customization.OsmandSettingsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_customizeOsmandSettings, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to get list of gpx files currently registered (imported or created) in OsmAnd;
     *
     * @return list of gpx files
     */
@Override public boolean getImportedGpx(java.util.List<net.osmand.aidl.gpx.AGpxFile> files) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getImportedGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readTypedList(files, net.osmand.aidl.gpx.AGpxFile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to get list of sqlitedb files registered in OsmAnd;
     *
     * @return list of sqlitedb files
     */
@Override public boolean getSqliteDbFiles(java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> files) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSqliteDbFiles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readTypedList(files, net.osmand.aidl.tiles.ASqliteDbFile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to get list of currently active sqlitedb files
     *
     * @return list of sqlitedb files
     */
@Override public boolean getActiveSqliteDbFiles(java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> files) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSqliteDbFiles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
_reply.readTypedList(files, net.osmand.aidl.tiles.ASqliteDbFile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to show selected sqlitedb file as map overlay.
     *
     * @param fileName (String) - name of sqlitedb file
     */
@Override public boolean showSqliteDbFile(java.lang.String fileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fileName);
mRemote.transact(Stub.TRANSACTION_showSqliteDbFile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to hide sqlitedb file from map overlay.
     *
     * @param fileName (String) - name of sqlitedb file
     */
@Override public boolean hideSqliteDbFile(java.lang.String fileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fileName);
mRemote.transact(Stub.TRANSACTION_hideSqliteDbFile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for adding image to the top of OsmAnd's NavDrawer with additional params
     *
     * @param imageUri (String) - image's URI.toString
     * @param packageName (String) - client's app package name
     * @param intent (String) - intent for additional functionality on image click
     *
     */
@Override public boolean setNavDrawerLogoWithParams(net.osmand.aidl.navdrawer.NavDrawerHeaderParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNavDrawerLogoWithParams, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method for adding functionality to "Powered by Osmand" logo in NavDrawer's footer
     * (reset OsmAnd settings to pre-clinet app's state)
     *
     * @param packageName (String) - package name
     * @param intent (String) - intent
     * @param appName (String) - client's app name
     */
@Override public boolean setNavDrawerFooterWithParams(net.osmand.aidl.navdrawer.NavDrawerFooterParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNavDrawerFooterWithParams, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Restore default (pre-client) OsmAnd settings and state:
     * clears features, widgets and settings customization, NavDraw logo.
     */
@Override public boolean restoreOsmand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_restoreOsmand, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to change state of plug-ins in OsmAnd.
     *
     * @param pluginId (String) - id (name) of plugin.
     * @param newState (int) - new state (0 - off, 1 - on).
     */
@Override public boolean changePluginState(net.osmand.aidl.plugins.PluginParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_changePluginState, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to register for callback on OsmAnd initialization
     * @param callback (IOsmAndAidlCallback) - create and provide instance of {@link IOsmAndAidlCallback} interface
     */
@Override public boolean registerForOsmandInitListener(net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerForOsmandInitListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Requests bitmap snap-shot of map with GPX file from provided URI in its center.
     * You can set bitmap size, density and GPX lines color, but you need
     * to manually download appropriate map in OsmAnd or background will be empty.
     * Bitmap will be returned through callback {@link IOsmAndAidlCallback#onGpxBitmapCreated(AGpxBitmap)}
     *
     * @param gpxUri (Uri/File) - Uri for gpx file
     * @param density (float) - image density. Recommended to use default metrics for device's display.
     * @param widthPixels (int) - width of bitmap
     * @param heightPixels (int) - height of bitmap
     * @param color (int) - color in ARGB format
     * @param callback (IOsmAndAidlCallback) - instance of callback from OsmAnd.
     */
@Override public boolean getBitmapForGpx(net.osmand.aidl.gpx.CreateGpxBitmapParams file, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((file!=null)) {
_data.writeInt(1);
file.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getBitmapForGpx, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int copyFile(net.osmand.aidl.copyfile.CopyFileParams filePart) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((filePart!=null)) {
_data.writeInt(1);
filePart.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_copyFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to register for updates during navgation. Notifies user about distance to the next turn and its type.
     *
     * @param subscribeToUpdates (boolean) - subscribe or unsubscribe from updates
     * @param callbackId (long) - id of callback, needed to unsubscribe from updates
     * @param callback (IOsmAndAidlCallback) - callback to notify user on navigation data change
     */
@Override public long registerForNavigationUpdates(net.osmand.aidl.navigation.ANavigationUpdateParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerForNavigationUpdates, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to add Context Menu buttons to OsmAnd Context menu.
     *
     * {@link ContextMenuButtonsParams } is a wrapper class for params:
     *
     * @param leftButton (AContextMenuButton) - parameters for left context button:
     * @param buttonId (String at AContextMenuButton) - id of button in View
     * @param leftTextCaption (String at AContextMenuButton) - left-side button text
     * @param rightTextCaption (String at AContextMenuButton) - right-side button text
     * @param String leftIconName (String at AContextMenuButton) - name of left-side icon
     * @param String rightIconName (String at AContextMenuButton) - name of right-side icon
     * @param boolean needColorizeIcon (booleanat AContextMenuButton) - flag to apply color to icon
     * @param boolean enabled (boolean at AContextMenuButton) - enable button flag
     *
     * @param rightButton (AContextMenuButton) - parameters for right context button, see <i>leftButton</i> param for details.
     * @param id (String) - button id;
     * @param appPackage (String) - clinet's app package name
     * @param layerId (String) - id of Osmand's map layer
     * @param callbackId (long) - {@link IOsmAndAidlCallback} id
     * @param pointsIds (List<String>) - list of point Ids to which this rules applies to.
     *
     * @param callback (IOsmAndAidlCallback) - AIDL callback;
     *
     * @return long - callback's Id;
     */
@Override public long addContextMenuButtons(net.osmand.aidl.contextmenu.ContextMenuButtonsParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addContextMenuButtons, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to remove Context Menu buttons from OsmAnd Context menu.
     *
     * {@link RemoveContextMenuButtonsParams} is a wrapper class for params:
     *
     * @param paramsId (String) - id of {@link ContextMenuButtonsParams} of button you want to remove;
     * @param callbackId (long) - id of {@ling IOsmAndAidlCallback} of button you want to remove;
     *
     */
@Override public boolean removeContextMenuButtons(net.osmand.aidl.contextmenu.RemoveContextMenuButtonsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeContextMenuButtons, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to update params on already set custom Context Button.
     *
     * {@link UpdateContextMenuButtonsParams } is a wrapper class for params:
     *
     * @param leftButton (AContextMenuButton) - parameters for left context button:
     * @param buttonId (String at AContextMenuButton) - id of button in View
     * @param leftTextCaption (String at AContextMenuButton) - left-side button text
     * @param rightTextCaption (String at AContextMenuButton) - right-side button text
     * @param String leftIconName (String at AContextMenuButton) - name of left-side icon
     * @param String rightIconName (String at AContextMenuButton) - name of right-side icon
     * @param boolean needColorizeIcon (booleanat AContextMenuButton) - flag to apply color to icon
     * @param boolean enabled (boolean at AContextMenuButton) - enable button flag
     *
     * @param rightButton (AContextMenuButton) - parameters for right context button, see <i>leftButton</i> param for details.
     * @param id (String) - button id;
     * @param appPackage (String) - clinet's app package name
     * @param layerId (String) - id of Osmand's map layer
     * @param callbackId (long) - {@link IOsmAndAidlCallback} id
     * @param pointsIds (List<String>) - list of point Ids to which this rules applies to.
     *
     */
@Override public boolean updateContextMenuButtons(net.osmand.aidl.contextmenu.UpdateContextMenuButtonsParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateContextMenuButtons, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to check if there is a customized setting in OsmAnd Settings.
     *
     * {@link OsmandSettingsInfoParams} is a wrapper class for params:
     *
     * @param sharedPreferencesName (String at OsmandSettingInfoParams) - key of setting in OsmAnd's preferences.
     *
     * @return boolean - true if setting is already set in SharedPreferences
     *
     */
@Override public boolean areOsmandSettingsCustomized(net.osmand.aidl.customization.OsmandSettingsInfoParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_areOsmandSettingsCustomized, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to customize parameters of OsmAnd.
     *
     * @param params (CustomizationInfoParams) - wrapper class for custom settings and ui.
     *
     * @param settingsParams (OsmandSettingsParams) - wrapper class for OsmAnd shared preferences params.
     * 			   See {@link #customizeOsmandSettings(in OsmandSettingsParams params) customizeOsmandSettings}
     * 			   method description for details.
     * @param navDrawerHeaderParams (NavDrawerHeaderParams) - wrapper class for OsmAnd navdrawer header params.
     * 			   See {@link #setNavDrawerLogoWithParams(in NavDrawerHeaderParams params) setNavDrawerLogoWithParams}
     * 			   method description for details.
     * @param navDrawerFooterParams (NavDrawerFooterParams) - wrapper class for OsmAnd navdrawer footer params.
     * 			   See {@link #setNavDrawerFooterWithParams(in NavDrawerFooterParams params) setNavDrawerFooterWithParams}
     * 			   method description for details.
     * @param navDrawerItemsParams (SetNavDrawerItemsParams) - wrapper class for OsmAnd navdrawer items params.
     * 			   See {@link #setNavDrawerItems(in SetNavDrawerItemsParams params) setNavDrawerItems}
     * 			   method description for details.
     * @param visibilityWidgetsParams (ArrayList<SetWidgetsParams>) - wrapper class for OsmAnd widgets visibility.
     * 			   See {@link #regWidgetVisibility(in SetWidgetsParams params) regWidgetVisibility}
     * 			   method description for details.
     * @param availabilityWidgetsParams (ArrayList<SetWidgetsParams>) - wrapper class for OsmAnd widgets availability.
     * 			   See {@link #regWidgetAvailability(in SetWidgetsParams params) regWidgetAvailability}
     * 			   method description for details.
     * @param pluginsParams (ArrayList<PluginParams>) - wrapper class for OsmAnd plugins states params.
     * 			   See {@link #changePluginState(in PluginParams params) changePluginState}
     * 			   method description for details.
     * @param featuresEnabledIds (List<String>) - list of UI elements (like QuickSearch button) to show.
     * 			   See {@link #setEnabledIds(in List<String> ids) setEnabledIds}
     * @param featuresDisabledIds (List<String>) - list of UI elements (like QuickSearch button) to hide.
     * 			   See {@link #setDisabledIds(in List<String> ids) setDisabledIds}
     * @param featuresEnabledPatterns (List<String>) - list of NavDrawer menu items to show.
     * 			   See {@link #setEnabledPatterns(in List<String> patterns) setEnabledPatterns}
     * @param featuresDisabledPatterns (List<String>) - list of NavDrawer menu items to hide.
     * 			   See {@link #setDisabledPatterns(in List<String> patterns) setDisabledPatterns}
     *
     */
@Override public boolean setCustomization(net.osmand.aidl.customization.CustomizationInfoParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCustomization, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to register for Voice Router voice messages during navigation. Notifies user about voice messages.
     *
     * @params subscribeToUpdates (boolean) - boolean flag to subscribe or unsubscribe from messages
     * @params callbackId (long) - id of callback, needed to unsubscribe from messages
     * @params callback (IOsmAndAidlCallback) - callback to notify user on voice message
     */
@Override public long registerForVoiceRouterMessages(net.osmand.aidl.navigation.ANavigationVoiceRouterMessageParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerForVoiceRouterMessages, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Removes all active map markers (marks them as passed and moves to history)
     * Empty class of params
     */
@Override public boolean removeAllActiveMapMarkers(net.osmand.aidl.mapmarker.RemoveMapMarkersParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeAllActiveMapMarkers, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Method to get color name for gpx.
     *
     * @param fileName (String) - name of gpx file.
     *
     * @param gpxColor (String) - color name of gpx. Can be one of: "red", "orange", "lightblue",
     *                                              "blue", "purple", "translucent_red", "translucent_orange",
     *                                              "translucent_lightblue", "translucent_blue", "translucent_purple"
     * Which used in {@link #importGpx(in ImportGpxParams params) importGpx}
     * Or color hex if gpx has custom color.
     *
     */
@Override public boolean getGpxColor(net.osmand.aidl.gpx.GpxColorParams params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getGpxColor, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
if ((0!=_reply.readInt())) {
params.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_addMapMarker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeMapMarker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateMapMarker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_addMapWidget = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeMapWidget = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateMapWidget = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_addMapPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeMapPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_updateMapPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_addMapLayer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_removeMapLayer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_updateMapLayer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_importGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_showGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_hideGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getActiveGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setMapLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_calculateRoute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_refreshMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_addFavoriteGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_removeFavoriteGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_updateFavoriteGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_addFavorite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_removeFavorite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_updateFavorite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_startGpxRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_stopGpxRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_takePhotoNote = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_startVideoRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_startAudioRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_stopRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_navigate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_navigateGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_removeGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_showMapPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setNavDrawerItems = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_pauseNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_resumeNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_stopNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_muteNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_unmuteNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_search = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_navigateSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_registerForUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_unregisterFromUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_setNavDrawerLogo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_setEnabledIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_setDisabledIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_setEnabledPatterns = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_setDisabledPatterns = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_regWidgetVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_regWidgetAvailability = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_customizeOsmandSettings = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_getImportedGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_getSqliteDbFiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_getActiveSqliteDbFiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_showSqliteDbFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_hideSqliteDbFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_setNavDrawerLogoWithParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_setNavDrawerFooterWithParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_restoreOsmand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_changePluginState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_registerForOsmandInitListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_getBitmapForGpx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_copyFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_registerForNavigationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_addContextMenuButtons = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_removeContextMenuButtons = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_updateContextMenuButtons = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_areOsmandSettingsCustomized = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_setCustomization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_registerForVoiceRouterMessages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_removeAllActiveMapMarkers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_getGpxColor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
}
/**
     * Add map marker at given location.
     *
     * @param lat (double) -  latitude.
     * @param lon (double) - longitude.
     * @param name (String)- name of marker.
     */
public boolean addMapMarker(net.osmand.aidl.mapmarker.AddMapMarkerParams params) throws android.os.RemoteException;
/**
     * Remove map marker.
     *
     * If ignoreCoordinates is false the marker is only removed if lat/lon match the currently set values of the marker.
     * If ignoreCoordinates is true the marker is removed if the name matches, the values of lat/lon are ignored.
     *
     * @param lat (double) -  latitude.
     * @param lon (double) - longitude.
     * @param name (String)- name of marker.
     * @param ignoreCoordinates (boolean) - flag to determine whether lat/lon shall be ignored
     */
public boolean removeMapMarker(net.osmand.aidl.mapmarker.RemoveMapMarkerParams params) throws android.os.RemoteException;
/**
     * Update map marker.
     *
     * If ignoreCoordinates is false the marker gets updated only if latPrev/lonPrev match the currently set values of the marker.
     * If ignoreCoordinates is true the marker gets updated if the name matches, the values of latPrev/lonPrev are ignored.
     *
     * @param latPrev (double) - latitude (current marker).
     * @param lonPrev (double) - longitude (current marker).
     * @param namePrev (String) - name (current marker).
     * @param latNew (double) - latitude (new marker).
     * @param lonNew (double) - longitude (new marker).
     * @param nameNew (String) - name (new marker).
     * @param ignoreCoordinates (boolean) - flag to determine whether latPrev/lonPrev shall be ignored
     */
public boolean updateMapMarker(net.osmand.aidl.mapmarker.UpdateMapMarkerParams params) throws android.os.RemoteException;
/**
     * Add map widget to the right side of the main screen.
     * Note: any specified icon should exist in OsmAnd app resources.
     *
     * @param id (String) - widget id.
     * @param menuIconName (String) - icon name (configure map menu).
     * @param menuTitle (String) - widget name (configure map menu).
     * @param lightIconName (String) - icon name for the light theme (widget).
     * @param darkIconName (String) - icon name for the dark theme (widget).
     * @param text (String) - main widget text.
     * @param description (String) - sub text, like "km/h".
     * @param order (int) - order position in the widgets list.
     * @param intentOnClick (String) - onClick intent. Called after click on widget as startActivity(Intent intent).
     */
public boolean addMapWidget(net.osmand.aidl.mapwidget.AddMapWidgetParams params) throws android.os.RemoteException;
/**
     * Remove map widget.
     *
     * @param (String) id - widget id.
     */
public boolean removeMapWidget(net.osmand.aidl.mapwidget.RemoveMapWidgetParams params) throws android.os.RemoteException;
/**
     * Update map widget.
     * Note: any specified icon should exist in OsmAnd app resources.
     *
     * @param id (String) - widget id.
     * @param menuIconName (String) - icon name (configure map menu).
     * @param menuTitle (String) - widget name (configure map menu).
     * @param lightIconName (String) - icon name for the light theme (widget).
     * @param darkIconName (String) - icon name for the dark theme (widget).
     * @param text (String) - main widget text.
     * @param description (String) - sub text, like "km/h".
     * @param order (int) - order position in the widgets list.
     * @param intentOnClick (String) - onClick intent. Called after click on widget as startActivity(Intent intent).
     */
public boolean updateMapWidget(net.osmand.aidl.mapwidget.UpdateMapWidgetParams params) throws android.os.RemoteException;
/**
    * Add point to user layer.
    *
    * @param layerId (String) - layer id. Note: layer should be added first.
    * @param pointId (String) - point id.
    * @param shortName (String) - short name (single char). Displayed on the map.
    * @param fullName (String) - full name. Displayed in the context menu on first row.
    * @param typeName (String) - type name. Displayed in context menu on second row.
    * @param color (int) - color of circle's background.
    * @param location (ALatLon) - location of the point.
    * @param details (List<String>)- list of details. Displayed under context menu.
    * @param params (Map<String, String>) - optional map of params for point.
    */
public boolean addMapPoint(net.osmand.aidl.maplayer.point.AddMapPointParams params) throws android.os.RemoteException;
/**
     * Remove point.
     *
     * @param layerId (String) - layer id.
     * @param pointId (String) - point id.
     */
public boolean removeMapPoint(net.osmand.aidl.maplayer.point.RemoveMapPointParams params) throws android.os.RemoteException;
/**
     * Update point.
     *
     * @param layerId (String) - layer id.
     * @param pointId (String) - point id.
     * @param updateOpenedMenuAndMap (boolean) - flag to enable folowing mode and menu updates for point
     * @param shortName (String) - short name (single char). Displayed on the map.
     * @param fullName (String) - full name. Displayed in the context menu on first row.
     * @param typeName (String) - type name. Displayed in context menu on second row.
     * @param color (String) - color of circle's background.
     * @param location (ALatLon)- location of the point.
     * @param details (List<String>) - list of details. Displayed under context menu.
     * @param params (Map<String, String>) - optional map of params for point.
     */
public boolean updateMapPoint(net.osmand.aidl.maplayer.point.UpdateMapPointParams params) throws android.os.RemoteException;
/**
     * Add user layer on the map.
     *
     * @param id (String) - layer id.
     * @param name (String) - layer name.
     * @param zOrder (float) - z-order position of layer. Default value is 5.5f
     * @param points Map<Sting, AMapPoint> - initial list of points. Nullable.
     * @param imagePoints (boolean) - use new style for points on map or not. Also default zoom bounds for new style can be edited.
     */
public boolean addMapLayer(net.osmand.aidl.maplayer.AddMapLayerParams params) throws android.os.RemoteException;
/**
     * Remove user layer.
     *
     * @param id (String) - layer id.
     */
public boolean removeMapLayer(net.osmand.aidl.maplayer.RemoveMapLayerParams params) throws android.os.RemoteException;
/**
     * Update user layer.
     *
     * @param id (String) - layer id.
     * @param name (String) - layer name.
     * @param zOrder (float) - z-order position of layer. Default value is 5.5f
     * @param points Map<Sting, AMapPoint> - list of points. Nullable.
     * @param imagePoints (boolean) - use new style for points on map or not. Also default zoom bounds for new style can be edited.
     */
public boolean updateMapLayer(net.osmand.aidl.maplayer.UpdateMapLayerParams params) throws android.os.RemoteException;
/**
     * Import GPX file to OsmAnd (from URI or file).
     *
     * @param gpxUri (Uri) - URI created by FileProvider (preferable method).
     * @param file (File) - File which represents GPX track (not recomended, OsmAnd should have rights to access file location).
     * @param fileName (String) - Destination file name. May contain dirs.
     * @param color (String) - color of gpx. Can be one of: "red", "orange", "lightblue", "blue", "purple",
     *                    "translucent_red", "translucent_orange", "translucent_lightblue",
     *                    "translucent_blue", "translucent_purple"
     * @param show (boolean) - show track on the map after import
     */
public boolean importGpx(net.osmand.aidl.gpx.ImportGpxParams params) throws android.os.RemoteException;
/**
     * Show GPX file on map.
     *
     * @param fileName (String) - file name to show. Must be imported first.
     */
public boolean showGpx(net.osmand.aidl.gpx.ShowGpxParams params) throws android.os.RemoteException;
/**
     * Hide GPX file.
     *
     * @param fileName (String) - file name to hide.
     */
public boolean hideGpx(net.osmand.aidl.gpx.HideGpxParams params) throws android.os.RemoteException;
/**
     * Get list of active GPX files.
     *
     * @return list of active gpx files.
     */
public boolean getActiveGpx(java.util.List<net.osmand.aidl.gpx.ASelectedGpxFile> files) throws android.os.RemoteException;
/**
     * Set map view to current location.
     *
     * @param latitude (double) - latitude of new map center.
     * @param longitude (double) - longitude of new map center.
     * @param zoom (float) - map zoom level. Set 0 to keep zoom unchanged.
     * @param animated (boolean) - set true to animate changes.
     */
public boolean setMapLocation(net.osmand.aidl.map.SetMapLocationParams params) throws android.os.RemoteException;
public boolean calculateRoute(net.osmand.aidl.calculateroute.CalculateRouteParams params) throws android.os.RemoteException;
/**
       * Refresh the map (UI)
       */
public boolean refreshMap() throws android.os.RemoteException;
/**
       * Add favorite group with given params.
       *
       * @param name (String)    - group name.
       * @param color (String)  - group color. Can be one of: "red", "orange", "yellow",
       *                "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
       * @param visible (boolean) - group visibility.
       */
public boolean addFavoriteGroup(net.osmand.aidl.favorite.group.AddFavoriteGroupParams params) throws android.os.RemoteException;
/**
    	 * Update favorite group with given params.
    	 *
    	 * @param namePrev (String) - group name (current).
    	 * @param colorPrev (String) - group color (current).
    	 * @param visiblePrev (boolean) - group visibility (current).
    	 * @param nameNew (String)  - group name (new).
    	 * @param colorNew (String)  - group color (new).
    	 * @param visibleNew (boolean) - group visibility (new).
    	 */
public boolean removeFavoriteGroup(net.osmand.aidl.favorite.group.RemoveFavoriteGroupParams params) throws android.os.RemoteException;
/**
    	 * Remove favorite group with given name.
    	 *
    	 * @param name (String) - name of favorite group.
    	 */
public boolean updateFavoriteGroup(net.osmand.aidl.favorite.group.UpdateFavoriteGroupParams params) throws android.os.RemoteException;
/**
    	 * Add favorite at given location with given params.
    	 *
    	 * @param lat (double) - latitude.
    	 * @param lon (double)  - longitude.
    	 * @param name (String)  - name of favorite item.
    	 * @param description (String)  - description of favorite item.
    	 * @param category (String)  - category of favorite item.
    	 * @param color (String)  - color of favorite item. Can be one of: "red", "orange", "yellow",
    	 *                    "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
    	 * @param visible (boolean) - should favorite item be visible after creation.
    	 */
public boolean addFavorite(net.osmand.aidl.favorite.AddFavoriteParams params) throws android.os.RemoteException;
/**
    	 * Update favorite at given location with given params.
    	 *
    	 * @param latPrev (double)  - latitude (current favorite).
    	 * @param lonPrev (double) - longitude (current favorite).
    	 * @param namePrev (String) - name of favorite item (current favorite).
    	 * @param categoryPrev (String) - category of favorite item (current favorite).
    	 * @param latNew (double)  - latitude (new favorite).
    	 * @param lonNew (double)  - longitude (new favorite).
    	 * @param nameNew (String)  - name of favorite item (new favorite).
    	 * @param descriptionNew (String) - description of favorite item (new favorite).
    	 * @param categoryNew (String) - category of favorite item (new favorite). Use only to create a new category,
    	 *                       not to update an existing one. If you want to  update an existing category,
    	 *                       use the {@link #updateFavoriteGroup(String, String, boolean, String, String, boolean)} method.
    	 * @param colorNew (String) - color of new category. Can be one of: "red", "orange", "yellow",
    	 *                       "lightgreen", "green", "lightblue", "blue", "purple", "pink", "brown".
    	 * @param visibleNew (boolean) - should new category be visible after creation.
    	 */
public boolean removeFavorite(net.osmand.aidl.favorite.RemoveFavoriteParams params) throws android.os.RemoteException;
/**
       * Remove favorite at given location with given params.
       *
       * @param lat (double)  - latitude.
       * @param lon (double) - longitude.
       * @param name (String) - name of favorite item.
       * @param category (String) - category of favorite item.
       */
public boolean updateFavorite(net.osmand.aidl.favorite.UpdateFavoriteParams params) throws android.os.RemoteException;
/**
     * Start gpx recording.
     */
public boolean startGpxRecording(net.osmand.aidl.gpx.StartGpxRecordingParams params) throws android.os.RemoteException;
/**
     * Stop gpx recording.
     */
public boolean stopGpxRecording(net.osmand.aidl.gpx.StopGpxRecordingParams params) throws android.os.RemoteException;
/**
     * Take photo note.
     *
     * AudioVideoNotesPlugin must be enabled for taking photo notes
     *
     * @param lat (double) - latutude of photo note.
     * @param lon (double) - longitude of photo note.
     */
public boolean takePhotoNote(net.osmand.aidl.note.TakePhotoNoteParams params) throws android.os.RemoteException;
/**
     * Start video note recording.
     *
     * AudioVideoNotesPlugin must be enabled for taking video notes
     *
     * @param lat (double) - latutude of video note point.
     * @param lon (double) - longitude of video note point.
     */
public boolean startVideoRecording(net.osmand.aidl.note.StartVideoRecordingParams params) throws android.os.RemoteException;
/**
     * Start audio note recording.
     *
     * AudioVideoNotesPlugin must be enabled for taking audio notes
     *
     * @param lat (double) - latutude of audio note point.
     * @param lon (double) - longitude of audio note point.
     */
public boolean startAudioRecording(net.osmand.aidl.note.StartAudioRecordingParams params) throws android.os.RemoteException;
/**
     * Stop Audio/Video recording.
     */
public boolean stopRecording(net.osmand.aidl.note.StopRecordingParams params) throws android.os.RemoteException;
/**
     * Start navigation.
     *
     * @param startName (String) - name of the start point as it displays in OsmAnd's UI. Nullable.
     * @param startLat (double) - latitude of the start point. If 0 - current location is used.
     * @param startLon (double) - longitude of the start point. If 0 - current location is used.
     * @param destName (String) - name of the start point as it displays in OsmAnd's UI.
     * @param destLat (double) - latitude of a destination point.
     * @param destLon (double) - longitude of a destination point.
     * @param profile (String)  - One of: "default", "car", "bicycle", "pedestrian", "aircraft", "boat", "hiking", "motorcycle", "truck". Nullable (default).
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
public boolean navigate(net.osmand.aidl.navigation.NavigateParams params) throws android.os.RemoteException;
/**
     * Start navigation using gpx file. User need to grant Uri permission to OsmAnd.
     *
     * @param gpxUri (Uri) - URI created by FileProvider.
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
public boolean navigateGpx(net.osmand.aidl.navigation.NavigateGpxParams params) throws android.os.RemoteException;
/**
     * Remove GPX file.
     *
     * @param fileName (String) - file name to remove;
     */
public boolean removeGpx(net.osmand.aidl.gpx.RemoveGpxParams params) throws android.os.RemoteException;
/**
     * Show AMapPoint on map in OsmAnd.
     *
     * @param layerId (String) - layer id. Note: layer should be added first.
     * @param pointId (String) - point id.
     * @param shortName (String) - short name (single char). Displayed on the map.
     * @param fullName (String) - full name. Displayed in the context menu on first row.
     * @param typeName (String) - type name. Displayed in context menu on second row.
     * @param color (int) - color of circle's background.
     * @param location (ALatLon) - location of the point.
     * @param details List<String> - list of details. Displayed under context menu.
     * @param params Map<String, String> - optional map of params for point.
     */
public boolean showMapPoint(net.osmand.aidl.maplayer.point.ShowMapPointParams params) throws android.os.RemoteException;
/**
     * Method for adding up to 3 items to the OsmAnd navigation drawer.
     *
     * @param appPackage - current application package.
     * @param names - list of names for items.
     * @param uris - list of uris for intents.
     * @param iconNames - list of icon names for items.
     * @param flags - list of flags for intents. Use -1 if no flags needed.
     */
public boolean setNavDrawerItems(net.osmand.aidl.navdrawer.SetNavDrawerItemsParams params) throws android.os.RemoteException;
/**
     * Put navigation on pause.
     */
public boolean pauseNavigation(net.osmand.aidl.navigation.PauseNavigationParams params) throws android.os.RemoteException;
/**
     * Resume navigation if it was paused before.
     */
public boolean resumeNavigation(net.osmand.aidl.navigation.ResumeNavigationParams params) throws android.os.RemoteException;
/**
     * Stop navigation. Removes target / intermediate points and route path from the map.
     */
public boolean stopNavigation(net.osmand.aidl.navigation.StopNavigationParams params) throws android.os.RemoteException;
/**
     * Mute voice guidance. Stays muted until unmute manually or via the api.
     */
public boolean muteNavigation(net.osmand.aidl.navigation.MuteNavigationParams params) throws android.os.RemoteException;
/**
     * Unmute voice guidance.
     */
public boolean unmuteNavigation(net.osmand.aidl.navigation.UnmuteNavigationParams params) throws android.os.RemoteException;
/**
     * Run search for POI / Address.
     *
     * @param searchQuery (String) - search query string.
     * @param searchType (int) - type of search. Values:
     *                   SearchParams.SEARCH_TYPE_ALL - all kind of search
     *                   SearchParams.SEARCH_TYPE_POI - POIs only
     *                   SearchParams.SEARCH_TYPE_ADDRESS - addresses only
     *
     * @param latitude (double) - latitude of original search location.
     * @param longitude (double) - longitude of original search location.
     * @param radiusLevel (int) - value from 1 to 7. Default value = 1.
     * @param totalLimit (int) - limit of returned search result rows. Default value = -1 (unlimited).
     */
public boolean search(net.osmand.aidl.search.SearchParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Do search and start navigation.
     *
     * @param startName (String) - name of the start point as it displays in OsmAnd's UI. Nullable.
     * @param startLat (double) - latitude of the start point. If 0 - current location is used.
     * @param startLon (double) - longitude of the start point. If 0 - current location is used.
     * @param searchQuery (String) - Text of a query for searching a destination point. Sent as URI parameter.
     * @param searchLat (double) - original location of search (latitude). Sent as URI parameter.
     * @param searchLon (double) - original location of search (longitude). Sent as URI parameter.
     * @param profile (String) - one of: "default", "car", "bicycle", "pedestrian", "aircraft", "boat", "hiking", "motorcycle", "truck". Nullable (default).
     * @param force (boolean) - ask to stop current navigation if any. False - ask. True - don't ask.
     */
public boolean navigateSearch(net.osmand.aidl.navigation.NavigateSearchParams params) throws android.os.RemoteException;
/**
     * Method to register for periodical callbacks from OsmAnd
     *
     * @param updateTimeMS (long)- period of time in millisecond after which callback is triggered
     * @param callback (IOsmAndCallback)- create and provide instance of {@link IOsmAndAidlCallback} interface
     * @return id (long) - id of callback in OsmAnd. Needed to unsubscribe from updates.
     */
public long registerForUpdates(long updateTimeMS, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Method to unregister from periodical callbacks from OsmAnd
     *
     * @param callbackId (long)- id of registered callback (provided by OsmAnd
     * in {@link OsmAndAidlHelper#registerForUpdates(long, IOsmAndAidlCallback)})
     */
public boolean unregisterFromUpdates(long callbackId) throws android.os.RemoteException;
/**
     * Method for adding image to the top of Osmand's NavDrawer.
     *
     * @param imageUri (String)- image's URI.toString
     *
     * @deprecated
     * Use the {@link #setNavDrawerLogoWithParams(NavDrawerHeaderParams params)} method.
     */
public boolean setNavDrawerLogo(java.lang.String imageUri) throws android.os.RemoteException;
/**
     * Method for selected UI elements (like QuickSearch button) to show.
     *
     * @param ids (List<String>)- list of menu items keys from {@link OsmAndCustomizationConstants}
     */
public boolean setEnabledIds(java.util.List<java.lang.String> ids) throws android.os.RemoteException;
/**
     * Method for selected UI elements (like QuickSearch button) to hide.
     *
     * @param ids (List<String>)- list of menu items keys from {@link OsmAndCustomizationConstants}
     */
public boolean setDisabledIds(java.util.List<java.lang.String> ids) throws android.os.RemoteException;
/**
     * Method to show selected NavDrawer's menu items.
     *
     * @param patterns (List<String>) - list of menu items names from {@link OsmAndCustomizationConstants}
     */
public boolean setEnabledPatterns(java.util.List<java.lang.String> patterns) throws android.os.RemoteException;
/**
     * Method to hide selected NavDrawer's menu items.
     *
     * @param patterns (List<String>)- list of menu items names from {@link OsmAndCustomizationConstants}
     */
public boolean setDisabledPatterns(java.util.List<java.lang.String> patterns) throws android.os.RemoteException;
/**
     * Register OsmAnd widgets for visibility.
     *
     * @param widgetKey ()- widget id.
     * @param appModKeys - list of OsmAnd Application modes widget active with. Could be "null" for all modes.
     */
public boolean regWidgetVisibility(net.osmand.aidl.customization.SetWidgetsParams params) throws android.os.RemoteException;
/**
     * Register OsmAnd widgets for availability.
     *
     * @param widgetKey (String) - widget id.
     * @param appModKeys (List<String>)- ist of OsmAnd Application modes widget active with. Could be "null" for all modes.
     */
public boolean regWidgetAvailability(net.osmand.aidl.customization.SetWidgetsParams params) throws android.os.RemoteException;
/**
     * Add custom parameters for OsmAnd settings to associate with client app.
     *
     * @param sharedPreferencesName (String)- string with name of clint's app for shared preferences key
     * @param bundle (Bundle)- bundle with keys from Settings IDs {@link OsmAndCustomizationConstants} and Settings params
     */
public boolean customizeOsmandSettings(net.osmand.aidl.customization.OsmandSettingsParams params) throws android.os.RemoteException;
/**
     * Method to get list of gpx files currently registered (imported or created) in OsmAnd;
     *
     * @return list of gpx files
     */
public boolean getImportedGpx(java.util.List<net.osmand.aidl.gpx.AGpxFile> files) throws android.os.RemoteException;
/**
     * Method to get list of sqlitedb files registered in OsmAnd;
     *
     * @return list of sqlitedb files
     */
public boolean getSqliteDbFiles(java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> files) throws android.os.RemoteException;
/**
     * Method to get list of currently active sqlitedb files
     *
     * @return list of sqlitedb files
     */
public boolean getActiveSqliteDbFiles(java.util.List<net.osmand.aidl.tiles.ASqliteDbFile> files) throws android.os.RemoteException;
/**
     * Method to show selected sqlitedb file as map overlay.
     *
     * @param fileName (String) - name of sqlitedb file
     */
public boolean showSqliteDbFile(java.lang.String fileName) throws android.os.RemoteException;
/**
     * Method to hide sqlitedb file from map overlay.
     *
     * @param fileName (String) - name of sqlitedb file
     */
public boolean hideSqliteDbFile(java.lang.String fileName) throws android.os.RemoteException;
/**
     * Method for adding image to the top of OsmAnd's NavDrawer with additional params
     *
     * @param imageUri (String) - image's URI.toString
     * @param packageName (String) - client's app package name
     * @param intent (String) - intent for additional functionality on image click
     *
     */
public boolean setNavDrawerLogoWithParams(net.osmand.aidl.navdrawer.NavDrawerHeaderParams params) throws android.os.RemoteException;
/**
     * Method for adding functionality to "Powered by Osmand" logo in NavDrawer's footer
     * (reset OsmAnd settings to pre-clinet app's state)
     *
     * @param packageName (String) - package name
     * @param intent (String) - intent
     * @param appName (String) - client's app name
     */
public boolean setNavDrawerFooterWithParams(net.osmand.aidl.navdrawer.NavDrawerFooterParams params) throws android.os.RemoteException;
/**
     * Restore default (pre-client) OsmAnd settings and state:
     * clears features, widgets and settings customization, NavDraw logo.
     */
public boolean restoreOsmand() throws android.os.RemoteException;
/**
     * Method to change state of plug-ins in OsmAnd.
     *
     * @param pluginId (String) - id (name) of plugin.
     * @param newState (int) - new state (0 - off, 1 - on).
     */
public boolean changePluginState(net.osmand.aidl.plugins.PluginParams params) throws android.os.RemoteException;
/**
     * Method to register for callback on OsmAnd initialization
     * @param callback (IOsmAndAidlCallback) - create and provide instance of {@link IOsmAndAidlCallback} interface
     */
public boolean registerForOsmandInitListener(net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Requests bitmap snap-shot of map with GPX file from provided URI in its center.
     * You can set bitmap size, density and GPX lines color, but you need
     * to manually download appropriate map in OsmAnd or background will be empty.
     * Bitmap will be returned through callback {@link IOsmAndAidlCallback#onGpxBitmapCreated(AGpxBitmap)}
     *
     * @param gpxUri (Uri/File) - Uri for gpx file
     * @param density (float) - image density. Recommended to use default metrics for device's display.
     * @param widthPixels (int) - width of bitmap
     * @param heightPixels (int) - height of bitmap
     * @param color (int) - color in ARGB format
     * @param callback (IOsmAndAidlCallback) - instance of callback from OsmAnd.
     */
public boolean getBitmapForGpx(net.osmand.aidl.gpx.CreateGpxBitmapParams file, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
public int copyFile(net.osmand.aidl.copyfile.CopyFileParams filePart) throws android.os.RemoteException;
/**
     * Method to register for updates during navgation. Notifies user about distance to the next turn and its type.
     *
     * @param subscribeToUpdates (boolean) - subscribe or unsubscribe from updates
     * @param callbackId (long) - id of callback, needed to unsubscribe from updates
     * @param callback (IOsmAndAidlCallback) - callback to notify user on navigation data change
     */
public long registerForNavigationUpdates(net.osmand.aidl.navigation.ANavigationUpdateParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Method to add Context Menu buttons to OsmAnd Context menu.
     *
     * {@link ContextMenuButtonsParams } is a wrapper class for params:
     *
     * @param leftButton (AContextMenuButton) - parameters for left context button:
     * @param buttonId (String at AContextMenuButton) - id of button in View
     * @param leftTextCaption (String at AContextMenuButton) - left-side button text
     * @param rightTextCaption (String at AContextMenuButton) - right-side button text
     * @param String leftIconName (String at AContextMenuButton) - name of left-side icon
     * @param String rightIconName (String at AContextMenuButton) - name of right-side icon
     * @param boolean needColorizeIcon (booleanat AContextMenuButton) - flag to apply color to icon
     * @param boolean enabled (boolean at AContextMenuButton) - enable button flag
     *
     * @param rightButton (AContextMenuButton) - parameters for right context button, see <i>leftButton</i> param for details.
     * @param id (String) - button id;
     * @param appPackage (String) - clinet's app package name
     * @param layerId (String) - id of Osmand's map layer
     * @param callbackId (long) - {@link IOsmAndAidlCallback} id
     * @param pointsIds (List<String>) - list of point Ids to which this rules applies to.
     *
     * @param callback (IOsmAndAidlCallback) - AIDL callback;
     *
     * @return long - callback's Id;
     */
public long addContextMenuButtons(net.osmand.aidl.contextmenu.ContextMenuButtonsParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Method to remove Context Menu buttons from OsmAnd Context menu.
     *
     * {@link RemoveContextMenuButtonsParams} is a wrapper class for params:
     *
     * @param paramsId (String) - id of {@link ContextMenuButtonsParams} of button you want to remove;
     * @param callbackId (long) - id of {@ling IOsmAndAidlCallback} of button you want to remove;
     *
     */
public boolean removeContextMenuButtons(net.osmand.aidl.contextmenu.RemoveContextMenuButtonsParams params) throws android.os.RemoteException;
/**
     * Method to update params on already set custom Context Button.
     *
     * {@link UpdateContextMenuButtonsParams } is a wrapper class for params:
     *
     * @param leftButton (AContextMenuButton) - parameters for left context button:
     * @param buttonId (String at AContextMenuButton) - id of button in View
     * @param leftTextCaption (String at AContextMenuButton) - left-side button text
     * @param rightTextCaption (String at AContextMenuButton) - right-side button text
     * @param String leftIconName (String at AContextMenuButton) - name of left-side icon
     * @param String rightIconName (String at AContextMenuButton) - name of right-side icon
     * @param boolean needColorizeIcon (booleanat AContextMenuButton) - flag to apply color to icon
     * @param boolean enabled (boolean at AContextMenuButton) - enable button flag
     *
     * @param rightButton (AContextMenuButton) - parameters for right context button, see <i>leftButton</i> param for details.
     * @param id (String) - button id;
     * @param appPackage (String) - clinet's app package name
     * @param layerId (String) - id of Osmand's map layer
     * @param callbackId (long) - {@link IOsmAndAidlCallback} id
     * @param pointsIds (List<String>) - list of point Ids to which this rules applies to.
     *
     */
public boolean updateContextMenuButtons(net.osmand.aidl.contextmenu.UpdateContextMenuButtonsParams params) throws android.os.RemoteException;
/**
     * Method to check if there is a customized setting in OsmAnd Settings.
     *
     * {@link OsmandSettingsInfoParams} is a wrapper class for params:
     *
     * @param sharedPreferencesName (String at OsmandSettingInfoParams) - key of setting in OsmAnd's preferences.
     *
     * @return boolean - true if setting is already set in SharedPreferences
     *
     */
public boolean areOsmandSettingsCustomized(net.osmand.aidl.customization.OsmandSettingsInfoParams params) throws android.os.RemoteException;
/**
     * Method to customize parameters of OsmAnd.
     *
     * @param params (CustomizationInfoParams) - wrapper class for custom settings and ui.
     *
     * @param settingsParams (OsmandSettingsParams) - wrapper class for OsmAnd shared preferences params.
     * 			   See {@link #customizeOsmandSettings(in OsmandSettingsParams params) customizeOsmandSettings}
     * 			   method description for details.
     * @param navDrawerHeaderParams (NavDrawerHeaderParams) - wrapper class for OsmAnd navdrawer header params.
     * 			   See {@link #setNavDrawerLogoWithParams(in NavDrawerHeaderParams params) setNavDrawerLogoWithParams}
     * 			   method description for details.
     * @param navDrawerFooterParams (NavDrawerFooterParams) - wrapper class for OsmAnd navdrawer footer params.
     * 			   See {@link #setNavDrawerFooterWithParams(in NavDrawerFooterParams params) setNavDrawerFooterWithParams}
     * 			   method description for details.
     * @param navDrawerItemsParams (SetNavDrawerItemsParams) - wrapper class for OsmAnd navdrawer items params.
     * 			   See {@link #setNavDrawerItems(in SetNavDrawerItemsParams params) setNavDrawerItems}
     * 			   method description for details.
     * @param visibilityWidgetsParams (ArrayList<SetWidgetsParams>) - wrapper class for OsmAnd widgets visibility.
     * 			   See {@link #regWidgetVisibility(in SetWidgetsParams params) regWidgetVisibility}
     * 			   method description for details.
     * @param availabilityWidgetsParams (ArrayList<SetWidgetsParams>) - wrapper class for OsmAnd widgets availability.
     * 			   See {@link #regWidgetAvailability(in SetWidgetsParams params) regWidgetAvailability}
     * 			   method description for details.
     * @param pluginsParams (ArrayList<PluginParams>) - wrapper class for OsmAnd plugins states params.
     * 			   See {@link #changePluginState(in PluginParams params) changePluginState}
     * 			   method description for details.
     * @param featuresEnabledIds (List<String>) - list of UI elements (like QuickSearch button) to show.
     * 			   See {@link #setEnabledIds(in List<String> ids) setEnabledIds}
     * @param featuresDisabledIds (List<String>) - list of UI elements (like QuickSearch button) to hide.
     * 			   See {@link #setDisabledIds(in List<String> ids) setDisabledIds}
     * @param featuresEnabledPatterns (List<String>) - list of NavDrawer menu items to show.
     * 			   See {@link #setEnabledPatterns(in List<String> patterns) setEnabledPatterns}
     * @param featuresDisabledPatterns (List<String>) - list of NavDrawer menu items to hide.
     * 			   See {@link #setDisabledPatterns(in List<String> patterns) setDisabledPatterns}
     *
     */
public boolean setCustomization(net.osmand.aidl.customization.CustomizationInfoParams params) throws android.os.RemoteException;
/**
     * Method to register for Voice Router voice messages during navigation. Notifies user about voice messages.
     *
     * @params subscribeToUpdates (boolean) - boolean flag to subscribe or unsubscribe from messages
     * @params callbackId (long) - id of callback, needed to unsubscribe from messages
     * @params callback (IOsmAndAidlCallback) - callback to notify user on voice message
     */
public long registerForVoiceRouterMessages(net.osmand.aidl.navigation.ANavigationVoiceRouterMessageParams params, net.osmand.aidl.IOsmAndAidlCallback callback) throws android.os.RemoteException;
/**
     * Removes all active map markers (marks them as passed and moves to history)
     * Empty class of params
     */
public boolean removeAllActiveMapMarkers(net.osmand.aidl.mapmarker.RemoveMapMarkersParams params) throws android.os.RemoteException;
/**
     * Method to get color name for gpx.
     *
     * @param fileName (String) - name of gpx file.
     *
     * @param gpxColor (String) - color name of gpx. Can be one of: "red", "orange", "lightblue",
     *                                              "blue", "purple", "translucent_red", "translucent_orange",
     *                                              "translucent_lightblue", "translucent_blue", "translucent_purple"
     * Which used in {@link #importGpx(in ImportGpxParams params) importGpx}
     * Or color hex if gpx has custom color.
     *
     */
public boolean getGpxColor(net.osmand.aidl.gpx.GpxColorParams params) throws android.os.RemoteException;
}
