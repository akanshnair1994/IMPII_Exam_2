
package com.hexamind.retrofitevaluation1;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class JsonElement {

    @Expose
    private Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

}
