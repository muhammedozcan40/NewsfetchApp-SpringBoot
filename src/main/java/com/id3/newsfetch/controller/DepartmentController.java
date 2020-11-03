package com.id3.newsfetch.controller;

import com.id3.newsfetch.model.ApiResponse;
import com.id3.newsfetch.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@EnableScheduling
@RestController
@RequestMapping("/myapp")
public class DepartmentController {

    News news;
    @Autowired
    private RestTemplate restTemplate;

    @Scheduled (fixedRate = 10000)
    public void Scheduledmami () {
        getNews();
    }

    @GetMapping
    public ApiResponse getNews(){
        String url ="https://newsapi.org/v2/top-headlines?country=tr&apiKey=a26d389215264a729b22bdf239dd394c";
        ApiResponse apiResponse =restTemplate.getForObject(url,ApiResponse.class);
        //   for(News value : apiResponse.Articles){
        //       System.out.println (value.getTitle());

        // }

        for(int j=0;j<10;j++)
            System.out.println (apiResponse.Articles.get(j).getTitle());
        return apiResponse;

    }

}
