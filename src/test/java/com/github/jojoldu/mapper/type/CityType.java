package com.github.jojoldu.mapper.type;

import com.github.jojoldu.mapper.EnumMapperType;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public enum CityType implements EnumMapperType {
    SEOUL("서울"),
    BUSAN("부산"),
    DAEGU("대구");

    private String title;

    CityType(String title) {
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
