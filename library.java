class Lib{
    String[] books;
    int no_of_books;
     Lib(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;

        System.out.println(book + "has been added");
    }
    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null)
                continue;
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){

            for(int i = 0; i < this.books.length ; i++){
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
            System.out.println("*" + book);
        }
        System.out.println("This book does not exist");
    }

  
    void returnBook(String book){

         addBook(book);
    }

}



public class library {
    public static void main(String[] args) {
        Lib clb = new Lib();
        clb.addBook("Think and Grow Rich");
        clb.addBook("Algorithms");
        clb.addBook("c++");
        clb.showAvailableBooks();
        clb.issueBook("c++");
        clb.showAvailableBooks();
        clb.returnBook("c++");
        clb.showAvailableBooks();
    }
}
