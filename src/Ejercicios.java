
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int c = x + y;
		return c;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int c = x - y;
		return c;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int c = x * y;
		return c;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int c = x % y;
		return c;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		if ((x % 2)== 0){
			return true;
		}else{
			return false;
		}
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		
			return true;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int c = Math.max(x, y);
			return c;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if (edad >= 18){
			return true;
		}else{
			return false;
		}
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if ((x)% 1 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		int c = Math.max(x, Math.max(y, z));
			return c;
	}
	
	public static void main(String[] args)
	{
		
	}

}
