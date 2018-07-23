package com.second.example.dto;

import com.second.example.domain.members.Members;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MembersSaveDto {
    private String name;
    private String age;

    public Members toEntity() {
        return Members.builder()
                .name(name)
                .age(age)
                .build();
    }
}
