package builder_pattern;

public class Text {
    private String displayValue; 
    private String font; 
    private String color; 
    private String decoration; 

    public Text(TextBuilder builder) {
        this.displayValue = builder.displayValue;
        this.font = builder.font;
        this.color = builder.color;
        this.decoration = builder.decoration;
    }

    public static class TextBuilder {
        private String displayValue; 
        private String font; 
        private String color; 
        private String decoration; 

        public TextBuilder displayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }

        public TextBuilder font(String font) {
            this.font = font;
            return this;
        }

        public TextBuilder color(String color) {
            this.color = color;
            return this;
        }

        public TextBuilder decoration(String decoration) {
            this.decoration = decoration;
            return this;
        }

        public Text build() {
            return new Text(this);
        }
    }

    @Override
    public String toString() {
        return "Text [displayValue=" + displayValue + ", font=" + font + ", color=" + color + ", decoration="
                + decoration + "]";
    }
}
