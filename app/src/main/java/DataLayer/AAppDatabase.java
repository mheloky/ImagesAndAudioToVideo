package DataLayer;
import DataObjects.*;
import android.arch.persistence.room.*;

@Database(entities = {Project.class, Picture.class,Audio.class}, version = 1)
public abstract class AAppDatabase extends RoomDatabase {

    public abstract PicturesDataAccessManager picturesDBDLManager();
    public abstract AudioDataAccessManager audioDBDLManager();
    public abstract ProjectsDataAccessManager projectDBDLManager();

}