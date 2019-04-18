package net.wanho.mapper;

import net.wanho.proj.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/4/18.
 */
public interface StudentMapper {
    List<Student> queryAllStu();
    Student queryById(Integer id);
    void addStu(Student student);
    void delStu(Integer id);
    void updateStu(Student student);
}
