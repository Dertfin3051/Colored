# Colored

**Colored** - a simple Java-library for quickly using ANSI-colors in the console for your Java program.

## Installation
[![](https://jitpack.io/v/Dertfin3051/Colored.svg)](https://jitpack.io/#Dertfin3051/Colored)
### Maven
To install *Colored* into your Maven project, first add the JitPack repository to your `pom.xml` file:
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Then add *Colored*  to your dependencies, actually in `pom.xml`:
```
<dependencies>
    <dependency>
      <groupId>com.github.Dertfin3051</groupId>
      <artifactId>Colored</artifactId>
      <version>1.1</version>
    </dependency>
</dependencies>
```

### Gradle (Groovy)
To install *Colored* into your Gradle project __running on Groovy DSL__, first add the JitPack repository to your `build.gradle` file:
```
repositories {
    maven { url " https://jitpack.io" }
}
```
Then add *Colored*  to your dependencies, actually in `build.gradle`:
```
dependencies {
    implementation "com.github.Dertfin3051:Colored" version "1.1"
}
```

### Gradle (Kotlin)
To install *Colored* into your Gradle project __running on Kotlin DSL__, first add the JitPack repository to your `build.gradle` file:
```
repositories {
    maven {
        setUrl("https://jitpack.io")
    }
}
```
Then add *Colored*  to your dependencies, actually in `build.gradle`:
```
dependencies {
    implementation("com.github.Dertfin3051:Colored:1.1")
}
```

## How to use
*Colored* library is very simple to use. For make you text colored, just use one of the colors from `Color` enum:
```
System.out.println(Color.RED + "This text is red!");
```

**But**, if line ends, color isn't reset. Just use `Style.RESET`, to reset your color *(and all styles)*.
```
System.out.println(Color.PURPLE + "This text is purple!" + Color.RESET);
System.out.println("This text has default color");
```

Besides the color you can change the text background
```
System.out.println("" +
    Color.RED + Background.PURPLE +
    "This is red text with purple background :D"
    + Style.RESET
);
```

Since we touched on Style, we can also look at its functions.  
There are several styles that *Colored* supports:
- `Style.BOLD`
- `Style.ITALIC`
- `Style.UNDERLINE`
- `Style.RESET` *don't forget about it*

*Now you can find `Style.NONE`. Let his appointment remain a surprise for you until the next update :D*

## *Good luck!*
