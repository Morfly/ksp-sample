plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp")
}

kotlin.sourceSets.main {
    kotlin.srcDirs(
        file("$buildDir/generated/ksp/main/kotlin"),
    )
}

ksp {
    // passing an argument to our processor
    arg("ignoreGenericArgs", "false")
}

dependencies {
    implementation(project(":annotations"))
    ksp(project(":processor"))
}