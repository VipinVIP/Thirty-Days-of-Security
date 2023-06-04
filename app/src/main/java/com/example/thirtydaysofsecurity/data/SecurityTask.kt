package com.example.thirtydaysofsecurity.data

import androidx.annotation.StringRes
import com.example.thirtydaysofsecurity.R

data class SecurityTask (
    val dayNum:Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
)

val securityTasks = listOf(
    SecurityTask(1, R.string.heading_1, R.string.description_1),
    SecurityTask(2, R.string.heading_2, R.string.description_2),
    SecurityTask(3, R.string.heading_3, R.string.description_3),
    SecurityTask(4, R.string.heading_4, R.string.description_4),
    SecurityTask(5, R.string.heading_5, R.string.description_5),
    SecurityTask(6, R.string.heading_6, R.string.description_6),
    SecurityTask(7, R.string.heading_7, R.string.description_7),
    SecurityTask(8, R.string.heading_8, R.string.description_8),
    SecurityTask(9, R.string.heading_9, R.string.description_9),
    SecurityTask(10, R.string.heading_10, R.string.description_10),
    SecurityTask(11, R.string.heading_11, R.string.description_11),
    SecurityTask(12, R.string.heading_12, R.string.description_12),
    SecurityTask(13, R.string.heading_13, R.string.description_13),
    SecurityTask(14, R.string.heading_14, R.string.description_14),
    SecurityTask(15, R.string.heading_15, R.string.description_15),
    SecurityTask(16, R.string.heading_16, R.string.description_16),
    SecurityTask(17, R.string.heading_17, R.string.description_17),
    SecurityTask(18, R.string.heading_18, R.string.description_18),
    SecurityTask(19, R.string.heading_19, R.string.description_19),
    SecurityTask(20, R.string.heading_20, R.string.description_20),
    SecurityTask(21, R.string.heading_21, R.string.description_21),
    SecurityTask(22, R.string.heading_22, R.string.description_22),
    SecurityTask(23, R.string.heading_23, R.string.description_23),
    SecurityTask(24, R.string.heading_24, R.string.description_24),
    SecurityTask(25, R.string.heading_25, R.string.description_25),
    SecurityTask(26, R.string.heading_26, R.string.description_26),
    SecurityTask(27, R.string.heading_27, R.string.description_27),
    SecurityTask(28, R.string.heading_28, R.string.description_28),
    SecurityTask(29, R.string.heading_29, R.string.description_29),
    SecurityTask(30, R.string.heading_30, R.string.description_30)
)