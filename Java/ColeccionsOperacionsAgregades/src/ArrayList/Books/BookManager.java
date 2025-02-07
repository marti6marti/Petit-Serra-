package ArrayList.Books;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void newBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id = sc.nextInt();
        System.out.println("Title: ");
        String title = sc.next();
        System.out.println("Author: ");
        String author = sc.next();
        System.out.println("Rating: ");
        int rating = sc.nextInt();
        Book book = new Book(id,title,author,rating);
        books.add(book);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book searchBookTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book's title to find the information: ");
        String title = sc.next();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book's author to find the information: ");
        String author = sc.next();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book's id to find the information: ");
        int id = sc.nextInt();

        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void allbooks(){
        for (Book book : books) {
            System.out.print(book);
            System.out.println();
        }
    }

    public void updateRating(){
        Scanner sc = new Scanner(System.in);

        Book book = this.searchBookTitle();

        if(book != null){
            System.out.println("new score: ");
            int rating = sc.nextInt();
            book.setRating(rating);
        }
    }

    public void getAllBooksByRating(){
        books.sort(bookComparatorByRating.reversed());
        books.forEach(System.out::println);
    }

    public void getNBooksByRating(int numberGetBooks){
        books.sort(bookComparatorByRating.reversed());
        var subList = books.subList(0,numberGetBooks);
        subList.forEach(System.out::println);

    }

    public ArrayList<Book> getBooksByMinRating(int minRating){
        var newBooks = new ArrayList<Book>();
        for (Book book: books){
            if (book.getRating() > minRating){
                newBooks.add(book);
            }
        }
        newBooks.forEach(System.out::println);
        return newBooks;
    }

    public Comparator<Book> bookComparatorByRating = Comparator.comparingInt(Book::getRating);

    public void delBookID(){
       books.remove(searchBookID());
    }

}
