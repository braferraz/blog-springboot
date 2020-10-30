package com.spring.blog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;
import com.spring.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public List<Post> findAll() {
		return blogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return blogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogRepository.save(post);
	}

}
