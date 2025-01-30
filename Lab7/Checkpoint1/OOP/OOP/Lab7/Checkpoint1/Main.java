package OOP.OOP.Lab7.Checkpoint3;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {
            new Button("Draw"),
            new TextBox(),
            new ColorPicker("Black")
        };

        UIPanel panel = new UIPanel(controls);
        panel.drawAll();

        // Simulate user interactions
        System.out.println("\n// Simulating User Interactions");
        controls[0].handleEvent("click");  // Button click
        controls[1].handleEvent("textChange:Hello World");  // TextBox input
        controls[2].handleEvent("colorSelected:Red");  // ColorPicker selection

        System.out.println("\n// Redrawing after interactions");
        panel.drawAll();  // Redraw all elements
    }
}

