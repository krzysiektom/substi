package com.example.substi;

public enum PositionType {
    LAWYER("adwokat"),
    LEGAL_COUNCEL("radca prawny"),
    ADVOCATE_TRAINEE("aplikant adwokacki"),
    LEGAL_COUNSEL_TRAINEE("aplikant radcowski"),
    OTHER("inne");

    private String positionType;

    PositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionType() {
        return positionType;
    }
}
