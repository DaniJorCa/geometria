/**
 * @author Daniel Jordan Carreño
 * @version 1.2
 */
public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;

	/**
	 *
	 * @param tipoFigura String descripcion figura
	 * @param lG double del lado del lado grande
	 * @param lP double del lado pequeño
	 */
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 *
	 * @return Devuelve un primitivo double indicandonos el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 *
	 * @return Devuelve un primitivo double indicandonos el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
