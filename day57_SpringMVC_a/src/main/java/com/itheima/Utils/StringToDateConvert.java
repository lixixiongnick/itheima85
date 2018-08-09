package com.itheima.Utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
* 自定义转换器
* */
public class StringToDateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        /*
        * 判断
        * */
        if (StringUtils.isEmpty(source)){
            throw new  RuntimeException("数据源为空");
        }
        try {
           return new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            throw  new RuntimeException("支持日期类型为yyyy-MM-dd的转换！");
        }
    }
}
