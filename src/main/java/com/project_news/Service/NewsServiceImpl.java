package com.project_news.Service;

import com.project_news.Entity.News;
import com.project_news.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService  {

    @Autowired
    private NewsRepository newsRepository;
    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }
}
