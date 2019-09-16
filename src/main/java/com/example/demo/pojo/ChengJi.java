package com.example.demo.pojo;

/**
 * Created by 张齐 on 2019/9/13.
 */
public class ChengJi{
    private int id;
    private String name;
    private String kemu;
    private int fenshu;

    public ChengJi() {
    }

    public ChengJi(int id, String name, String kemu, int fenshu) {
        this.id = id;
        this.name = name;
        this.kemu = kemu;
        this.fenshu = fenshu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKemu() {
        return kemu;
    }

    public void setKemu(String kemu) {
        this.kemu = kemu;
    }

    public int getFenshu() {
        return fenshu;
    }

    public void setFenshu(int fenshu) {
        this.fenshu = fenshu;
    }
}
