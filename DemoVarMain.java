public class DemoVarMain {
    public static void main(String[] args) {
        //instance of the class
        DemoTypesVar ob=new DemoTypesVar();
        ob.numone=23;
        //protected
        ob.number=34;
        //private
        //ob.num=67;



        //instance var call
        int result=ob.numone=10;
        System.out.println("This is instance variable output"
                +result);
        //local variable
        ob.display();

        //static variable
        System.out.println("This is static variable output"
                +DemoTypesVar.numthree);

    }
}
