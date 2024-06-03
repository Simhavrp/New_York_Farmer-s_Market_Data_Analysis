package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long operationId;
    private String hours;
    private String months;
    private String season;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market marketData;

    public Operation() {
    }

    public Operation(Long operationId, String hours, String months, String season, Market marketData) {
        this.operationId = operationId;
        this.hours = hours;
        this.months = months;
        this.season = season;
        this.marketData = marketData;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Market getMarketData() {
        return marketData;
    }

    public void setMarketData(Market marketData) {
        this.marketData = marketData;
    }
}
