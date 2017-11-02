package com.ttvnp.sampledagger2

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        MyApplicationModule::class,
        MainActivityModule::class
))
interface MyApplicationComponent {
    fun inject(myApplication: MyApplication)
}
