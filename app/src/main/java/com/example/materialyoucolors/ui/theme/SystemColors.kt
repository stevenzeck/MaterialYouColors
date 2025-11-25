package com.example.materialyoucolors.ui.theme

import androidx.annotation.ColorRes

data class SystemColorEntry(
    val group: String,
    val shade: String,
    @param:ColorRes val resId: Int
)

// Fully explicit list to ensure type safety and allow the ViewModel to iterate deterministically
val systemColorList = listOf(
    // Accent 1
    SystemColorEntry("Accent 1", "0", android.R.color.system_accent1_0),
    SystemColorEntry("Accent 1", "10", android.R.color.system_accent1_10),
    SystemColorEntry("Accent 1", "50", android.R.color.system_accent1_50),
    SystemColorEntry("Accent 1", "100", android.R.color.system_accent1_100),
    SystemColorEntry("Accent 1", "200", android.R.color.system_accent1_200),
    SystemColorEntry("Accent 1", "300", android.R.color.system_accent1_300),
    SystemColorEntry("Accent 1", "400", android.R.color.system_accent1_400),
    SystemColorEntry("Accent 1", "500", android.R.color.system_accent1_500),
    SystemColorEntry("Accent 1", "600", android.R.color.system_accent1_600),
    SystemColorEntry("Accent 1", "700", android.R.color.system_accent1_700),
    SystemColorEntry("Accent 1", "800", android.R.color.system_accent1_800),
    SystemColorEntry("Accent 1", "900", android.R.color.system_accent1_900),
    SystemColorEntry("Accent 1", "1000", android.R.color.system_accent1_1000),

    // Accent 2
    SystemColorEntry("Accent 2", "0", android.R.color.system_accent2_0),
    SystemColorEntry("Accent 2", "10", android.R.color.system_accent2_10),
    SystemColorEntry("Accent 2", "50", android.R.color.system_accent2_50),
    SystemColorEntry("Accent 2", "100", android.R.color.system_accent2_100),
    SystemColorEntry("Accent 2", "200", android.R.color.system_accent2_200),
    SystemColorEntry("Accent 2", "300", android.R.color.system_accent2_300),
    SystemColorEntry("Accent 2", "400", android.R.color.system_accent2_400),
    SystemColorEntry("Accent 2", "500", android.R.color.system_accent2_500),
    SystemColorEntry("Accent 2", "600", android.R.color.system_accent2_600),
    SystemColorEntry("Accent 2", "700", android.R.color.system_accent2_700),
    SystemColorEntry("Accent 2", "800", android.R.color.system_accent2_800),
    SystemColorEntry("Accent 2", "900", android.R.color.system_accent2_900),
    SystemColorEntry("Accent 2", "1000", android.R.color.system_accent2_1000),

    // Accent 3
    SystemColorEntry("Accent 3", "0", android.R.color.system_accent3_0),
    SystemColorEntry("Accent 3", "10", android.R.color.system_accent3_10),
    SystemColorEntry("Accent 3", "50", android.R.color.system_accent3_50),
    SystemColorEntry("Accent 3", "100", android.R.color.system_accent3_100),
    SystemColorEntry("Accent 3", "200", android.R.color.system_accent3_200),
    SystemColorEntry("Accent 3", "300", android.R.color.system_accent3_300),
    SystemColorEntry("Accent 3", "400", android.R.color.system_accent3_400),
    SystemColorEntry("Accent 3", "500", android.R.color.system_accent3_500),
    SystemColorEntry("Accent 3", "600", android.R.color.system_accent3_600),
    SystemColorEntry("Accent 3", "700", android.R.color.system_accent3_700),
    SystemColorEntry("Accent 3", "800", android.R.color.system_accent3_800),
    SystemColorEntry("Accent 3", "900", android.R.color.system_accent3_900),
    SystemColorEntry("Accent 3", "1000", android.R.color.system_accent3_1000),

    // Neutral 1
    SystemColorEntry("Neutral 1", "0", android.R.color.system_neutral1_0),
    SystemColorEntry("Neutral 1", "10", android.R.color.system_neutral1_10),
    SystemColorEntry("Neutral 1", "50", android.R.color.system_neutral1_50),
    SystemColorEntry("Neutral 1", "100", android.R.color.system_neutral1_100),
    SystemColorEntry("Neutral 1", "200", android.R.color.system_neutral1_200),
    SystemColorEntry("Neutral 1", "300", android.R.color.system_neutral1_300),
    SystemColorEntry("Neutral 1", "400", android.R.color.system_neutral1_400),
    SystemColorEntry("Neutral 1", "500", android.R.color.system_neutral1_500),
    SystemColorEntry("Neutral 1", "600", android.R.color.system_neutral1_600),
    SystemColorEntry("Neutral 1", "700", android.R.color.system_neutral1_700),
    SystemColorEntry("Neutral 1", "800", android.R.color.system_neutral1_800),
    SystemColorEntry("Neutral 1", "900", android.R.color.system_neutral1_900),
    SystemColorEntry("Neutral 1", "1000", android.R.color.system_neutral1_1000),

    // Neutral 2
    SystemColorEntry("Neutral 2", "0", android.R.color.system_neutral2_0),
    SystemColorEntry("Neutral 2", "10", android.R.color.system_neutral2_10),
    SystemColorEntry("Neutral 2", "50", android.R.color.system_neutral2_50),
    SystemColorEntry("Neutral 2", "100", android.R.color.system_neutral2_100),
    SystemColorEntry("Neutral 2", "200", android.R.color.system_neutral2_200),
    SystemColorEntry("Neutral 2", "300", android.R.color.system_neutral2_300),
    SystemColorEntry("Neutral 2", "400", android.R.color.system_neutral2_400),
    SystemColorEntry("Neutral 2", "500", android.R.color.system_neutral2_500),
    SystemColorEntry("Neutral 2", "600", android.R.color.system_neutral2_600),
    SystemColorEntry("Neutral 2", "700", android.R.color.system_neutral2_700),
    SystemColorEntry("Neutral 2", "800", android.R.color.system_neutral2_800),
    SystemColorEntry("Neutral 2", "900", android.R.color.system_neutral2_900),
    SystemColorEntry("Neutral 2", "1000", android.R.color.system_neutral2_1000),
)
