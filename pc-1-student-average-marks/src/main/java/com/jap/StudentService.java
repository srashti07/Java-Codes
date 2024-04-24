package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("John", 23, 500));
        studentSet.add(new Student("Bob", 26, 545));
        studentSet.add(new Student("William", 15, 400));
        studentSet.add(new Student("Kevin", 29, 489));
        studentSet.add(new Student("Johnson", 30, 578));
        studentSet.add(new Student("Catherine", 25, 490));

        return studentSet;
    }

    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        TreeSet<String> sortedNames = new TreeSet<>();

        for (Student student : studentSet) {
            sortedNames.add(student.getName());
        }

        return sortedNames;
    }

    public static Map<String, Integer> calculateAverage(Set<Student> studentSet) {
        Map<String, Integer> averageMap = new HashMap<>();

        for (Student student : studentSet) {
            String name = student.getName();
            int totalMarks = student.getTotalMarks();

            averageMap.put(name, averageMap.getOrDefault(name, 0) + totalMarks);
        }

        for (Map.Entry<String, Integer> entry : averageMap.entrySet()) {
            entry.setValue(entry.getValue() / studentSet.size());
        }

        return averageMap;
    }

    public static void main(String[] args) {
        Set<Student> studentSet = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentSet));
        System.out.println(calculateAverage(studentSet));
    }
}