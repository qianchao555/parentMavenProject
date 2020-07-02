package com.cqian.amarsoft;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class TestHutool {
    public static void main(String[] args) {
        String dateStr = "2020-07-02 11:11:11";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }
}
