package com.seurs.go4lunch.domain.repository;

import com.seurs.go4lunch.data.remote.firebase.User;
import com.seurs.go4lunch.util.Result;

public interface UserRepository {
    Result<User> getUser();
}
