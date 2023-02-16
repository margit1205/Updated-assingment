package com.example.votingregistraion;

public class Voter {
    String voterName;
    int voterId;
    int voterAge;

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public void setVoterAge(int voterAge) {
        this.voterAge = voterAge;
    }

    public int getVoterId() {
        return voterId;
    }

    public int getVoterAge() {
        return voterAge;
    }

    public String getVoterName() {
        return voterName;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterName='" + voterName + '\'' +
                ", voterId=" + voterId +
                ", voterAge=" + voterAge +
                '}';
    }
}
