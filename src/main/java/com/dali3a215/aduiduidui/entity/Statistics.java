package com.dali3a215.aduiduidui.entity;

import java.io.Serializable;

/**
 * (Statistics)实体类
 *
 * @author makejava
 * @since 2022-06-14 23:12:05
 */
public class Statistics implements Serializable {
    private static final long serialVersionUID = -28529020740014551L;
    
    private Integer id;
    
    private String key;
    
    private Long uploadSize;
    
    private Long downloadSize;
    
    private Long fileSize;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getUploadSize() {
        return uploadSize;
    }

    public void setUploadSize(Long uploadSize) {
        this.uploadSize = uploadSize;
    }

    public Long getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Long downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

}

