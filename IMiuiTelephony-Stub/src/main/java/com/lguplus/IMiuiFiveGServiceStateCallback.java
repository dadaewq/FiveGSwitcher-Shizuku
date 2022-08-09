package com.lguplus;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IMiuiFiveGServiceStateCallback extends IInterface {
    public static final String DESCRIPTOR = "com.lguplus.IMiuiFiveGServiceStateCallback";

    void on5GAvailable(int i) throws RemoteException;

    void on5GBearerAdded(int i) throws RemoteException;

    void on5GBearerDeleted(int i) throws RemoteException;

    void on5GUnavailable(int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static class Default implements IMiuiFiveGServiceStateCallback {
        @Override // com.lguplus.IMiuiFiveGServiceStateCallback
        public void on5GAvailable(int slotId) throws RemoteException {
        }

        @Override // com.lguplus.IMiuiFiveGServiceStateCallback
        public void on5GUnavailable(int slotId) throws RemoteException {
        }

        @Override // com.lguplus.IMiuiFiveGServiceStateCallback
        public void on5GBearerAdded(int slotId) throws RemoteException {
        }

        @Override // com.lguplus.IMiuiFiveGServiceStateCallback
        public void on5GBearerDeleted(int slotId) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMiuiFiveGServiceStateCallback {
        static final int TRANSACTION_on5GAvailable = 1;
        static final int TRANSACTION_on5GBearerAdded = 3;
        static final int TRANSACTION_on5GBearerDeleted = 4;
        static final int TRANSACTION_on5GUnavailable = 2;

        public Stub() {
            attachInterface(this, IMiuiFiveGServiceStateCallback.DESCRIPTOR);
        }

        public static IMiuiFiveGServiceStateCallback asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
            if (iin != null && (iin instanceof IMiuiFiveGServiceStateCallback)) {
                return (IMiuiFiveGServiceStateCallback) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1598968902:
                    reply.writeString(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            data.enforceInterface(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                            int _arg0 = data.readInt();
                            on5GAvailable(_arg0);
                            reply.writeNoException();
                            return true;
                        case 2:
                            data.enforceInterface(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                            int _arg02 = data.readInt();
                            on5GUnavailable(_arg02);
                            reply.writeNoException();
                            return true;
                        case 3:
                            data.enforceInterface(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                            int _arg03 = data.readInt();
                            on5GBearerAdded(_arg03);
                            reply.writeNoException();
                            return true;
                        case 4:
                            data.enforceInterface(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                            int _arg04 = data.readInt();
                            on5GBearerDeleted(_arg04);
                            reply.writeNoException();
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* loaded from: classes.dex */
        public static class Proxy implements IMiuiFiveGServiceStateCallback {
            public static IMiuiFiveGServiceStateCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMiuiFiveGServiceStateCallback.DESCRIPTOR;
            }

            @Override // com.lguplus.IMiuiFiveGServiceStateCallback
            public void on5GAvailable(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(1, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().on5GAvailable(slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.lguplus.IMiuiFiveGServiceStateCallback
            public void on5GUnavailable(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(2, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().on5GUnavailable(slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.lguplus.IMiuiFiveGServiceStateCallback
            public void on5GBearerAdded(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(3, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().on5GBearerAdded(slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.lguplus.IMiuiFiveGServiceStateCallback
            public void on5GBearerDeleted(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiFiveGServiceStateCallback.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(4, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().on5GBearerDeleted(slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IMiuiFiveGServiceStateCallback impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IMiuiFiveGServiceStateCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
