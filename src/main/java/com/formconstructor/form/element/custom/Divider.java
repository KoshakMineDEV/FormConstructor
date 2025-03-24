package com.formconstructor.form.element.custom;


import com.formconstructor.form.element.ElementType;

public class Divider extends CustomElement {
    public Divider() {
        this("");
    }

    public Divider(String name) {
        super(name, ElementType.DIVIDER);
    }

    @Override
    public boolean respond(Object data) {
        return true;
    }
}
