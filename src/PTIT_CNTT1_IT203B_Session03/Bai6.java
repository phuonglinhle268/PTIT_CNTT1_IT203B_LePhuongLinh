package PTIT_CNTT1_IT203B_Session03;

import java.util.List;

public class Bai6 {
    record Post(String title, List<String> tag){}

    public static void main(String[] args) {
        List<Post> posts = List.of(
                new Post("Java Post", List.of("java", "backend")),
                new Post("Python Post", List.of("python", "data"))
        );

        List<String> tags = posts.stream().flatMap(post -> post.tag.stream()).toList();
        //flatMap: biến đổi và làm phẳng cấu trúc dữ liệu lồng nhau
        //toList: ghép lại thành 1 list

        System.out.println(tags);
    }
}
