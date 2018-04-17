package SwimCentre_Project;
import java.awt.Color;

public class Tester {

    public static void main(String[] args) {

    Date date1 = new Date (1, 3, 2008);
    Date date2 = new Date (8, 4, 2008);
    
    Session s1 = new Session ("S08_01", "BreastStroke Level 3", 0.00, date1);
    Session s2 = new Session ("S08_02", "ButterFly Level 1", 16.00, date2);
    
    Member m1 = new Member (1, "Mick Wood",'A');
    Member m2 = new Member (2, "Olenka Marczyk",'A');
    Member m3 = new Member (3, "David Pearson",'A');
    Member m4 = new Member (4, "Bodo Scholtz",'A');
    
    Centre centre1 = new Centre("Hatfield");

    s1.signUp(m1);
    s1.signUp(m2);
    s1.signUp(m3);
    s1.signUp(m4);
    s1.showMembersOnSession();
    System.out.println();

    centre1.addSession(s1);
    centre1.addSession(s2);
    System.out.println(centre1.toString());
    System.out.println();
    centre1.searchSessionsByDate(date2);
    }
}

