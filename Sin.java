public class Sin{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		// convert x to an angle between  -2PI nd 2PI
		double term = 1.0;    // ith term  = x^i/i
		double sum = 0.0;     // sum of first i = terms in taylor series
		
		for(int i = 1; term != 0.0; i++){
			term *= (x/1);
			if(i%4 == 1)sum += term;
			if(i%4 == 3)sum -= term;
		}
		System.out.println(sum);
	}
}
		