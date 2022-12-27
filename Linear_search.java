
package linear_search;
import java.util.Scanner;

public class Linear_search {

    
    public static void main(String[] args) {
  
        //memasukan scanner
        Scanner keyboard = new Scanner(System.in);
        
        //deklarasi array String
        String[] rakSatu = {"Advan","Vivo","Oppo","Xiaomi","Iphone"};
        String[] rakDua = {"Asus","Acer","Sony","Nokia"};
        String[] rakTiga = {"Poco","Infinix","iQoo","Mito"};
            
        //deklarasi String
        String namaRak = "";
        String cari = "";
        String tanya = "";
        
        do {
            
            //input jenis Rak
            System.out.println("Rak mana yang ingin Anda lihat? ");
            System.out.println("List Rak : rakSatu, rakDua, rakTiga");
            System.out.print("Inputkan Nama Rak = ");
            namaRak = keyboard.next();

            //display isi rak sesuai rak yang dipilih
            switch (namaRak) {
                case "rakSatu" :
                    for (int i = 0; i < rakSatu.length ; i++){
                        System.out.println(i + ". " + rakSatu[i]);
                    }
                    break;
                case "rakDua" :
                    for (int i = 0; i < rakDua.length ; i++){
                        System.out.println(i + ". " + rakDua[i]);
                    }
                    break;
                case "rakTiga" :
                    for (int i = 0; i < rakTiga.length ; i++){
                        System.out.println(i + ". " + rakTiga[i]);
                    }
                    break;
            }
            
            //input cari handphone
            System.out.print("Brand handphone apa yang anda cari : ");
            cari = keyboard.next();

            //searching
            boolean temu = false;
            String hasil = "" ;
            int urut = 0;
            switch (namaRak) {
                case "rakSatu" :
                    for (int i = 0; i < rakSatu.length; i++) {
                        if(rakSatu[i].equalsIgnoreCase(cari)) {
                            urut = i;
                            temu = true;                     
                        }
                    }
                break;
                case "rakDua" :
                    for (int i = 0; i < rakDua.length; i++) {
                        if(rakDua[i].equalsIgnoreCase(cari)) {
                            urut = i;
                            temu = true;
                    }
                }
                break;
                case "rakTiga" :
                    for (int i = 0; i < rakTiga.length; i++) {
                        if(rakTiga[i].equalsIgnoreCase(cari)) {
                                urut = i;
                                temu = true;                     
                            }
                        }
                break;
                }

                //display hasil
                if (temu) {
                    System.out.println("Brand handphone " + cari + "ditemukan pada "
                            + namaRak + " dan ditemukan pada urutan ke-" + urut);
                } else {
                    System.out.println("Mohon maaf, tidak ketemu!");
                }

                System.out.println("Apakah anda ingin mengulangi? [Ya/Tidak]");
                tanya = keyboard.next();
                
        } while(tanya.equalsIgnoreCase("Ya"));
        
        System.out.println("Terima Kasih!");
   
    }
    
}    
