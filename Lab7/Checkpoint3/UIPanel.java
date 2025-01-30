
class UIPanel {
    private UIControl[] controls;

    public UIPanel(UIControl[] controls) {
        this.controls = controls;
    }

    public void drawAll() {
        System.out.println("// Calling drawAll() on the UIPanel");
        for (UIControl control : controls) {
            control.draw();
        }
    }
}
