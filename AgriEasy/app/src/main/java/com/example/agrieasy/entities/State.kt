package com.example.agrieasy.entities

import androidx.room.PrimaryKey

data class State(
    @PrimaryKey(autoGenerate= false)
    val state: String,
    val sr_no: Int
)