package net.wanho.service;

import com.github.pagehelper.PageInfo;
import net.wanho.proj.Student;

/**
 * Created by Administrator on 2019/4/18.
 */
public interface StudentServiceI {
    PageInfo<Student> queryAllStu(Integer pageNum);
    void addStu(Student student);
    void delStu(Integer id);
    Student queryById(Integer id);
    void updateStu(Student student);
}
