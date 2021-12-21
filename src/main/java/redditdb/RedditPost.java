package redditdb;

public class RedditPost {

    private String id;
    private String parent_id;
    private String link_id;
    private String name;
    private String author;
    private String body;
    private String subreddit_id;
    private String subreddit;
    private int score;
    private String created_utc;

    public RedditPost() {}

    public RedditPost(String id, String parent_id, String link_id, String name, String author,
                      String body, String subreddit_id, String subreddit, int score, String created_utc) {
        this.id = id;
        this.parent_id = parent_id;
        this.link_id = link_id;
        this.name = name;
        this.author = author;
        this.body = body;
        this.subreddit_id = subreddit_id;
        this.subreddit = subreddit;
        this.score = score;
        this.created_utc = created_utc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getLink_id() {
        return link_id;
    }

    public void setLink_id(String link_id) {
        this.link_id = link_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubreddit_id() {
        return subreddit_id;
    }

    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(String created_utc) {
        this.created_utc = created_utc;
    }
}
