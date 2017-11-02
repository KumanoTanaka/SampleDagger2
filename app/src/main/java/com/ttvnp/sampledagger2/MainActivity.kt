package com.ttvnp.sampledagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.ttvnp.sampledagger2.lib.Greeter
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var greeter: Greeter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertDialog.Builder(this).setMessage(greeter.greet()).setPositiveButton("OK", null).show()
    }
}
