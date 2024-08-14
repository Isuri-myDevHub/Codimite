import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Job{
  String name;
  LocalDateTime startTime;
  LocalDateTime endTime;

  public Job(String name,  LocalDateTime startTime,  LocalDateTime endTime){
    this.name = name;
    this.startTime =  startTime;
    this.endTime =  endTime;
  }
}

public class Q1{
  public static void main (String[] args){
    List<Job> jobs = new ArrayList<>();
    jobs.add(new Job("AC Repairing", LocalDateTime.parse("2024-07-01 09:00", formatter), LocalDateTime.parse("2024-08-14 10:40", formatter)));
    jobs.add(new Job("Plumbing", LocalDateTime.parse("2024-07-02 11:00", formatter), LocalDateTime.parse("2024-07-02 12:00", formatter)));


    calculateAvailableTime(jobs);
    
  }

  public static void calculateAvailableTime (List<Job> jobs){
    LocalDateTime currentEnd = LocalDateTime.MIN;

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
