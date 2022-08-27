package com.example.materialyoucolors

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialyoucolors.ui.theme.ColorHelper
import com.example.materialyoucolors.ui.theme.MaterialYouColorsTheme
import com.example.materialyoucolors.ui.theme.colorMap
import com.google.android.material.color.MaterialColors


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {

    private val colorTypes = listOf("accent_1", "accent_2", "accent_3", "neutral_1", "neutral_2")
    private val colorShades = listOf(
        "0",
        "10",
        "50",
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700",
        "800",
        "900",
        "1000"
    )

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            MaterialYouColorsTheme {
                Scaffold(
                    topBar = {
                        SmallTopAppBar(
                            title = {
                                Text(text = stringResource(id = R.string.app_name))
                            },
                        )
                    },
                ) {
                    Column(modifier = Modifier.verticalScroll(scrollState)) {
                        colorTypes.forEach { colorType ->
                            val title = colorType.uppercase().replace('_', ' ')
                            SectionTitle(text = title)
                            colorShades.forEach { colorShade ->
                                val colorString = "${colorType}_$colorShade"
                                val color = ColorHelper.getColorHex(
                                    this@MainActivity,
                                    colorMap[colorString]!!
                                )
                                ColorRow(name = colorShade, color = color)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SectionTitle(text: String) {
    Row(modifier = Modifier.background(MaterialTheme.colorScheme.secondary)) {
        SelectionContainer {
            Text(
                text = text,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondary,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
        }
    }
}

@Composable
fun ColorRow(name: String, color: String) {
    Row {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color.color)
                .padding(20.dp)
        ) {
            SelectionContainer {
                Text(
                    text = name,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (MaterialColors.isColorLight(color.color.toArgb())) Color.Black else Color.White,
                    modifier = Modifier.align(Alignment.CenterStart),
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.CenterEnd),
            ) {
                SelectionContainer {
                    Text(
                        text = color,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (MaterialColors.isColorLight(color.color.toArgb())) Color.Black else Color.White,
                    )
                }
            }
        }
    }
}

val String.color
    get() = Color(android.graphics.Color.parseColor(this))

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialYouColorsTheme {
        ColorRow("300", "#385870000")
    }
}
