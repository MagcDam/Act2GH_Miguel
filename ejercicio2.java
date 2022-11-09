public class ejercicio2 {

  public static void main(String[] args) {
    final int NUMEROMAXIMO = 10;
    final int CANTIDADNUMEROS = 20;
    int[] numerosAleatorios = new int [20];


      for (int i = 0; i < CANTIDADNUMEROS; i++) {
        numerosAleatorios[i] = (int) (Math.random()*(NUMEROMAXIMO + 1));

        System.out.println(numerosAleatorios[i]);
      }



  }

}
