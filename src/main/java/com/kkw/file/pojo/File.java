package com.kkw.file.pojo;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * (File)实体类
 *
 * @author makejava
 * @since 2021-09-24 14:28:05
 */
public class File implements Serializable {
    private static final long serialVersionUID = 499236333384914504L;

    private Integer id;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * 文件http地址
     */
    private String fileAddress;
    /**
     * 上传人id
     */
    private String userId;
    /**
     * 上传时间
     */
    private Date uploadTime;
    /**
     * 文件类别id
     */
    private Integer sortId;
    /**
     * 点赞数量
     */
    private Integer likeCount;
    /**
     * 评论数量
     */
    private Integer comment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

}
