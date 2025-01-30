class Button extends UIControl {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button with label \"" + label + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("click")) {
            System.out.println("Button \"" + label + "\" clicked!");
        }
    }

    @Override
    public String getName() {
        return "Button";
    }
}

