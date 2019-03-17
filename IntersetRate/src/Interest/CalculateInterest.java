package Interest;

public class CalculateInterest {
	public double simpleinterest(double pr,double t ,double rate) {
		return ((pr * t * rate)/100);
	}
	public double compoundinterest(double pr,double t,double rate) {
		return ((pr*Math.pow((1 + rate/100), t))-pr);
	}
	

}
