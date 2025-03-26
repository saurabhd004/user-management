package com.project.user_management.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;  // Auto-generated primary key

    @Column(nullable = false, unique = true)
    private String username;  // Unique username

    @Column(nullable = false)
    private String password;  // Encrypted password (we will hash it later)

    @Column(nullable = false, unique = true)
    private String email;  // Unique email

    @Column(nullable = false)
    private String role;  // Role (e.g., USER, ADMIN)

    @Column(nullable = false)
    private ZonedDateTime createdOn;  // Account status
}
