package DataObjects;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Project.class,
        parentColumns = "ID",
        childColumns = "FKProjectID"))
public class Audio {

    @PrimaryKey(autoGenerate  = true)
    public int ID;

    @ColumnInfo(name = "Name")
    public String Name;

    @ColumnInfo(name = "CreationDate")
    public Long CreationDateNumber;

    @ColumnInfo(name = "FKProjectID")
    public String FKProjectID;

}
