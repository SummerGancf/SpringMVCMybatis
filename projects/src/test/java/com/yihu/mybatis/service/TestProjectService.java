package com.yihu.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.yihu.mybatis.entity.ProjectName;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gancaifeng on 2016/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring.xml",
        "classpath:config/spring-mybatis.xml" })
public class TestProjectService {
    private static final Logger LOGGER = Logger
        .getLogger(TestProjectService.class);

    @Autowired(required = true)
    private ProjectNameService projectNameService;

    @Test
    public void testQueryById1() {
        ProjectName projectName = projectNameService.getProjectNameById(3);
        //              LOGGER.info(projectName.getProjectname());
        System.out.print(projectName.getProjectname());
  //      LOGGER.info(JSON.toJSON(projectName));
        }
    @Test
    public void testQueryAll() {
        List<ProjectName> projectNameList = projectNameService.getProjectAll();
        //              LOGGER.info(projectName.getProjectname());
        System.out.print(JSON.toJSON(projectNameList));
        //      LOGGER.info(JSON.toJSON(projectName));
    }



}
