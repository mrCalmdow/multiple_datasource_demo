package com.flchen.multiple_datasource_demo.entity.shop.admin.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "administrator")
public class AdministratorDO extends BaseDO {

    public final static int LOCK_STATUS_LOCK = 1;
    public final static int LOCK_STATUS_UNLOCK = 0;

    public final static Integer GMLEVEL_CHAIRMAN = 1;//总经理权限等级
    public final static Integer GMLEVEL_MANAGER = 2;//经理权限等级
    public final static Integer GMLEVEL_SALESMAN = 3;//业务员权限等级


    private String mobile;
    private String password;
    private String name;

    private String employeesNum;//员工账号

    private String email;
    private String sex;
    private String duty;//职务
    private long birthday;
    private String nativePlace;//籍贯
    private String telephone;//家用电话
    private String idCard;//身份证号码
    private String remarks;
    //用于权限
    private List<String> roleIds;

    private Integer gmlevel;//权限等级

    private int pwdErrorTimes = 0;// 密码输错次数
    private long lastPwdErrorTime;// 最后登录错误时间
    private int lockStatus = AdministratorDO.LOCK_STATUS_UNLOCK;// 锁定状态（0、未锁，1、锁定）
    private long lockTime;// 锁定时间

    public String getEmployeesNum() {
        return employeesNum;
    }

    public void setEmployeesNum(String employeesNum) {
        this.employeesNum = employeesNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPwdErrorTimes() {
        return pwdErrorTimes;
    }

    public void setPwdErrorTimes(int pwdErrorTimes) {
        this.pwdErrorTimes = pwdErrorTimes;
    }

    public long getLastPwdErrorTime() {
        return lastPwdErrorTime;
    }

    public void setLastPwdErrorTime(long lastPwdErrorTime) {
        this.lastPwdErrorTime = lastPwdErrorTime;
    }

    public int getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    public long getLockTime() {
        return lockTime;
    }

    public void setLockTime(long lockTime) {
        this.lockTime = lockTime;
    }

    public Integer getGmlevel() {
        return gmlevel;
    }

    public void setGmlevel(Integer gmlevel) {
        this.gmlevel = gmlevel;
    }
}
