plugins {
    id("java")
    `maven-publish`
}

group = "pt.saipar.opal"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.46")
	annotationProcessor("org.projectlombok:lombok:1.18.46")

    implementation("com.google.code.gson:gson:2.7")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "api"
            from(components["java"])
        }
    }
}
