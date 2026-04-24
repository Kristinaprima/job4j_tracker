package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error error500 = new Error(true, 500, "Internal Server Error");
        error500.printInfoError();
        Error error404 = new Error(false, 404, "Not Found");
        error404.printInfoError();
        Error error = new Error();
        error.printInfoError();
    }

    public void printInfoError() {
        System.out.println("Активная ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}
