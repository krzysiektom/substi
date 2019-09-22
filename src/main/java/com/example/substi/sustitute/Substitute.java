package com.example.substi.sustitute;


import com.example.substi.ActivityType;
import com.example.substi.PositionType;
import com.example.substi.State;
import com.example.substi.substituteLocation.SubstituteLocation;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "substitutes")
public class Substitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SubstituteLocation location;
    private LocalDateTime dateTime;
    private ActivityType activityType;
    private PositionType positionType;
    private BigDecimal price;
    private String additionalInfo;
    private State state;

    public Substitute() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubstituteLocation getLocation() {
        return location;
    }

    public void setLocation(SubstituteLocation location) {
        this.location = location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Substitute{" +
                "id=" + id +
                ", location=" + location +
                ", dateTime=" + dateTime +
                ", activityType=" + activityType +
                ", positionType=" + positionType +
                ", price=" + price +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", state=" + state +
                '}';
    }
}
