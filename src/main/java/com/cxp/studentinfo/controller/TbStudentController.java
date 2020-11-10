package com.cxp.studentinfo.controller;


import com.cxp.studentinfo.entity.TbStudent;
import com.cxp.studentinfo.service.ITbStudentService;
import com.cxp.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cxp
 * @since 2020-11-09
 */
@RestController
@RequestMapping("/studentinfo/tb-student")
public class TbStudentController {

    @Resource
    private ITbStudentService iTbStudentService;


    public TbStudentController(){
    }

    @RequestMapping("/gettbstudentbyid/{id}")
    public CommonResult<TbStudent> getTbStudentById(@PathVariable("id")String id){
        TbStudent student = iTbStudentService.getById(id);
        return new CommonResult<>(200, "查询成功", student);
    }


}

