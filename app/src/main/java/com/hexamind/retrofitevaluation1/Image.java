
package com.hexamind.retrofitevaluation1;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Image {

    @Expose
    private String alignment;
    @Expose
    private Long hOffset;
    @Expose
    private String name;
    @Expose
    private String src;
    @Expose
    private Long vOffset;

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
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

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Long getVOffset() {
        return vOffset;
    }

    public void setVOffset(Long vOffset) {
        this.vOffset = vOffset;
    }

}
