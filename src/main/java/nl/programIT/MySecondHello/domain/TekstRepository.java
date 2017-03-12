package nl.programIT.MySecondHello.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TekstRepository extends CrudRepository<Tekst, Long>{

}
