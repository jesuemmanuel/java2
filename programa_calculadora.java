public class Main {
  public static void main(String[] args) {

    int a, b;
     string  op;
    a=Integer.parseInt(System.console().readLine("dame el primer numero: "));
    b=Integer.parseInt(System.console().readLine("dame el segundo numero: "));
    op=Integer.parseInt(System.console().readLine("dame tu opcion: "));
    Calculadora2 chalan=new Calculadora2(a, b);
    switch (op){
      case "+": 
        System.out.println(chalan.suma());
        break;
        
      
      case "-": 
        System.out.println(chalan.resta());
        break;
        
      
        case"*":
        System.out.println(chalan.multi());
        break;
          
        
      case "/":
        System.out.println(chalan.div());
        break;
        
      
        
    }
    
   }
  }
class Calculadora2{
int num1, num2;
  public Calculadora2( int A, int B){
    this.num1=A;
    this.num2=B;
  }
public int resta() {
int A=this.num1-this.num2;
  return A;
}
public int multi() {
  int A=this.num1*this.num2;
  return A;
}
public float div () {
  float A=this.num1/this.num2;
  return A;
}
public int suma () {
  int A=this.num1+this.num2;
  return A;
 }
}