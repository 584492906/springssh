package com.shinowit.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2014/12/16.
 */
@Entity
@Table(name = "stu_info")
public class StuInfo {
    private String stuId;
    private String stuName;

    @Id
    @Column(name = "stu_Id")
    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "stu_Name")
    @Size(min = 3,max = 5)
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


}
