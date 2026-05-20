package br.com.fiap._tdspo.cp3devopsrm566230.controller;
import br.com.fiap._tdspo.cp3devopsrm566230.model.Post;
import br.com.fiap._tdspo.cp3devopsrm566230.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Post criar(@RequestBody Post post) {
        return repository.save(post);
    }
}