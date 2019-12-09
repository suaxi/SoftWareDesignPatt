package com.st.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightTest {
    public static void main(String[] args) {

    }
}

//享元接口
interface FlyWeight{
    void action(int args);
}

//具体享元
class FlyWeightImpl implements FlyWeight{

    @Override
    public void action(int args) {
        System.out.println("参数为"+args);
    }
}

class FlyWeightFactory {
    private static Map flyweight = new HashMap();

    public FlyWeightFactory(String key) {
        flyWeights.put(key, new FlyWeightImpl());
    }

    public static FlyWeight getFlyWeight(String key) {
        if (flyweights.get(key) == null) {
            flyweight.put(key, new FlyWeightImpl());
        }
        return (FlyWeight) flyweights.get(key);
    }
}