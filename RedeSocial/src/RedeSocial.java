public class RedeSocial {
    public static void main(String[] args) throws Exception {
        Post post = new Post(1, "Hello Threads", Status.DRAFT);

        post.publish();
        System.out.println("Post successfully posted.");
    }
}
