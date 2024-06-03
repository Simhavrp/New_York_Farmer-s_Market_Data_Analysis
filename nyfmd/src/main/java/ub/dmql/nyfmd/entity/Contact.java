package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String name;
    private String phone;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market marketData;

    public Contact() {
    }

    public Contact(Long contactId, String name, String phone, Market marketData) {
        this.contactId = contactId;
        this.name = name;
        this.phone = phone;
        this.marketData = marketData;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Market getMarketData() {
        return marketData;
    }

    public void setMarketData(Market marketData) {
        this.marketData = marketData;
    }
}
