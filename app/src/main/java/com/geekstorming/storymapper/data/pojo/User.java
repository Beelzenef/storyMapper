package com.geekstorming.storymapper.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by Beelzenef on 24/02/2018.
 */

public class User implements Parcelable {

    private String username;
    private String user;
    private String email;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() { }

    public User(String username, String user, String email, String password) {
        this.username = username;
        this.user = user;
        this.email = email;
        this.password = password;
    }

    protected User(Parcel in) {
       this.username = in.readString();
       this.user = in.readString();
       this.email = in.readString();
       this.password = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // Constructor

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    // toString()

    @Override
    public String toString() {
        return this.username;
    }

    // Parcelable methods

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(user);
        dest.writeString(email);
        dest.writeString(password);
    }
}
