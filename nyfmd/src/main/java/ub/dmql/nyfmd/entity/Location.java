package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;

    private String county;
    private String locality;
    private String address;
    private String city;
    private String zip;
    private String state;
    private Double latitude;
    private Double longitude;

    @OneToOne
    @JoinColumn(name = "market_id")
    private Market marketData;

    public Location() {
    }

    public Location(Long locationId, String county, String locality, String address, String city, String zip, String state, Double latitude, Double longitude, Market marketData) {
        this.locationId = locationId;
        this.county = county;
        this.locality = locality;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
        this.marketData = marketData;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public Market getMarketData() {
        return marketData;
    }

    public void setMarketData(Market marketData) {
        this.marketData = marketData;
    }
}
