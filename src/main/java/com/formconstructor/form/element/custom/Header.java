package com.formconstructor.form.element.custom;

import com.formconstructor.form.element.ElementType;

public class Header extends CustomElement {

    public Header() {
        this("");
    }

    public Header(String text) {
        super(text, ElementType.HEADER);
    }

    @Override
    public boolean respond(Object data) {
        return true;
    }
}