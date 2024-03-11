package kz.iitu.authservice.controller;

import kz.iitu.authservice.dto.AuthenticationRequest;
import kz.iitu.authservice.dto.AuthenticationResponse;
import kz.iitu.authservice.dto.RegisterRequest;
import kz.iitu.authservice.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
        @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @GetMapping("/get")
    public ResponseEntity<?> register() {
        return ResponseEntity.ok(authenticationService.getAll());
    }

}
