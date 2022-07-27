package com.phucle.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
