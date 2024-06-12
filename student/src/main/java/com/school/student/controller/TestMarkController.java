//package com.school.student.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.school.student.entity.TestMark;
//import com.school.student.service.TestMarkservice;
//
//
//@RestController
//@RequestMapping("/api")
//public class TestMarkController {
//    @Autowired
//    private TestMarkservice testMarkService;
//
//    @PostMapping("/testmark")
//    public TestMark createOrUpdateTestMark(
//        @RequestParam Long studentId,
//        @RequestParam Long testId,
//        @RequestParam Long questionId,
//        @RequestParam Long choiceId) {
//        return testMarkService.createOrUpdateTestMark(studentId, testId, questionId, choiceId);
//    }
//
//    @GetMapping("/testmarks")
//    public List<TestMark> retrieveAllTestMarks() {
//        return testMarkService.retrieveAllTestMarks();
//    }
//}
