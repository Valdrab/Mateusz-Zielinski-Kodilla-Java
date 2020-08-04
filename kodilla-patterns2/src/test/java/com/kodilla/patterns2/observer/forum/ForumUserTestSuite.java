package com.kodilla.patterns2.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser walterWhite = new ForumUser("Walter White");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(walterWhite);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi! Could you help me with a for loop?");
        javaHelpForum.addPost("It's better to use a while loop in this case.");
        javaToolsForum.addPost("Help, my MySQL db isn't working :(");
        javaHelpForum.addPost("What's the reason for using a while loop?");
        javaToolsForum.addPost("When logging in, I get a 'bad credentials' msg.");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, walterWhite.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
