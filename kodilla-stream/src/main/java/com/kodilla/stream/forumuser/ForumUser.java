package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate dateOfBirth, final int numberOfPublishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "Forum User{" +
                "User ID='" + userId + '\'' +
                ", User name='" + userName + '\'' +
                ", Sex=" + sex + '\'' +
                ", Date of birth='" + dateOfBirth + '\'' +
                ", Number of posts published='" + numberOfPublishedPosts + '\'' +
                '}';
    }
}
