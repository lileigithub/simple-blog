package com.blog.simpleblog.entity;

/**
 * description
 * @author lilei
 * @date 2022/6/22 14:23
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
