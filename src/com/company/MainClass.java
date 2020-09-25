package com.company;

class Student
{
    private int ans;
    private String name;
    private String facultate;

    public Student( String name, int ans, String faculatate)
    {
        this.ans = ans;
        this.name = name;
        this.facultate = faculatate;
    }

    public String printst()
    {
        return ("Nume: " + this.name + ", ans " + this.ans + ", Faculatatea: " + this.facultate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}