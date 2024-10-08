plugins {
   alias(libs.plugins.android.application)
   alias(libs.plugins.jetbrains.kotlin.android)
   alias(libs.plugins.googleService)
}

android {
   namespace = "com.facundo.ecommerce"
   compileSdk = 34

   defaultConfig {
      applicationId = "com.facundo.ecommerce"
      minSdk = 23
      targetSdk = 34
      versionCode = 1
      versionName = "1.0"
      vectorDrawables.useSupportLibrary = true //Support image vec

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
   }

   buildTypes {
      release {
         isMinifyEnabled = false
         proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
         )
      }
   }
   compileOptions {
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
   }
   kotlinOptions {
      jvmTarget = "1.8"
   }
   buildFeatures {
      viewBinding = true //Find View By Id
   }
}

dependencies {
   implementation(libs.androidx.core.ktx)
   implementation(libs.androidx.appcompat)
   implementation(libs.material)
   implementation(libs.androidx.activity)
   implementation(libs.androidx.constraintlayout)
   implementation(libs.lottie) //Animations
   implementation(libs.firebaseAuth) //Authentication with Firebase
   implementation(libs.firebaseDatabase) //Database with Firebase
   testImplementation(libs.junit)
   androidTestImplementation(libs.androidx.junit)
   androidTestImplementation(libs.androidx.espresso.core)
}