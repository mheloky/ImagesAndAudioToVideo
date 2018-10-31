package DataObjects;

import java.util.*;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;


@Entity
public class Project {

    @PrimaryKey(autoGenerate  = true)
    public int ID;

    @ColumnInfo(name = "Name")
    public String Name;


    @ColumnInfo(name = "CreationDateNumber")
    Long CreationDateNumber;

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        Name = name;
    }

    public Long getCreationDateNumber() {
        return CreationDateNumber;
    }

    public void setCreationDateNumber(Long creationDateNumber) {
        CreationDateNumber = creationDateNumber;
    }

    public int getProjectID(){
        return ID;
    }
    //@ColumnInfo(name = "CreationDate")
   // Calendar  CreationDate;


}
