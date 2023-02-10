abstract class FactoryDemo extends SmartPhone{
static int price=0;
boolean OriginalPiece = false;
abstract void verifyFingerPrint();
abstract void providePattern();
void browse(){
System.out.println("Factory Demo browsing");
}
}
