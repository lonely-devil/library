package pro;

import java.util.List;

public interface MapPro {
    User selectUser(String username);
    List<Book> bookList();
    void delBook(int id);
    void addBook(int id);
    Book selBook(String name);
    void upUser(User user);
}
