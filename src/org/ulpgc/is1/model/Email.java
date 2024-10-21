package org.ulpgc.is1.model;

public class Email {
    private String account;

    public Email(String account) {
        if (isValid()) {
            this.account = account;
        }
        else {
            this.account = null;
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        if (isValid()) {
            this.account = account;
        }
        else {
            this.account = null;
        }
    }

    public boolean isValid() {
        if (!account.contains("@")) {
            return false;
        }
        return account.contains(".");
    }

    @Override
    public String toString() {
        return getAccount();
    }
}
