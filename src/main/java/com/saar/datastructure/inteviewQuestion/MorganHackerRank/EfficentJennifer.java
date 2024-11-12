package com.saar.datastructure.inteviewQuestion.MorganHackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class EfficentJennifer {
    public static void main(String[] args) throws IOException {

        List<Float> list = Arrays.asList(1.01f, 1.01f, 1.01f, 1.4f, 2.4f);
        List<Float> list1 = Arrays.asList(4f, 1.01f, 1.991f, 1.32f, 1.4f);
        System.out.println(Result.efficientJanitor(list));
        System.out.println(Result.efficientJanitor(list1));
    }

}

class Result {

    /*
     * Complete the 'efficientJanitor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts FLOAT_ARRAY weight as parameter.
     */

    public static int efficientJanitor(List<Float> weight) {
        Float sum = 0.00f;
        int tripCount = 0;
        for (Float singleBag : weight) {
            if (singleBag <= 3.00) {
                sum += singleBag;
                if (sum > 3.00) {
                    ++tripCount;
                    sum = singleBag;
                }
            }
        }

        if (sum == weight.get(weight.size() - 1)) {
            ++tripCount;
        }

        return tripCount;
    }

}

