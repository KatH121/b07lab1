public class Polynomial {

	double [] coeff;	
	
	
	public Polynomial() {
		this.coeff = new double[]{0};
	}
	
	
	public Polynomial(double[] array) {
		this.coeff = array;
	}
	
	
	public Polynomial add(Polynomial arr) {
		int size1 = this.coeff.length;
		int size2 = arr.coeff.length;		
		if (size1 >= size2) {
			for (int i = 0 ; i < size2 ; i ++) {
				coeff[i] += arr.coeff[i];
			}
			arr.coeff = coeff;		
		}
		
		else {
			for (int i = 0 ; i < size1 ; i ++) {
				arr.coeff[i] += coeff[i];
			}
		}
		
		return arr;
	}
	
	
	public double evaluate(double x) {
		double result = 0;
		int size = this.coeff.length;
		for (int i = 0 ; i < size ; i++) {
			result += coeff[i] * Math.pow(x, i);
		}
		
		return result;
	}
	
	
	public boolean hasRoot(double v) {
		return (evaluate(v) == 0);
	}
}