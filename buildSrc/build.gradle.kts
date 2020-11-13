plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    //implementation("com.github.jengelman.gradle.plugins:shadow:6.0.0") // works as expected
    implementation("com.github.jengelman.gradle.plugins:shadow:6.1.0") // IDEA integration broken
}
