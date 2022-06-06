package com.example.proyecto.database

class Product(
    nombre:String, artista:String, año: String, genero:String, album:String, duracion:String, url:String, pista:String
) {

    val nombre: String = nombre
    val artista: String  = artista
    val año: String = año
    val genero: String = genero
    val album: String = album
    val duracion: String = duracion
    val url: String = url
    val pista: String = pista
}



fun Product.toEntity() = ProductEntity(
   nombre, artista, año, genero, album, duracion, url, pista
)