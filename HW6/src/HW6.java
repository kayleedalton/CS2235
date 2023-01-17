//Kaylee Dalton
//12/4/2022
//CS 2235

import java.util.*;
import java.util.Random;
import java.util.PriorityQueue;
class HW6 {

    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<Job>();
        Random rand = new Random();

      for (int i = 1; i<=10; i++)
        {
            Job newJob = new Job();
            newJob.name = ("Job " + i);
            newJob.length = (rand.nextInt(101) + 1); //Get random length
            newJob.priority = (rand.nextInt(20) + 1); //Get random priority
            jobs.add(newJob);
        }
        int addNewJob = 0;
      int z = 10;
        while(!jobs.isEmpty())
        {
            if (addNewJob%100==0) //Add new job every 100 time slices
            {
                Job newJob = new Job();
                newJob.name = ("Job " + (z+1));
                newJob.length = (rand.nextInt(101) + 1); //Get random length
                newJob.priority = (rand.nextInt(20) + 1); //Get random priority
                jobs.add(newJob);
            }
            Job currentJob = jobs.remove();
            for (int a = 0; a <= currentJob.length; a++)//For loop runs the amount of times equal to the length
            {
                addNewJob += currentJob.length; //Calculate total time slices
            System.out.println("Working on current job... \n" + currentJob.name + " " + a + " slices completed");
            if(a==currentJob.length) //If they're equal we have finished this job
            {
               System.out.println(currentJob.name + " completed!");
            }
            }
        }
        System.out.println("All jobs completed! Total Runtime = " + addNewJob); //Display total runtime

    }
}

//Test Code Leftovers

/*        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);


        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }*/
/*        Job job1 = new Job();
        job1.name = "Clean";
        job1.length = 4;
        job1.priority = 3;
        jobs.add(job1);
        Job job2 = new Job();
        job2.name = "Store";
        job2.length = 1;
        job2.priority = 1;
        jobs.add(job2);
        Job job3 = new Job();
        job3.name = "Buffer";
        job3.length = 2;
        job3.priority = 2;
        jobs.add(job3);
        while(!jobs.isEmpty())
        {
            System.out.println("Finished " + jobs.remove());
        }*/


