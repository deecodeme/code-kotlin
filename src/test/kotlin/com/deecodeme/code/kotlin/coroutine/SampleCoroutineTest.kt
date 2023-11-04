package com.deecodeme.code.kotlin.coroutine

import org.junit.jupiter.api.Test

class SampleCoroutineTest {

    @Test
    fun simpleCoroutine() {
    }

    @Test
    fun coroutinesWithDelay() {
        SampleCoroutine().coroutinesReusingThreads()
    }
}