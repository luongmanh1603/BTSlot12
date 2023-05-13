package Btap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class News implements INews {
     int id;
     String title;
     String publishDate;
     String author;
     String content;
     double averageRate;

     ArrayList<Integer> rateList = new ArrayList<>();

    public News() {

    }

    public News(int id, String title, String publishDate, String author, String content){
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display() {
        System.out.println("Title:" + title);
        System.out.println("publish date:" + publishDate);
        System.out.println("content:" + content);
        System.out.println("avg rate:" + averageRate);
    }
    public void calculate() {
        double total = 0;
        for (Integer i : rateList){
            total += i;

        }
        averageRate = total/rateList.size();
    }
    public void inputRate(int star){
        if (star > 0 && star <= 5){
            rateList.add(star);
            calculate();
            return;
        }
    }
}