package SwimCentre_Project;
import java.util.*;

public class Centre {

    private String name;
    private HashMap<String, Session> sessionList;
    
    public Centre(String name) {
        this.name = name;
        sessionList = new HashMap<>();
    }

    public void addSession(Session newSession) {
        sessionList.put(newSession.getSessionCode(), newSession);
    }

    public void cancelSession(Session currentSession) {
        sessionList.remove(currentSession.getSessionCode());
    }

    public void searchSessionsByDate(Date date) {
        for (Session value : sessionList.values()) {
            if (value.getStartDate().equals(date)) {
                System.out.println("Value: " + value);
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                        + sessionList + ")";
    }
}
