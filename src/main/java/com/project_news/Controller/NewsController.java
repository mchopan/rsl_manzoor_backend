package com.project_news.Controller;

import com.project_news.Entity.News;
import com.project_news.Service.NewsServices.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewsController {

    @Autowired
    private  NewsService newsService;

//    Post News
    @PostMapping("/addNews")
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
// Delete By Id
    @DeleteMapping("/delete/{id}")
    public  String deleteNewsById(@PathVariable("id") Long newsId){
        newsService.deleteNews(newsId);
        return "News Deleted Successfully";
    }

//Update News By id
    @PutMapping("/update/{id}")
    public News updateNews(@PathVariable("id") Long newsId,@RequestBody News news){
        return newsService.updateNews(newsId,news);
    }


}
