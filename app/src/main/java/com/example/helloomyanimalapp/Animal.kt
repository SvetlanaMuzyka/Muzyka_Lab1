package com.example.helloomyanimalapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val name: String,
    val age: Int,
    val color: String,
    val ownerName: String,
    val species: String,
    val sex: String
) : Parcelable
