package com.mycompany.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.nio.file.Paths;

/**
 *
 * @author 33769
 */
public class Main {

    public static void main(String[] args) throws Exception {
        
        //  QR Code pour la page d'acceuil
        String QRHome = "10.0.2.2:4200";  //String data = "http://www.localhost:4200";
        String pathQRHome = "C:\\Users\\mathi\\OneDrive\\EPSI\\MSPR\\QRCodePictures\\code_accueil.jpg";
        BitMatrix matrixQRHome = new MultiFormatWriter()
                .encode(QRHome,
                        BarcodeFormat.QR_CODE,
                        400,
                        400
                );
        MatrixToImageWriter.writeToPath(matrixQRHome, "jpg", Paths.get(pathQRHome));
        
        //  QR Code pour la liste des produits
        String QRListProd = "10.0.2.2:4200/produit";//10.60.59.250:4200/produit";
        String pathQRListProd = "C:\\Users\\mathi\\OneDrive\\EPSI\\MSPR\\QRCodePictures\\code_liste_produits.jpg";
        BitMatrix matrixListProd = new MultiFormatWriter()
                .encode(QRListProd,
                        BarcodeFormat.QR_CODE,
                        400,
                        400
                );
        MatrixToImageWriter.writeToPath(matrixListProd, "jpg",Paths.get(pathQRListProd)
        );
        
        
        
        
    }

}
