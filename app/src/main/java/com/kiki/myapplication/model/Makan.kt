package com.kiki.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Makan(
    val name: String,
    val locationName: String,
    val description: String,
    val imageUrl: String,
    val rating: Double,
    val category: String,
    val latitude: Double,
    val longitude: Double,
    val isFavorite: Boolean = false,
) : Parcelable

