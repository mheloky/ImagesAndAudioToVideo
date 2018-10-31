package DataLayer;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
import DataObjects.*;

@Dao
public interface AudioDataAccessManager extends IDataAccessManager<Audio> {

        @Insert
        public void insertItem(Audio items);

        @Query("SELECT * FROM Audio")
        List<Audio> GetAllItems();

        @Query("SELECT * FROM Audio where FKProjectID=:ProjectID")
        List<Audio> GetAllItems(int ProjectID);
}
