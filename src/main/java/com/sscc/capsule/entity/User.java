package com.sscc.capsule.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length=64)
    private String password;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false)
    private Integer generation; // 기수

    @Column(nullable = false, columnDefinition = "TINYINT")
    @ColumnDefault("0")
    private Integer role;

}
