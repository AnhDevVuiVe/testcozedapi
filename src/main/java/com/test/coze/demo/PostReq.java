package com.test.coze.demo;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PostReq {
    @Column(name = "content")
    private String content;

    @Column(name = "title")
    private String title;
}
