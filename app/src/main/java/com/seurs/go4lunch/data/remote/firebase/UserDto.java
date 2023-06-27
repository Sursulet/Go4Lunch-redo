package com.seurs.go4lunch.data.remote.firebase;

import androidx.annotation.Nullable;

public class UserDto {
    private String uid;
    private String username;
    @Nullable
    private String avatarUrl;

    public UserDto(String uid, String username, @Nullable String avatarUrl) {
        this.uid = uid;
        this.username = username;
        this.avatarUrl = avatarUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Nullable
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(@Nullable String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
