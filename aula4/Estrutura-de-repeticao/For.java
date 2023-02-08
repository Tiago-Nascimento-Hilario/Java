public class For {
    public static void main(String[] args) {
        //Repetição controlada por contador
        for(int contador = 0; contador <= 50; contador++){
            if(contador % 2 == 0 ){
                System.out.println(contador + " é par");
            }else{
                System.out.println(contador + " é impar");
            }
        }
    }
}
