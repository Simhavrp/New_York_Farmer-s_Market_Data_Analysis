package ub.dmql.nyfmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ub.dmql.nyfmd.entity.Market;
import ub.dmql.nyfmd.entity.MarketData;
import ub.dmql.nyfmd.projection.ICountyCount;
import ub.dmql.nyfmd.service.MarketService;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    MarketService marketService;

    @RequestMapping(method = RequestMethod.POST, value = "/market-data")
    public void saveMarketData(@RequestBody List<MarketData> marketData) {
        marketService.saveMarketData(marketData);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/schema")
    public void makeSchema() {
        marketService.makeSchema();
    }
    // get all info regarding a market
    @RequestMapping("/markets")
    public List<Market> getAllMarkets() {
        return marketService.getAllMarkets();
    }

    // get grouped by county info
    @RequestMapping(method = RequestMethod.GET, value = "/county-info")
    public ResponseEntity<List<Map<String, Object>>> getCountyCounts() {
        return ResponseEntity.ok(marketService.getCountyCounts());
    }


}
