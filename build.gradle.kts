plugins {
    id("java")
}

group = "xyz.galaxyy.lualink.addons.discordsrv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://codeberg.org/api/packages/LuaLink/maven")
    maven("https://repo.purpurmc.org/snapshots")
    maven("https://nexus.scarsz.me/content/groups/public/")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.purpurmc.purpur:purpur-api:1.20.4-R0.1-SNAPSHOT")
    compileOnly("xyz.galaxyy.lualink:lualink:1.20.4-SNAPSHOT")
    compileOnly("com.discordsrv:discordsrv:1.27.0")
}

tasks.test {
    useJUnitPlatform()
}
