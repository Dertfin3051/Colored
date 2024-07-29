package io.github.Dertfin3051;

/**
 * Enum containing ANSI codes to change the text color <p>
 * Using: Use one of these values as String.
 * @since 1.0
 */
public enum Color {
    /**
     * @deprecated `Color.RESET` will be deleted. Use `Style.RESET` instead
     */
    @Deprecated RESET("\u001B[0m"),

    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    LIGHT_BLUE("\u001B[39m")
    ;

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
