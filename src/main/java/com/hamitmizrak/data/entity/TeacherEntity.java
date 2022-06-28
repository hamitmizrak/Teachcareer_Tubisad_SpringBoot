package com.hamitmizrak.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "teacher")
public class TeacherEntity extends BaseEntity implements Serializable {
    public static final long serialVersionUID = 1L;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_surname")
    private String teacherSurname;

}
