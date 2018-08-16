package ru.cloudcrew.leadmeetinghelper.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import ru.cloudcrew.leadmeetinghelper.persisted.Test;

@Mapper
public interface ITestMapper {
    @Select("SELECT * FROM test WHERE title LIKE '%' || #{title} || '%'")
    Test getTestByTitle(@Param("title") String title);

    @Insert("INSERT INTO test(title) VALUES(#{title})")
    void insertTest(String title);

    @Select("SELECT * FROM test")
    List<Test> getAllTests();
}
