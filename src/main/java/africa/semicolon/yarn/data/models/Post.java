package africa.semicolon.yarn.data.models;

import java.time.LocalDateTime;
import java.util.List;

public class Post extends Storable{
    private Integer id;
    private  String title;
    private LocalDateTime time;
    private String bdy;
    private List<Comment> comments;

}
