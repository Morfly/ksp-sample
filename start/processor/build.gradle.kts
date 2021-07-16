plugins {
    kotlin("jvm")
}

// gradle.properties
val kspVersion: String by project

dependencies {
    implementation(project(":annotations"))
    implementation("com.google.devtools.ksp:symbol-processing-api:$kspVersion")
}