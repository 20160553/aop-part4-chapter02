package fastcampus.aop.part3.chapter04.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/f64a5edf-4be6-4bd1-8ef2-b3242c5b7cd4")
    fun listMusics() : Call<MusicDto>
}