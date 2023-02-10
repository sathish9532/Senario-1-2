class Samsung extends FactoryDemo{
static int price = 5000;
public static void main(String[] args){
Samsung sam = new Samsung();
sam.sendMessage();
sam.receiveCall();
sam.browse();
sam.call(30);
sam.verifyFingerPrint();
sam.providePattern();
System.out.println(sam.price);
}
public void sendMessage(){
System.out.println("Message Sending");
}
public void receiveCall(){
System.out.println("waiting for User to Pick");
}
public void verifyFingerPrint(){
System.out.println("Error");
}
public void providePattern(){
System.out.println("Incorrect Pattern");
}
public int call(int sec){
System.out.println("Second Calculated");
return sec;
}
}
