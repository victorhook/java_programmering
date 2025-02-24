package fractal;

import koch.Koch;
import mountain.Mountain;
import mountain.Point;

public class FractalApplication {
	public static void main(String[] args) {
		Fractal[] fractals = new Fractal[2];
		fractals[1] = new Koch(300);
		fractals[0] = new Mountain(10,
				                   new Point(100, 400),
								   new Point(250, 120),
								   new Point(500, 400));

	    new FractalView(fractals, "Fraktaler", 600, 600);
	}

}
