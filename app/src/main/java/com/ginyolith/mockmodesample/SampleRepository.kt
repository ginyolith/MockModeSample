package com.ginyolith.mockmodesample

interface SampleRepository {
    fun getHelloWorld() : String
}

class SampleRepositoryImpl : SampleRepository {
    override fun getHelloWorld(): String {
        return "Hello World from Real Repository"
    }

}