pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "AreaCalculator"

//include(":androidApp", ":shared", "compose-desktop")
include(":androidApp")
include(":shared")
