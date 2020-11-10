package com.cxp.studentinfo.service.impl;

import com.cxp.studentinfo.entity.TbStudent;
import com.cxp.studentinfo.mapper.TbStudentMapper;
import com.cxp.studentinfo.service.ITbStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxp
 * @since 2020-11-09
 */
@Service
public class TbStudentServiceImpl extends ServiceImpl<TbStudentMapper, TbStudent> implements ITbStudentService {

    @Resource
    private TbStudentMapper tbStudentMapper;


    public TbStudentServiceImpl(){}

}
