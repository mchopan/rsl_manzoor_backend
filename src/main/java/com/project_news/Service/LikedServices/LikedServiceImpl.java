package com.project_news.Service.LikedServices;

import com.project_news.Entity.Liked;
import com.project_news.Repository.LikedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class LikedServiceImpl implements LikedService{

    @Autowired
    private LikedRepository likedRepository;
    @Override
    public Liked addLike(Liked liked) {
        return likedRepository.save(liked);
    }

    @Override
    public ArrayList<Liked> getLike() {
        return (ArrayList<Liked>) likedRepository.findAll();
    }

    @Override
    public Liked getLikeById(Long likedId) {
        return likedRepository.findById(likedId).get();
    }

    @Override
    public void deleteLikesById(Long likedId) {
        likedRepository.deleteById(likedId);
    }

}
