package by.epam.les07.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Library {
    private String libraryName;
    private ArrayList<Book> booksList = new ArrayList<>();
 
    Library(String libraryName) {
        this.libraryName = libraryName;
    }
 
    void addBookrToLibraryList(Book book) {
        booksList.add(book);
    }
 
    List<Book> getListByAuthor(String specAuthor) {
        List<Book> list = new ArrayList<>();
        for (Book c : booksList) {
            if (c.getAuthor() == specAuthor ) {
                list.add(c);
            }
        }
        
        return list;
    }
 
    List<Book> getListByPublish(String specPublish) {
        List<Book> list = new ArrayList<>();
        for (Book c : booksList) {
            if (c.getPublish() == specPublish ) {
                list.add(c);
            }
        }
      
       
        return list;
    }
 
    List<Book> getListByDiapasond(int diapazonStart) {
        List<Book> list = new ArrayList<>();
        for (Book c : booksList) {
            if (c.getPyear() >= diapazonStart ) {
                list.add(c);
            }
        }
 
        return list;
    }
 
 
 
}
 

