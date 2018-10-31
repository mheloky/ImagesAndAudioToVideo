package DataLayer;

import java.util.Date;

public class DLFile {

    String Name;
    String Path;
    Date CreationDate;

    public DLFile(String fileName, String path)
    {
        Name=fileName;
        Path=path;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFullPath(){
        return Path+"\\"+Name;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

}
