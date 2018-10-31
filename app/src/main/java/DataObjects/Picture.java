package DataObjects;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;

@Entity(foreignKeys = @ForeignKey(entity = Project.class,
        parentColumns = "ID",
        childColumns = "FKProjectID"))
public class Picture {

    @PrimaryKey(autoGenerate  = true)
    public int ID;

    @ColumnInfo(name = "Name")
    public String Name;

    @ColumnInfo(name = "CreationDate")
    public Long CreationDateNumber;

    @ColumnInfo(name = "FKProjectID")
    public String FKProjectID;

    public String getName(){
        return Name;
    }

    public void setName(String theName){
        Name=theName;
    }

    public String getFKProjectID() {
        return FKProjectID;
    }

    public void setFKProjectID(String FKProjectID) {
        this.FKProjectID = FKProjectID;
    }
}
