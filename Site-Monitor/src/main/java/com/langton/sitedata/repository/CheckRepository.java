package com.langton.sitedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.langton.sitedata.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Integer>{

}
