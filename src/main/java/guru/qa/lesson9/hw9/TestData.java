package guru.qa.lesson9.hw9;

import java.util.Objects;

public class TestData {
    Student st1 = new Student("Ivan", 3, 20, 4.8);
    Student st2 = new Student("Ann", 4, 21, 5);
    Student st3 = new Student("Petr", 2, 19, 4.1);
    Student st4 = null;
    Student st5 = new Student("Kate", 5, 22, 4.6);
    Student st6 = new Student("Ann", 4, 21, 5);
}

class Student {
    String name;
    int course;
    int age;
    double avgGrade;

    public Student(String name, int course, int age, double avgGrade) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && age == student.age && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, age, avgGrade);
    }

    public int compareTo(Student other) {
        return this.course - other.course;
    }
}



