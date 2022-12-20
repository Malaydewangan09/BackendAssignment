package com.malay.EMS.repository;


import com.malay.EMS.entity.assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<assignment, Long> {

}
