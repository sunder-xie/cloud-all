package com.sfxie.services.center.pojo;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sfxie_sys_user_role
 *
 * @mbg.generated do_not_delete_during_merge Mon May 01 19:06:36 CST 2017
 */
public class SfxieSysUserRole {
    /**
     *  记录主键 : 记录主键,所属表字段为sfxie_sys_user_role.id_
     */
    private String id;

    /**
     *  用户代码 : 用户代码,所属表字段为sfxie_sys_user_role.user_id
     */
    private String userId;

    /**
     *  上一级公司 : 上上一级公司，也就是这一级的上一级公司,所属表字段为sfxie_sys_user_role.owner_company_code
     */
    private String ownerCompanyCode;

    /**
     *  是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效,所属表字段为sfxie_sys_user_role.is_valid
     */
    private String isValid;

    /**
     *  用户关联表id,所属表字段为sfxie_sys_user_role.user_info_relation_id
     */
    private String userInfoRelationId;

    /**
     *  角色代码 : 角色代码,所属表字段为sfxie_sys_user_role.role_code
     */
    private String roleCode;

    /**
     *  分区字段 : 分区字段,从用户公司代码字段取值,所属表字段为sfxie_sys_user_role.partition_company
     */
    private String partitionCompany;

    /**
     * 获取 记录主键 : 记录主键 字段:sfxie_sys_user_role.id_
     *
     * @return sfxie_sys_user_role.id_, 记录主键 : 记录主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 记录主键 : 记录主键 字段:sfxie_sys_user_role.id_
     *
     * @param id sfxie_sys_user_role.id_, 记录主键 : 记录主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 用户代码 : 用户代码 字段:sfxie_sys_user_role.user_id
     *
     * @return sfxie_sys_user_role.user_id, 用户代码 : 用户代码
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置 用户代码 : 用户代码 字段:sfxie_sys_user_role.user_id
     *
     * @param userId sfxie_sys_user_role.user_id, 用户代码 : 用户代码
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取 上一级公司 : 上上一级公司，也就是这一级的上一级公司 字段:sfxie_sys_user_role.owner_company_code
     *
     * @return sfxie_sys_user_role.owner_company_code, 上一级公司 : 上上一级公司，也就是这一级的上一级公司
     */
    public String getOwnerCompanyCode() {
        return ownerCompanyCode;
    }

    /**
     * 设置 上一级公司 : 上上一级公司，也就是这一级的上一级公司 字段:sfxie_sys_user_role.owner_company_code
     *
     * @param ownerCompanyCode sfxie_sys_user_role.owner_company_code, 上一级公司 : 上上一级公司，也就是这一级的上一级公司
     */
    public void setOwnerCompanyCode(String ownerCompanyCode) {
        this.ownerCompanyCode = ownerCompanyCode == null ? null : ownerCompanyCode.trim();
    }

    /**
     * 获取 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效 字段:sfxie_sys_user_role.is_valid
     *
     * @return sfxie_sys_user_role.is_valid, 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效 字段:sfxie_sys_user_role.is_valid
     *
     * @param isValid sfxie_sys_user_role.is_valid, 是否有效 : 是否有效,Y:是;N:否
控制是否在公司任职有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * 获取 用户关联表id 字段:sfxie_sys_user_role.user_info_relation_id
     *
     * @return sfxie_sys_user_role.user_info_relation_id, 用户关联表id
     */
    public String getUserInfoRelationId() {
        return userInfoRelationId;
    }

    /**
     * 设置 用户关联表id 字段:sfxie_sys_user_role.user_info_relation_id
     *
     * @param userInfoRelationId sfxie_sys_user_role.user_info_relation_id, 用户关联表id
     */
    public void setUserInfoRelationId(String userInfoRelationId) {
        this.userInfoRelationId = userInfoRelationId == null ? null : userInfoRelationId.trim();
    }

    /**
     * 获取 角色代码 : 角色代码 字段:sfxie_sys_user_role.role_code
     *
     * @return sfxie_sys_user_role.role_code, 角色代码 : 角色代码
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 设置 角色代码 : 角色代码 字段:sfxie_sys_user_role.role_code
     *
     * @param roleCode sfxie_sys_user_role.role_code, 角色代码 : 角色代码
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * 获取 分区字段 : 分区字段,从用户公司代码字段取值 字段:sfxie_sys_user_role.partition_company
     *
     * @return sfxie_sys_user_role.partition_company, 分区字段 : 分区字段,从用户公司代码字段取值
     */
    public String getPartitionCompany() {
        return partitionCompany;
    }

    /**
     * 设置 分区字段 : 分区字段,从用户公司代码字段取值 字段:sfxie_sys_user_role.partition_company
     *
     * @param partitionCompany sfxie_sys_user_role.partition_company, 分区字段 : 分区字段,从用户公司代码字段取值
     */
    public void setPartitionCompany(String partitionCompany) {
        this.partitionCompany = partitionCompany == null ? null : partitionCompany.trim();
    }
}