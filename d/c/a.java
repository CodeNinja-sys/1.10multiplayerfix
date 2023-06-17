/*
 * Decompiled with CFR 0.150.
 */
package d.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class a {
    public static ArrayList a(String string) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(string);
            process.waitFor();
        }
        catch (IOException iOException) {
            return null;
        }
        catch (InterruptedException interruptedException) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String string2 = "";
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            while ((string2 = bufferedReader.readLine()) != null) {
                arrayList.add(string2);
            }
        }
        catch (IOException iOException) {
            return null;
        }
        return arrayList;
    }

    public static String b(String string) {
        ArrayList arrayList = a.a(string);
        if (arrayList != null) {
            return (String)arrayList.get(0);
        }
        return null;
    }
}

