package com.example.flutter_leak_vm_test

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

class MainFlutterActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
