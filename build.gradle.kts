plugins {
	id("org.springframework.boot") version "3.3.2" apply false
	id("io.spring.dependency-management") version "1.1.6" apply false
	kotlin("plugin.jpa") version "1.9.24" apply false
	kotlin("jvm") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24" apply false
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "java")
	apply(plugin = "io.spring.dependency-management")

	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "org.springframework.boot")

	apply(plugin = "kotlin")
	apply(plugin = "kotlin-spring") //allopen
	apply(plugin = "kotlin-jpa")

	group = "com.gorany"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation(kotlin("stdlib"))

		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
//		developmentOnly("org.springframework.boot:spring-boot-devtools")
		runtimeOnly("com.h2database:h2")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
		testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	}

	kotlin {
		compilerOptions {
			freeCompilerArgs.addAll("-Xjsr305=strict")
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}
