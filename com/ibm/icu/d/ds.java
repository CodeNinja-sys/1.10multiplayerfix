/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.bc;
import com.ibm.icu.d.aa;
import com.ibm.icu.d.ac;
import com.ibm.icu.d.dt;
import com.ibm.icu.util.dv;
import java.io.DataInputStream;
import java.io.InputStream;

final class ds {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 7;
    public static final int d = 8;
    public static final int e = 0;
    public static final int f = 0x1000000;
    public static final int g = 0x7F000000;
    public static final int h = 0x1FFFFF;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;
    public static final int o = 6;
    public static final int p = 7;
    public static final int q = 8;
    private static final byte[] r = new byte[]{68, 105, 99, 116};

    private ds() {
    }

    public static dt a(String string) {
        int n2;
        int n3;
        bc bc2 = (bc)dv.k("com/ibm/icu/impl/data/icudt51b/brkitr");
        String string2 = bc2.f("dictionaries/" + string);
        string2 = "data/icudt51b/brkitr/" + string2;
        InputStream inputStream = am.b(string2);
        ag.a(inputStream, r, null);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int[] arrn = new int[8];
        for (n3 = 0; n3 < 8; ++n3) {
            arrn[n3] = dataInputStream.readInt();
        }
        n3 = arrn[0];
        com.ibm.icu.a.a.a(n3 >= 32);
        if (n3 > 32) {
            n2 = n3 - 32;
            dataInputStream.skipBytes(n2);
        }
        n2 = arrn[4] & 7;
        int n4 = arrn[3] - n3;
        dt dt2 = null;
        if (n2 == 0) {
            int n5;
            int n6 = arrn[5];
            byte[] arrby = new byte[n4];
            for (n5 = 0; n5 < arrby.length; ++n5) {
                arrby[n5] = dataInputStream.readByte();
            }
            com.ibm.icu.a.a.a(n5 == n4);
            dt2 = new aa(arrby, n6);
        } else if (n2 == 1) {
            com.ibm.icu.a.a.a(n4 % 2 == 0);
            int n7 = n4 / 2;
            char[] arrc = new char[n4 / 2];
            for (int i2 = 0; i2 < n7; ++i2) {
                arrc[i2] = dataInputStream.readChar();
            }
            dt2 = new ac(new String(arrc));
        } else {
            dt2 = null;
        }
        dataInputStream.close();
        inputStream.close();
        return dt2;
    }
}

