package com.kkw.file.controller;

import com.kkw.file.model.ResponseMessage;
import com.kkw.file.service.FileService;
import com.kkw.file.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;


    @PostMapping("upLoad")
    public ResponseMessage upLoad(MultipartFile file, Integer sort) {
        String path = null;
        try {
            fileService.uploadFile(file , sort);
            return  new ResponseMessage(true, "上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new ResponseMessage(true, "上传失败");
    }



}
