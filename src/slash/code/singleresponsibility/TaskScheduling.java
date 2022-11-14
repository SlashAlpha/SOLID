package slash.code.singleresponsibility;

 class Compute {

    public String compute(){
        return "computing data based on user input";
    }
}
class Save{
    public String save(){
        return "save the data to database";
    }
}
class Notification{
    public String sendNotifications(){
        return "send the notification to the user";
    }
}


class SchedulingApplication{
    Compute compute;
    Save save;
    Notification notification;

    public SchedulingApplication(Compute compute, Save save, Notification notification) {
        this.compute = compute;
        this.save = save;
        this.notification = notification;
    }
    public void schedule(){
        System.out.println(compute.compute());
        System.out.println(save.save());
        System.out.println(notification.sendNotifications());
    }



}
 class TaskExe{

     public static void main(String[] args) {
         SchedulingApplication schedulingApplication=new SchedulingApplication(new Compute(),new Save(),new Notification());
         schedulingApplication.schedule();


     }



}
