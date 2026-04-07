// import libraries 
import java.util.Scanner;

public class BooksMenu {

    // lets add a method to compare two books
    private static Book getExpensiveBook(Book book1, Book book2){
        if (book1.getPrice() < book2.getPrice()){
            return book2;
        }else{
            return book1;
        }
    }
    public static void main(String s[]){
        // lets create a Scanner object 
        Scanner scanner = new Scanner(System.in); 

        // lets create an array of books 
        Book[] books = new Book[10]; 

        int bkIdx = 0; 
        while(true){
            System.out.println("Press 1 to view books, 2 to add books, any other key to exit"); 

            String userActions = scanner.nextLine(); 

            if (userActions.equals("1")){
                for (int i= 0; i< books.length; i++){
                    if(books[i] != null){
                        System.out.println(books[i]);
                    }
                }
            }else if (userActions.equals("2")){
                // lets check if the book array is full 
                if (bkIdx == 10){
                    System.out.println("10 books added already. Cannot add any more books!");
                    continue; 
                }
                System.out.println("Enter book Title");
                String tmpTitle = scanner.nextLine();
                System.out.println("Enter book Author");
                String tmpAuthor = scanner.nextLine();
                System.out.println("Enter book Price");
                float tmpPrice = Float.parseFloat(scanner.nextLine());
                Book bkTmp = new Book(); 
                bkTmp.setTitle(tmpTitle);
                bkTmp.setAuthor(tmpAuthor);
                bkTmp.setPrice(tmpPrice);

                books[bkIdx++] = bkTmp;

            }else{
                break; 
            }
        }


    }
}
