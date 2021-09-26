package com.kkw.file.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.tobato.fastdfs.domain.conn.FdfsWebServer;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.kkw.file.mapper.FileMapper;
import com.kkw.file.model.ResponseMessage;
import com.kkw.file.pojo.File;
import com.kkw.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

@Service
public class FileServiceImpl implements FileService {


    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private FdfsWebServer fdfsWebServer;

    @Autowired
    private FastFileStorageClient storageClient;
    //上传文件
    public ResponseMessage uploadFile(MultipartFile file, Integer sortId ) throws IOException {
        StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), StrUtil.subAfter(file.getOriginalFilename(), ".", true), null);
        String path = storePath.getFullPath();
        this.saveRecode(file,fdfsWebServer.getWebServerUrl()+path, sortId);
        if (path == null) {
            return ResponseMessage.error("上传文件");
        }
        return ResponseMessage.ok("上传文件");
    }

    //将上传记录保存到数据库
    private void saveRecode(MultipartFile file, String path,Integer sortId) {
        File mode = new File();
        mode.setFileName(file.getOriginalFilename());
        mode.setFileAddress(path);
        mode.setFileSize(file.getSize());
        mode.setUploadTime(new Date());
        mode.setSortId(sortId);
        mode.setLikeCount(0);
        mode.setComment(0);
        mode.setUserId("张三");
        fileMapper.saveFile(mode);
    }
}
