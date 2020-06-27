package com.startup.entity;

public class Contact {
    public String phone;
    public String email;
    public String homephone;

    private Contact(Builder builder){
        this.phone = builder.phone;
        this.email = builder.email;
        this.homephone = builder.homephone;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getHomephone() {
        return homephone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", homephone='" + homephone + '\'' +
                '}';
    }

    public static class Builder{
        public String phone;
        public String email;
        public String homephone;


        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setHomephone(String homephone){
            this.homephone = homephone;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }

    }
}
