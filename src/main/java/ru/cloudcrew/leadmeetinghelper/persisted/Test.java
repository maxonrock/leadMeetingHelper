package ru.cloudcrew.leadmeetinghelper.persisted;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    private Long id;
    private String title;
    private Date dateCreated;
}
