package com.zwickyc.zwycpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zwickyc.zwycpicturebackend.exception.ErrorCode;
import com.zwickyc.zwycpicturebackend.exception.ThrowUtils;
import com.zwickyc.zwycpicturebackend.manager.FileManager;
import com.zwickyc.zwycpicturebackend.model.dto.file.UploadPictureResult;
import com.zwickyc.zwycpicturebackend.model.dto.picture.PictureQueryRequest;
import com.zwickyc.zwycpicturebackend.model.dto.picture.PictureUploadRequest;
import com.zwickyc.zwycpicturebackend.model.entity.Picture;
import com.zwickyc.zwycpicturebackend.model.entity.User;
import com.zwickyc.zwycpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author shiro
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2026-01-21 16:53:09
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile, PictureUploadRequest pictureUploadRequest, User loginUser);

    /**
     * 获取图片包装类（单条）
     *
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 获取图片包装类（分页）
     *
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    void validPicture(Picture picture);
}
