package com.formconstructor.form.element;

import com.google.gson.annotations.SerializedName;

public enum ElementType {
    @SerializedName("divider") DIVIDER,
    @SerializedName("dropdown") DROPDOWN,
    @SerializedName("header") HEADER,
    @SerializedName("input") INPUT,
    @SerializedName("label") LABEL,
    @SerializedName("slider") SLIDER,
    @SerializedName("step_slider") STEP_SLIDER,
    @SerializedName("toggle") TOGGLE;
}