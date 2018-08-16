package ru.cloudcrew.leadmeetinghelper.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;

import ru.cloudcrew.leadmeetinghelper.LeadMeetingHelperApplication;
import ru.cloudcrew.leadmeetinghelper.mappers.ITestMapper;
import ru.cloudcrew.leadmeetinghelper.persisted.Test;

@Component
public class TestService implements ITestService {
    private final Logger log = LoggerFactory.getLogger(LeadMeetingHelperApplication.class);
    @Autowired
    private ITestMapper mapper;

    @Override
    public Test getByTitle(final String title) {
        Preconditions.checkNotNull(title, "Необходимо указать значение");
        log.info(title + " requested");
        final Test result = mapper.getTestByTitle(title);

        return result;
    }

    @Override
    public void createTest(final String title) {
        mapper.insertTest(title);
    }

    @Override
    public List<Test> getAllTests() {
        return mapper.getAllTests();
    }
}
