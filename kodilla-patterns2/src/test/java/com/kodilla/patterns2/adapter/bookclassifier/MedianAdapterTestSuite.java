package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Famous Author", "Great Title", 1911, "1234");
        Book book2 = new Book("Author", "Title", 2000, "2431");
        Book book3 = new Book("Another Author", "Another Title", 1986, "4321");
        Book book4 = new Book("Lesser known Author", "Barely a book", 2019, "3142");
        Book book5 = new Book("Another Author 2", "Another Title 2", 1957, "1423");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1986, median);
    }
}
