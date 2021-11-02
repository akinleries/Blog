package africa.semicolon.yarn.services;

import africa.semicolon.yarn.dat.ropsitories.PostRepository;
import africa.semicolon.yarn.dat.ropsitories.Repository;
import africa.semicolon.yarn.data.models.Post;
import africa.semicolon.yarn.dto.request.CreatePostRequest;
import africa.semicolon.yarn.utilities.ModelMapper;

public class PostServiceImp implements PostService{
    private final Repository repository = new PostRepository();
    @Override
    public CreatePostResponse addPost(CreatePostRequest createPostRequest){
        Post post = ModelMapper.map(createPostRequest);
        post = repository.save(post);
        return ModelMapper.map()
    }
}
