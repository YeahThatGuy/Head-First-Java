package SwimCentre_Project;

import java.util.*;

public class Session {

    private String SessionCode;
    private String description;
    private double fee;
    public  Date startDate;
    private double totalFees;
    private ArrayList<Member> sessionMembers;
     
    public Session(String SessionCode, String description,
                    double fee, Date date) {

        startDate = date;
        this.SessionCode = SessionCode;
        this.description = description;
        this.fee = fee;
        totalFees = 0;
        sessionMembers = new ArrayList<>();
     }

     public void signUp(Member newMember) {
        sessionMembers.add(newMember);
        totalFees += fee;
     }

    public void showMembersOnSession() {
        for (Member cell : sessionMembers) {
            System.out.println(cell.toString());
        }
    }
     
    public String getSessionCode() {
        return SessionCode;
    }

    public double getFee() {
        return fee;
    }

    public Date getStartDate() {
        return startDate;
    }
       
    public String toString() {
        String separator = ", ";
        return SessionCode + separator + description + separator + 
                            "\nDate: " + startDate.toString() + 
                            "\nFee: " + fee + " Total fees: " + totalFees + "\n";
    }            
}
