package ub.dmql.nyfmd.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.error.Mark;
import ub.dmql.nyfmd.entity.*;
import ub.dmql.nyfmd.repository.MarketRepository;

import java.util.Optional;

@Component
public class ExtractData {

    @Autowired
    private MarketRepository marketRepository;

    public Contact extractContactData(MarketData marketData){
        Contact c = new Contact();
        c.setName(marketData.getContact());
        c.setPhone(marketData.getPhone());
        Optional<Market> optionalObject = marketRepository.findById(marketData.getMarketDataId());
        marketRepository.findById(marketData.getMarketDataId());
        System.out.println("############3 marketData.getMarketDataId() #########33" +  marketData.getMarketDataId());
        System.out.println("############3 optionalObject #########33" +  optionalObject);
        Market m = optionalObject.orElse(null);
        System.out.println("############3 m #########33" +  m);
        c.setMarketData(m);
        return c;
    }

    public Location extractLocationData(MarketData marketData) {
        Location l = new Location();
        l.setCounty(marketData.getCounty());
        l.setLocality(marketData.getMarket_location());
        l.setAddress(marketData.getAddress_line_1());
        l.setCity(marketData.getCity());
        l.setZip(marketData.getZip());
        l.setState(marketData.getState());
        l.setLatitude(marketData.getLatitude());
        l.setLongitude(marketData.getLongitude());
        Optional<Market> optionalObject = marketRepository.findById(marketData.getMarketDataId());
        Market m = optionalObject.orElse(null);
        l.setMarketData(m);
        return l;
    }

    public Operation extractOperationData(MarketData marketData) {
        Operation o = new Operation();
        o.setHours(marketData.getOperation_hours());
        o.setMonths(marketData.getOperation_months_code());
        o.setSeason(marketData.getOperation_season());
        Optional<Market> optionalObject = marketRepository.findById(marketData.getMarketDataId());
        Market m = optionalObject.orElse(null);
        o.setMarketData(m);
        return o;
    }

    public WelfareProgram extractWelfareData(MarketData marketData) {
        WelfareProgram w = new WelfareProgram();
        w.setSnap(marketData.getSnap_status().equalsIgnoreCase("y"));
        w.setFccIssue(marketData.getFc().equalsIgnoreCase("y"));
        w.setFccAccept(marketData.getFca().equalsIgnoreCase("y"));
        Optional<Market> optionalObject = marketRepository.findById(marketData.getMarketDataId());
        Market m = optionalObject.orElse(null);
        w.setMarketData(m);
        return w;
    }

    public Market extractMarketData(MarketData marketData){
        Market m = new Market();
        m.setName(marketData.getMarket_name());
        m.setFnmp(marketData.getFmnp().equalsIgnoreCase("y"));
        m.setMarket_link(marketData.getMarket_link());
        m.setMarketId(marketData.getMarketDataId());
        return m;
    }
}
