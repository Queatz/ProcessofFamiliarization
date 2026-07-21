plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeMultiplatform)
}

kotlin {
    js {
        outputModuleName = "web"
        browser()
        binaries.executable()
    }

    sourceSets {
        jsMain.dependencies {
            implementation(project(":core"))
            implementation(compose.html.core)
            implementation(compose.runtime)
        }
        jsTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
