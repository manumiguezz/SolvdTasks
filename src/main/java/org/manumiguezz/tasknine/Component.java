package org.manumiguezz.tasknine;

public enum Component {

    CPU(true),
    GPU(true);

    private Boolean usable;

    Component(Boolean usable) {
        this.usable = usable;
    }
}
