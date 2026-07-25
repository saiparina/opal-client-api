plugins {
    id("java")
}

group = "pt.saipar"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.46")
	annotationProcessor("org.projectlombok:lombok:1.18.46")

    implementation("com.google.code.gson:gson:2.7")
}
