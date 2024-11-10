package com.diaz.rodrigo.poketinder.api

import com.diaz.rodrigo.poketinder.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("/api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>
}