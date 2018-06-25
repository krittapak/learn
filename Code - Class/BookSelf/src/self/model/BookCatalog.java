/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.model;

/**
 *
 * @author Tisanai.Cha
 */
public class BookCatalog {

    private int numOfBooks;
    private Book books[];

    public BookCatalog(int lengthOfCatalog) {
         books = new Book[lengthOfCatalog];
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        int addedIndex=-1;
        if (numOfBooks<books.length) {
            books[numOfBooks]=bookAdded;
            addedIndex=numOfBooks;
            numOfBooks++;
        }
        return addedIndex;
    }

    public int unAvailableBook(Book bookUnAvailable) {
        int deleteIndex=-1;
        for (int i = 0; i < numOfBooks; i++) {
            if (bookUnAvailable.equals(books[i])) {
                books[i].setAvailable(false);
                deleteIndex=i;
                break;
            }
        }
        return deleteIndex;
    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
