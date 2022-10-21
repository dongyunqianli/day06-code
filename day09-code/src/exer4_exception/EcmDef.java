package exer4_exception;

public class EcmDef {
    public static void main(String[] args){
        try {
            int i=Integer.parseInt(args[0]);
            int j=Integer.parseInt(args[1]);
            System.out.println(ecm(i, j));
        }catch(NumberFormatException e){
            System.out.println("inconsistent data types");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("missing command line arguments");
        }catch(ArithmeticException e){
            System.out.println("divide by zero");
        }catch (EcDef e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i, int j) throws EcDef{
        if(i<0||j<0){
            throw new EcDef("分子或分母为负数了");
        }
        return i/j;
    }
}
