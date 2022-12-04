import org.codehaus.groovy.runtime.StringGroovyMethods.padLeft

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

tasks.register("nextDay") {
    doLast {
        val sourcesDirectory = layout.projectDirectory.dir("src/main/kotlin/y2022")
        val lastDayNum = sourcesDirectory
            .asFileTree
            .map { it.name }
            .map { dayNum(it) }
            .maxOf { it }
        val nextDayNum = padLeft((lastDayNum + 1).toString(), 2, "0")

        copyFile(sourcesDirectory, "Day00.kt", nextDayNum)
        val testDirectory = layout.projectDirectory.dir("src/test/kotlin/y2022")
        copyFile(testDirectory, "Day00Test.kt", nextDayNum)
        val resourcesDirectory = layout.projectDirectory.dir("src/test/resources/2022")
        copyFile(resourcesDirectory, "day00Simple.txt", nextDayNum)
        copyFile(resourcesDirectory, "day00Real.txt", nextDayNum)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

fun dayNum(fileName: String): Int {
    return fileName.substring(3..4).toInt()
}

fun copyFile(folder: Directory, templateFileName: String, nextDayNum: String) {
    val sourceFileContent = folder.file(templateFileName).asFile.readText()
        .replace("00", nextDayNum)
    val newFile = folder.file(templateFileName.replace("00", nextDayNum)).asFile
    newFile.writeText(sourceFileContent)
}
