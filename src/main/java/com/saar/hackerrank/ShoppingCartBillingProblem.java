package com.saar.hackerrank;

import java.util.*;
import java.util.function.Predicate;

public class ShoppingCartBillingProblem {
    public int totalAmount(String[][] productList, String[][] discounts) {
        Map<String, String[]> disTypeMap = new HashMap<>();

        for (String[] discount : discounts) {
            disTypeMap.put(discount[0], discount);
        }

        List<Integer> disCountedPriceList = new ArrayList<>();
        for (String[] product : productList) {

            int price = Integer.parseInt(product[0]);
            int min = price;
            for (int i = 1; i < product.length; i++) {
                String tag = product[i];
                if (null != tag && !tag.isEmpty() & !"EMPTY".equals(tag)) {
                    String[] discount = disTypeMap.get(tag);
                    int disCountedPrice = getDiscountedPrice(price, discount);
                    if(min < disCountedPrice)
                        min = disCountedPrice;
                }else if (min < price) {
                    min = price;
                }
            }
            disCountedPriceList.add(min);
        }
        return 0;
    }

    private int getDiscountedPrice(Integer price, String[] discountType) {
        int type = Integer.parseInt(discountType[1]);
        int retailAmt = Integer.parseInt(discountType[2]);
        switch (type) {
            case 0:
                return retailAmt;
            case 1:
                return price - (price * retailAmt / 100);
            case 2:
                return price - retailAmt;
            default:
                return price;
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> logMap = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        //Collections.sort(logMap.keySet());
        list.add(1);
        logMap.put(1, list);
        logMap.get(1).add(2);
        System.out.println(logMap.toString());
        for (Map.Entry<Integer, List<Integer>>mpa : logMap.entrySet()){
            //if (mpa.getKey() >= 1 )

        }
    }

}
