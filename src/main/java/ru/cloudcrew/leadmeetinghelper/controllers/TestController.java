package ru.cloudcrew.leadmeetinghelper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.cloudcrew.leadmeetinghelper.persisted.Test;
import ru.cloudcrew.leadmeetinghelper.services.ITestService;

@RestController
@RequestMapping("/api/")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "test/{title}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Test getTestByTitle(@PathVariable("title") final String title) {
        final Test result = testService.getByTitle(title);
        return result;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Test> getTestByTitle() {
        final List<Test> result = testService.getAllTests();
        return result;
    }

    @RequestMapping(value = "test", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createTestByTitle(@RequestBody final String title) {
        testService.createTest(title);
    }


}
