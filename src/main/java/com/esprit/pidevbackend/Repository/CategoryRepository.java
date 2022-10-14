package com.esprit.pidevbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.pidevbackend.Domain.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
