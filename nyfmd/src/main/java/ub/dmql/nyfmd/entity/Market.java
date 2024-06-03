package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long marketId;
    private String name;
    private Boolean fnmp;
    private String market_link;
//    @OneToOne
//    @JoinColumn(name = "market_data_id")
//    private MarketData marketData;

//    public MarketData getMarketData() {
//        return marketData;
//    }
//
//    public void setMarketData(MarketData marketData) {
//        this.marketData = marketData;
//    }

    public Market() {
    }

    public Market(Long marketId, String name, Boolean fnmp, String market_link) {
        this.marketId = marketId;
        this.name = name;
        this.fnmp = fnmp;
        this.market_link = market_link;
//        this.marketData = marketData;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFnmp() {
        return fnmp;
    }

    public void setFnmp(Boolean fnmp) {
        this.fnmp = fnmp;
    }

    public String getMarket_link() {
        return market_link;
    }

    public void setMarket_link(String market_link) {
        this.market_link = market_link;
    }
}
