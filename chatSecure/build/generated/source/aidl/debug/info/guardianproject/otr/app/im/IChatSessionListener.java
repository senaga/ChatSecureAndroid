/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/marcelo/dev/android/ChatSecureAndroid_ulife/chatSecure/src/main/aidl/info/guardianproject/otr/app/im/IChatSessionListener.aidl
 */
package info.guardianproject.otr.app.im;
public interface IChatSessionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements info.guardianproject.otr.app.im.IChatSessionListener
{
private static final java.lang.String DESCRIPTOR = "info.guardianproject.otr.app.im.IChatSessionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an info.guardianproject.otr.app.im.IChatSessionListener interface,
 * generating a proxy if needed.
 */
public static info.guardianproject.otr.app.im.IChatSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof info.guardianproject.otr.app.im.IChatSessionListener))) {
return ((info.guardianproject.otr.app.im.IChatSessionListener)iin);
}
return new info.guardianproject.otr.app.im.IChatSessionListener.Stub.Proxy(obj);
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
case TRANSACTION_onChatSessionCreated:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
this.onChatSessionCreated(_arg0);
return true;
}
case TRANSACTION_onChatSessionCreateError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
info.guardianproject.otr.app.im.engine.ImErrorInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onChatSessionCreateError(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements info.guardianproject.otr.app.im.IChatSessionListener
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
     * This method is called when a new ChatSession is created. A ChatSession
     * will be created either when the user called explicitly or an incoming
     * message which doesn't belong to any active sessions arrived.
     */
@Override public void onChatSessionCreated(info.guardianproject.otr.app.im.IChatSession session) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((session!=null))?(session.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onChatSessionCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when it failed to create a new ChatSession.
     *
     * @param name the name of the ChatSession failed to create. It's either the
     *      name of the contact or the group.
     * @param error detail error,
     */
@Override public void onChatSessionCreateError(java.lang.String name, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onChatSessionCreateError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onChatSessionCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onChatSessionCreateError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * This method is called when a new ChatSession is created. A ChatSession
     * will be created either when the user called explicitly or an incoming
     * message which doesn't belong to any active sessions arrived.
     */
public void onChatSessionCreated(info.guardianproject.otr.app.im.IChatSession session) throws android.os.RemoteException;
/**
     * This method is called when it failed to create a new ChatSession.
     *
     * @param name the name of the ChatSession failed to create. It's either the
     *      name of the contact or the group.
     * @param error detail error,
     */
public void onChatSessionCreateError(java.lang.String name, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException;
}
