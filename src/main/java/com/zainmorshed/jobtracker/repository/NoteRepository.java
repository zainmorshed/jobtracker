package com.zainmorshed.jobtracker.repository;

import com.zainmorshed.jobtracker.model.Note;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {


}
