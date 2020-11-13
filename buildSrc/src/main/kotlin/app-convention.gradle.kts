plugins {
    java
    id("com.github.johnrengelman.shadow")
}

tasks {
    shadowJar {
        isZip64 = true
    }
}
