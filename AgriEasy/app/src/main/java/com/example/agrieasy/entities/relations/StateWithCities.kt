package com.example.agrieasy.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.agrieasy.entities.City
import com.example.agrieasy.entities.State

data class StateWithCities(
    @Embedded val state: State,
    @Relation(
        parentColumn="state",
        entityColumn = "state"
    )
    val cities: List<City>
)