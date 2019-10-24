package com.kodilla.testing.library;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private static int testCounter = 0;
    @Mock private LibraryDatabase libraryDatabase;
    @InjectMocks private BookLibrary bookLibrary;


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
        MockitoAnnotations.initMocks(this);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabase.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabase.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabase.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabase.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabase.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabase, times(1)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfNoRentedBooks() {
        //Given
        List<Book> emptyBookList = new ArrayList<>();
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(emptyBookList);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(any(LibraryUser.class));
        //Then
        assertEquals(0, theListOfBooks.size());
    }

    @Test
    public void testListBooksInHandsOfOneRentedBook() {
        //Given
        List<Book> oneBookList = generateListOfNBooks(1);
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(oneBookList);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(any(LibraryUser.class));
        //Then
        assertEquals(1, theListOfBooks.size());
    }

    @Test
    public void testListBooksInHandsOfFiveRentedBooks() {
        //Given
        List<Book> fiveBookList = generateListOfNBooks(5);
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(fiveBookList);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(any(LibraryUser.class));
        //Then
        assertEquals(5, theListOfBooks.size());
    }
}

