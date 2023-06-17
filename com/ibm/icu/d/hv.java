/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.t;
import com.ibm.icu.d.hw;
import com.ibm.icu.d.hx;
import com.ibm.icu.d.it;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

final class hv {
    hw a;
    short[] b;
    short[] c;
    short[] d;
    short[] e;
    t f;
    String g;
    int[] h;
    static final int i = 24;
    static final int j = 0;
    static final int k = 1;
    static final int l = 2;
    static final int m = 3;
    static final int n = 4;
    static final int o = 5;
    static final int p = 6;
    static final int q = 7;
    static final int r = 8;
    static final int s = 9;
    static final int t = 10;
    static final int u = 11;
    static final int v = 12;
    static final int w = 13;
    static final int x = 14;
    static final int y = 15;
    static final int z = 16;
    static final int A = 17;
    static final int B = 0;
    static final int C = 1;
    static final int D = 2;
    static final int E = 3;
    static final int F = 4;
    static final int G = 0;
    static final int H = 2;
    static final int I = 4;
    static final int J = 6;
    static final int K = 8;
    static final int L = 1;
    static final int M = 2;
    static hx N = new hx();

    int a(int n2) {
        return 8 + n2 * (this.a.e + 4);
    }

    hv() {
    }

    static hv a(InputStream inputStream) {
        int n2;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
        hv hv2 = new hv();
        dataInputStream.skip(128L);
        hv2.a = new hw();
        hv2.a.a = dataInputStream.readInt();
        hv2.a.b = dataInputStream.readInt();
        hv2.a.c[0] = (byte)(hv2.a.b >> 24);
        hv2.a.c[1] = (byte)(hv2.a.b >> 16);
        hv2.a.c[2] = (byte)(hv2.a.b >> 8);
        hv2.a.c[3] = (byte)hv2.a.b;
        hv2.a.d = dataInputStream.readInt();
        hv2.a.e = dataInputStream.readInt();
        hv2.a.f = dataInputStream.readInt();
        hv2.a.g = dataInputStream.readInt();
        hv2.a.h = dataInputStream.readInt();
        hv2.a.i = dataInputStream.readInt();
        hv2.a.j = dataInputStream.readInt();
        hv2.a.k = dataInputStream.readInt();
        hv2.a.l = dataInputStream.readInt();
        hv2.a.m = dataInputStream.readInt();
        hv2.a.n = dataInputStream.readInt();
        hv2.a.o = dataInputStream.readInt();
        hv2.a.p = dataInputStream.readInt();
        hv2.a.q = dataInputStream.readInt();
        hv2.a.r = dataInputStream.readInt();
        hv2.a.s = dataInputStream.readInt();
        dataInputStream.skip(24L);
        if (hv2.a.a != 45472 || hv2.a.b != 1 && hv2.a.c[0] != 3) {
            throw new IOException("Break Iterator Rule Data Magic Number Incorrect, or unsupported data version.");
        }
        int n3 = 96;
        if (hv2.a.f < n3 || hv2.a.f > hv2.a.d) {
            throw new IOException("Break iterator Rule data corrupt");
        }
        dataInputStream.skip(hv2.a.f - n3);
        n3 = hv2.a.f;
        hv2.b = new short[hv2.a.g / 2];
        for (n2 = 0; n2 < hv2.b.length; ++n2) {
            hv2.b[n2] = dataInputStream.readShort();
            n3 += 2;
        }
        dataInputStream.skip(hv2.a.h - n3);
        n3 = hv2.a.h;
        hv2.c = new short[hv2.a.i / 2];
        for (n2 = 0; n2 < hv2.c.length; ++n2) {
            hv2.c[n2] = dataInputStream.readShort();
            n3 += 2;
        }
        if (hv2.a.k > 0) {
            dataInputStream.skip(hv2.a.j - n3);
            n3 = hv2.a.j;
            hv2.d = new short[hv2.a.k / 2];
            for (n2 = 0; n2 < hv2.d.length; ++n2) {
                hv2.d[n2] = dataInputStream.readShort();
                n3 += 2;
            }
        }
        if (hv2.a.m > 0) {
            dataInputStream.skip(hv2.a.l - n3);
            n3 = hv2.a.l;
            hv2.e = new short[hv2.a.m / 2];
            for (n2 = 0; n2 < hv2.e.length; ++n2) {
                hv2.e[n2] = dataInputStream.readShort();
                n3 += 2;
            }
        }
        dataInputStream.skip(hv2.a.n - n3);
        n3 = hv2.a.n;
        dataInputStream.mark(hv2.a.o + 100);
        hv2.f = new t(dataInputStream, N);
        dataInputStream.reset();
        if (n3 > hv2.a.r) {
            throw new IOException("Break iterator Rule data corrupt");
        }
        dataInputStream.skip(hv2.a.r - n3);
        n3 = hv2.a.r;
        hv2.h = new int[hv2.a.s / 4];
        for (n2 = 0; n2 < hv2.h.length; ++n2) {
            hv2.h[n2] = dataInputStream.readInt();
            n3 += 4;
        }
        if (n3 > hv2.a.p) {
            throw new IOException("Break iterator Rule data corrupt");
        }
        dataInputStream.skip(hv2.a.p - n3);
        n3 = hv2.a.p;
        StringBuilder stringBuilder = new StringBuilder(hv2.a.q / 2);
        for (n2 = 0; n2 < hv2.a.q; n2 += 2) {
            stringBuilder.append(dataInputStream.readChar());
            n3 += 2;
        }
        hv2.g = stringBuilder.toString();
        if (it.r != null && it.r.indexOf("data") >= 0) {
            hv2.a();
        }
        return hv2;
    }

