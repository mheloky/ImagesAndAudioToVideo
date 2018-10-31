package DataLayer;
import android.arch.persistence.room.*;

import java.util.List;

public interface IDataAccessManager<T> {

        @Insert
        public void insertItem(T items);

        List<T> GetAllItems();
}
