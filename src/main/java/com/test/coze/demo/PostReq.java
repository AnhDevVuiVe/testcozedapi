package com.test.coze.demo;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PostReq {
    private String content;
    private String title;
}
