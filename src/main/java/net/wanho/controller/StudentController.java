package net.wanho.controller;

import com.github.pagehelper.PageInfo;
import net.wanho.proj.Student;
import net.wanho.service.StudentServiceI;
import net.wanho.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/18.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentServiceI studentServiceI;

@RequestMapping("queryall")
//@ResponseBody
    public String queryall(@RequestParam(value ="pageNum" ,defaultValue = "1") Integer pageNum,Map map){
     PageInfo<Student> studentPageInfo = studentServiceI.queryAllStu(pageNum);


//    JsonResult jsonResult = new JsonResult();
//    jsonResult.setStatus(200);
//    jsonResult.setMsg("查询成功");
//    jsonResult.setData(studentPageInfo);
    map.put("studentPageInfo",studentPageInfo);
    System.out.println(studentPageInfo);
    System.out.println(studentPageInfo.getTotal());
    return "Student";
    }


    @RequestMapping("add")
    public String add(Student student){
        studentServiceI.addStu(student);
        return "redirect:/queryall";
    }
    @RequestMapping("del")
    public String del(Integer id){
        studentServiceI.delStu(id);
        return "redirect:/queryall";
    }
    @RequestMapping("update")
    public String update(Student student){
        studentServiceI.updateStu(student);
        return "redirect:/queryall";
    }
    @RequestMapping("update2")
    public String update2(Integer id, Map map){
        Student student=studentServiceI.queryById(id);
        System.out.println(student);
        map.put("studentPageInfo",student);
        return "update";
    }
}
