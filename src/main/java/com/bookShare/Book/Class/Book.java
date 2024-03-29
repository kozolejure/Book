package com.bookShare.Book.Class;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Book {
    @Id
    private int id;
    private String title;
    private String description;
    private String author;
    private String image;



    // Getterji
    public int getId() {
        return id;
    }

    public String getName() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public String getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }



    // Setterji
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public Book(int id, String title, String description, String author, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.image = image;
    }

}
