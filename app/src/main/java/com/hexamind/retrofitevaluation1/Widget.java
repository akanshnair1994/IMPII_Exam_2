
package com.hexamind.retrofitevaluation1;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Widget {

    @Expose
    private String debug;
    @Expose
    private Image image;
    @Expose
    private Text text;
    @Expose
    private Window window;

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

}
