package com.rahul.marker

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.FILE
)
@Retention(AnnotationRetention.SOURCE)
annotation class CustomMarker(val name:String)