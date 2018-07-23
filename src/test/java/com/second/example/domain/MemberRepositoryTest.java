package com.second.example.domain;

import com.second.example.domain.members.Members;
import com.second.example.domain.members.MembersRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MemberRepositoryTest {
    @Autowired
    MembersRepository membersRepository;

    @Test
    public void 게시글저장_불러오기() {
        //given
        membersRepository.save(Members.builder()
                .name("유성민")
                .age("17")
                .build());

        //when
        List<Members> membersList = membersRepository.findAll();

        //then
        Members members = membersList.get(0);
        assertThat(members.getName(), is("유성민"));
        assertThat(members.getAge(), is("17"));
    }
}
