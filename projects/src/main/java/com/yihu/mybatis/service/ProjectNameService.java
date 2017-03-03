package com.yihu.mybatis.service;

import com.yihu.mybatis.entity.ProjectName;

import java.util.List;

/**
 * Created by gancaifeng on 2016/11/30.
 */
public interface ProjectNameService {

    ProjectName getProjectNameById(int projectid);
    List<ProjectName> getProjectAll();
}
