package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeacherRepository extends JpaRepository<TeacherEntity, Long> {
    //deliveredQuery
    List<TeacherEntity> findTeacherEntitiesByTeacherSurname(String teacherSurname);

}
