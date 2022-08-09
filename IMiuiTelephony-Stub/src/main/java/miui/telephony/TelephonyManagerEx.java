package miui.telephony;

/* loaded from: classes4.dex */
public class TelephonyManagerEx {
    public static TelephonyManagerEx getDefault() {
//        return Holder.INSTANCE;
        return null;
    }

    public IMiuiTelephony getMiuiTelephony() {
        Object sRegistry = null;
        if (sRegistry == null) {
            synchronized (TelephonyManagerEx.class) {
                if (sRegistry == null) {
//                        sRegistry = ITelephonyRegistry.Stub.asInterface(ServiceManager.getService("telephony.registry"));
                }
            }
        }
        if (sRegistry != null) {
//                return sRegistry.getMiuiTelephony();
        }
        return null;
    }
}
