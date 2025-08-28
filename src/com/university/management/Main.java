package com.university.management;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Professor> professors = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            String choice = sc.next().trim();

            switch (choice) {
                case "1":
                    generateStudents();
                    break;
                case "2":
                    showUniqueDepartments();
                    break;
                case "3":
                    showDepartmentCounts();
                    break;
                case "4":
                    listStudents();
                    break;
                case "5":
                    listProfessors();
                    break;
                case "6":
                    generateProfessors();
                    break;
                case "0":
                    System.out.println("Programdan cikiliyor...");
                    return;
                default:
                    System.out.println("Gecersiz secim!");
            }
            System.out.println();
        }
    }

    static void printMenu() {
        System.out.println("=== Universite Yonetim Sistemi ===");
        System.out.println("1) 10 ogrenci uret (List)");
        System.out.println("2) Benzersiz bolumler (Set)");
        System.out.println("3) Bolumlere gore ogrenci sayisi (HashMap)");
        System.out.println("4) Ogrencileri listele");
        System.out.println("5) Profesorleri listele");
        System.out.println("6) 5 profesor uret");
        System.out.println("0) Cikis");
        System.out.print("Seciminiz: ");
    }

    static void generateStudents() {
        students.clear();
        students.add(new Student("Ogrenci1", 2020, 1, Department.CS));
        students.add(new Student("Ogrenci2", 2021, 2, Department.EE));
        students.add(new Student("Ogrenci3", 2022, 3, Department.ME));
        students.add(new Student("Ogrenci4", 2020, 4, Department.CE));
        students.add(new Student("Ogrenci5", 2021, 5, Department.CS));
        students.add(new Student("Ogrenci6", 2022, 6, Department.EE));
        students.add(new Student("Ogrenci7", 2020, 7, Department.ME));
        students.add(new Student("Ogrenci8", 2021, 8, Department.CE));
        students.add(new Student("Ogrenci9", 2022, 9, Department.CS));
        students.add(new Student("Ogrenci10", 2020, 10, Department.EE));

        System.out.println("Ogrenciler eklendi. Toplam ogrenci sayisi: " + students.size());
    }

    static void generateProfessors() {
        professors.clear();
        professors.add(new Professor("Prof1", 2010, Department.CS));
        professors.add(new Professor("Prof2", 2012, Department.EE));
        professors.add(new Professor("Prof3", 2015, Department.ME));
        professors.add(new Professor("Prof4", 2018, Department.CE));
        professors.add(new Professor("Prof5", 2020, Department.CS));

        System.out.println("Profesorler eklendi. Toplam profesor sayisi: " + professors.size());
    }

    static void showUniqueDepartments() {
        Set<Department> departments = new HashSet<>();
        for (Student student : students) {
            departments.add(student.getDepartment());
        }
        System.out.println("Ogrencilerin ait oldugu bolumler: " + departments);
    }

    static void showDepartmentCounts() {
        HashMap<Department, Integer> counts = new HashMap<>();
        for (Student student : students) {
            Department department = student.getDepartment();
            if (counts.containsKey(department)) {
                counts.put(department, counts.get(department) + 1);
            } else {
                counts.put(department, 1);
            }
        }
        System.out.println("Bolumlere gore ogrenci sayilari: " + counts);
    }

    static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("Ogrenci listesi bos. Once ogrenci eklemelisiniz.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.print());
        }
    }

    static void listProfessors() {
        if (professors.isEmpty()) {
            System.out.println("Profesor listesi bos. Once profesor eklemelisiniz.");
            return;
        }
        for (Professor profesor : professors) {
            System.out.println(profesor.print());
        }
    }
}
