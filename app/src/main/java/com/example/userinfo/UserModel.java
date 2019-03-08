package com.example.userinfo;

public class UserModel extends RealmObject {
    @PrimaryKey
    private int id;
    private String name ;

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAvatar() {
//        return avatar;
//    }
//
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getFx_account_number() {
//        return fx_account_number;
//    }
//
//    public void setFx_account_number(String fx_account_number) {
//        this.fx_account_number = fx_account_number;
//    }
//
//    public RealmList<UserTags> getTags() {
//        return tags;
//    }
//
//    public void setTags(RealmList<UserTags> tags) {
//        this.tags = tags;
//    }
//
//    public float getRisk() {
//        return risk;
//    }
//
//    public void setRisk(float risk) {
//        this.risk = risk;
//    }
//
//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
//
//    public String getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(String updated_at) {
//        this.updated_at = updated_at;
//    }
//
//    public boolean isIs_phone_valid() {
//        return is_phone_valid;
//    }
//
//    public void setIs_phone_valid(boolean is_phone_valid) {
//        this.is_phone_valid = is_phone_valid;
//    }
//
//    public boolean isIs_email_valid() {
//        return is_email_valid;
//    }
//
//    public void setIs_email_valid(boolean is_email_valid) {
//        this.is_email_valid = is_email_valid;
//    }
//
//    public String getBirth_date() {
//        return birth_date;
//    }
//
//    public void setBirth_date(String birth_date) {
//        this.birth_date = birth_date;
//    }
//
//    public float getBalance() {
//        return balance;
//    }
//
//    public void setBalance(float balance) {
//        this.balance = balance;
//    }
//
//    public int getActive() {
//        return active;
//    }
//
//    public void setActive(int active) {
//        this.active = active;
//    }
}
