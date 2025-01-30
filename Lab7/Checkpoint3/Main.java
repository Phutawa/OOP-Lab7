public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {
            new Button("Draw"),
            new TextBox(),
            new ColorPicker("Black")
        };

        UIPanel panel = new UIPanel(controls);
        panel.drawAll();

        System.out.println("\n// Simulating User Interactions");
        controls[0].handleEvent("click");
        controls[1].handleEvent("textChange:Hello World");
        controls[2].handleEvent("colorSelected:Red");

        System.out.println("\n// Redrawing after interactions");
        panel.drawAll();
    }
}

