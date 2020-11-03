package com.id3.newsfetch.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ApiResponse implements Serializable {
    public String status;
    public String Code;
    public String Message;
    public List<News> Articles;
    public int TotalResults;
}
