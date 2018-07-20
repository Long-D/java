package org.communis.javawebintro.enums;

public enum DevStatus {
    ACTIVE,
    BLOCK;

    public String getStringName() {
        switch(this) {
            case BLOCK:
                return "Заблокирован";
            case ACTIVE:
                return "Активен";
            default:
                return null;
        }
    }
}