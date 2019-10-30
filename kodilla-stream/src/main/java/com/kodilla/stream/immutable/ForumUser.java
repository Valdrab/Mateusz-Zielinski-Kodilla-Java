package com.kodilla.stream.immutable;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final Date birthDate;
    private final List<ForumUser> friends = new ArrayList<>();

    public ForumUser(final String username, final String realName, final Date birthDate) {
        this.username = username;
        this.realName = realName;
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean addFriend(ForumUser forumUser) {
        return friends.add(forumUser);
    }

    public boolean removeFriend(ForumUser forumUser) {
        return friends.remove(forumUser);
    }
}
