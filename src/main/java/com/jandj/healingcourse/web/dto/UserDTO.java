package com.jandj.healingcourse.web.dto;

public class UserDTO {

    private String username;
    private String password;

    // 기본 생성자
    public UserDTO() {
    }

    // 필드를 초기화하는 생성자
    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter와 Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString 메서드 (디버깅 및 로깅에 유용)
    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
