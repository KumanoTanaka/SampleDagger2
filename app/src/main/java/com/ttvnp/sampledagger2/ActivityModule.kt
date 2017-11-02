package com.ttvnp.sampledagger2

import com.ttvnp.sampledagger2.lib.Greeter
import com.ttvnp.sampledagger2.lib.GreeterImpl
import com.ttvnp.sampledagger2.lib.StringGenerator
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    fun greeter(stringGenerator: StringGenerator): Greeter {
        return GreeterImpl(stringGenerator)
    }

}