package com.bdqn.pojo;

import java.io.Serializable;
import java.util.Date;

public class ItripUser implements Serializable {

    private static final long serialVersionUID = -7745060334908092451L;
    private Long id;
    private String userCode;
    private String userPassword;
    private Integer userType;
    private Long flatID;
    private String userName;
    private int activated;
    private Date creationDate;
    private Long createdBy;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        return this.userCode;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setFlatID(Long flatID) {
        this.flatID = flatID;
    }

    public Long getFlatID() {
        return this.flatID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }


    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }


}
