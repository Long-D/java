package org.communis.javawebintro.enums;

public enum DevRole {
    ROLE_ADMIN {
    },
    ROLE_OPERATOR {
    };

    public String getStringName() {
        switch (this) {
            case ROLE_ADMIN:
                return "Высшее";
            case ROLE_OPERATOR:
                return "Среднее";
            default:
                return null;
        }
    }

}