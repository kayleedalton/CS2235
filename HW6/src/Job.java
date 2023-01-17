public class Job implements Comparable<Job>
{
    public String name;
    public int priority;
    public int length;


    public int compareTo(Job other)
    {
    if(this.equals(other))
        return 0;
    else if (this.priority > other.priority)
        return 1;
    else return -1;
    }



}