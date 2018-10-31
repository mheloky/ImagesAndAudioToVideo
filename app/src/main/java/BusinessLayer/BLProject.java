package BusinessLayer;
import java.util.ArrayList;
import java.util.List;
import DataObjects.*;

public class BLProject {

    private int ID;
    private String Name;
    private List<Audio> Audio;
    private List<Picture> Picture;

    public BLProject(){

        Audio=new ArrayList<Audio>();
        Picture =new ArrayList<Picture>();
        Picture =new ArrayList<Picture>();

    }

    public List<Audio> GetAudio(){
        return Audio;
    }

    public List<Picture> GetPictures(){

        return Picture;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
