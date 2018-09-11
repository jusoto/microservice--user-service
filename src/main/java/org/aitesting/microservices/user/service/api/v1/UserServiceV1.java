package org.aitesting.microservices.user.service.api.v1;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.aitesting.microservices.user.service.user.User;
import org.aitesting.microservices.user.service.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceV1 {

    private UserRepository userRepository;

    @Autowired
    public UserServiceV1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @HystrixCommand
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
