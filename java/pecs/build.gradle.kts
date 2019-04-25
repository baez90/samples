plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply lombok plugin
    id("io.freefair.lombok") version "3.2.0"
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}