package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.CircleMaster;

public interface NoteRepository extends  JpaRepository<CircleMaster, Integer> {

}
