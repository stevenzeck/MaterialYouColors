package com.example.materialyoucolors

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
fun ColorRow(
    name: String,
    color: Color,
    hexLabel: String
) {
    val textColor = if (color.luminance() > 0.5f) Color.Black else Color.White

    Row {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color)
                .padding(20.dp)
                .semantics {
                    contentDescription = "Color swatch for shade $name. Hex value is $hexLabel"
                }
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
                        text = hexLabel,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = textColor,
                    )
                }
            }
        }
    }
}
