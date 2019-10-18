package com.ss.lmshibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ss.lmshibernate.entity.Borrower;
@Repository
public interface BorrowerDao extends JpaRepository<Borrower, Long> {

}