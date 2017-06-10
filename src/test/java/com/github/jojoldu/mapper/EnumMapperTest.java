package com.github.jojoldu.mapper;

import com.github.jojoldu.mapper.type.CityType;
import com.github.jojoldu.mapper.type.JobType;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2017. 6. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class EnumMapperTest {

    /*
        @Bean
    public EnumMapper enumMapper() {
        EnumMapper enumMapper = new EnumMapper();
        enumMapper.put("FeeType", PgPartnerFeeType.FeeType.class);
        enumMapper.put("PaymentOption", PaymentOption.class);
        enumMapper.put("ApplyType", PgPartnerFeeCalculator.ApplyType.class);
        enumMapper.put("SupplyPrice", PgPartnerFeeCalculator.SupplyPrice.class);
        enumMapper.put("Surtax", PgPartnerFeeCalculator.Surtax.class);
        enumMapper.put("CompareType", CompareType.class);
        enumMapper.put("OmitStatus", OmitStatus.class);
        enumMapper.put("CancelStatus", CancelStatus.class);
        enumMapper.put("CompareModifyStatus", CompareModifyStatus.class);

        return enumMapper;
    }
     */

    private EnumMapper enumMapper;

    @Before
    public void setup () {
        enumMapper = new EnumMapper();
    }

    @Test
    public void JobType_show() throws Exception {
        //given
        final String KEY_JOB = "job";
        enumMapper.put(KEY_JOB, JobType.class);

        //when
        List<EnumMapperValue> enumValues = enumMapper.get(KEY_JOB);

        //then
        assertThat(enumValues.size()).isEqualTo(4);

        enumValues.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void JoBType_CityType_show() throws Exception {
        //given
        final String KEY_JOB = "job";
        final String KEY_CITY = "city";

        enumMapper.put(KEY_JOB, JobType.class);
        enumMapper.put(KEY_CITY, CityType.class);

        //when
        List<EnumMapperValue> jobTypes = enumMapper.get(KEY_JOB);
        List<EnumMapperValue> cityTypes = enumMapper.get(KEY_CITY);

        //then
        System.out.println("======= Job Type =======");
        assertThat(jobTypes.size()).isEqualTo(4);
        jobTypes.forEach(e -> System.out.println(e.toString()));

        System.out.println("======= City Type =======");
        assertThat(cityTypes.size()).isEqualTo(3);
        cityTypes.forEach(e -> System.out.println(e.toString()));
    }
}
