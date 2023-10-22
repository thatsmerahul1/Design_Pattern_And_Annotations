plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("kotlin")
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<org.gradle.api.tasks.compile.JavaCompile> {
    options.compilerArgs.add("-source")
    options.compilerArgs.add("1.8")
    options.compilerArgs.add("-target")
    options.compilerArgs.add("1.8")
}

dependencies {
    project(":markermodule")
    implementation ("androidx.annotation:annotation:1.7.0")
    implementation ("com.squareup:kotlinpoet:1.8.0")
}