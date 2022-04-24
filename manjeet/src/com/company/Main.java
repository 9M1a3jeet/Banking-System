package com.company;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc=new Scanner(System.in);
        File f1=new File("c:/Users/SAIF/ideaProjects/sonu.txt");
        f1.createNewFile();
       // Scanner sc=new Scanner(System.in);
        System.out.println("Is exist:"+f1.exists());
        System.out.println("length:"+f1.length());
        FileOutputStream fout=new FileOutputStream("c:/Users/SAIF/ideaProjects/sonu.txt");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
            fout.write(ch[i]);
      //  fout.write
        fout.close();
        int i;
        FileInputStream fis=new FileInputStream("c:/Users/SAIF/ideaProjects/sonu.txt");
        do{
            i=fis.read();
            if(i!=-1)
                System.out.println((char)i);
        } while(i!=-1);
    }
}
