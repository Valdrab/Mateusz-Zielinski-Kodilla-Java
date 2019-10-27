package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(0,"Joe",'M',LocalDate.of(1988,Month.FEBRUARY,13),76));
        forumUsersList.add(new ForumUser(1,"Zoe",'F',LocalDate.of(2000,Month.NOVEMBER,2),12));
        forumUsersList.add(new ForumUser(2,"Nick",'M',LocalDate.of(1972,Month.APRIL,8),0));
        forumUsersList.add(new ForumUser(3,"Lori",'F',LocalDate.of(1987,Month.JULY,27),0));
        forumUsersList.add(new ForumUser(4,"Peter",'M',LocalDate.of(1981,Month.MARCH,1),1));
    }

    public List<ForumUser> getForumUsersList(){
        return new ArrayList<>(forumUsersList);
    }
}
