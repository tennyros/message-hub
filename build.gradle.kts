plugins {
    id("org.springframework.boot") version "3.4.3" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
}

subprojects {

    group = "com.github.tennyros.messagehub"
    version = "1.0.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter")
//    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}