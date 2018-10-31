package DataLayer;

import android.content.ClipData;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.OpenableColumns;

import java.io.File;
import java.util.ArrayList;

public class FileManager {

    public ArrayList<DLFile> GetFilesFromData(ClipData clipData, ContentResolver contentResolver){

        ArrayList<DLFile> theFIles=new ArrayList<DLFile>();
        int clipDataCount=clipData.getItemCount();
        for(int i=0;i<clipDataCount;i++) {

            Uri fileURI=clipData.getItemAt(i).getUri();
            Cursor returnCursor =
                    contentResolver.query(fileURI, null, null, null, null);
            returnCursor.moveToNext();
            int nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
            String fileName=returnCursor.getString(nameIndex);
            Uri selectedImage = fileURI;
            File theFile =new File(selectedImage.toString());
            //fileNames.add(returnCursor.getString(nameIndex));
            theFIles.add(new DLFile(fileName,theFile.getAbsolutePath()));

            returnCursor.close();
        }

        return theFIles;
    }
}
