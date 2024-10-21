package org.ulpgc.is1.model;

public class Email {
    private String account;

    public Email(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean isValid() {
        if (!account.contains("@")) {
            return false;
        }
        return account.contains(".");
    }
}
