package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Peter Goldman");
        User user2 = new YGeneration("Monica Lewis");
        User user3 = new ZGeneration("John Smith");
        //When
        String user1SharedPostOn = user1.sharePost();
        String user2SharedPostOn = user2.sharePost();
        String user3SharedPostOn = user3.sharePost();
        //Then
        Assert.assertEquals("Snapchat", user1SharedPostOn);
        Assert.assertEquals("Twitter", user2SharedPostOn);
        Assert.assertEquals("Facebook", user3SharedPostOn);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Peter Goldman");
        //When
        String userSharedPostOn = user.sharePost();
        System.out.println("Peter shared post using " + userSharedPostOn);
        user.setSocialPublisher(new TwitterPublisher());
        userSharedPostOn = user.sharePost();
        System.out.println("Peter is now sharing posts using " + userSharedPostOn);
        //Then
        Assert.assertEquals("Twitter", userSharedPostOn);
    }
}
