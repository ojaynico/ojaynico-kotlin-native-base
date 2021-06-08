# ojaynico-kotlin-native-base
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ojaynico/ojaynico-kotlin-native-base/badge.svg)](https://search.maven.org/artifact/com.github.ojaynico/ojaynico-kotlin-native-base/1.0.4/pom)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ojaynico/ojaynico-kotlin-react-native/badge.svg)](https://search.maven.org/artifact/com.github.ojaynico/ojaynico-kotlin-react-native/1.1.3/pom)
[![Kotlin](https://img.shields.io/badge/kotlin-1.5.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react)
[![npm version](https://img.shields.io/npm/v/react-native?color=brightgreen&label=npm%20package)](https://www.npmjs.com/package/react-native)
[![Kotlin JS IR supported](https://img.shields.io/badge/Kotlin%2FJS-IR%20supported-yellow)](https://kotl.in/jsirsupported)

Kotlin Wrapper for Native Base

Available components: All native base components are available in this wrapper. Check them out using the URL below:

https://nativebase.io/

## `How to use the wrapper?`

Use the cli tool below to generate a new Kotlin React Native application.

https://github.com/ojaynico/create-ojaynico-krn

Proceed to the next step after generating the project.

Run the following command in your projects root directory.

`npm install native-base --save`

In your react native application shared module (a kotlin gradle project), update your gradle file to include the following in the respective blocks.

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ojaynico:ojaynico-kotlin-native-base:1.0.4")
}
```

### `Example of code snippet for a native base app using the above wrapper`

```kotlin
import ojaynico.kotlin.native.base.*
import ojaynico.kotlin.react.native.AppRegistry
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        container {
            header {
                left {
                    button {
                        attrs.transparent = true
                        icon {
                            name = "menu"
                        }
                    }
                }
                body {
                    title("Header") {

                    }
                }
                right {  }
            }
            content {
                text("This is Content Section") {}
            }
            footer {
                footerTab {
                    button {
                        attrs.full = true
                        text("Footer") {

                        }
                    }
                }
            }
        }
    }
}

fun main() {
    AppRegistry.registerComponent("NativeBase") { App::class.js }
}
```
