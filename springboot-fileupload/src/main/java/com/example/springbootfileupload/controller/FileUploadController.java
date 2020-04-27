package com.example.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author liujie
 * @Date 2020/4/22 0:43
 * @Describe        文件上传
 */
public class FileUploadController {
    @PostMapping("/FileUploadController")
    public String fileUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("C:/"+file.getOriginalFilename()));
        return "OK";
    }
}
