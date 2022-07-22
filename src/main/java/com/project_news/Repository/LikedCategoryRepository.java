package com.project_news.Repository;

import com.project_news.Entity.LikedCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikedCategoryRepository extends JpaRepository<LikedCategory,Long> {
}
