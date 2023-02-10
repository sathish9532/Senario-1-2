class TamilNadu extends SouthIndia{
static String capital = "Chennai";
public static void main(String[] args)
{
TamilNadu TN = new TamilNadu("nuh");
TN.speakLang();
TN.eat();
TN.dress();
TN.cultivate();
TN.livingStyle();
System.out.println(India.capital);
System.out.println(TamilNadu.capital);
SouthIndia SI= new TamilNadu();
}
void cultivate(){
System.out.println("Rice and Sugar cultivation");
}
void livingStyle(){
System.out.println("Above Average development");
}
void speakLang(){
System.out.println("Tamil & English");
}
void eat(){
System.out.println("Rice");
}
void dress(){
System.out.println("Dothi and Saree");
}
TamilNadu(String PM)
{
super("primeMinister");
}
TamilNadu(){
super("\t Modi");
}
}


