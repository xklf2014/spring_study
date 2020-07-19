package com.story.bean;

import java.util.*;

public class Person1 {
    private int id;
    private String name;
    private Integer age;
    private String gender;
    private String[] hobbies;
    private Address address;
    private List<String> lists;
    private Set<String> sets;
    private Map<String,Object> map;
    private Properties properties;
    private List<Address> addressList;

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", map=" + map +
                ", properties=" + properties +
                ", addressList=" + addressList +
                '}';
    }

    public Person1(Address address) {
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Person1() {
    }

    public Person1(int id, String name, Integer age, String gender, String[] hobbies, Address address, List<String> lists, Set<String> sets, Map<String, Object> map, Properties properties, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.address = address;
        this.lists = lists;
        this.sets = sets;
        this.map = map;
        this.properties = properties;
        this.addressList = addressList;
    }
}
