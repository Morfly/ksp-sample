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
    // passing an argument to the symbol processor
    //arg("ignoreGenericArgs", "true")
}

dependencies {
    implementation(project(":annotations"))
    ksp(project(":processor"))
}
