package dev.folomkin.kubespringbootdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.folomkin.kubespringbootdemo.entity.User;
import dev.folomkin.kubespringbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

//
//    @Test
//    void shouldCreateUserAndReturn201() throws Exception {
//        User input = new User(null, "alice", "alice@example.com");
//        User saved = new User(1L, "alice", "alice@example.com");
//
//        when(userService.createUser(any(User.class))).thenReturn(saved);
//
//        mockMvc.perform(post("/api/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(input)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.id").value(1))
//                .andExpect(jsonPath("$.username").value("alice"))
//                .andExpect(jsonPath("$.email").value("alice@example.com"));
//    }
}