package spring_jpa.spring_jpa;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {

	
	
}
