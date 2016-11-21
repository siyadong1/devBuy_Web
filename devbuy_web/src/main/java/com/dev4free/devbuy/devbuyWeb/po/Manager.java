package com.dev4free.devbuy.devbuyWeb.po;

public class Manager {
    private String managerId;

    private String name;

    private String password;

    private String supermanager;

    private String description;

    private Integer submanagerCount;

    private String parentManager;

    private String createTime;

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSupermanager() {
        return supermanager;
    }

    public void setSupermanager(String supermanager) {
        this.supermanager = supermanager == null ? null : supermanager.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSubmanagerCount() {
        return submanagerCount;
    }

    public void setSubmanagerCount(Integer submanagerCount) {
        this.submanagerCount = submanagerCount;
    }

    public String getParentManager() {
        return parentManager;
    }

    public void setParentManager(String parentManager) {
        this.parentManager = parentManager == null ? null : parentManager.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}