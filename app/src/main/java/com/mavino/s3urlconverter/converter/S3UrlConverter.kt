package com.mavino.s3urlconverter.converter

class S3UrlConverter(val url: String) {


    fun parse(): String{
        // split
        var result = url.split(".mp4")[0]
        result = result.split("/")[3]

        result = Constants.URL_TEMPLATE + result + Constants.URL_EXT
        return result
    }
}