
public class RunnerLab5A1 {
    public static void main(String[]args){
        Fraction f1 = new Fraction(5,10);
        f1.setNum(5);
        f1.getNum();
        f1.setDe(10);
        f1.getDe();
        
        System.out.println(" The fraction we want to check is " +f1.getNum()+ "/" +f1.getDe());
        
        
        Fraction f2= new Fraction (1,2);
        f2.setNum(1);
        f2.getNum();
        f2.setDe(2);
        f2.getDe();
        System.out.println(" The second fraction is " +f2.getNum()+ "/" +f2.getDe());
        
        if (f1.equals(f2)) {
				f1.displayFraction();
				System.out.print(" is equal to ");
				f2.displayFraction();
			} 
                        else{
				f1.displayFraction();
				System.out.print(" is not equal to ");
				f2.displayFraction();
			}
      
        
    }
    
    
}
