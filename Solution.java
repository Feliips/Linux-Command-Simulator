import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String comando = br.readLine();

        if (comando.equals("ls")) {
            System.out.println("lista arquivos e diretorios");
        } else if (comando.equals("cd")) {
            System.out.println("altera o diretorio atual");
        } else if (comando.equals("pwd")) {
            System.out.println("mostra o caminho do diretorio atual");
        } else if (comando.equals("mkdir")) {
            System.out.println("cria um novo diretorio");
        } else {
            System.out.println("comando invalido");
        }
    }
}