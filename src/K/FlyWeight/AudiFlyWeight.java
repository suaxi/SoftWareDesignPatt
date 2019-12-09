package K.com.sw.flyweight;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.awt.*;
import java.util.HashMap;

public class AudiFlyWeight {
    public static void main(String[] args) {
    FlyWeightFactory1 ft=new FlyWeightFactory1();
    double length=5.12,width=1.47,height=1.82;
    String str=width+"#"+height+"#"+length;
    FlyWeight1 fw=ft.getFlyWeight(str);
    Car car1=new Car(fw, "黑色",4.5,"奥迪A8");
    Car car2=new Car(fw, "白色",4.5,"奥迪A4L");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
//享元接口
interface FlyWeight1{
    public double getLength();
    public double getWidth();
    public double getHeigth();
    public void printMess(String mess);
}

//具体享元
class ConcreateFlyWeight implements FlyWeight1{
    private double length;
    private double width;
    private double heigth;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeigth() {
        return 0;
    }

    @Override
    public void printMess(String mess) {
        System.out.println(mess);
        System.out.println("长度："+length);
        System.out.println("宽度："+width);
        System.out.println("高度："+heigth);
    }

    @Override
    public String toString() {
        return "ConcreateFlyWeight{" +
                "length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}

//享元工厂
class FlyWeightFactory1{
    private HashMap<String,FlyWeight1> hashMap;

    public void FlyWeightFactory1(){
        hashMap=new HashMap<String,FlyWeight1>();
    }

    public synchronized FlyWeight1 getFlyWeight(String key){
        if(hashMap.containsKey(key)){
            return hashMap.get(key);
        }else{
            double width=0,height=0,length=0;
           String [] str= key.split("#");
            width=Double.parseDouble(str[0]);
            height=Double.parseDouble(str[1]);
            length=Double.parseDouble(str[2]);
            FlyWeight1 ft=new ConcreateFlyWeight(width,height,length);
            hashMap.put(key,ft);
            return ft;
        }
    }
}

//具体程序
class Car{
    FlyWeight1 flyWeight;
    String color;
    double power;
    String name;

    public Car(FlyWeight1 flyWeight, String color, double power, String name) {
        this.flyWeight = flyWeight;
        this.color = color;
        this.power = power;
        this.name = name;
    }

    public void print(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "flyWeight=" + flyWeight +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", name='" + name + '\'' +
                '}';
    }
}