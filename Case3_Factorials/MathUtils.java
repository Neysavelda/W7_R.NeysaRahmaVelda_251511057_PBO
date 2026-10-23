public class MathUtils {
    // Menghitung faktorial secara umum tanpa pengecekan nilai negatif atau overflow
   public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: " + n);
        if (n > 16)
            throw new IllegalArgumentException("Argument too large (maximum is 16): " + n);

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}