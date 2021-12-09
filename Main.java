public class Main {

    int a,b;


    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main(int a) {
        this.a = a;
    }

    public int add() {
           return a + b;
        }
        public int subtract(){
        return a - b;
        }

        public int multi(){
        return a * b;
        }

          public Integer division(){
            if(b==0 || a==0){
                return null;
            }                               
            else{
                return a/b;
            }
        }

        public double exponentiation(){
        return Math.pow(a,b);
        }

        public double cube(){
        return Math.cbrt(a);
        }

    }

