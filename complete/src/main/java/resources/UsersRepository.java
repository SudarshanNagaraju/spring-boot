package resources;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.CircleMaster;

public interface UsersRepository extends JpaRepository<CircleMaster, Integer> {

}
