package com.example.picodiploma.mitologiyunani

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val imageSrc : Int,
    val imageTitle: String,
    val imageDesc: String,
    val simboldesk: String,
    val senjatadesk: String,
) : Parcelable