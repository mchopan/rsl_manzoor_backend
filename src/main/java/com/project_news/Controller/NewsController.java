package com.project_news.Controller;

import com.project_news.Entity.News;
import com.project_news.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewsController {

    @Autowired
    private  NewsService newsService;

//    Post News
    @PostMapping("/save")
    public News saveNews(@RequestBody News news){
        return newsService.saveNews(news);
    }

//    Get All News
    @GetMapping("/getNews")
    public ArrayList<News> getNews(){
            return newsService.getNews();
    }

//    Get News By id
    @GetMapping("/getNews/{id}")
    public News getNewsById(@PathVariable("id") Long newsId){
        return newsService.getNewsById(newsId);
}


//     Delete News By Id
    @DeleteMapping("/delete/{id}")
    public void deleteNews(@PathVariable("id") Long newsId){
        newsService.deleteNews(newsId);
    }

// Update News
    @PutMapping("/update/{id}")
    public News updateNews(@PathVariable("id") Long newsId,@RequestBody News news){
        return newsService.updateNews(newsId,news);
    }
}
