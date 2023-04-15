/*
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Array Java Sederhana
 *Name: Muh. Asrul Mulis
 *Date: 15/April/2023
 *
 *Version(0.1)
 */

import java.util.Scanner;

public class MiniAtm {
    
	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
		int enter = 0;
		double content, balance =1000000, savings =1, take =1;
		int choose, choice, choice2 =2, choice3, result =0, result2 =0;
		double[] add_balance = new double[20];
		double[] whitdraw_balance = new double[20];
		
		for(enter =0; enter <=2; enter++) {
			System.out.println("-------------------------------------------------");
			System.out.println("|>>>>=====# Welcome To ATM Java Array #=====<<<<|");
			System.out.println("-------------------------------------------------");
			System.out.print("Input ATM: ");
			String inputAtm = input.next();
			System.out.print("Input Passwoard: ");
			int integerPasswoard = input.nextInt();
			System.out.println("-------------------------------------------------");
			
			if( (inputAtm.equalsIgnoreCase("BJA"))&& (integerPasswoard==159753) ) {
				
				System.out.println("|----<<<<<=====# Login Successful #=====>>>>>----|");
				System.out.println("-------------------------------------------------");
				System.out.println("|============# Bank ATM Java Array #============|");
				System.out.println("       Language Slection | Pilihan Bahasa        ");
				System.out.println();
				System.out.println(">>>( 1.) INDONESIA\n\n" + ">>>( 2.) ENGLISH\n");
				System.out.println("-------------------------------------------------");
				System.out.print("Input your choice: ");
				int Choose = input.nextInt();
					
					System.out.println();
					
				while(true) {

					switch(Choose) {
						case 1:
							System.out.println("===========================================");
							System.out.println("|>>>>>>>>>>>># ATM Java Array #<<<<<<<<<<<|");
							System.out.println("===========================================");
							System.out.println("<<<1> Cek Saldo" + "     " + "Riwayat Transaksi <4>>>");
							System.out.println();
							System.out.println("<<<2> Tambah Dana" + "             " + "Bantuan <5>>>");
							System.out.println();
							System.out.println("<<<3> Tarik Dana" + "               " + "Keluar <6>>>");
							System.out.println("==========================================");
							System.out.print("Masukan Pilihan: ");
							int Choice = input.nextInt();
							System.out.println();
							switch(Choice) {
								case 1:
								   do {
									  System.out.println("--------------------------------");
									  System.out.println("Total Saldo Anda = Rp." + balance );
									  System.out.println("--------------------------------");
									  System.out.println("<<1> Keluar\n\n" + "<<2> Kembali\n");
									  System.out.println("--------------------------------");
									  System.out.print("Masukan Pilihan: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
										  break;
									    }
								    }
									while(choice2 !=2);
									break;
								case 2:
								   do {
									   System.out.println();
									   System.out.println("---------------------------------------");
									   System.out.print("Masukan Jumlah= " + "Rp.");
									   savings = input.nextDouble();
									   add_balance[result] = savings;
									   result++;
									   balance += savings;
									   System.out.println("Saldo Tersisa = Rp." + balance );
									   System.out.println("---------------------------------------");
									   System.out.println("<<1> Keluar\n\n" + "<<2> Kembali\n");
									   System.out.println("---------------------------------------");
									   System.out.print("Masukan Pilihan: ");
									   int Choice2 = input.nextInt();
									   
									   switch(Choice2) {
										   case 1:
										   System.exit(0);
										   break;
									    }
								    }
									while(choice2 !=2);
									break;
								case 3:
								   do {
									   System.out.println();
									   System.out.println("---------------------------------------");
									   System.out.print("Masukan Jumlah = " + "Rp.");
									   take = input.nextDouble();
									   whitdraw_balance[result2] = take;
									   result2++;
									   content = balance;
									   content -= take;
									   if(content <= 50000) {
										   System.out.println("Saldo Mengembang Setelah penarikan Minimal: Rp. 50.000,00");
									    }
									   else {
											balance -= take;
											System.out.println("Saldo Tersisa = Rp." + balance );
										}
									   System.out.println("---------------------------------------");
									   System.out.println("<<1> Keluar\n\n" + "<<2> Kembali\n");
									   System.out.println("---------------------------------------");
									   System.out.print("Masukan Pilihan: ");
									   int Choice2 = input.nextInt();
										
									   switch(Choice2) {
											case 1:
											System.exit(0);
											break;
										}
								    }
									while(choice2 !=2);
									break;
								case 4:
								   do {
									   System.out.println();
									   System.out.println("============================================");
									   System.out.println("|             Riwayat Transaksi            |");
									   System.out.println("|Riwayat Pemasukan & Pengeluaran Saldo Anda|");
									   System.out.println("============================================");
									   for(int y =0; y <result; y++) {
										   System.out.println("Total Penambahan Dana: Rp." + " " + add_balance[y] );
									    }
									   System.out.println("============================================");
									   for(int z =0; z <result2; z++) {
										   System.out.println("Total Penarikan Dana: Rp." + " " + whitdraw_balance[z] );
									    }
									   System.out.println("============================================");
									   System.out.println("<<1> Keluar\n\n" + "<<2> Kembali\n");
									   System.out.println("-----------------------------------------");
									   System.out.print("Masukan Pilihan: ");
									   int Choice2 = input.nextInt();
										
									   switch(Choice2) {
											case 1:
											System.exit(0);
											break;
										}
								    }
									while(choice2 !=2);
									break;
								case 5:
								   do {
									   System.out.println();
									   System.out.println("==================================================================================");
									   System.out.println("|                             Pusat Bantuan ATM BJA                              |");
									   System.out.println("==================================================================================");
									   System.out.println("(1) Gunakan Menu Ke-1 Jika Anda Ingin Melihat Saldo");
									   System.out.println("(2) Gunakan Menu Ke-2 Jika Anda Ingin Mengisi Saldo");
									   System.out.println("(3) Gunakan Menu Ke-3 Jika Anda Ingin Menarik Saldo");
									   System.out.println("(4) Gunakan Menu Ke-4 Jika Anda Ingin Melihat Riwayat Transaksi Saldo");
									   System.out.println("(5) Gunakan Menu Ke-5 Jika Anda Pertama Kali Menggunakan ATM");
									   System.out.println("(6) Gunakan Menu Ke-6 Jika Anda Telah Selesai Mengunakan Program ATM");
									   System.out.println("(7) Saat Penarikan, Harap Perhatikan Saldo Mengendap Minimal Rp.50.000,00");
									   System.out.println("(8) Jika Kartu Anda Tertelan Mesin ATM, Tetap Tenang Karena Itu Tidak akan tejadi");
									   System.out.println("(9) Jika Anda Gabut Maka Jangan Hubungi No ini +62 83290-XXX-XXX. Yah Di Sensor");
									   System.out.println("===================================================================================");
								       System.out.println("<<1> Keluar\n\n" + "<<2> Kembali\n");
									   System.out.println("-----------------------------------------");
									   System.out.print("Masukan Pilihan: ");
									   int Choice2 = input.nextInt();
										
									   switch(Choice2) {
											case 1:
											System.exit(0);
											break;
										}
								    }
									while(choice2 !=2);
									break;
							   case 6:
							      System.exit(0);
								  break;
							   default: 
							    System.out.println("----------------------------------");
								System.out.println("  Harap Masukan Menu yang Sesuai  ");
								System.out.println("----------------------------------");
								System.exit(0);
								break;
							}
					    System.out.println("    Semangat Belajar Progam     ");
					    System.out.println("--------------------------------");
					    System.out.println("Enthusiasm For Learning Programs");
						break;
					    case 2:
					        System.out.println("===================================================");
						    System.out.println("|   >>>>>>>>>>>># ATM Java Array #<<<<<<<<<<<<    |");
						    System.out.println("===================================================");
					        System.out.println("<<<1> Balance check" + "     " + "Transaction History <4>>>");
						    System.out.println();
						    System.out.println("<<<2> Add Funds" + "                        " + "Help <5>>>");
						    System.out.println();
						    System.out.println("<<<3> Withdraw Funds" + "                   " + "Exit <6>>>");
						    System.out.println("===================================================");
						    System.out.print("Enter your Choice: ");
						    int Choice3 = input.nextInt();
							System.out.println();
						    switch(Choice3) {
								case 1:
								   do {
									  System.out.println("--------------------------------");
									  System.out.println("Your Total Balance = Rp." + balance );
									  System.out.println("--------------------------------");
									  System.out.println("<<1> Exit\n\n" + "<<2> Return\n");
									  System.out.println("--------------------------------");
									  System.out.print("Enter your Choice: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
										  break;
									    }
								    }
								   while(choice2 !=2);
								   break;
								case 2:
								   do {
									  System.out.println();
									  System.out.println("---------------------------------------");
									  System.out.print("Enter the Amount = " + "Rp.");
									  savings = input.nextDouble();
									  add_balance[result] = savings;
									  result++;
									  balance += savings;
									  System.out.println("Remaining Balance = Rp." + balance );
									  System.out.println("---------------------------------------");
									  System.out.println("<<1> Exit\n\n" + "<<2> Return\n");
									  System.out.println("---------------------------------------");
									  System.out.print("Enter your Choice: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
									    }
								    }
								   while(choice2 !=2);
								   break;
								case 3:
								   do {
									  System.out.println();
									  System.out.println("---------------------------------------");
									  System.out.print("Enter the Amount = " + "Rp.");
									  take = input.nextDouble();
									  whitdraw_balance[result2] = take;
									  result2++;
									  content = balance;
									  content -= take;
									  if(content <= 50000) {
									       System.out.println("The balance expands after the minimum withdrawal : Rp.50.000,00");
									    }
									  else {
										   balance -= take;
									       System.out.println("Remaining Balance = Rp. " + balance );
										}
									  System.out.println("---------------------------------------");
									  System.out.println("<<1> Exit\n\n" + "<<2> Return\n");
									  System.out.println("---------------------------------------");
									  System.out.print("Enter your Choice: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
										  break;
									    }
								    }
									while(choice2 !=2);
									break;
								case 4:
								   do {
									  System.out.println();
									  System.out.println("============================================");
									  System.out.println("|            Transaction History           |");
									  System.out.println("| Your balance entry & expenditure history |");
									  System.out.println("============================================");
								      for(int y =0; y <result; y++) {
										   System.out.println("Total additional funds: Rp." + " " + add_balance[y] );
									    }
									  System.out.println("============================================");
									  for(int z =0; z <result2; z++) {
										   System.out.println("Total withdrawal of funds: Rp." + " " + whitdraw_balance[z] );
									    }
									  System.out.println("============================================");
									  System.out.println("<<1> Exit\n\n" + "<<2> Return\n");
									  System.out.println("-----------------------------------------");
									  System.out.print("Enter your Choice: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
										  break;
									    }
								    }
								   while(choice2 !=2);
								   break;
								case 5:
								   do {
									  System.out.println();
									  System.out.println("==================================================================================");
									  System.out.println("|                              Help Center ATM BJA                               |");
									  System.out.println("==================================================================================");
									  System.out.println("(1) Use the 1st Menu if You Want to See the Balance");
									  System.out.println("(2) Use the 2nd Menu if You Want to Top Up the Balance");
									  System.out.println("(3) Use the 3rd Menu if You Want to Withdraw the Balance");
									  System.out.println("(4) Use the 4th Menu if You Want to View the Balance Transaction History");
									  System.out.println("(5) Use the 5th Menu if You are Using the ATM for the First Time");
									  System.out.println("(6) Use the 6th Menu if You Have Finished Using the ATM Program");
									  System.out.println("(7) When Withdrawing, Please Pay Attention to the Minimum Deposit Balance Rp.50.000,00");
									  System.out.println("(8) If Your ATM Card is Swallowed by the ATM Machine, Stay Calm Because that Won't Happen");
									  System.out.println("(9) If You are Confused Then Don't Call this Number +62 83290-XXX-XXX. Well on Sensors");
									  System.out.println("===================================================================================");
								      System.out.println("<<1> Exit\n\n" + "<<2> Return\n");
									  System.out.println("-----------------------------------------");
									  System.out.print("Enter Your Choice: ");
									  int Choice2 = input.nextInt();
									  
									  switch(Choice2) {
										  case 1:
										  System.exit(0);
										  break;
									    }
								    }
								   while(choice2 !=2);
								   break;
								case 6:
								   System.exit(0);
								   break;
							   default: 
							    System.out.println("-----------------------------------");
								System.out.println(" Please Enter the Appropriate Menu ");
								System.out.println("-----------------------------------");
								System.exit(0);
								break;
							}
					   default:
					   System.out.println("    Semangat Belajar Progam     ");
					   System.out.println("--------------------------------");
					   System.out.println("Enthusiasm For Learning Programs");
					}
				}
			}
			else 
				System.out.println("       Wrong ATM or passwoard entered, Please try again and enter correctly          ");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("ATM atau kata sandi yang di masukan salah, Silakan coba lagi dan masukan dengan benar");
	    break;	
		}
	}
}