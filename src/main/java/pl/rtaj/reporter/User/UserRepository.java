package pl.rtaj.reporter.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findByActivationKey(String key);

}
