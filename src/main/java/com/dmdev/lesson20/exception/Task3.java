package com.dmdev.lesson20.exception;

public class Task3 {

    public static void main(String[] args) {
        unsafe();

    }

    public static void unsafe() {
        throw new DmdevException(new RuntimeException("runtime exception"));
    }
}
