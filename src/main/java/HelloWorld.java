public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello!");

        double x = Double.parseDouble(args[0]);
        double result = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2);

        System.out.println("sin^2(" + x + ") + cos^2(" + x + ") = " + result);

        //for each
        for(String arg: args){
            System.out.println(arg);
        }
    }
}
