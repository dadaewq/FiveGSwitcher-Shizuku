package miui.telephony;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;

import com.lguplus.IMiuiFiveGServiceStateCallback;

import java.util.List;

/* loaded from: classes.dex */
public interface IMiuiTelephony extends IInterface {
    public static final String DESCRIPTOR = "miui.telephony.IMiuiTelephony";

    int get5GIndicatorStatus(int i) throws RemoteException;

    Bundle getCellLocationForSlot(int i, String str) throws RemoteException;

    long getCotaOpconfigVersionCode() throws RemoteException;

    String getCotaOpconfigVersionName() throws RemoteException;

    String getDeviceId(String str) throws RemoteException;

    List<String> getDeviceIdList(String str) throws RemoteException;

    int getEsimGPIOState() throws RemoteException;

    String getImei(int i, String str) throws RemoteException;

    List<String> getImeiList(String str) throws RemoteException;

    String getMeid(int i, String str) throws RemoteException;

    List<String> getMeidList(String str) throws RemoteException;

    String getMobileNetworkCapability(int i) throws RemoteException;

    int getNrConfigType(int i) throws RemoteException;

    String getProductEid() throws RemoteException;

    int getRestrictDcnrStatus(int i) throws RemoteException;

    String getSmallDeviceId(String str) throws RemoteException;

    String getSpn(String str, int i, String str2, boolean z) throws RemoteException;

    int getSystemDefaultSlotId() throws RemoteException;

    int getUiccSlotForCardId(String str) throws RemoteException;

    int getUpperlayerStatus(int i) throws RemoteException;

    int getXMNetworkType(int i) throws RemoteException;

    boolean isCotaOpconfigUsed() throws RemoteException;

    boolean isDualNrEnabled() throws RemoteException;

    boolean isDualSaEnabled() throws RemoteException;

    boolean isEsimActive() throws RemoteException;

    boolean isFiveGCapable() throws RemoteException;

    boolean isGameFiveGOptimizeSupported() throws RemoteException;

    boolean isGwsdSupport() throws RemoteException;

    boolean isIccCardActivate(int i) throws RemoteException;

    boolean isImsRegistered(int i) throws RemoteException;

    boolean isNrCAEnabled(int i) throws RemoteException;

    boolean isSameOperator(String str, String str2) throws RemoteException;

    boolean isSupportEsimForCountry(String str) throws RemoteException;

    boolean isUserFiveGEnabled(int i) throws RemoteException;

    @Deprecated
    boolean isUserFiveGEnabled() throws RemoteException;

    boolean isUserFiveGSaEnabled(int i) throws RemoteException;

    boolean isVideoTelephonyAvailable(int i) throws RemoteException;

    boolean isVoNREnabled(int i) throws RemoteException;

    boolean isVoNRSupported() throws RemoteException;

    boolean isVolteEnabledByPlatform() throws RemoteException;

    boolean isVolteEnabledByPlatformForSlot(int i) throws RemoteException;

    boolean isVolteEnabledByUser() throws RemoteException;

    boolean isVolteEnabledByUserForSlot(int i) throws RemoteException;

    boolean isVtEnabledByPlatform() throws RemoteException;

    boolean isVtEnabledByPlatformForSlot(int i) throws RemoteException;

    boolean isWifiCallingAvailable(int i) throws RemoteException;

    String onOperatorNumericOrNameSet(int i, String str, String str2) throws RemoteException;

