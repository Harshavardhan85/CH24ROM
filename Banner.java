class Banner {
    private String message;
    private String fontColor;
    private int width;

    public Banner(String message, String fontColor, int width) {
        this.message = message;
        this.fontColor = fontColor;
        this.width = width;
    }

    public void display() {
        System.out.println("Banner Message: " + message + ", Font Color: " + fontColor + ", Width: " + width + " cm");
    }
}