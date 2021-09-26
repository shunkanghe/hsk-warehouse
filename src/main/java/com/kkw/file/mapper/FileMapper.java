package com.kkw.file.mapper;

import com.kkw.file.pojo.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FileMapper {

    /**
     *   // 保存信息到数据库
     */
    public void saveFile(File file);

}
