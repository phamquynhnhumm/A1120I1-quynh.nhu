package com.example.validating_form.model.service;


import com.example.validating_form.model.entity.People;
import com.example.validating_form.model.repository.PeopleReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PeopleServicelmpl implements PeopleService {

    @Autowired
    private PeopleReposetory peopleReposetory;

    @Override
    public void save(People people) {

        this.peopleReposetory.save(people);
    }

    @Override
    public void remove(People people) {
        peopleReposetory.delete(people);
    }
    @Override
    public Page<People> findAll(Pageable pageable) {

        return peopleReposetory.findAll(pageable);
    }
}
