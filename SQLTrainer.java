class SQLTrainer extends Trainer{
public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer();
int credit = ram.get_salary();
System.out.println(credit);
ram.training();
}
public SQLTrainer()
{
super("java", "institute");
}
}
