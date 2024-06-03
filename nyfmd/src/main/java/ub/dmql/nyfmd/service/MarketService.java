package ub.dmql.nyfmd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ub.dmql.nyfmd.entity.*;
import ub.dmql.nyfmd.projection.ICountyCount;
import ub.dmql.nyfmd.repository.*;
import ub.dmql.nyfmd.utility.ExtractData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MarketService {

    @Autowired
    private MarketDataRepository marketDataRepository;
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private MarketRepository marketRepository;
    @Autowired
    private OperationRepository operationRepository;
    @Autowired
    private WelfareProgramRepository welfareProgramRepository;
    @Autowired
    private ExtractData extractData;

    public MarketService() {
    }

    // saves incoming json data to DB
    public void saveMarketData(List<MarketData> marketDataList){
        // save market data to DB
        marketDataRepository.saveAll(marketDataList);
    }

    public void makeSchema(){

        // fetch all the market data from DB
        Iterable<MarketData> marketDataList = marketDataRepository.findAll();

        // traverse json data and save to corresponding tables
        List<Contact> contacts = new ArrayList<>();
        List<Location> locations = new ArrayList<>();
        List<Market> markets = new ArrayList<>();
        List<Operation> operations = new ArrayList<>();
        List<WelfareProgram> welfarePrograms = new ArrayList<>();

        for(MarketData marketData : marketDataList) {
            contacts.add(extractData.extractContactData(marketData));
            locations.add(extractData.extractLocationData(marketData));
            markets.add(extractData.extractMarketData(marketData));
            operations.add(extractData.extractOperationData(marketData));
            welfarePrograms.add(extractData.extractWelfareData(marketData));
        }
        saveContact(contacts);
        saveLocation(locations);
        saveMarket(markets);
        saveOperation(operations);
        saveWelfareProgram(welfarePrograms);
    }


    public void saveContact(List<Contact> contacts){
        contactRepository.saveAll(contacts);
    }
    public void saveLocation(List<Location> locations){
        locationRepository.saveAll(locations);
    }
    public void saveMarket(List<Market> markets){
        marketRepository.saveAll(markets);
    }
    public void saveOperation(List<Operation> operations){
        operationRepository.saveAll(operations);
    }
    public void saveWelfareProgram(List<WelfareProgram> welfarePrograms){
        welfareProgramRepository.saveAll(welfarePrograms);
    }

    public List<Map<String, Object>> getCountyCounts() {
        return locationRepository.countTotalCounty();
    }

    public List<Market> getAllMarkets() {
        List<Market> markets = new ArrayList<>();
        marketRepository.findAll().forEach(markets::add);
        return markets;
    }
}
