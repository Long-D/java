package org.communis.javawebintro.enums;

public enum DevAction {
    ACTION_1("Действие 1"), ACTION_2("Действие 2");

    private String friendlyName;

    DevAction(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }
}
