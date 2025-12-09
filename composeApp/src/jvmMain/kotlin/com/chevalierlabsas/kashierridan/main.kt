package com.chevalierlabsas.kashierridan

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.chevalierlabsas.kashierridan.core.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kashierridan",
    ) {
        App()
    }
}