import java.util.ArrayList;
import java.util.List;

class Job{
  String name;
  int startTime;
  int endTime;

  public Job(String name, int startTime, int endTime){
    this.name = name;
    this.startTime =  startTime;
    this.endTime =  endTime;
  }
}

public class Q1{
  public static void main (String[] args){
    List<Job> jobs = new ArrayList<>();
    jobs.add(new Job("AC Reparing", 11, 12));
    jobs.add(new Job("Plumbing", 9, 10.40));

    calculateAvailableTime(jobs);
    
  }

  public static void calculateAvailableTime (List<Job> jobs){
    int currentEnd = 0;

    for (Job job : jobs){
      if (job.startTime > currentEnd){
        System.out.println("Avalaible time-slot between " + currentEnd
                           + " and " +job.startTime);
      }
      currentEnd = job.endTime;
    }

    System.out.println("Available time-slot after " +  currentEnd);
  }
  
}
