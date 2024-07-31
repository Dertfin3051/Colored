import io.github.Dertfin3051.Background;
import io.github.Dertfin3051.Color;
import io.github.Dertfin3051.Colored;
import io.github.Dertfin3051.Style;

public class Main {
    public static void main(String[] args) {
        System.out.println("" +
                new Colored("text1", Color.RED, Background.RED, Style.ITALIC) +
                new Colored("text2", Color.PURPLE, Background.NONE, Style.BOLD) +
                new Colored("text3", Color.NONE, Background.YELLOW, Style.UNDERLINE)
        );
    }
}
