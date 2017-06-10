package com.github.jojoldu.mapper.type;

import com.github.jojoldu.mapper.EnumMapperType;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public enum JobType implements EnumMapperType {
    STUDENT("학생"),
    ENGINEER("엔지니어"),
    DOCTOR("의사"),
    DRIVER("운전사");

    private String title;

    JobType(String title) {
        this.title = title;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public String getTitle() {
        return title;
    }

}
