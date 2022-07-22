package com.project_news.Service.NewsServices;

import com.project_news.Entity.News;
import com.project_news.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class NewsServiceImpl implements NewsService  {

    @Autowired
    private NewsRepository newsRepository;

// Save News in DB
    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }
//Fetch All News
    @Override
    public ArrayList<News> getNews() {
        return (ArrayList<News>) newsRepository.findAll();
    }
//Fetch News By id
    @Override
    public News getNewsById(Long newsId) {
        return newsRepository.findById(newsId).get();
    }
//Delete By Id impl
    @Override
    public void deleteNews(Long newsId) {
        newsRepository.deleteById(newsId);
    }

    @Override
    public News updateNews(Long newsId, News news) {
        News editNews = newsRepository.findById(newsId).get();

        if (Objects.nonNull(news.getNewsTitle()) && !" ".equalsIgnoreCase(news.getNewsTitle())){
            editNews.setNewsTitle(news.getNewsTitle());
        }
        if (Objects.nonNull(news.getNewsDescription()) && !" ".equalsIgnoreCase(news.getNewsDescription())){
            editNews.setNewsDescription(news.getNewsDescription());
        }
        return newsRepository.save(editNews);
    }
}
