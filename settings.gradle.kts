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
        maven { url = uri("https://jitpack.io")}
    }
    repositories {
        jcenter()
    }
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "loanturbo"
include(":app")
 