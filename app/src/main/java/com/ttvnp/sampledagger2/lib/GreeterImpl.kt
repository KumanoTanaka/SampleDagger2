package com.ttvnp.sampledagger2.lib

import javax.inject.Inject

class GreeterImpl @Inject constructor(val stringGenerator: StringGenerator) : Greeter {

    override fun greet(): String = stringGenerator.generate()
}
