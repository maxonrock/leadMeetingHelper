package ru.cloudcrew.leadmeetinghelper.services;

import ru.cloudcrew.leadmeetinghelper.persisted.User;

import java.util.List;

public interface IUserService {

    User getByEmail(String email);

    void createUser(User user);

    User getById(long id);

    String getUserGroupId(long userId);
}
