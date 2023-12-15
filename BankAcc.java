// public class BankAcc {

//     private int accountNumber;       // Unique account ID
//     private double balance;          // Current account balance
//     private String accountHolderName; // Name of the account holder
//     private static int totalAccounts = 0; // Static variable to track total accounts created

//     // Constructor to create a new BankAccount instance
//     public BankAcc(int accountNumber, double initialBalance, String accountHolderName) {
//         this.accountNumber = accountNumber;
//         this.balance = initialBalance;
//         this.accountHolderName = accountHolderName;
//         totalAccounts++; // Increment totalAccounts when a new account is created
//     }

//     // Instance method to print account details
//     public void printAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolderName);
//         System.out.println("Balance: $" + balance);
//     }

//     // Instance method to deposit money into the account
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("$" + amount + " deposited successfully.");
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     // Instance method to withdraw money from the account
//     public void withdraw(double amount) {
//         if (amount > 0 && balance >= amount) {
//             balance -= amount;
//             System.out.println("$" + amount + " withdrawn successfully.");
//         } else {
//             System.out.println("Insufficient balance or invalid withdrawal amount.");
//         }
//     }

//     // Static method to return the total number of accounts created
//     public static int getTotalAccounts() {
//         return totalAccounts;
//     }

//     public static void main(String[] args) {
//         // Create two BankAccount instances
//         BankAcc account1 = new BankAcc(1001, 1000, "John Doe");
//         BankAcc account2 = new BankAcc(1002, 1500, "Jane Smith");

//         // Demonstrate account operations
//         account1.printAccountDetails();
//         account1.deposit(200);
//         account1.withdraw(100);
//         account1.printAccountDetails();

//         account2.printAccountDetails();
//         account2.deposit(500);
//         account2.withdraw(200);
//         account2.printAccountDetails();

//         // Print total number of accounts created
//         System.out.println("Total accounts created: " + BankAcc.getTotalAccounts());
//     }
// }

class Book
{
    String bookName;
    String author;
    long price;
    static int count = 0;

    //Initializing static block
    {
        count++;
    }

    //Parameterized Constructor
    Book(String bookName, String author, int price)
    {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    //Default Constructor
    Book()
    {
        bookName = "Null";
        author = "Null";
        price = 0;
    }

    //Copy Constructor
    Book(Book b1)
    {
        bookName = b1.bookName;
        author = b1.author;
        price = b1.price;
    }

    //Getter and Setter
    long getbookPrice()
    {
        return price;
    }

    int setbookPrice(int price)
    {
        this.price = price;
        return price;
    }

    //Method to display book details
    long getbookPrice(Book b1)
    {
        System.out.println(b1.price);
        return price;
    }

    //Static counting Method
    static int countOfBooks()
    {
        return count;
    }

    //Method to display book details
    void printBookInfo()
    {
        System.out.println("\nBook Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class EngineeringBook extends Book
{
    String category;

    //Parameterized Constructor
    EngineeringBook(String bookName, String author, int price, String category)
    {
        super(bookName, author, price);
        this.category = category;
    }

    //Default Constructor
    EngineeringBook()
    {
        super();
        category = "Null";
    }

    //Getter and Setter
    String getCategory()
    {
        return category;
    }

    String setCategory(String category)
    {
        this.category = category;
        return category;
    }

    //Overriding printBookInfo Method
    void printBookInfo()
    {
        System.out.println("\nBook Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    //Overrinding getbookPrice Method while adding 4% as GST
    long getbookPrice()
    {
        return price + (price * 4) / 100;
    }
}

class NonTechnicalBook extends Book
{
    //Parameterized Constructor
    NonTechnicalBook(String bookName, String author, int price)
    {
        super(bookName, author, price);
    }

    //Default Constructor
    NonTechnicalBook()
    {
        super();
    }

    //Overriding getbookPrice Method while giving 10% discount if the price is more than 200
    long getbookPrice()
    {
        if (price > 200)
            return price - (price * 10) / 100;
        else
            return price;
    }
}

class InternalExam
{
    //Creating utility Method that return total price of all books and also print the name of the book if the book is discounted
    static long getTotalPrice(Book[] books)
    {
        long totalPrice = 0;
        for (int i = 0; i < books.length; i++)
        {
            totalPrice += books[i].getbookPrice();
            if (books[i].getbookPrice() < books[i].price)
                System.out.println("\nThe book " + books[i].bookName + " is discounted.");
        }
        return totalPrice;
    }
    public static void main(String[] args)
    {
        //Creating an object of Book class
        Book b1 = new Book("Java", "James Gosling", 500);
        b1.printBookInfo();

        //Creating an object of EngineeringBook class
        EngineeringBook eb1 = new EngineeringBook("DSA", "K.Sahani", 900, "Computer Science");
        eb1.printBookInfo();
        System.out.println("The GST Prices are: " + eb1.getbookPrice());

        //Creating an object of NonTechnicalBook class
        NonTechnicalBook nb1 = new NonTechnicalBook("Economics of India", "Raghuram Rajan", 700);
        nb1.printBookInfo();
        System.out.println("The Discounted Prices are: " + nb1.getbookPrice()); 

        //Creating an array of Book class
        Book[] books = {b1, eb1, nb1};
        
        //Printing the total price of all books
        System.out.println("\nThe total price of all books is: " + getTotalPrice(books));
    }
}
