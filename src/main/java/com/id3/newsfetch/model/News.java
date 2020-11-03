package com.id3.newsfetch.model;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class News implements Serializable {
    public Source Source;
    public String Author;
    public String Title;
    public String Description;
    public String Url;
    public String UrlToImage;
    public LocalDateTime PublishedAt;

    public com.id3.newsfetch.model.Source getSource() {
        return Source;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getUrl() {
        return Url;
    }

    public String getUrlToImage() {
        return UrlToImage;
    }

    public LocalDateTime getPublishedAt() {
        return PublishedAt;
    }
}
