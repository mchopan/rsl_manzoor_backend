package com.project_news.Controller;

import com.project_news.Entity.News;
import com.project_news.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NewsController {

    @Autowired
    private  NewsService newsService;

    @PostMapping("/save")
    public News saveNews(@RequestBody News news){
        return newsService.saveNews(news);
    }

}
