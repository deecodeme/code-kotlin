package com.deecodeme.code.kotlin.coroutine

import kotlinx.coroutines.*;

class SampleCoroutine {
    fun simpleCoroutine() = runBlocking {
        val job = launch {
            delay(1000L)
            println("${Thread.currentThread().name} World!")
        }
        val job2 = launch {
            delay(2000L)
            println("${Thread.currentThread().name} World2!")
        }
        println("${Thread.currentThread().name}: Hello,")
        job.join()
        job2.join()
    }

    /*
    https://refactorizando.com/en/coroutines-in-kotlin-vs-java-threads
     */
    fun coroutinesReusingThreads() {
        println("Test to delay a coroutine. ${Thread.currentThread().name}}")
        repeat(10){
            GlobalScope.launch {
                println("Before execution time $it: ${Thread.currentThread().name}")
                delay(10)
                println("After execution time $it: ${Thread.currentThread().name}")
            }
        }
        Thread.sleep(200)
    }
}