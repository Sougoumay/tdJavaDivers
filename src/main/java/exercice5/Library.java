package exercice5;

import java.util.*;

public class Library {

    List<Book> books;
    Set<User> users;
    Map<User, Set<Book>> loanBookMap;
    Map<Book, Queue<User>> managerUserBookQueue;


    public Library() {
        books = new ArrayList<>();
        users = new HashSet<>();
        loanBookMap = new HashMap<>();
        managerUserBookQueue = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        managerUserBookQueue.put(book, new LinkedList<>());
    }

    public void addUser(User user) {
        users.add(user);
        Set<Book> books = new HashSet<>();
        loanBookMap.put(user, books);
    }

    public void loanBook(User user, Book book) {
        if (book.isLoaned()) {
            Book book1 = isSameBookAvailable(book);
            if (book1!=null) {
                loanBookMap.get(user).add(book1);
                book1.setLoaned(true);
            } else {
                Queue<User> userQueue = managerUserBookQueue.get(book);
                userQueue.add(user);
                managerUserBookQueue.put(book, userQueue);
            }
        } else {
            loanBookMap.get(user).add(book);
            book.setLoaned(true);
        }
    }

    public void returnBook(User user, Book book) {
        loanBookMap.get(user).remove(book);
        book.setLoaned(false);

        Queue<User> userQueue = managerUserBookQueue.get(book);
        if (userQueue.size() > 0) {
            User firstUser = userQueue.poll();
            loanBook(firstUser, book);
            managerUserBookQueue.put(book, userQueue);
        }
    }

    public void showBooks() {
        books.stream().distinct().forEach(System.out::println);
    }

    public void showLoans() {
        for(User user : loanBookMap.keySet()) {
            if(loanBookMap.get(user).size() > 0) {
                System.out.println("Les livres empruntés par : " + user.getNom() + " sont : ");
                loanBookMap.get(user).stream().forEach(System.out::println);
                System.out.println("\n");
            }
        }
    }

    private Book isSameBookAvailable(Book book) {

        for (Book book1 : books) {
            if (book1.equals(book) && !book1.isLoaned()) return book1;
        }

        return null;
    }



}
