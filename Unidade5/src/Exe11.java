public class Exe11 {
    public static void main(String[] args) {
        System.out.println("1ª hora: 1 biscoito quebrado");

        int biscoitos = 0;

        for(int i = 1; i < 16; i++){
            System.out.println((i + 1) + "ª hora: " + (i * 3) + " biscoitos quebrados");
            
            int cooks = 0 + ((i * 3));
            biscoitos += cooks;
        }
        System.out.println((biscoitos + 1) + " biscoitos foram quebrados");
    }
}
