package com.intec.codestudy.result;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class HungryCowTest {

    @Autowired
    HungryCow hungryCow;


    @Test
    void hungryCowTest1(){
        List<Integer> cowList = List.of(0);
        List<Integer> barnList = List.of(-5,5);

        long start = System.nanoTime();
        List<Integer> testResultArray = hungryCow.resultFunction(cowList, barnList);
        long finish = System.nanoTime();

        List<Integer> resultList = List.of(0);
        System.out.println(start - finish);

        assertArrayEquals(testResultArray.toArray(), resultList.toArray());
    }

    @Test
    void hungryCowTest2(){
        List<Integer> cowList = List.of(7,7);
        List<Integer> barnList = List.of(7,10000);

        long start = System.nanoTime();
        List<Integer> testResultArray = hungryCow.resultFunction(cowList, barnList);
        long finish = System.nanoTime();

        List<Integer> resultList = List.of(0,0);
        System.out.println(start - finish);

        assertArrayEquals(testResultArray.toArray(), resultList.toArray());
    }

    @Test
    void hungryCowTest3(){
        List<Integer> cowList = List.of(2,6,0,4,8);
        List<Integer> barnList = List.of(3, -1, 5, 1, 7);

        long start = System.nanoTime();
        List<Integer> testResultArray = hungryCow.resultFunction(cowList, barnList);
        long finish = System.nanoTime();

        List<Integer> resultList = List.of(3, 2, 1, 0, 4);
        System.out.println(start - finish);

        assertArrayEquals(testResultArray.toArray(), resultList.toArray());
    }
}
