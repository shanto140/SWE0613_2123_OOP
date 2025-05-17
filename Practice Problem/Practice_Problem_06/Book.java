package Practice_Problem_06;

class Book {
    public int BookId;
    public String BookName;
    public String BookAuthor;
    public String YearofPub;
    public float Price;
    public String Status;


    public void AddNewBooks(int bookId, String bookName, String bookAuthor, String yearofPub, float price, String status) {
        this.BookId = bookId;
        this.BookName = bookName;
        this.BookAuthor = bookAuthor;
        this.YearofPub = yearofPub;
        this.Price = price;
        this.Status = status;
        System.out.println(bookName + "is added: ");
    }

    public void DeleteBooks() {
        System.out.println("Book deleted: " + this.BookName);
        this.BookId = 0;
        this.BookName = null;
        this.BookAuthor = null;
        this.YearofPub = null;
        this.Price = 0.0f;
        this.Status = null;
    }


    public void DisplayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ID: " + this.BookId);
        System.out.println("Name: " + this.BookName);
        System.out.println("Author: " + this.BookAuthor);
        System.out.println("Year of Publication: " + this.YearofPub);
        System.out.println("Price: $" + this.Price);
        System.out.println("Status: " + this.Status);
    }

    public void InquiryBook() {
        System.out.println("Inquiring about book: " + this.BookName);
    }
}


class Librarian {
    public int Id;
    public String Name;


    public void SearchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    public boolean VerifyMember(int id) {
        System.out.println("Verifying member with ID: " + id);
        return true;
    }

    public void OrderBooks() {
        System.out.println("Ordering books ");
    }

    public void SellBooks() {
        System.out.println("Selling books");
    }
}


class Publisher {
    public int Id;
    public String Name;
    public String Address;
    public int PhoneNo;

    public void AddPub(int id, String name, String address, int phoneNo) {
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.PhoneNo = phoneNo;
        System.out.println("Publisher added: " + name);
    }

    public void ModifyPub(String newName, String newAddress, int newPhoneNo) {
        this.Name = newName;
        this.Address = newAddress;
        this.PhoneNo = newPhoneNo;
        System.out.println("Publisher modified: " + newName);
    }


    public void DeletePub() {
        System.out.println("Publisher deleted: " + this.Name);
        this.Id = 0;
        this.Name = null;
        this.Address = null;
        this.PhoneNo = 0;
    }

    public void OrderStatus() {
        System.out.println("Checking order status for publisher: " + this.Name);
    }
}

class User {
    public int UserID;
    public String UserName;
    public String UserAddress;
    public int PhoneNo;

    public void ReturnBooks() {
        System.out.println("Books returned by user: " + this.UserName);
    }

    public int PayFine(float amount) {
        System.out.println("Fine paid by user: $" + amount);
        return 0;
    }


    public void AddNewUser(int userId, String userName, String userAddress, int phoneNo) {
        this.UserID = userId;
        this.UserName = userName;
        this.UserAddress = userAddress;
        this.PhoneNo = phoneNo;
        System.out.println("New user added: " + userName);
    }


    public void DeleteUser() {
        System.out.println("User deleted: " + this.UserName);
        this.UserID = 0;
        this.UserName = null;
        this.UserAddress = null;
        this.PhoneNo = 0;
    }


    public void UpdateDetails(String newName, String newAddress, int newPhoneNo) {
        this.UserName = newName;
        this.UserAddress = newAddress;
        this.PhoneNo = newPhoneNo;
        System.out.println("User details updated: " + newName);
    }

    public void BookPurchase() {
        System.out.println("Book purchased by user: " + this.UserName);
    }
}


 class LibraryManagementSystem {

    public static void main(String[] args) {

        Book book = new Book();
        book.AddNewBooks(1, "Java Programming", "John Doe", "2023", 45.99f, "Available");
        book.DisplayBookDetails();
        book.InquiryBook();
        book.DeleteBooks();


        Librarian librarian = new Librarian();
        librarian.SearchBook("Java Programming");
        librarian.VerifyMember(123);
        librarian.OrderBooks();
        librarian.SellBooks();

        Publisher publisher = new Publisher();
        publisher.AddPub(1, "Tech Publishers", "123 Tech St", 1234567890);
        publisher.ModifyPub("New Tech Publishers", "456 Tech St", 987654321);
        publisher.OrderStatus();
        publisher.DeletePub();


        User user = new User();
        user.AddNewUser(1, "Alice", "123 Main St", 1234567890);
        user.ReturnBooks();
        user.PayFine(10.0f);
        user.UpdateDetails("Alice Smith", "456 Main St", 987654321);
        user.BookPurchase();
        user.DeleteUser();
    }
}