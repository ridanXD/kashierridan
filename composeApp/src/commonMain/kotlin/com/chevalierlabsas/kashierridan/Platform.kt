package com.chevalierlabsas.kashierridan

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform