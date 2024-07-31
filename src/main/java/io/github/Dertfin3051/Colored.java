package io.github.Dertfin3051;

public class Colored {

    private final String text;
    private final StringBuilder styles = new StringBuilder();

    public Colored(String text, Color color, Background background, Style style) {
        this.text = text;
        styles.append(color.toString());
        styles.append(background.toString());
        styles.append(style.toString());
    }

    public Colored(String text, Color color) {
        this.text = text;
        styles.append(color.toString());
    }

    public Colored(String text, Style style) {
        this.text = text;
        styles.append(style.toString());
    }

    public Colored(String text, Background background) {
        this.text = text;
        styles.append(background.toString());
    }

    public String getText() {
        return text;
    }

    public String getStyles() {
        return styles.toString();
    }

    @Override
    public String toString() {
        return styles.toString() + text + Style.RESET;
    }
}
