package io.github.Dertfin3051;

import java.io.IOException;

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

    /**
     * Method for correctly displaying colors on different operating systems. <br>
     * On Windows OS, programs cannot output ANSI colors,
     * so this process occurs through calling the "echo" command
     */
    public void safePrint() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec(String.format("echo \"%s\"", this)); // Try to print colored text with "echo"
            } catch (IOException e) {
                System.out.println(this.text); // Print non-colored text if "echo" command thrown IOE
            }
        } else {
            System.out.println(this); // Other OS supports program output with ANSI-colors
        }
    }
}
