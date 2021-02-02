package com.wannistudio.restapi.controller.v1;

import com.wannistudio.restapi.domain.user.User;
import com.wannistudio.restapi.repository.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController // 결과값을 JSON으로 출력합니다.
@RequestMapping(value = "/v1")
public class UserController {
    private final UserJpaRepo userJpaRepo;

    @GetMapping(value = "/user")
    public List<User> findAllUser() {
        return userJpaRepo.findAll();
    }

    @PostMapping(value = "/user")
    public User save() {
        User user = User.builder()
                .uid("wanni@naver.com")
                .name("wanni")
                .build();
        return userJpaRepo.save(user);
    }
}