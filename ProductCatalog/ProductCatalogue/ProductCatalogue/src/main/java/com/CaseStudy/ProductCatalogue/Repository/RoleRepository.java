package com.CaseStudy.ProductCatalogue.Repository;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
