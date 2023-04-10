public class PatternMaker {
    public static void main(String[] args) {
       PatternMaker stripes = new PatternMaker();


    }

    public PatternMaker(){
        System.out.println("Hi Pattern Maker");
        //pattern1();
        //pattern2();
        //pattern3();
        pattern5();

    }

    public void pattern1(){
        for(int x = 0; x<6; x++){
            for(int y = 0; y<1; y++){
                System.out.println(x*5);


            }
        }
    }
    public void pattern2(){
        for(int x = 2; x<28; x=x+5){
            //for(int y = 0; y<1; y++){
                System.out.println(x);


            //}
        }
    }
    public void pattern3(){
        for(int n = 21; n>0; n=n-4){
            //for(int y = 0; y<1; y++){
            System.out.print(n+"\t");


            //}
        }
    }
    public void pattern5(){
        for(int r = 0; r<4; r++){

            for(int z = 1; z<5; z++){

                System.out.print(z+"\t");



            }
            System.out.println();
        }
    }
}
