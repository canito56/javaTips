package com.jb.expresiones.lambda;

// Un bloque lambda que encuentra el divisor positivo
// más pequeño de un valor int.
public class DLambda {

	public static void main(String[] args) {
        
		// Este bloque lambda devuelve el divisor positivo más pequeño de un valor
        DFuncNum divPeq = n -> {
            int res = 1;

            // Obtenga el valor absoluto de n.
            n = n < 0 ? -n : n;

            for (int i = 2; i <= n/i; i++)
                if ((n % i) == 0) {
                    res = i;
                    break;
                }
            return res;
        };
        
         System.out.println("El divisor más pequeño de 12 es: " + divPeq.func(12));
         System.out.println("El divisor más pequeño de 15 es: " + divPeq.func(-15));

	}

}
