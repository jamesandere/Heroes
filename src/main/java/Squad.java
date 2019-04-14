import java.util.ArrayList;
import java.util.List;


public class Squad {
 private String squadName;
 private int squadSize;
 private String squadMission;

 public Squad (String name, int size, String mission){
     squadName = name;
     squadSize = size;
     squadMission = mission;
 }

 public String getSquadName(){
     return squadName;
 }

 public int getSquadSize(){
     return squadSize;
 }

    public String getSquadMission() {
        return squadMission;
    }
}
