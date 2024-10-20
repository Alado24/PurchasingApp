package org.ulpgc.is1.model;

public class Email {
    private final String account;

    public Email(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public boolean isValid() {
        return account.contains("@");
    }

}
