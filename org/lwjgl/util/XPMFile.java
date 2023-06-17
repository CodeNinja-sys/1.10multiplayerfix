/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class XPMFile {
    private byte[] a;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static int[] f = new int[4];

    private XPMFile() {
    }

    public static XPMFile a(String string) {
        return XPMFile.a(new FileInputStream(new File(string)));
    }

    public static XPMFile a(InputStream inputStream) {
        XPMFile xPMFile = new XPMFile();
        xPMFile.b(inputStream);
        return xPMFile;
    }

    public int a() {
        return f[1];
    }

    public int b() {
        return f[0];
    }

    public byte[] c() {
        return this.a;
    }

    private void b(InputStream inputStream) {
        try {
            int n2;
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            f = XPMFile.b(XPMFile.a(lineNumberReader));
            for (n2 = 0; n2 < f[2]; ++n2) {
                Object[] arrobject = XPMFile.c(XPMFile.a(lineNumberReader));
                hashMap.put((String)arrobject[0], (Integer)arrobject[1]);
            }
            this.a = new byte[f[0] * f[1] * 4];
            for (n2 = 0; n2 < f[1]; ++n2) {
                this.a(XPMFile.a(lineNumberReader), f, hashMap, n2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new IllegalArgumentException("Unable to parse XPM File");
        }
    }

    private static String a(LineNumberReader lineNumberReader) {
        String string;
        while (!(string = lineNumberReader.readLine()).startsWith("\"")) {
        }
        return string.substring(1, string.lastIndexOf(34));
    }

    private static int[] b(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        return new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())};
    }

    private static Object[] c(String string) {
        String string2 = string.substring(0, f[3]);
        String string3 = string.substring(f[3] + 4);
        return new Object[]{string2, Integer.parseInt(string3, 16)};
    }

    private void a(String string, int[] arrn, HashMap hashMap, int n2) {
        int n3 = n2 * 4 * arrn[0];
        for (int i2 = 0; i2 < arrn[0]; ++i2) {
            String string2 = string.substring(i2 * arrn[3], i2 * arrn[3] + arrn[3]);
            int n4 = (Integer)hashMap.get(string2);
            this.a[n3 + i2 * 4] = (byte)((n4 & 0xFF0000) >> 16);
            this.a[n3 + (i2 * 4 + 1)] = (byte)((n4 & 0xFF00) >> 8);
            this.a[n3 + (i2 * 4 + 2)] = (byte)((n4 & 0xFF) >> 0);
            this.a[n3 + (i2 * 4 + 3)] = -1;
        }
    }

    public static void main(String[] arrstring) {
        if (arrstring.length != 1) {
            System.out.println("usage:\nXPMFile <file>");
        }
        try {
            String string = arrstring[0].substring(0, arrstring[0].indexOf(".")) + ".raw";
            XPMFile xPMFile = XPMFile.a(arrstring[0]);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(string)));
            bufferedOutputStream.write(xPMFile.c());
            bufferedOutputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

