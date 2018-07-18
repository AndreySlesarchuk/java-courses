package by.umk.umkCrm;


/**
 * Created by admin on 27.03.2017.
 */
import java.text.Collator;
import java.util.Locale;


public class User implements Comparable {
    //id, user_name, user_hash is_group is_admin user in database
    private String id;
    private String userName;
    private String userHash;
    private Byte isGroup;
    private Byte isAdmin;
    private String status;

    // user data first_name, last_name, phone_mobile
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneMobile;

    // поле ИД ГРУППЫ
    private int groupId;


    // Methods
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = this.groupId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash;
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Byte getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Byte isGroup) {
        this.isGroup = isGroup;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String surName) {
        this.middleName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_Name) {
        this.lastName = last_Name;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    // Строку в определеннном формате.
    public String toString() {
        return lastName + " " + firstName + " " + middleName;
    }

    public int compareTo(Object obj) {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }



}