    static final int a(short[] arrs) {
        short s2 = arrs[0];
        short s3 = arrs[1];
        int n2 = (s2 << 16) + (s3 & 0xFFFF);
        return n2;
    }

    void a() {
        if (this.b.length == 0) {
            throw new NullPointerException();
        }
        System.out.println("RBBI Data Wrapper dump ...");
        System.out.println();
        System.out.println("Forward State Table");
        this.b(this.b);
        System.out.println("Reverse State Table");
        this.b(this.c);
        System.out.println("Forward Safe Points Table");
        this.b(this.d);
        System.out.println("Reverse Safe Points Table");
        this.b(this.e);
        this.b();
        System.out.println("Source Rules: " + this.g);
    }

    public static String a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append(n2);
        while (stringBuilder.length() < n3) {
            stringBuilder.insert(0, ' ');
        }
        return stringBuilder.toString();
    }

    public static String b(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append(Integer.toHexString(n2));
        while (stringBuilder.length() < n3) {
            stringBuilder.insert(0, ' ');
        }
        return stringBuilder.toString();
    }

    private void b(short[] arrs) {
        if (arrs == null) {
            System.out.println("  -- null -- ");
        } else {
            int n2;
            StringBuilder stringBuilder = new StringBuilder(" Row  Acc Look  Tag");
            for (n2 = 0; n2 < this.a.e; ++n2) {
                stringBuilder.append(hv.a(n2, 5));
            }
            System.out.println(stringBuilder.toString());
            for (n2 = 0; n2 < stringBuilder.length(); ++n2) {
                System.out.print("-");
            }
            System.out.println();
            for (int i2 = 0; i2 < hv.a(arrs); ++i2) {
                this.a(arrs, i2);
            }
            System.out.println();
        }
    }

    private void a(short[] arrs, int n2) {
        StringBuilder stringBuilder = new StringBuilder(this.a.e * 5 + 20);
        stringBuilder.append(hv.a(n2, 4));
        int n3 = this.a(n2);
        if (arrs[n3 + 0] != 0) {
            stringBuilder.append(hv.a(arrs[n3 + 0], 5));
        } else {
            stringBuilder.append("     ");
        }
        if (arrs[n3 + 1] != 0) {
            stringBuilder.append(hv.a(arrs[n3 + 1], 5));
        } else {
            stringBuilder.append("     ");
        }
        stringBuilder.append(hv.a(arrs[n3 + 2], 5));
        for (int i2 = 0; i2 < this.a.e; ++i2) {
            stringBuilder.append(hv.a(arrs[n3 + 4 + i2], 5));
        }
        System.out.println(stringBuilder);
    }

    private void b() {
        int n2;
        int n3 = this.a.e;
        String[] arrstring = new String[n3 + 1];
        int n4 = 0;
        int n5 = 0;
        int n6 = -1;
        int[] arrn = new int[n3 + 1];
        for (n2 = 0; n2 <= this.a.e; ++n2) {
            arrstring[n2] = "";
        }
        System.out.println("\nCharacter Categories");
        System.out.println("--------------------");
        for (int i2 = 0; i2 <= 0x10FFFF; ++i2) {
            n2 = this.f.a(i2);
            if ((n2 &= 0xFFFFBFFF) < 0 || n2 > this.a.e) {
                System.out.println("Error, bad category " + Integer.toHexString(n2) + " for char " + Integer.toHexString(i2));
                break;
            }
            if (n2 == n6) {
                n5 = i2;
                continue;
            }
            if (n6 >= 0) {
                if (arrstring[n6].length() > arrn[n6] + 70) {
                    arrn[n6] = arrstring[n6].length() + 10;
                    int n7 = n6;
                    arrstring[n7] = arrstring[n7] + "\n       ";
                }
                int n8 = n6;
                arrstring[n8] = arrstring[n8] + " " + Integer.toHexString(n4);
                if (n5 != n4) {
                    int n9 = n6;
                    arrstring[n9] = arrstring[n9] + "-" + Integer.toHexString(n5);
                }
            }
            n6 = n2;
            n4 = n5 = i2;
        }
        int n10 = n6;
        arrstring[n10] = arrstring[n10] + " " + Integer.toHexString(n4);
        if (n5 != n4) {
            int n11 = n6;
            arrstring[n11] = arrstring[n11] + "-" + Integer.toHexString(n5);
        }
        for (n2 = 0; n2 <= this.a.e; ++n2) {
            System.out.println(hv.a(n2, 5) + "  " + arrstring[n2]);
        }
        System.out.println();
    }
}

