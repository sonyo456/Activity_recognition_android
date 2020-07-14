package com.example.map_test;

public class Acc {
    private double x;
    private double y;
    private double z;
    private double svm;
//    private double msvm;
    public Acc(){

        this(0, 0, 0);
    }

    public Acc(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }

    public void setSvm(double x, double y, double z){
        //svm 계산
        this.svm = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)+ Math.pow(this.z,2));
    }
//    public void setMsvm(double svm){
//        this.msvm = svm
//    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }
    public double getSvm(){
        return this.svm;
    }

    public void setAccelerometer(double x, double y, double z){
        this.x = x;
        this.y=y;
        this.z = z;
//        this.svm = svm;
    }

}
