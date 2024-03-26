package com.fernandoschimidt.security.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User create(User user);
}
