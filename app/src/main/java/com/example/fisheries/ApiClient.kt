package com.example.fisheries

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiClient {
    @POST("productUpload")
    @FormUrlEncoded
    fun productDetailsPost(
        @Field("is_public") is_public: Boolean,
        @Field("title") title: String,
        @Field("slug") slug: String,
        @Field("product_class") product_class: Int
    ): Call<DefaultResponse>
}