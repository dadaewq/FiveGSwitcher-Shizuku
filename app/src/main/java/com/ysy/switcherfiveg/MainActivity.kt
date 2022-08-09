package com.ysy.switcherfiveg

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    companion object {
        // am start -n com.ysy.switcherfiveg/.MainActivity --ez enable_5g true
        private const val EXT_KEY_ENABLE_5G = "enable_5g"
    }

    private val mFragment by lazy { MoreBottomSheetFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        if (intent?.hasExtra(EXT_KEY_ENABLE_5G) == true) {
            if (!FiveGUtils.isShizukuOk()) {
                Toast.makeText(this, "please check Shizuku/Sui", Toast.LENGTH_SHORT).show()
                Shizuku.requestPermission(0)
                finish()
                return
            }

            FiveGUtils.setUserFiveGEnabled(intent.getBooleanExtra(EXT_KEY_ENABLE_5G, false))
            finish()
        } else {
            if (!mFragment.isDialogShowing()) {
                mFragment.show(supportFragmentManager, "MoreBottomSheetFragment")
            }
        }
    }
}
