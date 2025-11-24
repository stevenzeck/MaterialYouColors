package com.example.materialyoucolors

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import com.example.materialyoucolors.ui.theme.MaterialYouColorsTheme
import com.example.materialyoucolors.ui.theme.colorMap


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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            MaterialYouColorsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = stringResource(id = R.string.app_name))
                            },
                        )
                    },
                ) { innerPadding ->
                    LazyColumn(
                        modifier = Modifier
                            .padding(innerPadding)
                            .verticalScroll(scrollState)
                    ) {
                        items(colorTypes) { colorType ->
                            val title = colorType.uppercase().replace('_', ' ')
                            SectionTitle(text = title)
                            colorShades.forEach { colorShade ->
                                val colorString = "${colorType}_$colorShade"
                                val color =
                                    this@MainActivity.getHexColor(colorMap[colorString] ?: 0)
                                ColorRow(name = colorShade, colorString = color)
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
fun ColorRow(name: String, colorString: String) {

    val actualColor = colorString.color
    val textColor = if (actualColor.luminance() > 0.5f) Color.Black else Color.White

    Row {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(actualColor)
                .padding(20.dp)
        ) {
            SelectionContainer {
                Text(
                    text = name,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = textColor,
                    modifier = Modifier.align(Alignment.CenterStart),
                )
            }
            Box(
                modifier = Modifier.align(Alignment.CenterEnd),
            ) {
                SelectionContainer {
                    Text(
                        text = colorString,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = textColor,
                    )
                }
            }
        }
    }
}

val String.color
    get() = Color(this.toColorInt())

fun Context.getHexColor(@ColorRes id: Int): String {
    val colorInt = ContextCompat.getColor(this, id)
    return String.format("#%06X", (colorInt and 0xFFFFFF))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialYouColorsTheme {
        ColorRow("300", "#385870000")
    }
}
