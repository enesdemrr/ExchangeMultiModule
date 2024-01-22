pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ExchangeMultiModule"
include(":app")
include(":common")
include(":feature")
include(":navigation")
include(":common:data")
include(":common:domain")
include(":common:presentation")
include(":feature:home")
include(":feature:home:data")
include(":feature:home:domain")
include(":feature:home:presentation")
