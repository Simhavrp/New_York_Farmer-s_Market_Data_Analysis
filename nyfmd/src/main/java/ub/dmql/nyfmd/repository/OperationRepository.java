package ub.dmql.nyfmd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ub.dmql.nyfmd.entity.MarketData;
import ub.dmql.nyfmd.entity.Operation;

@Repository
public interface OperationRepository extends CrudRepository<Operation, Long> {
}
