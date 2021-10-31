package com.example.materialyoucolors.ui.theme

import android.content.Context
import android.os.Build
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat


@RequiresApi(Build.VERSION_CODES.S)
val colorMap = mutableMapOf(
    "accent_1_0" to android.R.color.system_accent1_0,

    "accent_1_0" to android.R.color.system_accent1_0,
    "accent_1_10" to android.R.color.system_accent1_10,
    "accent_1_50" to android.R.color.system_accent1_50,
    "accent_1_100" to android.R.color.system_accent1_100,
    "accent_1_200" to android.R.color.system_accent1_200,
    "accent_1_300" to android.R.color.system_accent1_300,
    "accent_1_400" to android.R.color.system_accent1_400,
    "accent_1_500" to android.R.color.system_accent1_500,
    "accent_1_600" to android.R.color.system_accent1_600,
    "accent_1_700" to android.R.color.system_accent1_700,
    "accent_1_800" to android.R.color.system_accent1_800,
    "accent_1_900" to android.R.color.system_accent1_900,
    "accent_1_1000" to android.R.color.system_accent1_1000,

    "accent_2_0" to android.R.color.system_accent2_0,
    "accent_2_10" to android.R.color.system_accent2_10,
    "accent_2_50" to android.R.color.system_accent2_50,
    "accent_2_100" to android.R.color.system_accent2_100,
    "accent_2_200" to android.R.color.system_accent2_200,
    "accent_2_300" to android.R.color.system_accent2_300,
    "accent_2_400" to android.R.color.system_accent2_400,
    "accent_2_500" to android.R.color.system_accent2_500,
    "accent_2_600" to android.R.color.system_accent2_600,
    "accent_2_700" to android.R.color.system_accent2_700,
    "accent_2_800" to android.R.color.system_accent2_800,
    "accent_2_900" to android.R.color.system_accent2_900,
    "accent_2_1000" to android.R.color.system_accent2_1000,

    "accent_3_0" to android.R.color.system_accent3_0,
    "accent_3_10" to android.R.color.system_accent3_10,
    "accent_3_50" to android.R.color.system_accent3_50,
    "accent_3_100" to android.R.color.system_accent3_100,
    "accent_3_200" to android.R.color.system_accent3_200,
    "accent_3_300" to android.R.color.system_accent3_300,
    "accent_3_400" to android.R.color.system_accent3_400,
    "accent_3_500" to android.R.color.system_accent3_500,
    "accent_3_600" to android.R.color.system_accent3_600,
    "accent_3_700" to android.R.color.system_accent3_700,
    "accent_3_800" to android.R.color.system_accent3_800,
    "accent_3_900" to android.R.color.system_accent3_900,
    "accent_3_1000" to android.R.color.system_accent3_1000,

    "neutral_1_0" to android.R.color.system_neutral1_0,
    "neutral_1_10" to android.R.color.system_neutral1_10,
    "neutral_1_50" to android.R.color.system_neutral1_50,
    "neutral_1_100" to android.R.color.system_neutral1_100,
    "neutral_1_200" to android.R.color.system_neutral1_200,
    "neutral_1_300" to android.R.color.system_neutral1_300,
    "neutral_1_400" to android.R.color.system_neutral1_400,
    "neutral_1_500" to android.R.color.system_neutral1_500,
    "neutral_1_600" to android.R.color.system_neutral1_600,
    "neutral_1_700" to android.R.color.system_neutral1_700,
    "neutral_1_800" to android.R.color.system_neutral1_800,
    "neutral_1_900" to android.R.color.system_neutral1_900,
    "neutral_1_1000" to android.R.color.system_neutral1_1000,

    "neutral_2_0" to android.R.color.system_neutral2_0,
    "neutral_2_10" to android.R.color.system_neutral2_10,
    "neutral_2_50" to android.R.color.system_neutral2_50,
    "neutral_2_100" to android.R.color.system_neutral2_100,
    "neutral_2_200" to android.R.color.system_neutral2_200,
    "neutral_2_300" to android.R.color.system_neutral2_300,
    "neutral_2_400" to android.R.color.system_neutral2_400,
    "neutral_2_500" to android.R.color.system_neutral2_500,
    "neutral_2_600" to android.R.color.system_neutral2_600,
    "neutral_2_700" to android.R.color.system_neutral2_700,
    "neutral_2_800" to android.R.color.system_neutral2_800,
    "neutral_2_900" to android.R.color.system_neutral2_900,
    "neutral_2_1000" to android.R.color.system_neutral2_1000,
)

object ColorHelper {
    fun getColorHex(context: Context, @ColorRes id: Int): String {
        return String.format(
            "#%06x",
            ContextCompat.getColor(context, id) and 0xffffff
        ).uppercase()
    }
}