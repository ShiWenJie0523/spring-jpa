package com.lance.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenjie.shi on 2016/6/21.
 */
@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String rolename;

    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER)
    private List<Permission> permissionList;//一个角色对应多个权限

    @ManyToMany
    @JoinTable(name = "t_user_role", joinColumns = {@JoinColumn(name = "role_id")},inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> userList;//一个角色对应多个用户

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Transient
    public List<String> getPermissionsName(){
        List<String> list = new ArrayList<String>();
        List<Permission> perList = getPermissionList();
        for (Permission per : perList) {
            list.add(per.getPermissionname());
        }
        return list;
    }
}
