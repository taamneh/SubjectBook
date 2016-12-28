package Models;

/**
 * Created by staamneh on 8/29/2016.
 */
public class EntryForExcel {
    private double time;
    private String sessionName;
    private String stimulus;
    private String failure;
    private double persperation;


    public EntryForExcel(double time, String name, String stm, String fail, double pers){
        this.time = time;
        sessionName = name;
        stimulus = stm;
        failure = fail;
        persperation = pers;

    }
    double getTime(){
        return time;
    }
    String getName()
    {
        return sessionName;
    }
    String getStimulus(){
        return stimulus;
    }
    String getFailure(){
        return failure;
    }

    double getPersperation(){
        return persperation;
    }
}
