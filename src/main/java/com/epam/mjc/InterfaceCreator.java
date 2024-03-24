package com.epam.mjc;

import java.util.*;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list->{
            List<Integer> result = new ArrayList<>();
            for (Integer i : list) {
                result.add(i / divider);
            }
            return result;
        };
    }
}
