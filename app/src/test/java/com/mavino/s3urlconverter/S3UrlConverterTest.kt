package com.mavino.s3urlconverter

import com.google.common.truth.Truth
import com.mavino.s3urlconverter.converter.Constants
import com.mavino.s3urlconverter.converter.S3UrlConverter
import org.junit.Test


class S3UrlConverterTest{

    val converter = S3UrlConverter(Constants.TEST_URL)

    @Test
    fun`test s3 url converter`(){

        val expected = "https://edekee-m3u8.s3.us-east-2.amazonaws.com/001ClayPotter_1.m3u8"

        val actual = converter.parse()

        println("this is actual result   " + actual)

        Truth.assertThat(expected).isEqualTo(actual)

    }
}