package com.second.example.controller;

import com.second.example.domain.members.MembersRepository;
import com.second.example.dto.MembersSaveDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainRestController {
    private MembersRepository membersRepository;

    @PostMapping("/save")
    public void saveMembers(@RequestBody MembersSaveDto dto){
        membersRepository.save(dto.toEntity());
    }
}
