package com.example.paymentsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "members", catalog = "payment_db", schema = "payment_db")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "pw", nullable = false)
    private String pw;
    @Column(name = "memeber_name", nullable = false, unique = true)
    private String memberName;
}
