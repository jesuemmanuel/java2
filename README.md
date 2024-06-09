//codigo para hacer operaciones basicas

public class Main {
  public static void main(String[] args) {
    int a,b;
    String op;
    a=Integer.parseInt(System.console().readLine("Ingresa el primer número: "));
b=Integer.parseInt(System.console().readLine("Ingresa el segundo número: "));
op=System.console().readLine("¿Que operación vas a realizar?:\nIngresa el simbolo de la operación (+,-,/,*): ");
    Calculadora2 Chalan=new Calculadora2(a,b);
   switch(op) {
     case "+":{   System.out.println(Chalan.Suma());
       break; 
     }
     case "-":{  
       
       System.out.println(Chalan.Resta());
       break;
     } 
     case "*":{  System.out.println(Chalan.Multi());
       break;
     }
     case "/":{
      System.out.println(Chalan.Division());
       break; 
     }
   }
    
  }
}


class Calculadora{//metodo que suma las variables 
  char operadores;
  int n1;
  int n2;

public int Suma (int A , int B){
  int c = A+B;
  return c;
}

public int Suma2 (int A, int B){
int Numero1 = A;
int Numero2 = B;
int c = Numero1 + Numero2;
  return c;

}
}
 class Calculadora2{
  int num1, num2;
  public Calculadora2(int A, int B){
    this.num1=A;//this significa que el atributo num1 vale A
    this.num2=B;
  }
   public int Suma(){
     int A=this.num1+this.num2;
     return A;
   }
  public int Resta(){
    int A=this.num1-this.num2;
    return A;
  }
  public int Multi(){
    int A=this.num1*this.num2;
    return A;
  }
  public int Division(){
    int A=this.num1/this.num2;
    return A;
  }
}
