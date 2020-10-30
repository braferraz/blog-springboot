package com.spring.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;

@Component
public class DummyData {

	@Autowired
	BlogRepository blogRepository;
	
	//@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Braian Ferraz");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.");
		
		Post post2 = new Post();
		post2.setAutor("Braian Ferraz");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post2.setTexto("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.");
	
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}
