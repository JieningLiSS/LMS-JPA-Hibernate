package com.ss.lmshibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ss.lmshibernate.entity.LibraryBranch;

@Repository
public interface LibraryBranchDao extends JpaRepository<LibraryBranch, Long> {

}