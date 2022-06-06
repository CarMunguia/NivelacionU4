package com.example.proyecto.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//TODO add TABLE_USERS constant
@Entity(tableName = TABLE_PRODUCTS)
data class ProductEntity(
    @PrimaryKey val nombre: String,
    @ColumnInfo(name = "artista") val artista: String,
    val url: String,
    val año: String,
    val genero: String,
    val album: String,
    val duracion : String,
    val pista: String
)

fun ProductEntity.toProduct() = Product(nombre, artista, url, año, genero, album, duracion, pista)