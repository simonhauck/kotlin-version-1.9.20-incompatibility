plugins {
    // This fails, Ktfmt uses Kotlin 1.9.20
    kotlin("jvm") version "1.9.10"
    id("com.ncorti.ktfmt.gradle") version "0.15.0"

    // This works, both use the same version
//    kotlin("jvm") version "1.9.20"
//    id("com.ncorti.ktfmt.gradle") version "0.15.0"

// This works. ktfmt 0.0.14 uses Kotlin 1.9.10
//    kotlin("jvm") version "1.9.0"
//    id("com.ncorti.ktfmt.gradle") version "0.14.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}