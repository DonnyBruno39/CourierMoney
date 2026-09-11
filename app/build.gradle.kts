plugins {
    id("com.android.application")
}

android {
    namespace = "ru.courier.money"
    compileSdk = 36

    defaultConfig {
        applicationId = "ru.courier.money"
        minSdk = 23
        targetSdk = 36
        versionCode = 20
        versionName = "2.12.0"

        val orsApiKey = System.getenv("ORS_API_KEY") ?: ""
        val escaped = orsApiKey.replace("\\", "\\\\").replace("\"", "\\\"")
        buildConfigField("String", "ORS_API_KEY", "\"$escaped\"")
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
