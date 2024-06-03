package ub.dmql.nyfmd.entity;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class WelfareProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long welfareProgramId;
    private Boolean snap;
    private Boolean fccIssue;
    private Boolean fccAccept;
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market marketData;

    public WelfareProgram() {
    }

    public WelfareProgram(Long welfareProgramId, Boolean snap, Boolean fccIssue, Boolean fccAccept, Market marketData) {
        this.welfareProgramId = welfareProgramId;
        this.snap = snap;
        this.fccIssue = fccIssue;
        this.fccAccept = fccAccept;
        this.marketData = marketData;
    }

    public Long getWelfareProgramId() {
        return welfareProgramId;
    }

    public void setWelfareProgramId(Long welfareProgramId) {
        this.welfareProgramId = welfareProgramId;
    }

    public Boolean getSnap() {
        return snap;
    }

    public void setSnap(Boolean snap) {
        this.snap = snap;
    }

    public Boolean getFccIssue() {
        return fccIssue;
    }

    public void setFccIssue(Boolean fccIssue) {
        this.fccIssue = fccIssue;
    }

    public Boolean getFccAccept() {
        return fccAccept;
    }

    public void setFccAccept(Boolean fccAccept) {
        this.fccAccept = fccAccept;
    }

    public Market getMarketData() {
        return marketData;
    }

    public void setMarketData(Market marketData) {
        this.marketData = marketData;
    }
}
