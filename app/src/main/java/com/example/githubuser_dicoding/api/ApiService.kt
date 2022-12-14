package com.example.githubuser_dicoding.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    //    Perhatikan anotasi headers nya bila tidak bisa request ke api
    @GET("users")
//    Menggunaka token api seperti ini sebenarnya tidak disarankan
    @Headers("Authorization: token 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")
    fun getListUser(): Call<List<ResponseItem>>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<ResponseDetail>

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q") q: String
    ): Call<ResponseSearch>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<List<ResponseItem>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<List<ResponseItem>>
}