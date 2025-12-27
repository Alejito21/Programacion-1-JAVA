package co.edu.uniquindio.poo.App;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String imagenURL = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        calcularAspectRadio(imagenURL);

    }


    public static void calcularAspectRadio(String URLimagen) {
        try{
            URL url = new URL(URLimagen);
            BufferedImage imagen = ImageIO.read(url);


            int ancho = imagen.getWidth();
            int alto = imagen.getHeight();

            int mcd = calcularMCD(ancho, alto);
            int radioAlto = alto/mcd;
            int radioAncho = ancho/mcd;

            System.out.printf("Dimensiones :" + ancho + "x" + alto);
            System.out.printf("Aspect Radio: " + radioAncho + ":" + radioAlto);

        }catch (IOException e){
            System.out.printf("No se puede leer la imagen " + e.getMessage());
        }
    }


    public static int calcularMCD(int ancho, int alto) {
        while (alto != 0) {
            int temp = alto;
            alto = ancho % ancho;
            ancho = temp;
        }
        return ancho;
    }
}



