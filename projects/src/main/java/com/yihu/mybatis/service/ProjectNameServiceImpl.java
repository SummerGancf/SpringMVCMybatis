package com.yihu.mybatis.service;


import com.yihu.mybatis.dao.ProjectNameMapper;
import com.yihu.mybatis.entity.ProjectName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by gancaifeng on 2016/11/30.
 */
@Service("ProjectNameService")
public class ProjectNameServiceImpl implements ProjectNameService {

    @Autowired
    private ProjectNameMapper projectNameMapper;

    @Override
    public ProjectName getProjectNameById(int projectid){
        return projectNameMapper.selectByPrimaryKey(projectid);
    }

    @Override
    public List<ProjectName> getProjectAll(){
        return projectNameMapper.findAll();
    }

}
