package com.example.cetarkfotomodul2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.adidas_slide,
            R.drawable.adidas_yezzy,
            R.drawable.jordan1,
    };

    private  static String[] filenameArray ={
            "Sendal Merk Adidas",
            "Sendal Merk yeezy",
            "Sepatu Jordan 1",
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }
    public static List<KatalogFoto> getKatalogFotoList(){
        return katalogFotoList;
    }
    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}
