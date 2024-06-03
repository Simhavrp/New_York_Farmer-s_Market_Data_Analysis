package ub.dmql.nyfmd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ub.dmql.nyfmd.entity.Location;
import ub.dmql.nyfmd.entity.MarketData;
import ub.dmql.nyfmd.projection.ICountyCount;

import java.util.List;
import java.util.Map;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {


    @Query("SELECT l.county AS countyName, COUNT(l.county) AS totalCounty FROM Location AS l GROUP BY countyName ORDER BY totalCounty DESC")
//    List<ICountyCount> countTotalCounty();
    List<Map<String, Object>> countTotalCounty();
}
