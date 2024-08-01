package com.HydroHero.HydroHero.models;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class HydrationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timestamp;
    private double amount;

    @ManyToOne
    private User user;

    public HydrationRecord() {

    }

    public HydrationRecord(LocalDateTime timestamp, double amount, User user) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setTimestamp(LocalDateTime timestamp) {
    }

    public void setAmount(double amount) {
    }
}
