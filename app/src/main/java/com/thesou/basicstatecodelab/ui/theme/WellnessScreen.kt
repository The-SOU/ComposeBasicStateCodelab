package com.thesou.basicstatecodelab.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.thesou.basicstatecodelab.StatefulCounter
import com.thesou.basicstatecodelab.WaterCounter
import com.thesou.basicstatecodelab.WellnessTask
import com.thesou.basicstatecodelab.WellnessTaskList
import com.thesou.basicstatecodelab.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column() {
        StatefulCounter(modifier)

        WellnessTaskList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) },
            modifier = modifier
        )
    }
}

