package com.zoravier.customcamera.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "person_name") val personName: String?,
    @ColumnInfo(name = "email_id") val emailId: String?
)
