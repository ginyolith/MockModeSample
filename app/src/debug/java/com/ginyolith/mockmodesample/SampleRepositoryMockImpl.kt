package com.ginyolith.mockmodesample

class SampleRepositoryMockImpl : SampleRepository {
    override fun getHelloWorld(): String {
        return "Hello World from Mock Repository"
    }

}