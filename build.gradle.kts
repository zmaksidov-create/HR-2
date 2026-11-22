plugins {
    id("com.android.application") version"8.5.2"
    id("org.jetbrains.kotlin.android") version "1.9.24"
}
android {
    namespace = "tm.hrakademiya.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "tm.hrakademiya.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 2
        versionName = "2.0"
    }
}
