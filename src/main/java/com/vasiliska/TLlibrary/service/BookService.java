package com.vasiliska.TLlibrary.service;


import com.vasiliska.TLlibrary.domain.Book;

import java.util.List;

public interface BookService {

    String addNewBook(String bookName, String authorName, String genreName);
    Book bookByName(String bookName);
    String delBook(String bookName);

    boolean updateBookNameById(Long id, String newName);

    String bookByGenre(String genre);
    String bookByAuthor(String author);
    List<Book> showAllBooks();

    String addComment(String commentText, String bookName);
    String getCommentsByBook(String bookName);

}
