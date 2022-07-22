package com.project_news.Repository;

import com.project_news.Entity.NewsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsListRepository extends JpaRepository<NewsList,Long> {
}
