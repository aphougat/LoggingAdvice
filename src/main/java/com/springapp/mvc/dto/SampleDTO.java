package com.springapp.mvc.dto;

/**
 * Created by abhay on 17/09/15.
 */
public class SampleDTO {

    int x;

    String y;

    float z;

    Integer t;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "SampleDTO{" +
                "x=" + x +
                ", y='" + y + '\'' +
                ", z=" + z +
                ", t=" + t +
                '}';
    }
}
