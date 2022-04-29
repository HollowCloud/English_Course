package com.example.english_course.sections

import android.os.Parcelable
import androidx.versionedparcelable.ParcelField
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val ImageSrc: Int,
    val ImageTitle: String,
    val ImageDescription: String
): Parcelable