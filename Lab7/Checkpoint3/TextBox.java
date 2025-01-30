class TextBox extends UIControl {
        private String text;
    
        public TextBox() {
            this.text = "";
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing TextBox with current text \"" + text + "\"");
        }
    
        @Override
        public void handleEvent(String event) {
            if (event.startsWith("textChange:")) {
                text = event.substring(11);
                System.out.println("TextBox updated to \"" + text + "\"");
            }
        }
    
        @Override
        public String getName() {
            return "TextBox";
        }
    }

