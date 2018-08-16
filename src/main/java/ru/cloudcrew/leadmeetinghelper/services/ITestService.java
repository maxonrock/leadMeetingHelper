package ru.cloudcrew.leadmeetinghelper.services;

import java.util.List;

import ru.cloudcrew.leadmeetinghelper.persisted.Test;

public interface ITestService {
    Test getByTitle(String title);

    void createTest(String title);

    List<Test> getAllTests();
}
