package kasir;
import java.util.*;


public class kasir_fixed
{
    Scanner input = new Scanner(System.in);
    Scanner pilihan = new Scanner(System.in);
    Scanner chose= new Scanner(System.in);
    Scanner bayarajah= new Scanner(System.in);

    int harga =0,
    pilih,
    jumlah,
    input_item;
    int harga_item[] = {20000, 35000, 59000, 63000, 180000, 120000, 5000, 2000};
    String menu=null,
    again;
    int total;
    double diskon;
    double bayar;
    int pembayaran;

    void Pesan()
    {
     
        System.out.println("Pilih pesanan anda : ");
        System.out.println("|_______________________________________________|");
        System.out.println("|                       MENU                    |");
        System.out.println("|                   Karen Cafe                  |");
        System.out.println("|_______________________________________________|");
        System.out.println("|          Nama               |     Harga       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("| 1. Javabica                 |   Rp 20000      |");
        System.out.println("| 2. Espresso                 |   Rp 35000      |");
        System.out.println("| 3. Caramel Chocolate Grande |   Rp 59000      |");
        System.out.println("| 4. Mocha Praline cream      |   Rp 63000      |");
        System.out.println("| 5. Mocha Latte without art  |   Rp 120000     |");
        System.out.println("| 6. Mocha Latte with Art     |   Rp 180000     |");
        System.out.println("| 7. Makaroni Rakyat          |   Rp 5000       |");
        System.out.println("| 8. Teh Tawar                |   Rp 2000       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("");
        System.out.println("________________________________________________");
        System.out.print ("Masukkan Nomor Item : ");
       input_item = pilihan.nextInt();
        
        System.out.print("Masukkan banyaknya Item : ");
        jumlah= input.nextInt();
        System.out.println("________________________________________________");
        if(input_item==1)
        {
            menu = " Javabica ";
            harga = harga + harga_item[0] * jumlah;
            total= harga_item[0] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
            
        }
        else if (input_item==2)
        {
            menu = " Espresso ";
            harga = harga + harga_item[1] * jumlah;
            total= harga_item[1] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
       
        }
        else if(input_item==3)
        {
            menu = " Espresso ";
            harga = harga + harga_item[2] * jumlah;
            total= harga_item[2] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
    
        }
        else if(input_item==4)
        {
            menu = " Espresso ";
            harga = harga + harga_item[3] * jumlah;
            total= harga_item[3] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if(input_item==5)
        {
            menu = "  MakaroniRakyat ";
            harga = harga + harga_item[4] * jumlah;
            total= harga_item[4] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if(input_item==6)
        {
            menu = "  MakaroniRakyat ";
            harga = harga + harga_item[5] * jumlah;
            total= harga_item[5] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if(input_item==7)
        {
            menu = "  MakaroniRakyat ";
            harga = harga + harga_item[6] * jumlah;
            total= harga_item[6] * input_item;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if(input_item==8)
        {
            menu = " Teh Tawar ";
        harga = harga + harga_item[7] * jumlah;
        total= harga_item[7] * input_item;
        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
       
    }
    void Lanjut()
    {
        System.out.println("Ingin lanjutkan pesanan : Y/T");
       again=input.nextLine();
       if(again=="Y"||again=="y")
       {
           Pesan();
       }
     
    }
    void cetakBayar()
    {
        if(harga >=500000)
        {
            diskon = harga * 0.5;
        }
        else if(harga >=200000){
            diskon = harga * 0.35;
        }
        else {
            diskon = 0;
        }

        bayar = harga-diskon;

        System.out.println("________________________________________________");
        System.out.println(" Pembayaran sebesar           :  Rp." +harga);
        System.out.println(" Anda mendapat diskon sebesar :  Rp." +diskon);
        System.out.println(" Total yang harus anda bayar  :  Rp." +bayar);
        System.out.println("________________________________________________");
        System.out.print  (" Jumlah uang yang diberikan   :  RP.");

        pembayaran = bayarajah.nextInt();
        double kembalian = pembayaran-bayar;

        System.out.println(" Kembalian Anda Sebesar       :  Rp." +kembalian);
        System.out.println("________________________________________________");
        System.out.println("           Terimakasih atas kunjungannya.       ");
        System.out.println("________________________________________________");
    }
}
class Run
{
    public static void main(String[]args)
     {
            kasir_fixed cek1 = new kasir_fixed();
            cek1.Pesan();
            cek1.Lanjut();
            cek1.cetakBayar();
           
    }
}
