package ua.top.bootjava.model;


public enum Role {
    USER,
    ADMIN;

    public String getAuthority() {
        //   https://stackoverflow.com/a/19542316/548473
        return "ROLE_" + name();
    }
}
