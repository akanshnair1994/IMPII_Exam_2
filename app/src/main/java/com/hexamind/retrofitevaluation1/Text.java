
package com.hexamind.retrofitevaluation1;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Text {

    @Expose
    private String alignment;
    @Expose
    private String data;
    @Expose
    private Long hOffset;
    @Expose
    private String name;
    @Expose
    private String onMouseUp;
    @Expose
    private Long size;
    @Expose
    private String style;
    @Expose
    private Long vOffset;

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getHOffset() {
        return hOffset;
    }

    public void setHOffset(Long hOffset) {
        this.hOffset = hOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnMouseUp() {
        return onMouseUp;
    }

    public void setOnMouseUp(String onMouseUp) {
        this.onMouseUp = onMouseUp;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getVOffset() {
        return vOffset;
    }

    public void setVOffset(Long vOffset) {
        this.vOffset = vOffset;
    }

}
