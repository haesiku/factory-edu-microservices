package com.factory.samples.edu.member.domain.member.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factory.samples.edu.member.domain.member.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
