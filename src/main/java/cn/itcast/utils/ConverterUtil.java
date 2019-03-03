package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConverterUtil implements Converter<String, Date> {

//  source 为 传递的字符串日期 2000-09-09
    public Date convert(String source) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
//            解析字符串日期 生成Date类型数据
            return  sdf.parse(source);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
