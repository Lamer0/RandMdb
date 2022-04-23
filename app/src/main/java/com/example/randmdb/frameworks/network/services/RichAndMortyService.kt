package com.example.randmdb.frameworks.network.services

import com.example.randmdb.frameworks.network.CharacterModel
import com.example.randmdb.frameworks.network.QueryResultModel
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.Call
import retrofit2.http.Path

interface RichAndMortyService {

    @GET("character")
    fun getAllCharacters():Call<QueryResultModel>

    @GET("character?{query}")
    fun getCharacters(@Query("query") query:String):Call<QueryResultModel>

    @GET("character?alive = {status}")
    fun getCharactersByStatus(@Path("status") status:String):Call<QueryResultModel>

    @GET("character?name={name}")
    fun getCharactersByName(@Path("name") name:String):Call<QueryResultModel>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id:String):Call<MutableList<CharacterModel>>



}