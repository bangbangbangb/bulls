package com.sdxg.angrybulls.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件上传工具类
 * @author YangSheng
 * @Package com.sdxg.angrybulls.utils
 * @date 2018/9/16 21:45
 */
public class FileUploadUtils {
    // 文件上传缓冲区大小
    private static final int BUFFER_SIZE = 1024;


    /**
     * 单文件上传。维护1024byte大小的缓冲区，支持大文件上传。
     *
     * @param file 要上传的文件
     * @param path 目标路径
     * @return boolean
     * @author 杨盛
     * @date 2018/9/16 21:49
     */
    static public boolean bigFileupload(MultipartFile file, String path){
        try (FileOutputStream fout = new FileOutputStream(new File(path));
             InputStream in = file.getInputStream()) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int length = 0;
            while((length = in.read(buffer, 0, buffer.length)) > 0){
                fout.write(buffer,0,length);
                fout.flush();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
