package com.crazyurus.naviauto.launcher

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = Intent(Intent.ACTION_MAIN)
        val componentName = ComponentName("com.byd.naviauto", "com.byd.automap.StartupActivity")

        intent.component = componentName

        startActivity(intent)
        finish()
    }
}
