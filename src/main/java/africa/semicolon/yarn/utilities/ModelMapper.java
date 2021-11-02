package africa.semicolon.yarn.utilities;

import africa.semicolon.yarn.data.models.Post;
import africa.semicolon.yarn.dto.request.CreatePostRequest;

import java.time.LocalDateTime;

public class ModelMapper {

    public  static Post map(CreatePostRequest createPostRequest){
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        post.setTime(LocalDateTime.now());
        return post;
    }

    public static CreatePostRequest map(Post post){
        CreatePostResponse createPostResponse = new CreatePostResponse();
        createPostResponse.setId(post.getId());
        createPostResponse.setTitle(post.getTitle());
        return createPostResponse;
    }

}
