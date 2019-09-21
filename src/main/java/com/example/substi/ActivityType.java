package com.example.substi;

public enum ActivityType {
    PHOTOCOPY("fotokopia akt"),
    MEETING("posiedzenie"),
    HEARING("rozprawa"),
    AGREEMENT("wezwanie do próby ugodowej"),
    INTERROGATION("przesłuchanie"),
    OTHER("inne");

    private String activityType;

    ActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityType() {
        return activityType;
    }
}