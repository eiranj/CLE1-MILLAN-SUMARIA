package com.example.cle1;

public class Post {
    private String postId;
    private String desc;
    private String url;

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) { this.url = url; }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", desc=" + desc +
                ", url=" + url +
                '}';
    }
}