package com.webservicemongodb.myfirstmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservicemongodb.myfirstmongodb.domain.Post;
import com.webservicemongodb.myfirstmongodb.repository.PostRepository;
import com.webservicemongodb.myfirstmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public List<Post> findByTitle(String text){
    return repo.findByTitleContainingIgnoreCase(text);
	}

}
