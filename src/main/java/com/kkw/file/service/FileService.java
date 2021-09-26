package com.kkw.file.service;


import com.kkw.file.model.ResponseMessage;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    /**
     * 上传文件
     * @param file
     * @return
     */
    public ResponseMessage uploadFile(MultipartFile file, Integer sortId) throws IOException;
}
