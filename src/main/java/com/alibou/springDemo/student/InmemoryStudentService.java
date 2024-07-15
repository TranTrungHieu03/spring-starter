package com.alibou.springDemo.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InmemoryStudentService implements StudentService {
    private final InMemoryStudentDao dao;

    public InmemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();

    }

}
