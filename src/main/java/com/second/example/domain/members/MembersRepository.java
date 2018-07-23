package com.second.example.domain.members;


import com.second.example.domain.members.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Members, Long> {
}
