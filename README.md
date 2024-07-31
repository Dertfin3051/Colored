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

### Even easier!

If you need to use multiple styles, then there is an easier way - the `Colored` class. It contains several styles at once and automatically resets them at the end of the line. It's easy to create:
```
System.out.println(
    new Colored("Your text", Color.RED, Background.BLACK, Style.ITALIC)
);
```

If you don't need to use one or more parameters, then set them to `NONE`:
```
System.out.println(
    new Colored("Your text", Color.RED, Background.NONE, Style.ITALIC)
);
```

You can also stack multiple Coloreds together, but be sure to add an empty `""` at the beginning to avoid errors *(or use `.toString()` for the first one)*
```
System.out.println("" +
    new Colored("text1", Color.RED, Background.RED, Style.ITALIC) +
    new Colored("text2", Color.PURPLE, Background.NONE, Style.BOLD) +
    new Colored("text3", Color.NONE, Background.YELLOW, Style.UNDERLINE)
);
```
```
System.out.println("" +
    new Colored("Good", Color.YELLOW, Background.PURPLE, Style.ITALIC) +
    new Colored("luck!", Color.PURPLE, Background.RED, Style.ITALIC) +
);
```

## *Good luck!*
