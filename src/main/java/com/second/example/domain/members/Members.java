package com.second.example.domain.members;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Members {
    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String name;

    private String age;

    @Builder
    public Members(String name, String age){
        this.name = name;
        this.age = age;
    }
}
