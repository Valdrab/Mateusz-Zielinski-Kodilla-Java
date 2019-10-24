package com.kodilla.testing.library;

import java.util.Collections;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (titleFragment.length() < 3 || resultList.size() > 20 )
            return Collections.emptyList();
        else {
            return resultList;
        }
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
