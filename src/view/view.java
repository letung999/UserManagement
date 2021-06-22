package view;

import connectDatabase.DeleteData;
import connectDatabase.InsertData;
import connectDatabase.LoadData;
import connectDatabase.Update;
import controller.DataController;
import deparment.Departments;
import exception.InvalidDateOfBirthException;
import exception.InvalidEmailException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneException;
import model.Student;
import model.Teacher;
import rand.RandIDEmployee;
import rand.RandIDStudent;
import rand.RandPersonID;
import sort.SortByNameStudent;
import sort.SortBySalary;
import sort.SortGBADesc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var controller = new DataController();
        var teacherFileName = "TEACHER.DAT";
        var studentFileName = "STUDENT.DAT";
        ArrayList<Student> listStudents = new ArrayList<>();
        ArrayList<Teacher> listTeacher = new ArrayList<>();
        var randIDStudent = new RandIDStudent();
        var randIDPerson = new RandPersonID();
        var randIDEmployee = new RandIDEmployee();
        var departments = new Departments();
        var sortSalary = new SortBySalary();
        var insertData = new InsertData();
        var loadData = new LoadData();
        var updateData = new Update();
        var deleteData = new DeleteData();
        int option;
        do {
            System.out.println("************************MENU************************");
            System.out.println("1.add Teacher In List");
            System.out.println("2.add Student In List");
            System.out.println("3.show Information teacher In List");
            System.out.println("4.show Information student In List");
            System.out.println("5.Sort Information");
            System.out.println("6.Connect DataBase");
            System.out.println("you choose");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0: {
                    System.out.println("exit");
                    break;
                }
                case 1: {
                    var teacher = new Teacher();
                    String personId, fullName, address, dateOfBirth, email, phoneNumber, idEmployee, role;
                    double salary;
                    int yearExperiences;
                    personId = randIDPerson.getPersonID();
                    teacher.setPersonId(personId);
                    System.out.println("Enter FullName");
                    fullName = scanner.nextLine();
                    try {
                        teacher.setFullName(fullName);
                    } catch (InvalidFullNameException e) {
                        System.out.println("Occur InvalidFullNameException ");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter address");
                    address = scanner.nextLine();
                    teacher.setAddress(address);
                    System.out.println("Enter date Of Birth");
                    dateOfBirth = scanner.nextLine();
                    try {
                        teacher.setDateOfBirth(dateOfBirth);
                    } catch (InvalidDateOfBirthException e) {
                        System.out.println("Occur InvalidDateOfBirthException");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter Email");
                    email = scanner.nextLine();
                    try {
                        teacher.setEmail(email);
                    } catch (InvalidEmailException e) {
                        System.out.println("Occur InvalidEmailException");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter phone Number");
                    phoneNumber = scanner.nextLine();
                    try {
                        teacher.setPhoneNumber(phoneNumber);
                    } catch (InvalidPhoneException e) {
                        System.out.println("Occur InvalidPhoneException");
                        System.out.println(e.getMessage());
                    }
                    idEmployee = randIDEmployee.getEmployeeID();
                    teacher.setIdEmployee(idEmployee);
                    System.out.println("Enter Role");
                    role = scanner.nextLine();
                    teacher.setRole(role);
                    System.out.println("Enter Salary");
                    salary = scanner.nextDouble();
                    teacher.setSalary(salary);
                    System.out.println("Enter year Experiences");
                    yearExperiences = scanner.nextInt();
                    teacher.setYearExperiences(yearExperiences);
                    listTeacher.add(teacher);
                    controller.addElementInList(listTeacher, teacherFileName);
                    break;
                }
                case 2: {
                    var student = new Student();
                    String personId, fullName, address, dateOfBirth, email, phoneNumber,
                            idStudent, nameUniversity, nameClass, nameDepartment;
                    float gba;
                    int choose;
                    personId = randIDPerson.getPersonID();
                    student.setPersonId(personId);
                    System.out.println("Enter FullName");
                    fullName = scanner.nextLine();
                    try {
                        student.setFullName(fullName);
                    } catch (InvalidFullNameException e) {
                        System.out.println("Occur InvalidFullNameException ");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter address");
                    address = scanner.nextLine();
                    student.setAddress(address);
                    System.out.println("Enter date Of Birth");
                    dateOfBirth = scanner.nextLine();
                    try {
                        student.setDateOfBirth(dateOfBirth);
                    } catch (InvalidDateOfBirthException e) {
                        System.out.println("Occur InvalidDateOfBirthException");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter Email");
                    email = scanner.nextLine();
                    try {
                        student.setEmail(email);
                    } catch (InvalidEmailException e) {
                        System.out.println("Occur InvalidEmailException");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Enter phone Number");
                    phoneNumber = scanner.nextLine();
                    try {
                        student.setPhoneNumber(phoneNumber);
                    } catch (InvalidPhoneException e) {
                        System.out.println("Occur InvalidPhoneException");
                        System.out.println(e.getMessage());
                    }
                    idStudent = randIDStudent.getStudentID();
                    student.setIdStudent(idStudent);
                    System.out.println("Enter University");
                    nameUniversity = scanner.nextLine();
                    student.setNameUniversity(nameUniversity);
                    System.out.println("Enter Name Class");
                    nameClass = scanner.nextLine();
                    student.setNameClass(nameClass);
                    do {
                        System.out.println("Enter Name Department");
                        System.out.println("1.INFORMATIONTECHNOLOGY\n2.ELECTRICAL\n3.ACCOUNTING\n4.TELECOMUNICATION\n5.MARKETTING");
                        System.out.println("your option");
                        choose = scanner.nextInt();
                        if (choose >= 1 && choose <= 5) {
                            nameDepartment = departments.getDepartment(choose);
                            student.setNameDepartment(nameDepartment);
                            break;
                        } else {
                            System.out.println("Please choose Option in List");
                        }
                    } while (true);
                    System.out.println("Enter Score GBA");
                    gba = scanner.nextFloat();
                    student.setGba(gba);
                    listStudents.add(student);
                    controller.addElementInList(listStudents, studentFileName);
                    break;

                }
                case 3: {
                    listTeacher = controller.readElementInList(teacherFileName);
                    System.out.println("************************LIST************************");
                    controller.showInfoTeacher(listTeacher);
                    break;
                }
                case 4: {
                    listStudents = controller.readElementInList(studentFileName);
                    System.out.println("************************LIST************************");
                    controller.showInfoStudent(listStudents);
                    break;
                }
                case 5: {
                    int optionSort;
                    do {
                        System.out.println("********************SORT*************************");
                        System.out.println("1.Sort Salary DESC");
                        System.out.println("2.Sort Student By Name");
                        System.out.println("3.Sort Score GBA Student DESC");
                        System.out.println("0.return main menu");
                        System.out.println("Your Option ?");
                        optionSort = scanner.nextInt();
                        switch (optionSort) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                listTeacher = controller.readElementInList(teacherFileName);
                                System.out.println("************************LIST************************");
                                sortSalary.sortSalaryDesc(listTeacher);
                                controller.showInfoTeacher(listTeacher);
                                break;
                            }
                            case 2: {
                                listStudents = controller.readElementInList(studentFileName);
                                System.out.println("************************LIST************************");
                                Collections.sort(listStudents, new SortByNameStudent());
                                controller.showInfoStudent(listStudents);
                                break;
                            }
                            case 3: {
                                listStudents = controller.readElementInList(studentFileName);
                                System.out.println("************************LIST************************");
                                Collections.sort(listStudents, new SortGBADesc());
                                controller.showInfoStudent(listStudents);
                                break;
                            }
                        }
                    } while (optionSort != 0);

                }
                case 6: {
                    int choose;
                    do {
                        System.out.println("********************LIST OPTION*************************");
                        System.out.println("1.Insert Data In DataBase");
                        System.out.println("2.Load Data From DataBase");
                        System.out.println("3.Update Element In DataBase");
                        System.out.println("4.Delete Element In DataBase");
                        System.out.println("5.Search Student By Name");
                        System.out.println("0.return main menu");
                        System.out.println("Your Option ?");
                        choose = scanner.nextInt();
                        switch (choose) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                ArrayList<Student> students = controller.readElementInList(studentFileName);
                                var listStudentDb = loadData.loadData();
                                var results = new ArrayList<Student>();
                                for (int i = 0; i < students.size(); ++i) {
                                    if (controller.checkExit(listStudentDb, students.get(i).getPersonId()) == false) {
                                        results.add(students.get(i));
                                        insertData.insert(results);
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("************************LIST************************");
                                ArrayList<Student> students = new ArrayList<>();
                                students = loadData.loadData();
                                controller.showInfoStudent(students);
                                break;
                            }
                            case 3: {
                                int result;
                                String personID;
                                float newScore;
                                var listStudent = loadData.loadData();
                                System.out.println("************************LIST************************");
                                controller.showInfoStudent(listStudent);
                                System.out.println("Enter personID to update");
                                scanner.nextLine();
                                personID = scanner.nextLine();
                                System.out.println("Enter new Score to Update");
                                newScore = scanner.nextFloat();
                                result = updateData.updateData(personID, newScore);
                                if (result != -1) {
                                    System.out.println("SUCCESS");
                                } else {
                                    System.out.println("FAIL");
                                }

                            }
                            case 4: {
                                int result;
                                String personID;
                                var listStudent = loadData.loadData();
                                System.out.println("************************LIST************************");
                                controller.showInfoStudent(listStudent);
                                System.out.println("Enter personID to delete");
                                scanner.nextLine();
                                personID = scanner.nextLine();
                                result = deleteData.deleteElement(personID);
                                if (result != -1) {
                                    System.out.println("SUCCESS");
                                } else {
                                    System.out.println("FAIL");
                                }
                                break;
                            }
                            case 5:{
                                listStudents = loadData.loadData();
                                String name;
                                System.out.println("************************LIST************************");
                                controller.showInfoStudent(listStudents);
                                System.out.println("Enter Name to Search");
                                scanner.nextLine();
                                name = scanner.nextLine();
                                var results = controller.searchStudentByName(listStudents, name);
                                if(results.size() < 0){
                                    System.out.println("no information");
                                }
                                else{
                                    System.out.println("************************RESULTS************************");
                                    controller.showInfoStudent(results);
                                }
                                break;
                            }
                        }
                    } while (choose != 0);

                }
            }
        } while (option != 0);

    }
}
