package BusinessLayer;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import DataLayer.DataLayer;
import DataObjects.Project;

public class BLProjectManager {

    Context theContext;

    BLProjectManager(Context context){
        theContext=context;
    }

    public BLProject CreateBLProject(Project theProject){

        DataLayer dataLayer=new DataLayer(theContext);
        BLProject blProject=new BLProject();
        blProject.setName((theProject.GetName()));
        blProject.setID(theProject.getProjectID());
        blProject.GetPictures().addAll(dataLayer.GetPictureInAppDatabase(theProject.getProjectID()));
        blProject.GetAudio().addAll(dataLayer.GetAudioInAppDatabase(theProject.getProjectID()));

        return blProject;
    }

    public List<BLProject> CreateBLProjects(List<Project> theProjects){

        DataLayer dataLayer=new DataLayer(theContext);
        List<Project> projects=dataLayer.GetProjectsInAppDatabase();
        List<BLProject> blProjects=new ArrayList<BLProject>();

        for(Project theProject : projects) {
            BLProject blProject = CreateBLProject(theProject);
            blProjects.add(blProject);
        }

        return blProjects;
    }

    public boolean DoesProjectNameExists(String name) {
        DataLayer dataLayer=new DataLayer(theContext);
        List<Project> projects=dataLayer.GetProjectsInAppDatabase();
        int projectCount=projects.size();

        for(int i=0;i<projectCount;i++){
            if(projects.get(i).GetName().equals((name))){
                return false;
            }
        }

        return true;
    }

}
