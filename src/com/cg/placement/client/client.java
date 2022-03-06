package com.cg.placement.client;

import com.cg.placement.entities.*;
import com.cg.placement.service.*;

import java.util.ArrayList;
import java.util.List;

public class client {
    public static void main(String[] args) {// Creating an object of all entity files


        Student student=new Student();
        IStudentService service=new StudentServiceImpl();

        Certificate certificate=new Certificate();
        ICertificateService service1=new CertificateServiceImpl();

        College college=new College();
        ICollegeService service2=new CollegeServiceImpl();


        User user1 =new User();
        User user2=new User();
        User user3=new User();
        IUserService service3=new UserServiceImpl();

        Placement placement=new Placement();
        IPlacementService service4=new PlacementServiceImpl();

        Admin admin =new Admin();

//        //creating user......................................................
//        user1.setName("Sam");
//        user1.setType("Admin");
//        user1.setPassword("Sam123");
//        admin.setUser(user1);
//        service3.addAdmin(admin);   //saving admin...
//
//        user2.setName("ram");
//        user2.setType("Corporate");
//        user2.setPassword("Ram123");
//
//        user3.setName("Sundar");
//        user3.setType("Corporate");
//        user3.setPassword("Sundar123");
////
//        //creating college.................................................................................
//        college.setName("A.C.PATIL");
//        college.setLocation("kharghar");
//        college.setAdmin(user1);
////
////        //creating certificate.....................................................................
//        certificate.setYear(2020);
//        certificate.setCollege(college);
////
////        //creating Student..................................................................................
//        student.setName("Shreyas");
//        student.setRoll(73);
//        student.setQualification("BE");
//        student.setCourses("BEIT");
//        student.setYear(2021);
//        student.setHallTicketNo(625);
//        //mapping student with college and certificate...
//        student.setCollege(college);
//        student.setCertificate(certificate);
//        // mapping certificate with student...
//        certificate.setStudent(student);
////
////
////
////        //creating all the list to add in college..........................................................................
//        List<Student> list =new ArrayList<Student>();
//        list.add(student);
//
//        List<Certificate> list1 =new ArrayList<Certificate>();
//        list1.add(certificate);
//
//        List<Placement> list2 =new ArrayList<Placement>();
//        list2.add(placement);
//
////        //mapping college........................................................................................
//        college.setCertificates(list1); //with certificate list.
//        college.setStudents(list);      //with students list.
//        college.setPlacements(list2);   //with placement list.
//
////        //creating Placements.....................................................................
//        placement.setName("Capgemini");
//        placement.setDate("11-01-2022");
//        placement.setQualification("BE_IT");
//        placement.setYear(2021);
////        mapping placement with college.
//        placement.setCollege(college);
//
//        // saving all entities
//
//        service3.addNewUser(user1);  //saving user...
//        service3.addNewUser(user2); //saving user...
//        service3.addNewUser(user3);     //saving user...
//        service.addStudent(student);        //saving student...
//        service2.addCollege(college);       //saving college...
//        service1.addCertificate(certificate);       //saving certificate...
//        service4.addPlacement(placement);       //saving placement...
//
//        System.out.println("one entry");



//      Retrieve
//        student= service.searchStudentById(5);
//        System.out.println("ID is:"+student.getId());
//        System.out.println("Roll is:"+student.getRoll());
//        System.out.println("College is:"+student.getCollege().getName());

//      Update
        student= service.searchStudentById(5);
        student.setQualification("ME");
        service.updateStudent(student);
        System.out.println("update is successful");

//        delete by id
//        student= service.searchStudentById(5);
//        service.deleteStudent(student);
//        System.out.println("deletion is successful");

//
////          delete by hallTicket.
//        student= service.searchStudentByHallTicketNo(1);
//        service.deleteStudent(student);
//        System.out.println("deletion is successful");



    }
}
