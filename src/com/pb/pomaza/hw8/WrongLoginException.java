package com.pb.pomaza.hw8;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Неверный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}