    void registerFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback iMiuiFiveGServiceStateCallback, int i) throws RemoteException;

    void setCallForwardingOption(int i, int i2, int i3, String str, ResultReceiver resultReceiver) throws RemoteException;

    boolean setCotaOpconfigUsed(boolean z) throws RemoteException;

    boolean setDefaultDataSlotId(int i, String str) throws RemoteException;

    void setDefaultVoiceSlotId(int i, String str) throws RemoteException;

    void setDualSaEnabled(boolean z) throws RemoteException;

    int setEsimState(int i) throws RemoteException;

    void setIccCardActivate(int i, boolean z) throws RemoteException;

    void setMobileNetworkCapability(String str) throws RemoteException;

    void setUserFiveGEnabled(boolean z, int i) throws RemoteException;

    void setUserFiveGSaEnabled(boolean z, int i) throws RemoteException;

    @Deprecated
    void setUserFiveGEnabled(boolean z) throws RemoteException;

    void setUserNrCAEnabled(int i, int i2) throws RemoteException;

    void setUserVoNREnabled(int i, boolean z) throws RemoteException;

    void unRegisterFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback iMiuiFiveGServiceStateCallback, int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static class Default implements IMiuiTelephony {
        @Override // miui.telephony.IMiuiTelephony
        public void setDefaultVoiceSlotId(int slotId, String opPackageName) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean setDefaultDataSlotId(int slotId, String opPackageName) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isImsRegistered(int phoneId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVideoTelephonyAvailable(int phoneId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isWifiCallingAvailable(int phoneId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVolteEnabledByUser() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVolteEnabledByUserForSlot(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVtEnabledByPlatform() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVtEnabledByPlatformForSlot(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVolteEnabledByPlatform() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVolteEnabledByPlatformForSlot(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getSystemDefaultSlotId() throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isGwsdSupport() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isIccCardActivate(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setIccCardActivate(int slotId, boolean isActivate) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public List<String> getDeviceIdList(String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public List<String> getImeiList(String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public List<String> getMeidList(String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getDeviceId(String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getImei(int slotId, String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getMeid(int slotId, String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getSmallDeviceId(String callingPackage) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isSameOperator(String numeric, String anotherNumeric) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getSpn(String numeric, int slotId, String spn, boolean longName) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String onOperatorNumericOrNameSet(int slotId, String property, String value) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public Bundle getCellLocationForSlot(int slotId, String callingPkg) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setCallForwardingOption(int phoneId, int action, int reason, String number, ResultReceiver callback) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setUserFiveGEnabled(boolean enabled, int slotId) throws RemoteException {
        }

        @Deprecated
        @Override // miui.telephony.IMiuiTelephony
        public void setUserFiveGEnabled(boolean enabled) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isUserFiveGEnabled(int slotId) throws RemoteException {
            return false;
        }

        @Deprecated
        @Override // miui.telephony.IMiuiTelephony
        public boolean isUserFiveGEnabled() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isUserFiveGSaEnabled(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVoNRSupported() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isVoNREnabled(int subId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isNrCAEnabled(int slotId) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setUserNrCAEnabled(int mode, int slotId) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setUserVoNREnabled(int slotId, boolean enabled) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setUserFiveGSaEnabled(boolean enabled, int slotId) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setDualSaEnabled(boolean enabled) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isDualSaEnabled() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getNrConfigType(int slotId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getXMNetworkType(int slotId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isFiveGCapable() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int get5GIndicatorStatus(int slotId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getUpperlayerStatus(int slotId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getRestrictDcnrStatus(int slotId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public void registerFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback cb, int slotId) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public void unRegisterFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback cb, int slotId) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isGameFiveGOptimizeSupported() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isDualNrEnabled() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getUiccSlotForCardId(String cardId) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getMobileNetworkCapability(int slotId) throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public void setMobileNetworkCapability(String nwCapability) throws RemoteException {
        }

        @Override // miui.telephony.IMiuiTelephony
        public int setEsimState(int state) throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public int getEsimGPIOState() throws RemoteException {
            return 0;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getProductEid() throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isEsimActive() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isSupportEsimForCountry(String countryIso) throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public String getCotaOpconfigVersionName() throws RemoteException {
            return null;
        }

        @Override // miui.telephony.IMiuiTelephony
        public long getCotaOpconfigVersionCode() throws RemoteException {
            return 0L;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean isCotaOpconfigUsed() throws RemoteException {
            return false;
        }

        @Override // miui.telephony.IMiuiTelephony
        public boolean setCotaOpconfigUsed(boolean used) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMiuiTelephony {
        static final int TRANSACTION_get5GIndicatorStatus = 42;
        static final int TRANSACTION_getCellLocationForSlot = 26;
        static final int TRANSACTION_getCotaOpconfigVersionCode = 58;
        static final int TRANSACTION_getCotaOpconfigVersionName = 57;
        static final int TRANSACTION_getDeviceId = 19;
        static final int TRANSACTION_getDeviceIdList = 16;
        static final int TRANSACTION_getEsimGPIOState = 53;
        static final int TRANSACTION_getImei = 20;
        static final int TRANSACTION_getImeiList = 17;
        static final int TRANSACTION_getMeid = 21;
        static final int TRANSACTION_getMeidList = 18;
        static final int TRANSACTION_getMobileNetworkCapability = 50;
        static final int TRANSACTION_getNrConfigType = 39;
        static final int TRANSACTION_getProductEid = 54;
        static final int TRANSACTION_getRestrictDcnrStatus = 44;
        static final int TRANSACTION_getSmallDeviceId = 22;
        static final int TRANSACTION_getSpn = 24;
        static final int TRANSACTION_getSystemDefaultSlotId = 12;
        static final int TRANSACTION_getUiccSlotForCardId = 49;
        static final int TRANSACTION_getUpperlayerStatus = 43;
        static final int TRANSACTION_getXMNetworkType = 40;
        static final int TRANSACTION_isCotaOpconfigUsed = 59;
        static final int TRANSACTION_isDualNrEnabled = 48;
        static final int TRANSACTION_isDualSaEnabled = 38;
        static final int TRANSACTION_isEsimActive = 55;
        static final int TRANSACTION_isFiveGCapable = 41;
        static final int TRANSACTION_isGameFiveGOptimizeSupported = 47;
        static final int TRANSACTION_isGwsdSupport = 13;
        static final int TRANSACTION_isIccCardActivate = 14;
        static final int TRANSACTION_isImsRegistered = 3;
        static final int TRANSACTION_isNrCAEnabled = 33;
        static final int TRANSACTION_isSameOperator = 23;
        static final int TRANSACTION_isSupportEsimForCountry = 56;
        static final int TRANSACTION_isUserFiveGEnabled = 29;
        static final int TRANSACTION_isUserFiveGSaEnabled = 30;
        static final int TRANSACTION_isVideoTelephonyAvailable = 4;
        static final int TRANSACTION_isVoNREnabled = 32;
        static final int TRANSACTION_isVoNRSupported = 31;
        static final int TRANSACTION_isVolteEnabledByPlatform = 10;
        static final int TRANSACTION_isVolteEnabledByPlatformForSlot = 11;
        static final int TRANSACTION_isVolteEnabledByUser = 6;
        static final int TRANSACTION_isVolteEnabledByUserForSlot = 7;
        static final int TRANSACTION_isVtEnabledByPlatform = 8;
        static final int TRANSACTION_isVtEnabledByPlatformForSlot = 9;
        static final int TRANSACTION_isWifiCallingAvailable = 5;
        static final int TRANSACTION_onOperatorNumericOrNameSet = 25;
        static final int TRANSACTION_registerFiveGServiceStateCallback = 45;
        static final int TRANSACTION_setCallForwardingOption = 27;
        static final int TRANSACTION_setCotaOpconfigUsed = 60;
        static final int TRANSACTION_setDefaultDataSlotId = 2;
        static final int TRANSACTION_setDefaultVoiceSlotId = 1;
        static final int TRANSACTION_setDualSaEnabled = 37;
        static final int TRANSACTION_setEsimState = 52;
        static final int TRANSACTION_setIccCardActivate = 15;
        static final int TRANSACTION_setMobileNetworkCapability = 51;
        public static final int TRANSACTION_setUserFiveGEnabled = 28;
        static final int TRANSACTION_setUserFiveGSaEnabled = 36;
        static final int TRANSACTION_setUserNrCAEnabled = 34;
        static final int TRANSACTION_setUserVoNREnabled = 35;
        static final int TRANSACTION_unRegisterFiveGServiceStateCallback = 46;

        public Stub() {
            attachInterface(this, IMiuiTelephony.DESCRIPTOR);
        }

        public static IMiuiTelephony asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IMiuiTelephony.DESCRIPTOR);
            if (iin != null && (iin instanceof IMiuiTelephony)) {
                return (IMiuiTelephony) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            ResultReceiver _arg4;
            switch (code) {
                case 1598968902:
                    reply.writeString(IMiuiTelephony.DESCRIPTOR);
                    return true;
                default:
                    boolean _arg0 = false;
                    switch (code) {
                        case 1:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg02 = data.readInt();
                            String _arg1 = data.readString();
                            setDefaultVoiceSlotId(_arg02, _arg1);
                            reply.writeNoException();
                            return true;
                        case 2:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg03 = data.readInt();
                            String _arg12 = data.readString();
                            boolean defaultDataSlotId = setDefaultDataSlotId(_arg03, _arg12);
                            reply.writeNoException();
                            reply.writeInt(defaultDataSlotId ? 1 : 0);
                            return true;
                        case 3:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isImsRegistered = isImsRegistered(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isImsRegistered ? 1 : 0);
                            return true;
                        case 4:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVideoTelephonyAvailable = isVideoTelephonyAvailable(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isVideoTelephonyAvailable ? 1 : 0);
                            return true;
                        case 5:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isWifiCallingAvailable = isWifiCallingAvailable(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isWifiCallingAvailable ? 1 : 0);
                            return true;
                        case 6:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVolteEnabledByUser = isVolteEnabledByUser();
                            reply.writeNoException();
                            reply.writeInt(isVolteEnabledByUser ? 1 : 0);
                            return true;
                        case 7:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVolteEnabledByUserForSlot = isVolteEnabledByUserForSlot(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isVolteEnabledByUserForSlot ? 1 : 0);
                            return true;
                        case 8:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVtEnabledByPlatform = isVtEnabledByPlatform();
                            reply.writeNoException();
                            reply.writeInt(isVtEnabledByPlatform ? 1 : 0);
                            return true;
                        case 9:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVtEnabledByPlatformForSlot = isVtEnabledByPlatformForSlot(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isVtEnabledByPlatformForSlot ? 1 : 0);
                            return true;
                        case 10:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVolteEnabledByPlatform = isVolteEnabledByPlatform();
                            reply.writeNoException();
                            reply.writeInt(isVolteEnabledByPlatform ? 1 : 0);
                            return true;
                        case 11:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVolteEnabledByPlatformForSlot = isVolteEnabledByPlatformForSlot(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isVolteEnabledByPlatformForSlot ? 1 : 0);
                            return true;
                        case 12:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result = getSystemDefaultSlotId();
                            reply.writeNoException();
                            reply.writeInt(_result);
                            return true;
                        case 13:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isGwsdSupport = isGwsdSupport();
                            reply.writeNoException();
                            reply.writeInt(isGwsdSupport ? 1 : 0);
                            return true;
                        case 14:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isIccCardActivate = isIccCardActivate(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isIccCardActivate ? 1 : 0);
                            return true;
                        case 15:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg04 = data.readInt();
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            setIccCardActivate(_arg04, _arg0);
                            reply.writeNoException();
                            return true;
                        case 16:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            List<String> _result2 = getDeviceIdList(data.readString());
                            reply.writeNoException();
                            reply.writeStringList(_result2);
                            return true;
                        case 17:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            List<String> _result3 = getImeiList(data.readString());
                            reply.writeNoException();
                            reply.writeStringList(_result3);
                            return true;
                        case 18:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            List<String> _result4 = getMeidList(data.readString());
                            reply.writeNoException();
                            reply.writeStringList(_result4);
                            return true;
                        case 19:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _result5 = getDeviceId(data.readString());
                            reply.writeNoException();
                            reply.writeString(_result5);
                            return true;
                        case 20:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg05 = data.readInt();
                            String _arg13 = data.readString();
                            String _result6 = getImei(_arg05, _arg13);
                            reply.writeNoException();
                            reply.writeString(_result6);
                            return true;
                        case 21:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg06 = data.readInt();
                            String _arg14 = data.readString();
                            String _result7 = getMeid(_arg06, _arg14);
                            reply.writeNoException();
                            reply.writeString(_result7);
                            return true;
                        case 22:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _result8 = getSmallDeviceId(data.readString());
                            reply.writeNoException();
                            reply.writeString(_result8);
                            return true;
                        case 23:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _arg07 = data.readString();
                            String _arg15 = data.readString();
                            boolean isSameOperator = isSameOperator(_arg07, _arg15);
                            reply.writeNoException();
                            reply.writeInt(isSameOperator ? 1 : 0);
                            return true;
                        case 24:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _arg08 = data.readString();
                            int _arg16 = data.readInt();
                            String _arg2 = data.readString();
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            String _result9 = getSpn(_arg08, _arg16, _arg2, _arg0);
                            reply.writeNoException();
                            reply.writeString(_result9);
                            return true;
                        case 25:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg09 = data.readInt();
                            String _arg17 = data.readString();
                            String _arg22 = data.readString();
                            String _result10 = onOperatorNumericOrNameSet(_arg09, _arg17, _arg22);
                            reply.writeNoException();
                            reply.writeString(_result10);
                            return true;
                        case 26:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg010 = data.readInt();
                            String _arg18 = data.readString();
                            Bundle _result11 = getCellLocationForSlot(_arg010, _arg18);
                            reply.writeNoException();
                            if (_result11 != null) {
                                reply.writeInt(1);
                                _result11.writeToParcel(reply, 1);
                            } else {
                                reply.writeInt(0);
                            }
                            return true;
                        case 27:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg011 = data.readInt();
                            int _arg19 = data.readInt();
                            int _arg23 = data.readInt();
                            String _arg3 = data.readString();
                            if (data.readInt() != 0) {
                                _arg4 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(data);
                            } else {
                                _arg4 = null;
                            }
                            setCallForwardingOption(_arg011, _arg19, _arg23, _arg3, _arg4);
                            reply.writeNoException();
                            return true;
                        case 28:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            int _arg110 = data.readInt();
                            setUserFiveGEnabled(_arg0, _arg110);
                            reply.writeNoException();
                            return true;
                        case 29:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isUserFiveGEnabled = isUserFiveGEnabled(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isUserFiveGEnabled ? 1 : 0);
                            return true;
                        case 30:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isUserFiveGSaEnabled = isUserFiveGSaEnabled(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isUserFiveGSaEnabled ? 1 : 0);
                            return true;
                        case 31:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVoNRSupported = isVoNRSupported();
                            reply.writeNoException();
                            reply.writeInt(isVoNRSupported ? 1 : 0);
                            return true;
                        case 32:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isVoNREnabled = isVoNREnabled(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isVoNREnabled ? 1 : 0);
                            return true;
                        case 33:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isNrCAEnabled = isNrCAEnabled(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(isNrCAEnabled ? 1 : 0);
                            return true;
                        case 34:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg012 = data.readInt();
                            int _arg111 = data.readInt();
                            setUserNrCAEnabled(_arg012, _arg111);
                            reply.writeNoException();
                            return true;
                        case 35:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _arg013 = data.readInt();
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            setUserVoNREnabled(_arg013, _arg0);
                            reply.writeNoException();
                            return true;
                        case 36:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            int _arg112 = data.readInt();
                            setUserFiveGSaEnabled(_arg0, _arg112);
                            reply.writeNoException();
                            return true;
                        case 37:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            setDualSaEnabled(_arg0);
                            reply.writeNoException();
                            return true;
                        case 38:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isDualSaEnabled = isDualSaEnabled();
                            reply.writeNoException();
                            reply.writeInt(isDualSaEnabled ? 1 : 0);
                            return true;
                        case TRANSACTION_getNrConfigType /* 39 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result12 = getNrConfigType(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result12);
                            return true;
                        case 40:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result13 = getXMNetworkType(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result13);
                            return true;
                        case 41:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isFiveGCapable = isFiveGCapable();
                            reply.writeNoException();
                            reply.writeInt(isFiveGCapable ? 1 : 0);
                            return true;
                        case 42:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result14 = get5GIndicatorStatus(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result14);
                            return true;
                        case 43:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result15 = getUpperlayerStatus(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result15);
                            return true;
                        case TRANSACTION_getRestrictDcnrStatus /* 44 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result16 = getRestrictDcnrStatus(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result16);
                            return true;
                        case 45:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            IMiuiFiveGServiceStateCallback _arg014 = IMiuiFiveGServiceStateCallback.Stub.asInterface(data.readStrongBinder());
                            int _arg113 = data.readInt();
                            registerFiveGServiceStateCallback(_arg014, _arg113);
                            reply.writeNoException();
                            return true;
                        case TRANSACTION_unRegisterFiveGServiceStateCallback /* 46 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            IMiuiFiveGServiceStateCallback _arg015 = IMiuiFiveGServiceStateCallback.Stub.asInterface(data.readStrongBinder());
                            int _arg114 = data.readInt();
                            unRegisterFiveGServiceStateCallback(_arg015, _arg114);
                            reply.writeNoException();
                            return true;
                        case TRANSACTION_isGameFiveGOptimizeSupported /* 47 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isGameFiveGOptimizeSupported = isGameFiveGOptimizeSupported();
                            reply.writeNoException();
                            reply.writeInt(isGameFiveGOptimizeSupported ? 1 : 0);
                            return true;
                        case 48:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isDualNrEnabled = isDualNrEnabled();
                            reply.writeNoException();
                            reply.writeInt(isDualNrEnabled ? 1 : 0);
                            return true;
                        case TRANSACTION_getUiccSlotForCardId /* 49 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result17 = getUiccSlotForCardId(data.readString());
                            reply.writeNoException();
                            reply.writeInt(_result17);
                            return true;
                        case 50:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _result18 = getMobileNetworkCapability(data.readInt());
                            reply.writeNoException();
                            reply.writeString(_result18);
                            return true;
                        case TRANSACTION_setMobileNetworkCapability /* 51 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            setMobileNetworkCapability(data.readString());
                            reply.writeNoException();
                            return true;
                        case TRANSACTION_setEsimState /* 52 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result19 = setEsimState(data.readInt());
                            reply.writeNoException();
                            reply.writeInt(_result19);
                            return true;
                        case TRANSACTION_getEsimGPIOState /* 53 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            int _result20 = getEsimGPIOState();
                            reply.writeNoException();
                            reply.writeInt(_result20);
                            return true;
                        case 54:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _result21 = getProductEid();
                            reply.writeNoException();
                            reply.writeString(_result21);
                            return true;
                        case TRANSACTION_isEsimActive /* 55 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isEsimActive = isEsimActive();
                            reply.writeNoException();
                            reply.writeInt(isEsimActive ? 1 : 0);
                            return true;
                        case TRANSACTION_isSupportEsimForCountry /* 56 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isSupportEsimForCountry = isSupportEsimForCountry(data.readString());
                            reply.writeNoException();
                            reply.writeInt(isSupportEsimForCountry ? 1 : 0);
                            return true;
                        case TRANSACTION_getCotaOpconfigVersionName /* 57 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            String _result22 = getCotaOpconfigVersionName();
                            reply.writeNoException();
                            reply.writeString(_result22);
                            return true;
                        case TRANSACTION_getCotaOpconfigVersionCode /* 58 */:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            long _result23 = getCotaOpconfigVersionCode();
                            reply.writeNoException();
                            reply.writeLong(_result23);
                            return true;
                        case 59:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            boolean isCotaOpconfigUsed = isCotaOpconfigUsed();
                            reply.writeNoException();
                            reply.writeInt(isCotaOpconfigUsed ? 1 : 0);
                            return true;
                        case 60:
                            data.enforceInterface(IMiuiTelephony.DESCRIPTOR);
                            if (data.readInt() != 0) {
                                _arg0 = true;
                            }
                            boolean cotaOpconfigUsed = setCotaOpconfigUsed(_arg0);
                            reply.writeNoException();
                            reply.writeInt(cotaOpconfigUsed ? 1 : 0);
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IMiuiTelephony {
            public static IMiuiTelephony sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMiuiTelephony.DESCRIPTOR;
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setDefaultVoiceSlotId(int slotId, String opPackageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(opPackageName);
                    boolean _status = this.mRemote.transact(1, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setDefaultVoiceSlotId(slotId, opPackageName);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean setDefaultDataSlotId(int slotId, String opPackageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(opPackageName);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(2, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setDefaultDataSlotId(slotId, opPackageName);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isImsRegistered(int phoneId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(phoneId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(3, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isImsRegistered(phoneId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVideoTelephonyAvailable(int phoneId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(phoneId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(4, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVideoTelephonyAvailable(phoneId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isWifiCallingAvailable(int phoneId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(phoneId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(5, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isWifiCallingAvailable(phoneId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVolteEnabledByUser() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(6, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVolteEnabledByUser();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVolteEnabledByUserForSlot(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(7, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVolteEnabledByUserForSlot(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVtEnabledByPlatform() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(8, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVtEnabledByPlatform();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVtEnabledByPlatformForSlot(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(9, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVtEnabledByPlatformForSlot(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVolteEnabledByPlatform() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(10, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVolteEnabledByPlatform();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVolteEnabledByPlatformForSlot(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(11, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVolteEnabledByPlatformForSlot(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getSystemDefaultSlotId() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(12, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSystemDefaultSlotId();
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isGwsdSupport() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(13, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isGwsdSupport();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isIccCardActivate(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(14, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isIccCardActivate(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setIccCardActivate(int slotId, boolean isActivate) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeInt(isActivate ? 1 : 0);
                    boolean _status = this.mRemote.transact(15, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setIccCardActivate(slotId, isActivate);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public List<String> getDeviceIdList(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(16, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceIdList(callingPackage);
                    }
                    _reply.readException();
                    List<String> _result = _reply.createStringArrayList();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public List<String> getImeiList(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(17, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getImeiList(callingPackage);
                    }
                    _reply.readException();
                    List<String> _result = _reply.createStringArrayList();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public List<String> getMeidList(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(18, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMeidList(callingPackage);
                    }
                    _reply.readException();
                    List<String> _result = _reply.createStringArrayList();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getDeviceId(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(19, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceId(callingPackage);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getImei(int slotId, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(20, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getImei(slotId, callingPackage);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getMeid(int slotId, String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(21, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMeid(slotId, callingPackage);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getSmallDeviceId(String callingPackage) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(callingPackage);
                    boolean _status = this.mRemote.transact(22, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSmallDeviceId(callingPackage);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isSameOperator(String numeric, String anotherNumeric) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(numeric);
                    _data.writeString(anotherNumeric);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(23, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSameOperator(numeric, anotherNumeric);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getSpn(String numeric, int slotId, String spn, boolean longName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(numeric);
                    _data.writeInt(slotId);
                    _data.writeString(spn);
                    _data.writeInt(longName ? 1 : 0);
                    boolean _status = this.mRemote.transact(24, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSpn(numeric, slotId, spn, longName);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String onOperatorNumericOrNameSet(int slotId, String property, String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(property);
                    _data.writeString(value);
                    boolean _status = this.mRemote.transact(25, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onOperatorNumericOrNameSet(slotId, property, value);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public Bundle getCellLocationForSlot(int slotId, String callingPkg) throws RemoteException {
                Bundle _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeString(callingPkg);
                    boolean _status = this.mRemote.transact(26, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCellLocationForSlot(slotId, callingPkg);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = (Bundle) Bundle.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setCallForwardingOption(int phoneId, int action, int reason, String number, ResultReceiver callback) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(phoneId);
                    _data.writeInt(action);
                    _data.writeInt(reason);
                    _data.writeString(number);
                    if (callback != null) {
                        _data.writeInt(1);
                        callback.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    boolean _status = this.mRemote.transact(27, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setCallForwardingOption(phoneId, action, reason, number, callback);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setUserFiveGEnabled(boolean enabled, int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(enabled ? 1 : 0);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(28, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserFiveGEnabled(enabled, slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Deprecated
            @Override // miui.telephony.IMiuiTelephony
            public void setUserFiveGEnabled(boolean enabled) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(enabled ? 1 : 0);
                    boolean _status = this.mRemote.transact(28, _data, _reply, 0);
                    if (!_status && IMiuiTelephony.Stub.getDefaultImpl() != null) {
                        IMiuiTelephony.Stub.getDefaultImpl().setUserFiveGEnabled(enabled);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isUserFiveGEnabled(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(29, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isUserFiveGEnabled(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Deprecated
            @Override // miui.telephony.IMiuiTelephony
            public boolean isUserFiveGEnabled() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(29, _data, _reply, 0);
                    if (!_status && IMiuiTelephony.Stub.getDefaultImpl() != null) {
                        return IMiuiTelephony.Stub.getDefaultImpl().isUserFiveGEnabled();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isUserFiveGSaEnabled(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(30, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isUserFiveGSaEnabled(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVoNRSupported() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(31, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVoNRSupported();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isVoNREnabled(int subId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(subId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(32, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVoNREnabled(subId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isNrCAEnabled(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(33, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isNrCAEnabled(slotId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setUserNrCAEnabled(int mode, int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(mode);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(34, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserNrCAEnabled(mode, slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setUserVoNREnabled(int slotId, boolean enabled) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    _data.writeInt(enabled ? 1 : 0);
                    boolean _status = this.mRemote.transact(35, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserVoNREnabled(slotId, enabled);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setUserFiveGSaEnabled(boolean enabled, int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(enabled ? 1 : 0);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(36, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserFiveGSaEnabled(enabled, slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setDualSaEnabled(boolean enabled) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(enabled ? 1 : 0);
                    boolean _status = this.mRemote.transact(37, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setDualSaEnabled(enabled);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isDualSaEnabled() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(38, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDualSaEnabled();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getNrConfigType(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getNrConfigType, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNrConfigType(slotId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getXMNetworkType(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(40, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getXMNetworkType(slotId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isFiveGCapable() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(41, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isFiveGCapable();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int get5GIndicatorStatus(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(42, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().get5GIndicatorStatus(slotId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getUpperlayerStatus(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(43, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUpperlayerStatus(slotId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getRestrictDcnrStatus(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getRestrictDcnrStatus, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRestrictDcnrStatus(slotId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void registerFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback cb, int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeStrongBinder(cb != null ? cb.asBinder() : null);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(45, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerFiveGServiceStateCallback(cb, slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void unRegisterFiveGServiceStateCallback(IMiuiFiveGServiceStateCallback cb, int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeStrongBinder(cb != null ? cb.asBinder() : null);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_unRegisterFiveGServiceStateCallback, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unRegisterFiveGServiceStateCallback(cb, slotId);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isGameFiveGOptimizeSupported() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_isGameFiveGOptimizeSupported, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isGameFiveGOptimizeSupported();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isDualNrEnabled() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(48, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDualNrEnabled();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getUiccSlotForCardId(String cardId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(cardId);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getUiccSlotForCardId, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUiccSlotForCardId(cardId);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getMobileNetworkCapability(int slotId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(slotId);
                    boolean _status = this.mRemote.transact(50, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMobileNetworkCapability(slotId);
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public void setMobileNetworkCapability(String nwCapability) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(nwCapability);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_setMobileNetworkCapability, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setMobileNetworkCapability(nwCapability);
                    } else {
                        _reply.readException();
                    }
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int setEsimState(int state) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeInt(state);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_setEsimState, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setEsimState(state);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public int getEsimGPIOState() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getEsimGPIOState, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEsimGPIOState();
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getProductEid() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(54, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProductEid();
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isEsimActive() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_isEsimActive, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isEsimActive();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isSupportEsimForCountry(String countryIso) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    _data.writeString(countryIso);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_isSupportEsimForCountry, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSupportEsimForCountry(countryIso);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public String getCotaOpconfigVersionName() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getCotaOpconfigVersionName, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCotaOpconfigVersionName();
                    }
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public long getCotaOpconfigVersionCode() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(Stub.TRANSACTION_getCotaOpconfigVersionCode, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCotaOpconfigVersionCode();
                    }
                    _reply.readException();
                    long _result = _reply.readLong();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean isCotaOpconfigUsed() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean z = false;
                    boolean _status = this.mRemote.transact(59, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isCotaOpconfigUsed();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status2 = z;
                    return _status2;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // miui.telephony.IMiuiTelephony
            public boolean setCotaOpconfigUsed(boolean used) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IMiuiTelephony.DESCRIPTOR);
                    boolean _result = true;
                    _data.writeInt(used ? 1 : 0);
                    boolean _status = this.mRemote.transact(60, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setCotaOpconfigUsed(used);
                    }
                    _reply.readException();
                    if (_reply.readInt() == 0) {
                        _result = false;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IMiuiTelephony impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IMiuiTelephony getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
