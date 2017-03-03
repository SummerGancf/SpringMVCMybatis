package com.yihu.mybatis.dao;

import com.yihu.mybatis.entity.ProjectName;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectNameMapper {
    int deleteByPrimaryKey(Integer projectid);

    int insert(ProjectName record);

    int insertSelective(ProjectName record);

    ProjectName selectByPrimaryKey(Integer projectid);

    int updateByPrimaryKeySelective(ProjectName record);

    int updateByPrimaryKey(ProjectName record);

    List<ProjectName> findAll();
}