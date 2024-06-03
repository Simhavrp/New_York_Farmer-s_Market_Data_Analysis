package ub.dmql.nyfmd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ub.dmql.nyfmd.entity.Market;

@Repository
public interface MarketRepository extends CrudRepository<Market, Long> {

}
