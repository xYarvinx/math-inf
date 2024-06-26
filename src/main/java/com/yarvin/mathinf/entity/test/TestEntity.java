package com.yarvin.mathinf.entity.test;

import com.yarvin.mathinf.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Tests")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String grade;

    private String mark;

    @ManyToOne
    private UserEntity user;
}
