package net.wanho.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.wanho.mapper.StudentMapper;
import net.wanho.proj.Student;
import net.wanho.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/4/18.
 */
@Service
public class StudentServiceImpl implements StudentServiceI {
    @Autowired
    private StudentMapper studentMapper;



    @Override
    public PageInfo<Student> queryAllStu(Integer pageNum) {
//        分页信息
        PageHelper.startPage(pageNum,4);
        List<Student> studentList = studentMapper.queryAllStu();
        System.out.println(studentList);
        PageInfo<Student> studentPageInfo = new PageInfo<Student>(studentList);
        studentPageInfo.getList();
        return studentPageInfo ;
    }

    @Override
    public void addStu(Student student) {
        studentMapper.addStu(student);
    }

    @Override
    public void delStu(Integer id) {
        studentMapper.delStu(id);
    }

    @Override
    public Student queryById(Integer id) {
        return studentMapper.queryById(id);
    }

    @Override
    public void updateStu(Student student) {
        studentMapper.updateStu(student);
    }
}
