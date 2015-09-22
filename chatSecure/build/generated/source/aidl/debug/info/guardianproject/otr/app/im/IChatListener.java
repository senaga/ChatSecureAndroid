/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/marcelo/dev/android/ChatSecureAndroid_ulife/chatSecure/src/main/aidl/info/guardianproject/otr/app/im/IChatListener.aidl
 */
package info.guardianproject.otr.app.im;
public interface IChatListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements info.guardianproject.otr.app.im.IChatListener
{
private static final java.lang.String DESCRIPTOR = "info.guardianproject.otr.app.im.IChatListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an info.guardianproject.otr.app.im.IChatListener interface,
 * generating a proxy if needed.
 */
public static info.guardianproject.otr.app.im.IChatListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof info.guardianproject.otr.app.im.IChatListener))) {
return ((info.guardianproject.otr.app.im.IChatListener)iin);
}
return new info.guardianproject.otr.app.im.IChatListener.Stub.Proxy(obj);
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
case TRANSACTION_onIncomingMessage:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
info.guardianproject.otr.app.im.engine.Message _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.Message.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.onIncomingMessage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_onIncomingData:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
byte[] _arg1;
_arg1 = data.createByteArray();
this.onIncomingData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onSendMessageError:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
info.guardianproject.otr.app.im.engine.Message _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.Message.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
info.guardianproject.otr.app.im.engine.ImErrorInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = info.guardianproject.otr.app.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onSendMessageError(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onConvertedToGroupChat:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
this.onConvertedToGroupChat(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onContactJoined:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
info.guardianproject.otr.app.im.engine.Contact _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onContactJoined(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onContactLeft:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
info.guardianproject.otr.app.im.engine.Contact _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onContactLeft(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onInviteError:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
info.guardianproject.otr.app.im.engine.ImErrorInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = info.guardianproject.otr.app.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onInviteError(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onIncomingReceipt:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
this.onIncomingReceipt(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
info.guardianproject.otr.app.im.IChatSession _arg0;
_arg0 = info.guardianproject.otr.app.im.IChatSession.Stub.asInterface(data.readStrongBinder());
this.onStatusChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onIncomingFileTransfer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.onIncomingFileTransfer(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onIncomingFileTransferProgress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onIncomingFileTransferProgress(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onIncomingFileTransferError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.onIncomingFileTransferError(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements info.guardianproject.otr.app.im.IChatListener
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
     * This method is called when a new message of the ChatSession has arrived.
     *
     * response indicates whether the user is focused on this message stream or not (for notifications)
     */
@Override public boolean onIncomingMessage(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Message msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onIncomingMessage, _data, _reply, 0);
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
     * This method is called when a new message of the ChatSession has arrived.
     */
@Override public void onIncomingData(info.guardianproject.otr.app.im.IChatSession ses, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_onIncomingData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when an error is found to send a message in the ChatSession.
     */
@Override public void onSendMessageError(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Message msg, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onSendMessageError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when the chat is converted to a group chat.
     */
@Override public void onConvertedToGroupChat(info.guardianproject.otr.app.im.IChatSession ses) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onConvertedToGroupChat, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when a new contact has joined into this ChatSession.
     */
@Override public void onContactJoined(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactJoined, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when a contact in this ChatSession has left.
     */
@Override public void onContactLeft(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactLeft, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when an error is found to invite a contact to join
     * this ChatSession.
     */
@Override public void onInviteError(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onInviteError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * This method is called when a new receipt has arrived.
     */
@Override public void onIncomingReceipt(info.guardianproject.otr.app.im.IChatSession ses, java.lang.String packetId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
_data.writeString(packetId);
mRemote.transact(Stub.TRANSACTION_onIncomingReceipt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** This method is called when OTR status changes */
@Override public void onStatusChanged(info.guardianproject.otr.app.im.IChatSession ses) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onStatusChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** this is called when there is a incoming file transfer request */
@Override public void onIncomingFileTransfer(java.lang.String from, java.lang.String file) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(from);
_data.writeString(file);
mRemote.transact(Stub.TRANSACTION_onIncomingFileTransfer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** this is called when there is a incoming file transfer request */
@Override public void onIncomingFileTransferProgress(java.lang.String file, int percent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(file);
_data.writeInt(percent);
mRemote.transact(Stub.TRANSACTION_onIncomingFileTransferProgress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** this is called when there is a incoming file transfer request */
@Override public void onIncomingFileTransferError(java.lang.String file, java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(file);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_onIncomingFileTransferError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onIncomingMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onIncomingData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSendMessageError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onConvertedToGroupChat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onContactJoined = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onContactLeft = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onInviteError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onIncomingReceipt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onIncomingFileTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onIncomingFileTransferProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onIncomingFileTransferError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
/**
     * This method is called when a new message of the ChatSession has arrived.
     *
     * response indicates whether the user is focused on this message stream or not (for notifications)
     */
public boolean onIncomingMessage(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Message msg) throws android.os.RemoteException;
/**
     * This method is called when a new message of the ChatSession has arrived.
     */
public void onIncomingData(info.guardianproject.otr.app.im.IChatSession ses, byte[] data) throws android.os.RemoteException;
/**
     * This method is called when an error is found to send a message in the ChatSession.
     */
public void onSendMessageError(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Message msg, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException;
/**
     * This method is called when the chat is converted to a group chat.
     */
public void onConvertedToGroupChat(info.guardianproject.otr.app.im.IChatSession ses) throws android.os.RemoteException;
/**
     * This method is called when a new contact has joined into this ChatSession.
     */
public void onContactJoined(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Contact contact) throws android.os.RemoteException;
/**
     * This method is called when a contact in this ChatSession has left.
     */
public void onContactLeft(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.Contact contact) throws android.os.RemoteException;
/**
     * This method is called when an error is found to invite a contact to join
     * this ChatSession.
     */
public void onInviteError(info.guardianproject.otr.app.im.IChatSession ses, info.guardianproject.otr.app.im.engine.ImErrorInfo error) throws android.os.RemoteException;
/**
     * This method is called when a new receipt has arrived.
     */
public void onIncomingReceipt(info.guardianproject.otr.app.im.IChatSession ses, java.lang.String packetId) throws android.os.RemoteException;
/** This method is called when OTR status changes */
public void onStatusChanged(info.guardianproject.otr.app.im.IChatSession ses) throws android.os.RemoteException;
/** this is called when there is a incoming file transfer request */
public void onIncomingFileTransfer(java.lang.String from, java.lang.String file) throws android.os.RemoteException;
/** this is called when there is a incoming file transfer request */
public void onIncomingFileTransferProgress(java.lang.String file, int percent) throws android.os.RemoteException;
/** this is called when there is a incoming file transfer request */
public void onIncomingFileTransferError(java.lang.String file, java.lang.String message) throws android.os.RemoteException;
}
