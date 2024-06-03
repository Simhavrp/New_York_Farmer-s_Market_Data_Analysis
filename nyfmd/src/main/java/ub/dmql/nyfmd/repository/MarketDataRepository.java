package ub.dmql.nyfmd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ub.dmql.nyfmd.entity.MarketData;

@Repository
public interface MarketDataRepository extends CrudRepository<MarketData, Long> {
}
