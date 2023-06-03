package com.example.thirtydaysofsecurity.data

import androidx.annotation.StringRes
import com.example.thirtydaysofsecurity.R

data class SecurityTask (
    @StringRes val title: Int,
    @StringRes val description: Int,
)

val securityTasks = listOf(
    SecurityTask(R.string.heading_1, R.string.description_1),
    SecurityTask(R.string.heading_2, R.string.description_2),
    SecurityTask(R.string.heading_3, R.string.description_3),
    SecurityTask(R.string.heading_4, R.string.description_4),
    SecurityTask(R.string.heading_5, R.string.description_5),
    SecurityTask(R.string.heading_6, R.string.description_6),
    SecurityTask(R.string.heading_7, R.string.description_7),
    SecurityTask(R.string.heading_8, R.string.description_8),
    SecurityTask(R.string.heading_9, R.string.description_9),
    SecurityTask(R.string.heading_10, R.string.description_10),
    SecurityTask(R.string.heading_11, R.string.description_11),
    SecurityTask(R.string.heading_12, R.string.description_12),
    SecurityTask(R.string.heading_13, R.string.description_13),
    SecurityTask(R.string.heading_14, R.string.description_14),
    SecurityTask(R.string.heading_15, R.string.description_15),
    SecurityTask(R.string.heading_16, R.string.description_16),
    SecurityTask(R.string.heading_17, R.string.description_17),
    SecurityTask(R.string.heading_18, R.string.description_18),
    SecurityTask(R.string.heading_19, R.string.description_19),
    SecurityTask(R.string.heading_20, R.string.description_20),
    SecurityTask(R.string.heading_21, R.string.description_21),
    SecurityTask(R.string.heading_22, R.string.description_22),
    SecurityTask(R.string.heading_23, R.string.description_23),
    SecurityTask(R.string.heading_24, R.string.description_24),
    SecurityTask(R.string.heading_25, R.string.description_25),
    SecurityTask(R.string.heading_26, R.string.description_26),
    SecurityTask(R.string.heading_27, R.string.description_27),
    SecurityTask(R.string.heading_28, R.string.description_28),
    SecurityTask(R.string.heading_29, R.string.description_29),
    SecurityTask(R.string.heading_30, R.string.description_30)
)