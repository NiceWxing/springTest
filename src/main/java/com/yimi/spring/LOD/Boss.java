package com.yimi.spring.LOD;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    public void comandCheckNumber(TeamLeader teamLeader){
        //模拟Boss一页一页往下翻页，TeamLeader实时统计
        teamLeader.checkNumberOfCourses();
    }
}
