package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
        public static void main(String[] args) {
            Forum forum = new Forum();
            Map<Integer, ForumUser> resultMapOfUsers = forum.getForumUsersList().stream()
                    .filter(forumUser -> forumUser.getSex() =='M')
                    .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(1999,Month.OCTOBER,26)))
                    .filter(forumUser -> forumUser.getNumberOfPublishedPosts() >= 1)
                    .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

            resultMapOfUsers.entrySet().stream()
                    .map(entry -> "Key: " + entry.getKey() + ", Value: " + entry.getValue())
                    .forEach(System.out::println);
        }
    }