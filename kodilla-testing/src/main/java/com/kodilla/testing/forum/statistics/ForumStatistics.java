package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostsCountPerUser;
    private double avgCommentsCountPerUser;
    private double avgCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsCountPerUser() {
        return avgPostsCountPerUser;
    }

    public double getAvgCommentsCountPerUser() {
        return avgCommentsCountPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        avgPostsCountPerUser = calcAvgPostsCountPerUser();
        avgCommentsCountPerUser = calcAvgCommentsCountPerUser();
        avgCommentsPerPost = calcAvgCommentsPerPost();
    }

    private double calcAvgPostsCountPerUser() {
        if (usersCount > 0) {
            return (double) postsCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calcAvgCommentsCountPerUser() {
        if (usersCount > 0) {
            return (double) commentsCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calcAvgCommentsPerPost() {
        if (commentsCount > 0 && postsCount > 0) {
            return (double) commentsCount/postsCount;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + avgPostsCountPerUser);
        System.out.println("Average number of comments per user: " + avgCommentsCountPerUser);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
}
