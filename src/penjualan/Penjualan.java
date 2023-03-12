/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import java.util.Scanner;

/**
 *
 * @author AHMAD NAJMUDIN
 */

//test
public class Penjualan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan Nama Kasir : ");
        String namaKasir;
        namaKasir = inputUser.nextLine();
        
        dataBarang[] dataBrg = new dataBarang[0];
        float jumlahBayar = 0;
        double diskon = 0, PPN = 0, hargaDiskon = 0, biayaKartu = 0, totalBayar;
        int Pilihan, jumlahBarang, x, pembayaran = 0;
        do {
            System.out.println("Silahkan pilih Menu transaksi :");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar Program");
            System.out.println("Masukan pilihan : ");
            Pilihan = inputUser.nextInt();
            switch(Pilihan){
                case 1:
                    System.out.print("Masukan jumlah barang : ");
                    jumlahBarang = inputUser.nextInt();
                    dataBrg = new dataBarang[jumlahBarang];
                    for(x = 0; x < dataBrg.length; x++){
                        dataBrg[x] = new dataBarang();
                        System.out.println("Barang ke : " + (x+1));
                        System.out.print("Masukan kode barang :"); dataBrg[x].setKodeBarang(inputUser.next());
                        System.out.print("Masukan nama barang :"); dataBrg[x].setNamaBarang(inputUser.next());
                        System.out.print("Masukan harga barang :"); dataBrg[x].setHargaBarang(inputUser.nextFloat());
                        System.out.print("Masukan jumlah beli :"); dataBrg[x].setJumlahBeli(inputUser.nextInt());
                    }
                    System.out.println("Metode pembayaran yang tersedia :");
                    System.out.println("1. Visa/Master");
                    System.out.println("2. Debit");
                    System.out.println("3. Cash");
                    System.out.print("Masukan pilihan pembayaran");
                    pembayaran = inputUser.nextInt();
          
                    break;
                case 2:
                    System.out.println("DATA PENJUALAN BARANG");
                    System.out.println("PT. PEMULANG TAMA");
                    System.out.println("Nama Kasir : " + namaKasir);
                    System.out.println("================================================================================");
                    System.out.println("No. \tKode Barang \tNama Barang \tHarga Barang \tJumlah Beli \tBayar");
                    System.out.println("================================================================================");
                    for (x = 0; x < dataBrg.length; x++){
                        System.out.println((x + 1) + "\t" + dataBrg[x].getKodeBarang() + "\t" + "\t" + dataBrg[x].getNamaBarang() + "\t" + "\t" + dataBrg[x].getHargaBarang() + "\t" + "\t" + dataBrg[x].getJumlahBeli() + "\t" + "\t" + dataBrg[x].getbayar());
                        jumlahBayar = (float) (jumlahBayar + dataBrg[x].getbayar());
                        //if (kondisi) kurukurawal artinya maka/pernyataan{ code here/pernyataan }
                        if(jumlahBayar < 500000){
                            diskon = 0;
                        } else {
                            diskon = jumlahBayar * 0.05;
                        }
                        hargaDiskon = jumlahBayar - diskon;
                        PPN = jumlahBayar * 0.1;
                    }
                    System.out.println("================================================================================");
                    System.out.println("Jumlah Bayar \t\t: Rp." + jumlahBayar);
                    System.out.println("Diskon \t\t\t: Rp. " + diskon);
                    System.out.println("PPN \t\t\t: Rp. " + PPN);
                    System.out.println("Cara Bayar (Visa-Master/Debit/Cash) : ");
                    switch (pembayaran){
                        case 1:
                            biayaKartu = 0.03 * jumlahBayar;
                            System.out.println("Visa-Master \tBiaya Kartu : Rp." + biayaKartu);
                            break;
                        case 2:
                            biayaKartu = 0;
                            System.out.println("Debit \tBiaya Kartu : Rp.-");
                            break;
                        case 3:
                            biayaKartu = 0;
                            System.out.println("Cash \tBiaya Kartu : Rp.-");
                            break;
                        default:
                            System.exit(0);   
                    }
                    totalBayar = hargaDiskon + PPN + biayaKartu;
                    System.out.println("Total Bayar \t\t: Rp." + totalBayar);
                    
            }
        }while (Pilihan !=3);
    }
}
