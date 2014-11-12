/*
 * work_test.java
 *
 * Copyright (c) 2014 Chengdu Lanjing Data&Information Co., Ltd
 */

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;

import java.util.List;

/**
 * Created by hanwei on 14-11-12.
 */

public class WorkTest {
    public static void main(String[] args){
        List<Term> parse = BaseAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
        System.out.println(parse);
    }
}
