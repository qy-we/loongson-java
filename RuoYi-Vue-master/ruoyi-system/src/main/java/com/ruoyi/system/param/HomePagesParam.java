package com.ruoyi.system.param;


import lombok.Data;

@Data
public class HomePagesParam extends BasePageParam{
    private Long id;

    private String clientId;

    private String teacherId;

    private String jhiType;

    private String name;

    private String avatarUrl;

    private String phone;

    private String email;

    private String gender;

    private String age;

    private String location;

    private String company;

    private String jhiRole;

    private String coursesCount;

    private String studentsCount;

    private String info;

    private String tag;

    private String createdAt;

    private String updatedAt;
}
