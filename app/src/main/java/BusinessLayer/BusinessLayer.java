package BusinessLayer;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;

import java.util.List;
import DataObjects.*;
import DataLayer.*;
import java.util.*;

public class BusinessLayer {

    Context context;

    public BusinessLayer(Context theContext){

        context=theContext;

    }

    public List<BLFile> GetSelectedFilesFromClipData(ClipData clipData){

        ArrayList<BLFile> blFiles=new ArrayList<BLFile>();
        ContentResolver contentResoler=context.getContentResolver();
        ArrayList<DLFile> dlFiles=new FileManager().GetFilesFromData(clipData,contentResoler);

        dlFiles=dlFile.s
        int fileCount=dlFiles.size();
        for(int i=0;i<fileCount-1;i++){
            String fullFilePath=dlFiles.get(i).getFullPath();
            long fileDurationInSeconds=((dlFiles.get(i+1).getCreationDate().getTime()/1000)-(dlFiles.get(i).getCreationDate().getTime()/1000));
            blFiles.add(new BLFile(fullFilePath,fileDurationInSeconds));
        }

        return blFiles;
    }
}
