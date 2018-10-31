package DataLayer;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import DataObjects.Audio;
import DataObjects.Project;

@Dao
public interface ProjectsDataAccessManager extends IDataAccessManager<Project> {

        @Insert
        public void insertItem(Audio items);

        @Query("SELECT * FROM Project")
        List<Project> GetAllItems();
}
