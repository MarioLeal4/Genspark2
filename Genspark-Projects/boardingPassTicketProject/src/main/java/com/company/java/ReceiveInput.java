package com.company.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReceiveInput {

    public String getInfo() throws IOException {
    String data = "";
    File getInfoFile = new File("C:\\Users\\ososm\\Desktop\\Genspark\\genspark proj\\boardingPassTicketProject\\saveData.txt");
    Scanner scan =  new Scanner(getInfoFile);

    while(scan.hasNext()) {
        data = scan.nextLine();
    }

    String[] info = data.split(",");


       String answer ="Name: " + info[0].substring(1) + "   Email:" + info[1] + "    Sex:" + info[2] +"  " + " Phone Number:" + info[3]
               + "    Depart From:" + info[5] + "      Going To:" + info[6] + "      Date : " + info[7];


          System.out.println(answer);
        return answer;

    }

    public String getSpecificUser(String name) throws IOException {
        File file = new File("C:\\Users\\ososm\\Desktop\\Genspark\\genspark proj\\boardingPassTicketProject\\saveData.txt");
        Scanner scan = new Scanner(file);
        String data= "";
        data = scan.nextLine();
        String[] info = data.split(",");
        while(scan.hasNext()){
            String[] info = data.split(",");
            if(scan.nextLine() == name){

                System.out.println("Name: " + info[0].substring(1) + "   Email:" + info[1] + "    Sex:" + info[2] +"  " + " Phone Number:" + info[3]
                        + "    Depart From:" + info[5] + "      Going To:" + info[6] + "      Date : " + info[7]);
                return  "Name: " + info[0].substring(1) + "   Email:" + info[1] + "    Sex:" + info[2] +"  " + " Phone Number:" + info[3]
                        + "    Depart From:" + info[5] + "      Going To:" + info[6] + "      Date : " + info[7];
            }
        }
        return "Name: " + info[0] + "   Email:" + info[1] + "    Sex:" + info[2] +"  " + " Phone Number:" + info[3]
                + "    Depart From:" + info[5] + "      Going To:" + info[6] + "      Date : " + info[7];
    }
}
