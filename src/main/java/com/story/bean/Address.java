package com.story.bean;

public class Address {
    private String province;
    private String city;
    private String town;

    public Address() {
        System.out.println("初始化address");
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    void init(){
        System.out.println("address初始化完成");
    }

    void destory(){
        System.out.println("adress对象完成销毁");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
