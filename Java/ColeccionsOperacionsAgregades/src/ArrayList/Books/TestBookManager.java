package ArrayList.Books;
import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        BookManager bm = new BookManager();
        Book book1 = new Book(1,"marcianos","martí",5);
        Book book2 = new Book(2,"jupiter","marc",3);
        Book book3 = new Book(3,"merry","miquel",2);
        Book book4 = new Book(4,"sunny","xinxong",1);
        Book book5 = new Book(3,"demolition","yep",4);

        bm.addBook(book1);
        bm.addBook(book2);
        bm.addBook(book3);
        bm.addBook(book4);
        bm.addBook(book5);

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {

            System.out.println("\nPlayer management system:");
            System.out.println("1. add a book to the list.");
            System.out.println("2. show all current books.");
            System.out.println("3. return a book based on the title of the book.");
            System.out.println("4. return a book based on the author of the book");
            System.out.println("5. update the rating of a book");
            System.out.println("6. Tots els vaixells actuals (per ordre lexicogràfic)");
            System.out.println("7. Tots els vaixells actuals (de car a barat)");
            System.out.println();
            System.out.println("9.remove a book from the list based on the book id.");
            System.out.println("10. Exit");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    bm.newBook();
                    break;
                case 2:
                    System.out.println(bm.allbooks());
                    break;
                case 3:
                    bm.searchBookTitle();
                    break;
                case 4:
                    bm.searchBookAuthor();
                    break;
                case 5:
                    bm.updateRating();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;
                case 9:
                    bm.delBookID();
                    break;
                case 10:
                    continuar = false;

            }
        }
    }
}
