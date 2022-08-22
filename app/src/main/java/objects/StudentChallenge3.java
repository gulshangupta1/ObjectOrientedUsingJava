package objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StudentChallenge3 {

    public static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getClassNo() {
            return classNo;
        }

        public void setClassNo(int classNo) {
            this.classNo = classNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }

    }

//    sort by age
    public List<Student> sortByAge(List<Student> students) {
        return students
                .stream()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student student1, Student student2) {
                        Integer age1 = student1.getAge();
                        Integer age2 = student2.getAge();
                        return age1.compareTo(age2);
                    }
                })
        .collect(Collectors.toList());
    }

//    sorted by name
    public List<Student> sortByName(List<Student> students) {
        return students
                .stream()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student student1, Student student2) {
                        String name1 = student1.getName();
                        String name2 = student2.getName();
                        return name1.compareTo(name2);
                    }
                })
                .collect(Collectors.toList());
    }

//  sorted by class
    public List<Student> sortByClass(List<Student> students) {
        return students
                .stream()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student student1, Student student2) {
                        Integer classNo1 = student1.getClassNo();
                        Integer classNo2 = student2.getClassNo();

                        return classNo1.compareTo(classNo2);
                    }
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        StudentChallenge3 studentChallenge3 = new StudentChallenge3();

        List<Student> studentsSortedByAge = studentChallenge3.sortByAge(students);
        studentsSortedByAge.stream().forEach(student -> System.out.println(student));

        System.out.println("------------------------------------------");
        List<Student> studentsSortedByName = studentChallenge3.sortByName(students);
        studentsSortedByName.stream().forEach(student -> System.out.println(student));

        System.out.println("------------------------------------------");
        List<Student> studentsSortedByClass = studentChallenge3.sortByClass(students);
        studentsSortedByClass.stream().forEach(student -> System.out.println(student));
    }
}
