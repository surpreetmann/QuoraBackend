package com.QuoraProject.QAMicroservice.service;

import com.QuoraProject.QAMicroservice.entity.Comment;
import java.util.List;

public interface CommentService {

    List<Comment> fetchComments(String parentID);
    void addComment(Comment comment);
}
