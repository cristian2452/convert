
public class convert {

		double fahrenheit;
		double celsius;
		double kelvin;
		
		public double convertion(double A)
		{
		double result = 0 ; 
			return result;
		}
}

class FtoC extends convert {
	
	public double convertion(double A) {
	
		double result = (A-32)*1.8;
		return result;
		
	}
}

class CtoF extends convert {
	
	public double convertion(double A) {
	
		double result = (A*1.8) + 32;
		return result;
		
	}
}
class CtoK extends convert {
	
	public double convertion(double A) {
	
		double result = A + 273.15;
		return result;
		
	}
}
class KtoC extends convert {
	
	public double convertion(double A) {
	
		double result = A - 273.15;
		return result;
		
	}
	class FtoK extends convert {
		
		public double convertion(double A) {
		
			double result = ((A-32)*1.8)+273.15;
			return result;
			
		}
	}
class KtoF extends convert {
		
		public double convertion(double A) {
		
			double result = ((A*1.8)-459.67);
			return result;
			
		}
	}
}
