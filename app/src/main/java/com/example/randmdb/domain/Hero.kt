package com.example.randmdb.domain

class Hero(
    val id:Int,
    val firstName:String,
    val image:String,
    val species:String,
    val type:String,
    val gender:String,
    val location:String,
    val episodes:Episode) {
}