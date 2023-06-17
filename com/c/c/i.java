/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class i {
    private static String a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a() {
        if (a != null) {
            return a;
        }
        BufferedReader bufferedReader = null;
        try {
            InputStream inputStream = i.class.getResourceAsStream("/version");
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            a = bufferedReader.readLine();
            bufferedReader.close();
            String string = a;
            return string;
        }
        catch (Exception exception) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        return null;
    }
}

