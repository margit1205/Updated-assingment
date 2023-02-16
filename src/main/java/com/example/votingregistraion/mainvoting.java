package com.example.votingregistraion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mainvoting {


    public static void main(String[] args) {

        HashMap<Integer, Nomineee> nominput = new HashMap<>();
        HashMap<Integer, Voter> votinput = new HashMap<>();
        HashMap<Integer,String> result = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to registration portal\n");

        System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
        int n = sc.nextInt();//int for enter 1 to enter nominee detils


        int count = 0;
        while (n != 0) {


            if (n == 1) {
                System.out.println("Enter number of nominees");
                int num = sc.nextInt();
                for (int i = 0; i < num; i++) {
                    System.out.println("Enter nominee name");
                    String nomineeName = sc.next();
                    sc.nextLine();
                    System.out.println("Enter nominee id");
                    int nomineeId = sc.nextInt();
                    System.out.println("Enter nominee Age");
                    int nomineeAge = sc.nextInt();


                    Nomineee nomini = new Nomineee();

                    nomini.setNomineeName(nomineeName);
                    nomini.setNomineeId(nomineeId);
                    nomini.setNomineeAge(nomineeAge);
                    nominput.put(nomineeId, nomini);


                }
               // System.out.println("Enter 2 - Insert voter details");
                 System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();//int for enter 1 to enter nominee detils

            }

            if (n == 2) {

                //All the operation on user
                System.out.println("Enter number of voters");
                int vnum = sc.nextInt();
                for (int i = 0; i < vnum; i++) {
                    Voter voter = new Voter();

                    System.out.println("Enter voter name");
                    String voterName = sc.next();
                    sc.nextLine();
                    System.out.println("Enter voter id");
                    int voterId = sc.nextInt();
                    System.out.println("Enter voter Age");
                    int voterAge = sc.nextInt();

                    voter.setVoterName(voterName);
                    voter.setVoterId(voterId);
                    voter.setVoterAge(voterAge);
                    votinput.put(voterId, voter);


                }

                System.out.println("Enter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();//int for enter 1 to enter nominee detils

            } else if (n == 3) {

                boolean elem = votinput.isEmpty();
                if (elem) {
                    System.out.println("No voter is inserted yet\n\n");
                    System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                    n = sc.nextInt();
                } else {
                    votinput.forEach((k, v) -> System.out.println("Key = "
                            + k + ", Value = " + v));

                    System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                    n = sc.nextInt();


                }
            } else if (n == 4) {

                nominput.forEach((k, v) -> System.out.println("Key = "
                        + k + ", Value = " + v));

                System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                n = sc.nextInt();


            } else if (n == 5) {

                boolean element = nominput.isEmpty();


                if (element) {
                    System.out.println("No nominee is participated");
                    break;

                } else {
/*
                    for (int i = 0; i < votinput.size(); i++) {
                        nominput.forEach((k, v) -> System.out.println("Key = "
                                + k + ", Value = " + v));

                        System.out.println("Enter your age");
                        int m = sc.nextInt();
                        if (m > 18) {
                            System.out.println("Enter id of nominee to vote");
                            int k = sc.nextInt();
                            System.out.println("You Voted  " + nominput.get(k));


                            if (nominput.containsKey(k)) {
                                count = count + 1;
                            } else {
                                System.out.println("Enter valid id");
                            }
                        } else {
                            System.out.println("You are not eligible for vote");
                        }
                    }*/
                  /*  for (int i = 0; i < votinput.size(); i++) {
                        Voter voter = new Voter();

                        System.out.println("Enter voter name");
                        String voterName = sc.next();
                        sc.nextLine();
                        System.out.println("Enter voter id");
                        int voterId = sc.nextInt();
                        System.out.println("Enter voter Age");
                        int voterAge = sc.nextInt();

                        voter.setVoterName(voterName);
                        voter.setVoterId(voterId);
                        voter.setVoterAge(voterAge);
                        votinput.put(voterId, voter);


                    }*/
                    System.out.println(votinput);
                    System.out.println("Enter your id to vote");
                    int k = sc.nextInt();

                    if (votinput.containsKey(k)) {
                        System.out.println("Enter your age ");
                        int age = sc.nextInt();
                        if (age > 18) {
                            System.out.println(nominput);
                            System.out.println("Enter id and name of nominee to vote");
                            int s = sc.nextInt();
                            String r= sc.next();sc.nextLine();


                            if (nominput.get(s) == null) {
                                System.out.println("Enter valid name");
                            } else {
                                for (int i = 0; i < votinput.size(); i++) {

                                    result.put(k, r);
                                    count++;
                                }
                                System.out.println("Your vote recorded");
                            }
                        } else {
                            System.out.println("You are not eligible");
                        }

                        System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                        n = sc.nextInt();


                    }
                }
            }
                if (n == 6) {
                    int k =nominput.size();
                    if (k==0) {
                        System.out.println("No nominee is participated");
                        break;
                    }
                    else {



                                System.out.println("The overall voted  nominee name with voter id are "+result);

                                System.out.println("Enter 1 - Insert Nominee Details\nEnter 2 - Insert voters Details\nEnter 3 - Show Voters Details\nEnter 4 - Show Nominee Details\nEnter 5 - To Vote\nEnter 6 - For Result \nEnter 0 - To Exit ");
                                n = sc.nextInt();


                    }
                }




        }
    }
}















