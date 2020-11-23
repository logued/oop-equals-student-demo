package oop;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // initial attempt an equals() method (checks missing)
//    public boolean equals(Student other) {
//        if (this.name==other.name && this.age==other.age)
//                return true;  // they are equal
//        else
//           return false;  // students are not equal
//    }


    //Generated code:
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age &&
//                name.equals(student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
