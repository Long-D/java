package org.communis.javawebintro.enums;

public enum DevAuth {
    BD("База данных"), LDAP("LDAP");

    private String stringName;

    DevAuth(String stringName) {
        this.stringName = stringName;
    }

    public String getStringName() {
        return stringName;
    }
}