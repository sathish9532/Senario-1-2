class  ActorSivakumar implements Actor{
static String address= "Coimbatore";
String Car_detail;
int Car_number;

public ActorSivakumar(String Car_detail, int Car_number){
this.Car_detail = Car_detail;
this.Car_number = Car_number;
}
public static void main(String[] args)
{
ActorSivakumar AS = new ActorSivakumar("Audi Car", 65);
AS.speaking();
AS.actor();
Actor ac = new ActorSivakumar();
System.out.println(ac.address);
}
ActorSivakumar(){
}
public void actor()
{
System.out.println("Last generation actor is Sivakumar");
}
public void speaking(){
return;
}
}
