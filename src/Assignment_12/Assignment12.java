package Assignment_12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
    int id, age, yearOfEnrollment;
    String name, gender, engDepartment;
    double perTillDate;

    Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;

    }
}
public class Assignment12 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        // Print the name of all departments in the college
        List<String> departments = students.stream().map(student -> student.engDepartment).collect(Collectors.toList());
        System.out.println(departments);

        //Get the names of all students who have enrolled after 2018
        List<String> studentNamesAfter2018 = students.stream().filter(student -> student.yearOfEnrollment > 2018).map(student -> student.name).collect(Collectors.toList());
        System.out.println(studentNamesAfter2018);

        //Get the details of all male student in the computer science department
        List<Student> maleStudentsCS = students.stream().filter(student -> student.gender.equals("Male")).filter( student -> student.engDepartment.equals("Computer Science")).collect(Collectors.toList());
        System.out.println(maleStudentsCS.stream().map( student -> student.name).collect(Collectors.toList()));

        // How many male and female student are there ?
        Map<String, Long> maleFemaleCount = students.stream().map( student -> student.gender).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(maleFemaleCount);

        //the average age of male and female students
        OptionalDouble maleAverage = students.stream().filter(student -> student.gender.equals("Female")).mapToDouble(student -> student.age).average();
        OptionalDouble femaleAvarage = students.stream().filter(student -> student.gender.equals("Male")).mapToDouble(student -> student.age).average();
        System.out.println("Male average " + maleAverage);
        System.out.println("Female Average " + femaleAvarage);

        //the details of highest student having highest percentage
        Student highestStudent = students.stream().max((student1, student2) -> student1.perTillDate > student2.perTillDate ? 1 : -1).get();
        System.out.println(highestStudent.id + " " + highestStudent.name);

        //Count the number of students in each department
        Map<String, Long> countByDepartment = students.stream().map(student -> student.engDepartment).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countByDepartment);

        // average percentage achieved in each department?
        Map<Object, Double> averagePercentageEachDepartment = students
                .stream()
                .collect(Collectors.groupingBy(student -> student.engDepartment,
                        Collectors.averagingDouble(student->student.perTillDate)));
        averagePercentageEachDepartment.forEach((department, average2) -> System.out.println(department + ":\t" + average2));

        //The details of youngest male student in the Electronic department
        Student youngestMaleStudent = students.stream().filter(student -> student.engDepartment.equals("Electronic")).filter(student->student.gender.equals("Male")).collect(Collectors.minBy((student1, student2)->student1.age>student2.age?1:-1)).get();
        System.out.println(youngestMaleStudent.name);

        //.How many male and female students are there in the computer science department
        Map<String, Long> result2 = students.stream().filter(student -> student.engDepartment.equals("Computer Science")).map(student -> student .gender).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result2);


    }

}