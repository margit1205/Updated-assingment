package com.example.votingregistraion;

public class Nomineee {

     String nomineeName;
     int nomineeId;
     int nomineeAge;



    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public void setNomineeId(int nomineeId) {
        this.nomineeId = nomineeId;
    }

    public void setNomineeAge(int nomineeAge) {
        this.nomineeAge = nomineeAge;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public int getNomineeId() {
        return nomineeId;
    }

    public int getNomineeAge() {
        return nomineeAge;
    }

    @Override
    public String toString() {
        return "Nomineee{" +
                "nomineeName='" + nomineeName + '\'' +
                ", nomineeId=" + nomineeId +
                ", nomineeAge=" + nomineeAge +
                '}';
    }
}