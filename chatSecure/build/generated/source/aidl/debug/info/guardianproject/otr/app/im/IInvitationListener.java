/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/marcelo/dev/android/ChatSecureAndroid_ulife/chatSecure/src/main/aidl/info/guardianproject/otr/app/im/IInvitationListener.aidl
 */
package info.guardianproject.otr.app.im;
public interface IInvitationListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements info.guardianproject.otr.app.im.IInvitationListener
{
private static final java.lang.String DESCRIPTOR = "info.guardianproject.otr.app.im.IInvitationListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an info.guardianproject.otr.app.im.IInvitationListener interface,
 * generating a proxy if needed.
 */
public static info.guardianproject.otr.app.im.IInvitationListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof info.guardianproject.otr.app.im.IInvitationListener))) {
return ((info.guardianproject.otr.app.im.IInvitationListener)iin);
}
return new info.guardianproject.otr.app.im.IInvitationListener.Stub.Proxy(obj);
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
case TRANSACTION_onGroupInvitation:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.onGroupInvitation(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements info.guardianproject.otr.app.im.IInvitationListener
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
     * Called when a new invitation received.
     *
     * @param id the id of the invitation in content provider.
     */
@Override public void onGroupInvitation(long id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(id);
mRemote.transact(Stub.TRANSACTION_onGroupInvitation, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGroupInvitation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when a new invitation received.
     *
     * @param id the id of the invitation in content provider.
     */
public void onGroupInvitation(long id) throws android.os.RemoteException;
}
