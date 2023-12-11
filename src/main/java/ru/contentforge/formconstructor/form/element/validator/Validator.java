package ru.contentforge.formconstructor.form.element.validator;

import lombok.Getter;

@Getter
public abstract class Validator {

    protected final String name;
    protected boolean validated;

    public Validator(String name) {
        this.name = name;
    }

    public abstract void validate(String input);

}
