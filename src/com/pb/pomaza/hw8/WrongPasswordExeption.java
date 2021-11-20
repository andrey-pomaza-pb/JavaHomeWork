package com.pb.pomaza.hw8;

class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Неверный пароль";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
