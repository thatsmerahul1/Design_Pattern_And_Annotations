package com.rahul.marker

import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

class CustomProcessor: AbstractProcessor() {
    override fun getSupportedAnnotationTypes() = mutableSetOf(CustomMarker::class.java.canonicalName)

    override fun process(annotations: MutableSet<out TypeElement>?, roundEnvironment: RoundEnvironment?): Boolean {
        val elementsAnnotatedWithMyAnnotation = roundEnvironment?.getElementsAnnotatedWith(CustomMarker::class.java)

        elementsAnnotatedWithMyAnnotation?.let {
            for (element in elementsAnnotatedWithMyAnnotation) {
                // Generate code for the element.
            }
        }
        return true
    }
    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.latestSupported()
    }
}