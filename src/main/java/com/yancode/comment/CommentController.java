package com.yancode.comment;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path = "comment", produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {

    @GetMapping
    public List<Object> getAllComment(){
        return List.of(new Comment(1,"Mon commentaire", LocalDate.now()));
    }
}
