package com.kk.demo;

public class ComparableDemo implements Comparable<ComparableDemo>{

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        return this.age.compareTo(o.getAge());
    }

    @Override
    public String toString() {
        return "ComparableDemo{" +
                "age=" + age +
                '}';
    }
}
