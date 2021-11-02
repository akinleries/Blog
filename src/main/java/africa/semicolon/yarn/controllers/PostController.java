package africa.semicolon.yarn.controllers;

import africa.semicolon.yarn.data.models.Post;
import africa.semicolon.yarn.dto.request.CreatePostRequest;
import africa.semicolon.yarn.services.PostService;
import africa.semicolon.yarn.services.PostServiceImp;

public class PostController {
    private final PostService postService = new PostServiceImp();

    public CreatePostRequest addPost(CreatePostRequest createPostRequest){
        return postService.addPost(createPostRequest);
    }

}
