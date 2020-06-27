package com.startup.entity;

import java.util.Objects;

public class Role {
    
    private String  roleId;
    private String type;
    
    
    public Role(){
        
    }
    
    public Role (Builder builder){
        this.roleId = builder.roleId;
        this.type = builder.type;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getType() {
        return type;
    }


    public static class Builder{
        private String  roleId;
        private String type;
        
        public Builder roleId(String id){
            this.roleId = id;
            return this;
        }
        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Role.Builder copy(Role role){
            this.roleId= role.roleId;
            this.type = role.type;

            return this;
        }
        public Role build(){
            return new Role(this);
        }
    }



    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return roleId.equals(role.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId);
    }
}

