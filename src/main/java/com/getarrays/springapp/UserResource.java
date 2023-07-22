package com.getarrays.springapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 6/18/2023
 */

@RestController
@RequestMapping("/api/test")
public class UserResource {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Test is successful");
    }
}
