package com.example.taskmanagementapi.controller;

import com.example.taskmanagementapi.model.AuthRequest;
import com.example.taskmanagementapi.util.JwtUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthControllerTest {

    @InjectMocks
    private AuthController authController;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JwtUtil jwtUtil;

    @Mock
    private Authentication authentication;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_shouldReturnToken_whenCredentialsAreValid() {
        // Arrange
        AuthRequest request = new AuthRequest();
        request.setUsername("admin");
        request.setPassword("admin123");

        when(authenticationManager.authenticate(any()))
                .thenReturn(authentication);
        when(authentication.getName())
                .thenReturn("admin");
        when(jwtUtil.generateToken("admin"))
                .thenReturn("mocked-jwt-token");

        // Act
        ResponseEntity<?> response = authController.login(request);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        Map<String, String> body = (Map<String, String>) response.getBody();
        assertNotNull(body);
        assertEquals("mocked-jwt-token", body.get("token"));
    }

    @Test
    void login_shouldReturn401_whenCredentialsAreInvalid() {
        // Arrange
        AuthRequest request = new AuthRequest();
        request.setUsername("wrong");
        request.setPassword("wrongpass");

        when(authenticationManager.authenticate(any()))
                .thenThrow(new BadCredentialsException("Invalid credentials"));

        // Act
        ResponseEntity<?> response = authController.login(request);

        // Assert
        assertEquals(401, response.getStatusCodeValue());
        assertEquals("Credenciales invalidas", response.getBody());
    }
}
