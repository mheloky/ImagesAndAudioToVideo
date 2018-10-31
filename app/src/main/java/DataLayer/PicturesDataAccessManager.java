package DataLayer;
import android.arch.persistence.room.*;

import java.util.List;

import DataObjects.Picture;

@Dao
public interface PicturesDataAccessManager extends IDataAccessManager<Picture> {

        @Insert
        public void insertItems(Picture... items);

        @Query("SELECT * FROM Picture")
        List<Picture> GetAllItems();

        @Query("SELECT * FROM Picture where FKProjectID=:ProjectID")
        List<Picture> GetAllItems(int ProjectID);

}
