package com.github.jojoldu.mapper;

import com.github.jojoldu.mapper.type.CityType;
import com.github.jojoldu.mapper.type.JobType;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class EnumMapperFactoryTest {


    private EnumMapperFactory enumMapperFactory;

    @Before
    public void setup () {
        enumMapperFactory = new EnumMapperFactory();
    }

    @Test
    public void JobType_show() throws Exception {
        //given
        final String KEY_JOB = "job";
        enumMapperFactory.put(KEY_JOB, JobType.class);

        //when
        List<EnumMapperValue> enumValues = enumMapperFactory.get(KEY_JOB);

        //then
        assertThat(enumValues.size()).isEqualTo(4);

        enumValues.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void JobType_CityType_show() throws Exception {
        //given
        final String KEY_JOB = "job";
        final String KEY_CITY = "city";

        enumMapperFactory.put(KEY_JOB, JobType.class);
        enumMapperFactory.put(KEY_CITY, CityType.class);

        //when
        List<EnumMapperValue> jobTypes = enumMapperFactory.get(KEY_JOB);
        List<EnumMapperValue> cityTypes = enumMapperFactory.get(KEY_CITY);

        //then
        System.out.println("======= Job Type =======");
        assertThat(jobTypes.size()).isEqualTo(4);
        jobTypes.forEach(e -> System.out.println(e.toString()));

        System.out.println("======= City Type =======");
        assertThat(cityTypes.size()).isEqualTo(3);
        cityTypes.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void MultiKey_get() throws Exception {
        //given
        final String KEY_JOB = "job";
        final String KEY_CITY = "city";
        final List<String> KEYS = Arrays.asList(KEY_JOB, KEY_CITY);

        enumMapperFactory.put(KEY_JOB, JobType.class);
        enumMapperFactory.put(KEY_CITY, CityType.class);

        //when
        Map<String, List<EnumMapperValue>> types = enumMapperFactory.get(KEYS);

        //then
        types.get(KEY_JOB).forEach(e -> System.out.println(e.toString()));
        types.get(KEY_CITY).forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void getAll() throws Exception {
        //given
        final String KEY_JOB = "job";
        final String KEY_CITY = "city";

        enumMapperFactory.put(KEY_JOB, JobType.class);
        enumMapperFactory.put(KEY_CITY, CityType.class);

        //when
        Map<String, List<EnumMapperValue>> types = enumMapperFactory.getAll();

        //then
        types.get(KEY_JOB).forEach(e -> System.out.println(e.toString()));
        types.get(KEY_CITY).forEach(e -> System.out.println(e.toString()));
    }
}
