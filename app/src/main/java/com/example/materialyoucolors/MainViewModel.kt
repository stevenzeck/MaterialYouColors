package com.example.materialyoucolors

import android.app.Application
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import com.example.materialyoucolors.ui.theme.systemColorList

data class ColorItem(
    val shade: String,
    val color: Color,
    val hexString: String
)

data class ColorSection(
    val title: String,
    val items: List<ColorItem>
)

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val colorSections: List<ColorSection> = systemColorList
        .groupBy { it.group }
        .map { (group, entries) ->
            ColorSection(
                title = group,
                items = entries.map { entry ->
                    val colorInt = ContextCompat.getColor(application, entry.resId)
                    ColorItem(
                        shade = entry.shade,
                        color = Color(colorInt),
                        hexString = String.format("#%06X", (colorInt and 0xFFFFFF))
                    )
                }
            )
        }
}
