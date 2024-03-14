package ru.easycode.zerotoheroandroidtdd

import kotlinx.coroutines.delay
import retrofit2.http.Url

interface Repository {

    suspend fun load(): SimpleResponse

    class Base(private val service: SimpleService, private val url: String) : Repository {
        override suspend fun load(): SimpleResponse {
            return service.fetch(url)
        }
    }
}
