plugins {
    `java-library`
    `maven-publish`
}

group = "com.example"
version = "0.1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
        from(components["java"])
        }
    }
}
