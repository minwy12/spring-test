package com.owen.jpah2mvn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.jpah2mvn.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> findByPublishedAndTitleContaining(boolean published, String title);
}
