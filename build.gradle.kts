plugins {
    kotlin("jvm") version "1.7.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.nield:kotlin-statistics:1.2.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks {
    wrapper {
        gradleVersion = "7.6"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
