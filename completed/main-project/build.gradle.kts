plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp")
}

// Makes generated code visible to IDE
kotlin.sourceSets.main {
    kotlin.srcDirs(
        file("$buildDir/generated/ksp/main/kotlin"),
    )
}

ksp {
    // Passing an argument to the symbol processor.
    // Change value to "true" in order to apply the argument.
    arg("ignoreGenericArgs", "false")
}

dependencies {
    implementation(project(":annotations"))
    ksp(project(":processor"))
}
