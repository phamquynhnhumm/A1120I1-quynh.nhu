package com.example.validating_form.model.repository;

import com.example.validating_form.model.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleReposetory  extends JpaRepository<People, Integer> {
}
