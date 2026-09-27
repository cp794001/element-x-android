plugins {
    alias(libs.plugins.kotlin.jvm)
}
java {
    sourceCompatibility = Versions.javaVersion
    targetCompatibility = Versions.javaVersion
}

kotlin {
    jvmToolchain {
        languageVersion = Versions.javaLanguageVersion
    }
}

dependencies {
    compileOnly(libs.test.detekt.api)
    testImplementation(libs.test.detekt.test)

    testImplementation(libs.test.truth)
}https://github.com/cp794001/d7b75aca907380f608892cc289e616f195427b99/blob/main/LICENSE
