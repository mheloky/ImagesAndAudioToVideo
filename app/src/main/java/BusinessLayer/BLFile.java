package BusinessLayer;

public class BLFile {

    String FileName;
    long DurationSeconds=GlobalFields.DurationLastImage;

    public BLFile(String fileName, long durationSeconds) {
        FileName = fileName;
        DurationSeconds = durationSeconds;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public long getDurationSeconds() {
        return DurationSeconds;
    }

    public void setDurationSeconds(long durationSeconds) {
        DurationSeconds = durationSeconds;
    }
}
