package io.github.Dertfin3051;

/**
 * Enum containing ANSI codes to change the text style <p>
 * Using: Use one of these values as String.<p>
 * `Style.RESET` reset all styles, colors etc
*/
public enum Style {
    RESET("\u001B[0m"),
    BOLD("\033[1m"),
    UNDERLINE("\033[4m"),
    ITALIC("\033[3m"),
    NONE("") // Instead null in the future :D
    ;

    private String value;

    Style(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
