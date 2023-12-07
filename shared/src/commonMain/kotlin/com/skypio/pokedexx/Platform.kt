package com.skypio.pokedexx

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform