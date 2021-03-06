package com.sfxie.services.center.pojo;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sfxie_sys_action
 *
 * @mbg.generated do_not_delete_during_merge Mon May 01 19:06:36 CST 2017
 */
public class SfxieSysAction {
    /**
     *  记录主键 : 记录主键,所属表字段为sfxie_sys_action.id_
     */
    private String id;

    /**
     *  动作名称 : 动作名称,所属表字段为sfxie_sys_action.action_name
     */
    private String actionName;

    /**
     *  动作资源 : 动作资源,所属表字段为sfxie_sys_action.action_url
     */
    private String actionUrl;

    /**
     *  排序字段 : 排序字段,所属表字段为sfxie_sys_action.sequence_no
     */
    private Integer sequenceNo;

    /**
     *  创建时间 : 创建时间,所属表字段为sfxie_sys_action.create_time
     */
    private Date createTime;

    /**
     *  记录创建人 : 记录创建人,所属表字段为sfxie_sys_action.create_user
     */
    private String createUser;

    /**
     *  最后修改时间 : 最后修改时间,所属表字段为sfxie_sys_action.update_time
     */
    private Date updateTime;

    /**
     *  最后修改人 : 最后修改人,所属表字段为sfxie_sys_action.update_user
     */
    private String updateUser;

    /**
     *  是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效,所属表字段为sfxie_sys_action.is_valid
     */
    private String isValid;

    /**
     *  置参数标记 : 如果链接中有参数，则设置参数标记。如:businessType=modify,所属表字段为sfxie_sys_action.param_flag
     */
    private String paramFlag;

    /**
     *  菜单代码 : 菜单代码,所属表字段为sfxie_sys_action.menu_code
     */
    private String menuCode;

    /**
     *  分区字段 : 分区字段,从用户公司代码字段取值,所属表字段为sfxie_sys_action.partition_company
     */
    private String partitionCompany;

    /**
     * 获取 记录主键 : 记录主键 字段:sfxie_sys_action.id_
     *
     * @return sfxie_sys_action.id_, 记录主键 : 记录主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 记录主键 : 记录主键 字段:sfxie_sys_action.id_
     *
     * @param id sfxie_sys_action.id_, 记录主键 : 记录主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 动作名称 : 动作名称 字段:sfxie_sys_action.action_name
     *
     * @return sfxie_sys_action.action_name, 动作名称 : 动作名称
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * 设置 动作名称 : 动作名称 字段:sfxie_sys_action.action_name
     *
     * @param actionName sfxie_sys_action.action_name, 动作名称 : 动作名称
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * 获取 动作资源 : 动作资源 字段:sfxie_sys_action.action_url
     *
     * @return sfxie_sys_action.action_url, 动作资源 : 动作资源
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * 设置 动作资源 : 动作资源 字段:sfxie_sys_action.action_url
     *
     * @param actionUrl sfxie_sys_action.action_url, 动作资源 : 动作资源
     */
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl == null ? null : actionUrl.trim();
    }

    /**
     * 获取 排序字段 : 排序字段 字段:sfxie_sys_action.sequence_no
     *
     * @return sfxie_sys_action.sequence_no, 排序字段 : 排序字段
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    /**
     * 设置 排序字段 : 排序字段 字段:sfxie_sys_action.sequence_no
     *
     * @param sequenceNo sfxie_sys_action.sequence_no, 排序字段 : 排序字段
     */
    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    /**
     * 获取 创建时间 : 创建时间 字段:sfxie_sys_action.create_time
     *
     * @return sfxie_sys_action.create_time, 创建时间 : 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 : 创建时间 字段:sfxie_sys_action.create_time
     *
     * @param createTime sfxie_sys_action.create_time, 创建时间 : 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 记录创建人 : 记录创建人 字段:sfxie_sys_action.create_user
     *
     * @return sfxie_sys_action.create_user, 记录创建人 : 记录创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 记录创建人 : 记录创建人 字段:sfxie_sys_action.create_user
     *
     * @param createUser sfxie_sys_action.create_user, 记录创建人 : 记录创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 最后修改时间 : 最后修改时间 字段:sfxie_sys_action.update_time
     *
     * @return sfxie_sys_action.update_time, 最后修改时间 : 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 最后修改时间 : 最后修改时间 字段:sfxie_sys_action.update_time
     *
     * @param updateTime sfxie_sys_action.update_time, 最后修改时间 : 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 最后修改人 : 最后修改人 字段:sfxie_sys_action.update_user
     *
     * @return sfxie_sys_action.update_user, 最后修改人 : 最后修改人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 最后修改人 : 最后修改人 字段:sfxie_sys_action.update_user
     *
     * @param updateUser sfxie_sys_action.update_user, 最后修改人 : 最后修改人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效 字段:sfxie_sys_action.is_valid
     *
     * @return sfxie_sys_action.is_valid, 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效 字段:sfxie_sys_action.is_valid
     *
     * @param isValid sfxie_sys_action.is_valid, 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * 获取 置参数标记 : 如果链接中有参数，则设置参数标记。如:businessType=modify 字段:sfxie_sys_action.param_flag
     *
     * @return sfxie_sys_action.param_flag, 置参数标记 : 如果链接中有参数，则设置参数标记。如:businessType=modify
     */
    public String getParamFlag() {
        return paramFlag;
    }

    /**
     * 设置 置参数标记 : 如果链接中有参数，则设置参数标记。如:businessType=modify 字段:sfxie_sys_action.param_flag
     *
     * @param paramFlag sfxie_sys_action.param_flag, 置参数标记 : 如果链接中有参数，则设置参数标记。如:businessType=modify
     */
    public void setParamFlag(String paramFlag) {
        this.paramFlag = paramFlag == null ? null : paramFlag.trim();
    }

    /**
     * 获取 菜单代码 : 菜单代码 字段:sfxie_sys_action.menu_code
     *
     * @return sfxie_sys_action.menu_code, 菜单代码 : 菜单代码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置 菜单代码 : 菜单代码 字段:sfxie_sys_action.menu_code
     *
     * @param menuCode sfxie_sys_action.menu_code, 菜单代码 : 菜单代码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * 获取 分区字段 : 分区字段,从用户公司代码字段取值 字段:sfxie_sys_action.partition_company
     *
     * @return sfxie_sys_action.partition_company, 分区字段 : 分区字段,从用户公司代码字段取值
     */
    public String getPartitionCompany() {
        return partitionCompany;
    }

    /**
     * 设置 分区字段 : 分区字段,从用户公司代码字段取值 字段:sfxie_sys_action.partition_company
     *
     * @param partitionCompany sfxie_sys_action.partition_company, 分区字段 : 分区字段,从用户公司代码字段取值
     */
    public void setPartitionCompany(String partitionCompany) {
        this.partitionCompany = partitionCompany == null ? null : partitionCompany.trim();
    }
}