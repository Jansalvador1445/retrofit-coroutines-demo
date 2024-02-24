package com.example.esgueera

import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {
    @GET("posts/1")
    suspend fun getProducts(): Response<Products>

    // MARK: ADD MORE HERE
}