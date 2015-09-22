/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/marcelo/dev/android/ChatSecureAndroid_ulife/chatSecure/src/main/aidl/info/guardianproject/otr/app/im/ISubscriptionListener.aidl
 */
package info.guardianproject.otr.app.im;
public interface ISubscriptionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements info.guardianproject.otr.app.im.ISubscriptionListener
{
private static final java.lang.String DESCRIPTOR = "info.guardianproject.otr.app.im.ISubscriptionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an info.guardianproject.otr.app.im.ISubscriptionListener interface,
 * generating a proxy if needed.
 */
public static info.guardianproject.otr.app.im.ISubscriptionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof info.guardianproject.otr.app.im.ISubscriptionListener))) {
return ((info.guardianproject.otr.app.im.ISubscriptionListener)iin);
}
return new info.guardianproject.otr.app.im.ISubscriptionListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onSubScriptionRequest:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.engine.Contact _arg0;
if ((0!=data.readInt())) {
_arg0 = info.guardianproject.otr.app.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
this.onSubScriptionRequest(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onSubscriptionApproved:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.engine.Contact _arg0;
if ((0!=data.readInt())) {
_arg0 = info.guardianproject.otr.app.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
this.onSubscriptionApproved(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onSubscriptionDeclined:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.engine.Contact _arg0;
if ((0!=data.readInt())) {
_arg0 = info.guardianproject.otr.app.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
this.onSubscriptionDeclined(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements info.guardianproject.otr.app.im.ISubscriptionListener
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
     * Called when:
     *  <ul>
     *  <li> the request a contact has sent to client
     *  </ul>
     *
     * @see info.guardianproject.otr.app.im.engine.SubscriptionRequestListener#onSubScriptionRequest(Contact from)
     */
@Override public void onSubScriptionRequest(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((from!=null)) {
_data.writeInt(1);
from.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(providerId);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_onSubScriptionRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the request is approved by user.
     *
     * @see info.guardianproject.otr.app.im.engine.SubscriptionRequestListener#onSubscriptionApproved(String contact)
     */
@Override public void onSubscriptionApproved(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((from!=null)) {
_data.writeInt(1);
from.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(providerId);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_onSubscriptionApproved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a subscription request is declined.
     *
     * @see info.guardianproject.otr.app.im.engine.ContactListListener#onSubscriptionDeclined(String contact)
     */
@Override public void onSubscriptionDeclined(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((from!=null)) {
_data.writeInt(1);
from.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(providerId);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_onSubscriptionDeclined, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onSubScriptionRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSubscriptionApproved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSubscriptionDeclined = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Called when:
     *  <ul>
     *  <li> the request a contact has sent to client
     *  </ul>
     *
     * @see info.guardianproject.otr.app.im.engine.SubscriptionRequestListener#onSubScriptionRequest(Contact from)
     */
public void onSubScriptionRequest(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException;
/**
     * Called when the request is approved by user.
     *
     * @see info.guardianproject.otr.app.im.engine.SubscriptionRequestListener#onSubscriptionApproved(String contact)
     */
public void onSubscriptionApproved(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException;
/**
     * Called when a subscription request is declined.
     *
     * @see info.guardianproject.otr.app.im.engine.ContactListListener#onSubscriptionDeclined(String contact)
     */
public void onSubscriptionDeclined(info.guardianproject.otr.app.im.engine.Contact from, long providerId, long accountId) throws android.os.RemoteException;
}
