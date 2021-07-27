package ru.contentforge.formconstructor.form.response;

import cn.nukkit.Player;
import ru.contentforge.formconstructor.form.element.*;
import ru.contentforge.formconstructor.form.handler.CustomFormHandler;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomFormResponse extends Response<CustomFormHandler> {

    protected final ArrayList<CustomFormElement> elements;
    protected final HashSet<String> containsId;

    public CustomFormResponse(CustomFormHandler handler, ArrayList<CustomFormElement> elements, HashSet<String> containsId) {
        super(handler, "");

        this.elements = elements;
        this.containsId = containsId;
    }

    public CustomFormElement get(int index){
        return elements.get(index);
    }

    public CustomFormElement get(String elementId){
        for(CustomFormElement element: elements){
            if(elementId.equals(element.elementId)) return element;
        }
        return null;
    }

    public boolean containsId(String elementId){
        return containsId.contains(elementId);
    }

    public <T extends CustomFormElement> T get(String elementId, Class<T> clazz){
        return clazz.cast(get(elementId));
    }

    public Label getLabel(int index){
        return (Label) elements.get(index);
    }

    public Label getLabel(String elementId){
        return get(elementId, Label.class);
    }

    public Input getInput(int index){
        return (Input) elements.get(index);
    }

    public Input getInput(String elementId){
        return get(elementId, Input.class);
    }

    public Toggle getToggle(int index){
        return (Toggle) elements.get(index);
    }

    public Toggle getToggle(String elementId){
        return get(elementId, Toggle.class);
    }

    public StepSlider getStepSlider(int index){
        return (StepSlider) elements.get(index);
    }

    public StepSlider getStepSlider(String elementId){
        return get(elementId, StepSlider.class);
    }

    public Dropdown getDropdown(int index){
        return (Dropdown) elements.get(index);
    }

    public Dropdown getDropdown(String elementId){
        return get(elementId, Dropdown.class);
    }

    @Override
    public void handle(Player player) {
        if(handler == null) return;
        handler.handle(player, this);
    }

}
