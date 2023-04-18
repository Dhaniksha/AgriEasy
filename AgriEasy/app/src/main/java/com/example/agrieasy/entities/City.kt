package com.example.agrieasy.entities

import androidx.room.PrimaryKey

data class City(
    @PrimaryKey(autoGenerate= false)
    val c_name: String,
)