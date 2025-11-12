package com.example.AirBnbClone.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false,columnDefinition = "INTEGER DEFAULT 0")
    private Integer bookedCount;

    private Integer totalCount;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private BigDecimal surgeFactor;

    private Boolean closed;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price; // basePrice * surgeFactor

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hotel_id",nullable = false)
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id",nullable = false)
    private Room room;

}
