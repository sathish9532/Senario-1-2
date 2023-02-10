class Trainer{
static String dept= "Java"; String institute= "Payilagam";
int salary=10000;

int get_salary(){
return salary;
}
void training(){
System.out.println("Training Institute");
}
public static void main(String[] args)
{
Trainer trainerKumar = new Trainer("CSE","Payilagam");
int amount=trainerKumar.get_salary();
trainerKumar.training();
System.out.println("Trainer got Salary \t" +amount);
}
public Trainer(String java, String payilagam)
{
dept = java;
institute = payilagam;
}
}
