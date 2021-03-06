package com.example.demo.service;

import com.example.demo.dao.MemeRepository;
import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemeServiceImpl implements MemeService{

    @Autowired
    private MemeRepository memeRepository;

    @Override
    public Post addPost(Post post) {
        return memeRepository.save(post);
    }

    @Override
    public Post getPostById(int id) {
        return memeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> getAllPosts() {
        return memeRepository.findAll();
    }

    @Override
    public Post updatePost(int id, Post post) {
        Post upadtedPost = memeRepository.save(post);
       return upadtedPost;
    }

    @Override
    public void deletePost(int id) {
        memeRepository.deleteById(id);
    }
}
