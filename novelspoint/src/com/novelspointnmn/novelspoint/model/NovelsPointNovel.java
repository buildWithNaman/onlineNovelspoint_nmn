package com.novelspointnmn.novelspoint.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "novels")
public class NovelsPointNovel {

    private String id;
    private String title;
    private String author;
    private Integer year;
    private List<String> categories;
    private List<NovelsPointChapter> chapters;
    private Boolean bestSeller;
    private Long views;
    private String languaga;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<NovelsPointChapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<NovelsPointChapter> chapters) {
        this.chapters = chapters;
    }

    public Boolean getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public String getLanguaga() {
        return languaga;
    }

    public void setLanguaga(String languaga) {
        this.languaga = languaga;
    }
}
