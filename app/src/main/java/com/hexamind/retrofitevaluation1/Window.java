
package com.hexamind.retrofitevaluation1;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Window {

    @Expose
    private Long height;
    @Expose
    private String name;
    @Expose
    private String title;
    @Expose
    private Long width;

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

}
