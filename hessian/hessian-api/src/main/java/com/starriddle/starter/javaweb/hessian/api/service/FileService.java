package com.starriddle.starter.javaweb.hessian.api.service;

import java.io.InputStream;

/**
 * 文件 服务
 *
 * @author CYL
 * @date 2018-10-27
 */
public interface FileService {

    /**
     * 上传文件
     *
     * @param fileName 上传的文件名
     * @param inputStream 上传的文件的输入流
     */
    String upload(String fileName, InputStream inputStream);

}
