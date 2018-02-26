package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import models.Book;
import views.html.books.*;

import java.util.Set;

public class BooksController extends Controller {

    // Show all books.
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    // Show book details.
    public Result show(Integer id) {
        return TODO;
    }

    public Result create() {
        return TODO;
    }

    public Result save() {
        return TODO;
    }

    public Result edit(Integer id) {
        return TODO;
    }

    public Result update() {
        return TODO;
    }

    public Result destroy(Integer id) {
        return TODO;
    }

}
