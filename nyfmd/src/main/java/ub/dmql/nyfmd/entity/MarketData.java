package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

@Entity
public class MarketData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long marketDataId;
    private String county;
    private String market_name;
    private String market_location;
    private String address_line_1;
    private String city;
    private String state;
    private String zip;
    private String contact;
    private String phone;
    private String market_link;
    private String operation_hours;
    private String operation_season;
    private String operation_months_code;
    private String fmnp;
    private String snap_status;
    private String fc;
    private String fca;
    private Double latitude;
    private Double longitude;

    public MarketData() {
    }

    public MarketData(Long marketDataId, String county, String market_name, String market_location, String address_line_1, String city, String state, String zip, String contact, String phone, String market_link, String operation_hours, String operation_season, String operation_months_code, String fmnp, String snap_status, String fc, String fca, Double latitude, Double longitude) {
        this.marketDataId = marketDataId;
        this.county = county;
        this.market_name = market_name;
        this.market_location = market_location;
        this.address_line_1 = address_line_1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.contact = contact;
        this.phone = phone;
        this.market_link = market_link;
        this.operation_hours = operation_hours;
        this.operation_season = operation_season;
        this.operation_months_code = operation_months_code;
        this.fmnp = fmnp;
        this.snap_status = snap_status;
        this.fc = fc;
        this.fca = fca;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getMarketDataId() {
        return marketDataId;
    }

    public void setMarketDataId(Long marketDataId) {
        this.marketDataId = marketDataId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getMarket_location() {
        return market_location;
    }

    public void setMarket_location(String market_location) {
        this.market_location = market_location;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMarket_link() {
        return market_link;
    }

    public void setMarket_link(String market_link) {
        this.market_link = market_link;
    }

    public String getOperation_hours() {
        return operation_hours;
    }

    public void setOperation_hours(String operation_hours) {
        this.operation_hours = operation_hours;
    }

    public String getOperation_season() {
        return operation_season;
    }

    public void setOperation_season(String operation_season) {
        this.operation_season = operation_season;
    }

    public String getOperation_months_code() {
        return operation_months_code;
    }

    public void setOperation_months_code(String operation_months_code) {
        this.operation_months_code = operation_months_code;
    }

    public String getFmnp() {
        return fmnp;
    }

    public void setFmnp(String fmnp) {
        this.fmnp = fmnp;
    }

    public String getSnap_status() {
        return snap_status;
    }

    public void setSnap_status(String snap_status) {
        this.snap_status = snap_status;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFca() {
        return fca;
    }

    public void setFca(String fca) {
        this.fca = fca;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
