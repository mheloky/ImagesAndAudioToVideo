package DataLayer;
import android.arch.persistence.room.*;
import android.content.Context;
import java.util.List;

import BusinessLayer.BLFile;
import DataObjects.*;

public class DataLayer implements Comparable<BLFile> {

    static AAppDatabase appDatabase;

    public DataLayer(Context context){

        InitializeAppDataBase(context);
    }

    public AAppDatabase InitializeAppDataBase(Context context){
        if(appDatabase==null){
            RoomDatabase.Builder<AAppDatabase> builder= Room.databaseBuilder(context,
                    AAppDatabase.class, "database-name");

            builder.allowMainThreadQueries();

            appDatabase=builder.build();
        }

        return appDatabase;
    }

    public void InsertPictureIntoAppDatabase(Picture thePicture){

        appDatabase.picturesDBDLManager().insertItems(thePicture);

    }

    public void InsertProjectIntoAppDatabase(Project theProject){

        appDatabase.projectDBDLManager().insertItem(theProject);

    }


    public List<Picture> GetPictureInAppDatabase(){

        return appDatabase.picturesDBDLManager().GetAllItems();

    }

    public List<Picture> GetPictureInAppDatabase(int projectID){

        return appDatabase.picturesDBDLManager().GetAllItems(projectID);

    }

    public List<Audio> GetAudioInAppDatabase(){

        return appDatabase.audioDBDLManager().GetAllItems();

    }

    public List<Audio> GetAudioInAppDatabase(int projectID){

        return appDatabase.audioDBDLManager().GetAllItems(projectID);

    }

    public List<Project> GetProjectsInAppDatabase(){

        return appDatabase.projectDBDLManager().GetAllItems();

    }
}
