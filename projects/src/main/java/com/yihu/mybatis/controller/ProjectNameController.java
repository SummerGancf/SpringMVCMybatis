package com.yihu.mybatis.controller;


import com.yihu.mybatis.entity.ProjectName;
import com.yihu.mybatis.service.ProjectNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * Created by gancaifeng on 2016/11/30.
 */

@Controller()
public class ProjectNameController {

    @Autowired
    private ProjectNameService projectNameService;

    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public String project() {
        return "project";
    }

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public String checkProject(int projectid,Model model) {
        System.out.print(projectid);
        ProjectName projectName = projectNameService.getProjectNameById(projectid);
        if (null != projectName) {
            System.out.print(projectName.getProjectname());
            model.addAttribute("projectName",projectName.getProjectname());
            return "success";
        } else {
            return "project";
        }
    }

    @RequestMapping(value = "/projectAll", method = RequestMethod.GET)
    public String checkProject() {
        return "projectAll";

    }
    @RequestMapping(value = "/projectAll/query", method = RequestMethod.GET)
    public @ResponseBody String checkProjectAll() {
        List<ProjectName> projectNameAll = projectNameService.getProjectAll();
        System.out.print(JSON.toJSON(projectNameAll));
        return JSON.toJSONString(projectNameAll);

    }


}
