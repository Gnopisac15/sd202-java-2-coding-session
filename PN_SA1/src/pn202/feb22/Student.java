/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pn202.feb22;

/**
 *
 * @author DCISM_REX
 */
public class Student {
    public String id;
    public String name;
    public String program;
    public int year;
    
    public Student() {
    
    }
    
    public Student(String id, String name) {
        this(id, name, null, 0);
    }
    
    public Student(String id, String name, String program, int year) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.year = year;
    }
    
    public void shiftProgram(String newProgram) {
        program = newProgram;
        year = 1;
    }
}
