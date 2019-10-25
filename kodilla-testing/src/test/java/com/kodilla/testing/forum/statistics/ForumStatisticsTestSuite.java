package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testPostsCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getAvgPostsCountPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public void testPostsCount1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getAvgPostsCountPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public void testCommentsCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAvgCommentsCountPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public void testCommentsCountSmallerThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(30);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getCommentsCount());
        assertEquals(30, forumStatistics.getPostsCount());
        assertEquals(0.333, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public void testCommentCountLargerThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(30);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(30, forumStatistics.getCommentsCount());
        assertEquals(10, forumStatistics.getPostsCount());
        assertEquals(3.0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public void testUsersCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> mockUserNamesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(mockUserNamesList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersCount());
        assertEquals(0, forumStatistics.getAvgPostsCountPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgCommentsCountPerUser(), 0.001);
    }
    @Test
    public void testUsersCount100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> mockUserNamesList = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            mockUserNamesList.add("Dummy User");
        }
        when(statisticsMock.usersNames()).thenReturn(mockUserNamesList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(30);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersCount());
        assertEquals(0.3, forumStatistics.getAvgCommentsCountPerUser(), 0.001);
        assertEquals(0.1, forumStatistics.getAvgPostsCountPerUser(), 0.001);
    }
}
