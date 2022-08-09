package miui.telephony;

/* loaded from: classes4.dex */
public class SubscriptionManagerEx {

    public static SubscriptionManagerEx getDefault() {
//        return Holder.INSTANCE;
        return null;
    }


    private IMiuiTelephony getMiuiTelephony() {
        return TelephonyManagerEx.getDefault().getMiuiTelephony();
    }

}
