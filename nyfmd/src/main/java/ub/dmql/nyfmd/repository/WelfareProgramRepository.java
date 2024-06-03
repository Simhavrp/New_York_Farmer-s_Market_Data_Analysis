package ub.dmql.nyfmd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ub.dmql.nyfmd.entity.MarketData;
import ub.dmql.nyfmd.entity.WelfareProgram;

@Repository
public interface WelfareProgramRepository extends CrudRepository<WelfareProgram, Long> {
}
