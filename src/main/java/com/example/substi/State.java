package com.example.substi;

public enum State {
    ACTIVE("aktualne"),
    DONE("zrealizowane");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}