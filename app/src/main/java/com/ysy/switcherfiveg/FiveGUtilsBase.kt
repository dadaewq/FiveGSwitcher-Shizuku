import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.IBinder
import miui.telephony.IMiuiTelephony
import miui.telephony.SubscriptionManagerEx
import miui.telephony.TelephonyManagerEx
import org.lsposed.hiddenapibypass.HiddenApiBypass
import rikka.shizuku.Shizuku
import rikka.shizuku.ShizukuBinderWrapper
import rikka.shizuku.SystemServiceHelper


@SuppressLint("NewApi")
open class FiveGUtilsBase {

    fun isShizukuOk(): Boolean {
        try {
            return Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

    private val extMiuiTelephony by lazy { getIMiuiTelephonyBinder() }

    private val isOldWay by lazy { getIsOldWay() }
    private fun getIMiuiTelephonyBinder(): IBinder {
        // add on 22.6.21
        // 初次添加获取IMiuiTelephonyBinder
        SystemServiceHelper.getSystemService("miui.radio.extphone")?.run {
            return this
        }

        try {
            Class.forName(TelephonyManagerEx::class.java.name)

            TelephonyManagerEx.getDefault().miuiTelephony?.asBinder()?.run {
                return this
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // add on 22.7.12
        // 根据反馈得知部分旧的系统并无"miui.radio.extphone"服务，需要通过其他方式获取IMiuiTelephonyBinder
        try {
            Class.forName(SubscriptionManagerEx::class.java.name)

            SubscriptionManagerEx.getDefault()?.run {
//                HiddenApiBypass.invoke(
//                    javaClass,
//                    this,
//                    "getMiuiTelephony"
//                )
                javaClass.getDeclaredMethod("getMiuiTelephony").apply { isAccessible = true }
                    .invoke(this)
//                    .takeIf { it is IMiuiTelephony }
                    ?.run {
                        (this as IMiuiTelephony).asBinder()?.run {
                            return this
                        }
                    }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        throw NullPointerException("cannot getIMiuiTelephonyBinder")
    }

    private fun getIMiuiTelephony(iBinder: IBinder): IMiuiTelephony {
        return IMiuiTelephony.Stub.asInterface(iBinder)
    }

    /**
     * add on 22.7.9
     * 根据反馈得知部分旧的设备的系统的isUserFiveGEnabled和setUserFiveGEnabled等方法没有第二个参数
     */
    private fun getIsOldWay(): Boolean {
        return try {
            Class.forName(IMiuiTelephony.DESCRIPTOR).getMethod("isUserFiveGEnabled")
            true
        } catch (e: NoSuchMethodException) {
            false
        }
    }

    /**
     * 获取默认上网卡Id
     */
    private fun getDefaultDataSlotId(): Int {
        return if (isOldWay) 0
        else try {
            (HiddenApiBypass.invoke(
                Class.forName("miui.telephony.DefaultSimManager"),
                null,
                "getDefaultDataSlotId"
            ).takeIf { it is Int } ?: 0) as Int
        } catch (e: Exception) {
            e.printStackTrace()
            0
        }
    }


    // need ShizukuBinderWrapper
    fun setUserFiveGEnabled(enable: Boolean, dataSlotId: Int) {
        try {
            getIMiuiTelephony(ShizukuBinderWrapper(extMiuiTelephony))
                .run {
                    if (isOldWay) isUserFiveGEnabled = enable
                    else setUserFiveGEnabled(enable, dataSlotId)
                }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun setUserFiveGEnabled(enable: Boolean) {
        setUserFiveGEnabled(enable, getDefaultDataSlotId())
    }

    fun toggleUserFiveG() {
        getDefaultDataSlotId().run {
            setUserFiveGEnabled(!isUserFiveGEnabled(this), this)
        }
    }

    // don't need ShizukuBinderWrapper
    fun isUserFiveGEnabled(dataSlotId: Int): Boolean = try {
        getIMiuiTelephony(extMiuiTelephony)
            .run {
                if (isOldWay) isUserFiveGEnabled
                else isUserFiveGEnabled(dataSlotId)
            }
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }

    fun isUserFiveGEnabled() = isUserFiveGEnabled(getDefaultDataSlotId())

}
