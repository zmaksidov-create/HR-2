plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
