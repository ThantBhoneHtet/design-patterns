package builder_pattern;

public class BuilderDemo {
    public static void main(String[] args) {
        Text text = new Text.TextBuilder()
                            .displayValue("Title")
                            .font("large")
                            .color("green")
                            .decoration("none")
                            .build();
        System.out.println(text);
    }
}
