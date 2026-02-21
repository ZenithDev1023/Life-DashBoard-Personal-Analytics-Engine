package utils;

public class ConsoleTheme {
    public static final String TITLE =
            ConsoleColors.UNDERLINE.getCode() +
                    ConsoleColors.BRIGHT_CYAN.getCode();

    public static final String SUCCESS =
            ConsoleColors.BOLD.getCode() +
                    ConsoleColors.GREEN.getCode();

    public static final String ERROR =
            ConsoleColors.BOLD.getCode() +
                    ConsoleColors.BRIGHT_RED.getCode();

    public static final String WARNING =
            ConsoleColors.UNDERLINE.getCode() +
                    ConsoleColors.YELLOW.getCode();

    public static final String INFO =
            ConsoleColors.UNDERLINE.getCode() +
                    ConsoleColors.BRIGHT_BLUE;

    public static final String INPUT =
            ConsoleColors.BOLD.getCode() +
                    ConsoleColors.WHITE.getCode();

    public static final String RESET =
            ConsoleColors.RESET.getCode();

    public static final String format(String style, String text) { return style + text + RESET; }
}
