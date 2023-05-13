package com.thesou.basicstatecodelab.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.thesou.basicstatecodelab.StatefulCounter
import com.thesou.basicstatecodelab.WaterCounter

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    StatefulCounter(modifier)
}