buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
        classpath("com.android.tools.build:gradle:4.1.0-rc02")
    }
}
group = "com.serapbercin.kotlinmm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
