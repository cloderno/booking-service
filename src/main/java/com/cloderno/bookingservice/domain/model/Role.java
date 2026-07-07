package com.cloderno.bookingservice.domain.model;

import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

/**
 * ADMIN
 * USER
 * OWNER
 */
public class Role {

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}
