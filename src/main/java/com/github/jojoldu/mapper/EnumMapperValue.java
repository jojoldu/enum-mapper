package com.github.jojoldu.mapper;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public class EnumMapperValue {

    private String code;
    private String title;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        code = enumMapperType.getCode();
        title = enumMapperType.getTitle();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
