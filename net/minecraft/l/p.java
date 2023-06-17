/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;

public class p {
    public String a;

    public p(String string) {
        this.a = string;
        String[] arrstring = p.a(string);
        String string2 = arrstring[0];
        for (int i2 = 1; i2 < arrstring.length; ++i2) {
            string2 = String.valueOf(string2) + "/" + arrstring[i2];
        }
        if (!Files.exists(Paths.get(string2, new String[0]), LinkOption.NOFOLLOW_LINKS)) {
            new File(string2).mkdirs();
        }
        if (!new File(string).exists()) {
            try {
                new File(string).createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public void a(int[] arrn) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(this.a, "UTF-8");
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            printWriter.println(arrn[i2]);
        }
        printWriter.close();
    }

    public Integer[] a() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.a));
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            return null;
        }
        try {
            String string = null;
            try {
                string = bufferedReader.readLine();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            while (string != null) {
                arrayList.add(Integer.parseInt(string));
                try {
                    string = bufferedReader.readLine();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return arrayList.size() == 0 ? null : arrayList.toArray(new Integer[arrayList.size()]);
    }

    private static String[] a(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "";
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (Character.valueOf(string.charAt(i2)).equals(Character.valueOf('/')) || Character.valueOf(string.charAt(i2)).equals(Character.valueOf('\\'))) {
                arrayList.add(string2);
                string2 = "";
                continue;
            }
            string2 = String.valueOf(string2) + string.charAt(i2);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}

