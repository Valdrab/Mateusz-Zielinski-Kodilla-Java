package com.kodilla.good.patterns.challenges;

public class User {

    private String username;
    private String realName;
    private boolean accountVerified;

    public User(String username, String realName, boolean accountVerified) {
        this.username = username;
        this.realName = realName;
        this.accountVerified = accountVerified;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public boolean isAccountVerified() {
        return accountVerified;
    }
}
