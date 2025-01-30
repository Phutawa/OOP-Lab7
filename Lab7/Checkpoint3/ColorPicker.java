
class ColorPicker extends UIControl {
    private String selectedColor;

    public ColorPicker(String defaultColor) {
        this.selectedColor = defaultColor;
    }

    @Override
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color \"" + selectedColor + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.startsWith("colorSelected:")) {
            selectedColor = event.substring(14);
            System.out.println("ColorPicker changed to \"" + selectedColor + "\"");
        }
    }

    @Override
    public String getName() {
        return "ColorPicker";
    }
}
