// LibrarySystem.java(Ques 9)

// Base class library system
class LibraryItem {
    String title;
    String author;
    int id;

    LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

// subclass for book
class Book extends LibraryItem {
    String publishDate;

    Book(String title, String author, int id, String publishDate) {
        super(title, author, id); // calls parent constructor with values
        this.publishDate = publishDate;
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Date: " + publishDate);
    }
}

// subclass for magazine
class Magazine extends LibraryItem {
    String issue;

    Magazine(String title, String author, int id, String issue) {
        super(title, author, id); // calls parent constructor with values
        this.issue = issue;
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Issue: " + issue);
    }
}

// subclass for news paper
class Newspaper extends LibraryItem {
    String howOften;

    Newspaper(String title, String author, int id, String howOften) {
        super(title, author, id); // calls parent constructor with values
        this.howOften = howOften;
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("How Often: " + howOften);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("old is gold", "gabar", 103, "1925");
        LibraryItem mag = new Magazine("Brolex", "Various", 102, "555678");
        LibraryItem news = new Newspaper("The Himalayan", "Team Himalaya", 101, "Daily");

        book.getInfo();
        mag.getInfo();
        news.getInfo();
    }
}