package io.github.Dertfin3051;

/**
 * Enum containing ANSI codes to change the text background <p>
 * Using: Use one of these values as String.<p>
 */
public enum Background {
    BLACK("\033[40m"),
    RED("\033[41m"),
    GREEN("\033[42m"),
    YELLOW("\033[43m"),
    BLUE("\033[44m"),
    PURPLE("\033[45m"),
    CYAN("\033[46m"),
    WHITE("\033[47m")
    ;

    private String value;

    Background(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
