public class Fraction 
{
	private int num;
	private int de;

        public Fraction(){
            num=0;
            de=0;
          
        }
        
	public Fraction(int a, int b){
	
		num = a;
		de = b;
	}

	public void setNum(int a){
	
		num = a;
	}
	public void setDe(int b){
	
		de = b;
	}
        public int getNum(){
	
		return num;
	}
	public int getDe(){
	
		return de;
	}
        
        

	public void displayFraction(){
	
		System.out.print( " The fraction  "+num + "/" + de);
	}

	public boolean equals(Fraction o){
	
		int n1, n2;
		int n3, n4;
		int n5 = 1;
		for (int i = 2; i <= Math.min(num, de); i++){ 
		

			if (num % i == 0 && de % i == 0)
				n5 = i;
		}

		n1 = num / n5;
		n2 = de / n5;

		int oGcf = 1;
		for (int i = 2; i <= Math.min(o.num, o.de); i++){ 
		
			
			if (o.num % i == 0 && o.de % i == 0)
				oGcf = i;
		}

		n3 = o.num / oGcf;
		n4 = o.de / oGcf;

		return (n1 == n3 && n2 == n4);

	}
}
