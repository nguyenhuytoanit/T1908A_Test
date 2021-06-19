package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "publishing")
    private String publishing;

    @Column(name = "author")
    private String author;

    @Column(name = "publishingId")
    private int publishingId;

    @ManyToOne()
    @JoinColumn(name = "publishingId", insertable = false, updatable = false)
    private PublisherEntity publisher;

    public BookEntity(){

    }

    public BookEntity(int id, String name, String publishing, String author, int publishingId, PublisherEntity publisher) {
        this.id = id;
        this.name = name;
        this.publishing = publishing;
        this.author = author;
        this.publishingId = publishingId;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingId() {
        return publishingId;
    }

    public void setPublishingId(int publishingId) {
        this.publishingId = publishingId;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherEntity publisher) {
        this.publisher = publisher;
    }
}
