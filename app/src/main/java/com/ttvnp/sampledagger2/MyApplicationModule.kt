package com.ttvnp.sampledagger2

import com.ttvnp.sampledagger2.lib.StringGenerator
import com.ttvnp.sampledagger2.lib.StringGeneratorImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyApplicationModule {
    @Singleton
    @Provides
    fun stringGenerator(): StringGenerator {
        return StringGeneratorImpl()
    }
}