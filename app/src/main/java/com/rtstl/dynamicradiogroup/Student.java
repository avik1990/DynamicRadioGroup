package com.rtstl.dynamicradiogroup;

public class Student {

    String name;
    String id;
    String classname;
    String section;

    public Student(String name, String id, String classname, String section) {
        this.name = name;
        this.id = id;
        this.classname = classname;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
