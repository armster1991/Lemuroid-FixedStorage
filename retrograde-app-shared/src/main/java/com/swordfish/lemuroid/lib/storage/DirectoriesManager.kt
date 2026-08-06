package com.swordfish.lemuroid.lib.storage

import android.content.Context
import android.os.Environment
import java.io.File

class DirectoriesManager(private val appContext: Context) {
    private fun getLemuroidDirectory(): File =
        File(Environment.getExternalStorageDirectory(), "Lemuroid").apply {
            mkdirs()
        }

    @Deprecated("Use the external states directory")
    fun getInternalStatesDirectory(): File =
        File(getLemuroidDirectory(), "savestates").apply {
            mkdirs()
        }

    fun getCoresDirectory(): File =
        File(appContext.filesDir, "cores").apply {
            mkdirs()
        }

    fun getSystemDirectory(): File =
        File(getLemuroidDirectory(), "system").apply {
            mkdirs()
        }

    fun getStatesDirectory(): File =
        File(getLemuroidDirectory(), "savestates").apply {
            mkdirs()
        }

    fun getStatesPreviewDirectory(): File =
        File(getLemuroidDirectory(), "state-previews").apply {
            mkdirs()
        }

    fun getSavesDirectory(): File =
        File(getLemuroidDirectory(), "saves").apply {
            mkdirs()
        }

    fun getInternalRomsDirectory(): File =
        File(getLemuroidDirectory(), "roms").apply {
            mkdirs()
        }
}
