/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.b;
import com.b.a.c;
import com.b.a.d;
import com.b.b.a;
import com.b.b.e;
import com.b.b.h;
import com.b.b.v;
import java.io.FileInputStream;
import java.io.InputStream;

class f {
    static int a = 8192;
    static byte[] b = new byte[a];

    f() {
    }

    public static void a(String[] arrstring) {
        InputStream inputStream = System.in;
        if (arrstring.length > 0) {
            try {
                inputStream = new FileInputStream(arrstring[0]);
            }
            catch (Exception exception) {
                System.err.println(exception);
            }
        }
        com.b.a.e e2 = new com.b.a.e();
        d d2 = new d();
        c c2 = new c();
        b b2 = new b();
        v v2 = new v();
        e e3 = new e();
        h h2 = new h();
        a a2 = new a(h2);
        int n2 = 0;
        e2.c();
        while (true) {
            boolean bl2 = false;
            int n3 = e2.a(4096);
            byte[] arrby = e2.a;
            try {
                n2 = inputStream.read(arrby, n3, 4096);
            }
            catch (Exception exception) {
                System.err.println(exception);
                System.exit(-1);
            }
            e2.b(n2);
            if (e2.b(c2) != 1) {
                if (n2 < 4096) break;
                System.err.println("Input does not appear to be an Ogg bitstream.");
                System.exit(1);
            }
            d2.a(c2.f());
            v2.a();
            e3.a();
            if (d2.a(c2) < 0) {
                System.err.println("Error reading first page of Ogg bitstream data.");
                System.exit(1);
            }
            if (d2.b(b2) != 1) {
                System.err.println("Error reading initial header packet.");
                System.exit(1);
            }
            if (v2.a(e3, b2) < 0) {
                System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
                System.exit(1);
            }
            int n4 = 0;
            while (n4 < 2) {
                int n5;
                while (n4 < 2 && (n5 = e2.b(c2)) != 0) {
                    if (n5 != 1) continue;
                    d2.a(c2);
                    while (n4 < 2 && (n5 = d2.b(b2)) != 0) {
                        if (n5 == -1) {
                            System.err.println("Corrupt secondary header.  Exiting.");
                            System.exit(1);
                        }
                        v2.a(e3, b2);
                        ++n4;
                    }
                }
                n3 = e2.a(4096);
                arrby = e2.a;
                try {
                    n2 = inputStream.read(arrby, n3, 4096);
                }
                catch (Exception exception) {
                    System.err.println(exception);
                    System.exit(1);
                }
                if (n2 == 0 && n4 < 2) {
                    System.err.println("End of file before finding all Vorbis headers!");
                    System.exit(1);
                }
                e2.b(n2);
            }
            Object object = e3.a;
            for (int i2 = 0; i2 < ((byte[][])object).length && object[i2] != null; ++i2) {
                System.err.println(new String(object[i2], 0, object[i2].length - 1));
            }
            System.err.println("\nBitstream is " + v2.b + " channel, " + v2.c + "Hz");
            System.err.println("Encoded by: " + new String(e3.d, 0, e3.d.length - 1) + "\n");
            a = 4096 / v2.b;
            h2.a(v2);
            a2.a(h2);
            object = new float[1][][];
            int[] arrn = new int[v2.b];
            while (!bl2) {
                int n6;
                while (!bl2 && (n6 = e2.b(c2)) != 0) {
                    if (n6 == -1) {
                        System.err.println("Corrupt or missing data in bitstream; continuing...");
                        continue;
                    }
                    d2.a(c2);
                    while ((n6 = d2.b(b2)) != 0) {
                        int n7;
                        if (n6 == -1) continue;
                        if (a2.a(b2) == 0) {
                            h2.a(a2);
                        }
                        while ((n7 = h2.a((float[][][])object, arrn)) > 0) {
                            byte[] arrby2 = object[0];
                            int n8 = n7 < a ? n7 : a;
                            for (n4 = 0; n4 < v2.b; ++n4) {
                                int n9 = n4 * 2;
                                int n10 = arrn[n4];
                                for (int i3 = 0; i3 < n8; ++i3) {
                                    int n11 = (int)((double)arrby2[n4][n10 + i3] * 32767.0);
                                    if (n11 > 32767) {
                                        n11 = 32767;
                                    }
                                    if (n11 < -32768) {
                                        n11 = -32768;
                                    }
                                    if (n11 < 0) {
                                        n11 |= 0x8000;
                                    }
                                    f.b[n9] = (byte)n11;
                                    f.b[n9 + 1] = (byte)(n11 >>> 8);
                                    n9 += 2 * v2.b;
                                }
                            }
                            System.out.write(b, 0, 2 * v2.b * n8);
                            h2.a(n8);
                        }
                    }
                    if (c2.d() == 0) continue;
                    bl2 = true;
                }
                if (bl2) continue;
                n3 = e2.a(4096);
                arrby = e2.a;
                try {
                    n2 = inputStream.read(arrby, n3, 4096);
                }
                catch (Exception exception) {
                    System.err.println(exception);
                    System.exit(1);
                }
                e2.b(n2);
                if (n2 != 0) continue;
                bl2 = true;
            }
            d2.b();
            a2.a();
            h2.a();
            v2.b();
        }
        e2.a();
        System.err.println("Done.");
    }
}

