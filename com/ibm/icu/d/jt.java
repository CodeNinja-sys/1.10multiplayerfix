/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.am;
import com.ibm.icu.a.fb;
import com.ibm.icu.a.gx;
import com.ibm.icu.a.t;
import com.ibm.icu.b.b;
import com.ibm.icu.d.fo;
import com.ibm.icu.d.jv;
import com.ibm.icu.d.jw;
import com.ibm.icu.d.ku;
import com.ibm.icu.d.kx;
import com.ibm.icu.util.VersionInfo;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public final class jt {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    public static final int p = 13;
    private static final int q = 13;
    private static final String[] r = new String[]{"rfc3491", "rfc3530cs", "rfc3530csci", "rfc3491", "rfc3530mixp", "rfc3491", "rfc3722", "rfc3920node", "rfc3920res", "rfc4011", "rfc4013", "rfc4505", "rfc4518", "rfc4518ci"};
    private static final WeakReference[] s = new WeakReference[14];
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 1;
    private static final int z = 2;
    private static final int A = 65520;
    private static final int B = 16319;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 3;
    private static final int G = 4;
    private static final int H = 5;
    private static final int I = 6;
    private static final int J = 7;
    private static final int K = 16;
    private static final int L = 25000;
    private t M;
    private int[] N;
    private char[] O;
    private VersionInfo P;
    private VersionInfo Q;
    private boolean R;
    private boolean S;
    private gx T;

    private char b(int n2) {
        return this.M.a(n2);
    }

    private static VersionInfo c(int n2) {
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 24 & 0xFF;
        return VersionInfo.a(n6, n5, n4, n3);
    }

    private static VersionInfo a(byte[] arrby) {
        if (arrby.length != 4) {
            return null;
        }
        return VersionInfo.a(arrby[0], arrby[1], arrby[2], arrby[3]);
    }

    public jt(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 25000);
        fb fb2 = new fb(bufferedInputStream);
        this.N = fb2.a(16);
        byte[] arrby = new byte[this.N[0]];
        this.O = new char[this.N[1] / 2];
        fb2.a(arrby, this.O);
        this.M = new t(new ByteArrayInputStream(arrby), null);
        fb2.a();
        this.R = (this.N[7] & 1) > 0;
        this.S = (this.N[7] & 2) > 0;
        this.P = jt.a(fb2.b());
        this.Q = jt.c(this.N[2]);
        VersionInfo versionInfo = com.ibm.icu.b.b.a();
        if (versionInfo.a(this.P) < 0 && versionInfo.a(this.Q) < 0 && (this.N[7] & 1) > 0) {
            throw new IOException("Normalization Correction version not supported");
        }
        bufferedInputStream.close();
        if (this.S) {
            this.T = gx.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static jt a(int n2) {
        if (n2 < 0 || n2 > 13) {
            throw new IllegalArgumentException("Bad profile type");
        }
        jt jt2 = null;
        WeakReference[] arrweakReference = s;
        synchronized (s) {
            WeakReference weakReference = s[n2];
            if (weakReference != null) {
                jt2 = (jt)weakReference.get();
            }
            if (jt2 == null) {
                InputStream inputStream = am.c("data/icudt51b/" + r[n2] + ".spp");
                if (inputStream != null) {
                    try {
                        try {
                            jt2 = new jt(inputStream);
                        }
                        finally {
                            inputStream.close();
                        }
                    }
                    catch (IOException iOException) {
                        throw new RuntimeException(iOException.toString());
                    }
                }
                if (jt2 != null) {
                    jt.s[n2] = new WeakReference<jt>(jt2);
                }
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return jt2;
        }
    }

    private static final void a(char c2, jv jv2) {
        jv2.a();
        if (c2 == '\u0000') {
            jv2.c = 4;
        } else if (c2 >= '\ufff0') {
            jv2.c = c2 - 65520;
        } else {
            jv2.c = 1;
            if ((c2 & 2) > 0) {
                jv2.a = true;
                jv2.b = c2 >> 2;
            } else {
                jv2.a = false;
                jv2.b = c2 << 16 >> 16;
                jv2.b >>= 2;
            }
            if (c2 >> 2 == 16319) {
                jv2.c = 3;
                jv2.a = false;
                jv2.b = 0;
            }
        }
    }

    private StringBuffer b(ku ku2, int n2) {
        boolean bl2;
        jv jv2 = new jv(null);
        char c2 = '\u0000';
        int n3 = -1;
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl3 = bl2 = (n2 & 1) > 0;
        while ((n3 = ku2.j()) != -1) {
            c2 = this.b(n3);
            jt.a(c2, jv2);
            if (jv2.c == 0 && !bl2) {
                throw new jw("An unassigned code point was found in the input", 3, ku2.i(), ku2.c());
            }
            if (jv2.c == 1) {
                if (jv2.a) {
                    int n4 = jv2.b;
                    int n5 = n4 >= this.N[3] && n4 < this.N[4] ? 1 : (n4 >= this.N[4] && n4 < this.N[5] ? 2 : (n4 >= this.N[5] && n4 < this.N[6] ? 3 : this.O[n4++]));
                    stringBuffer.append(this.O, n4, n5);
                    continue;
                }
                n3 -= jv2.b;
            } else if (jv2.c == 3) continue;
            kx.f(stringBuffer, n3);
        }
        return stringBuffer;
    }

    private StringBuffer a(StringBuffer stringBuffer) {
        return new StringBuffer(fo.a(stringBuffer.toString(), fo.h, 32));
    }

    public StringBuffer a(ku ku2, int n2) {
        int n3;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = this.b(ku2, n2);
        if (this.R) {
            stringBuffer2 = this.a(stringBuffer);
        }
        ku ku3 = ku.a(stringBuffer2);
        jv jv2 = new jv(null);
        int n4 = 19;
        int n5 = 19;
        int n6 = -1;
        int n7 = -1;
        boolean bl2 = false;
        boolean bl3 = false;
        while ((n3 = ku3.j()) != -1) {
            char c2 = this.b(n3);
            jt.a(c2, jv2);
            if (jv2.c == 2) {
                throw new jw("A prohibited code point was found in the input", 2, ku3.i(), jv2.b);
            }
            if (!this.S) continue;
            n4 = this.T.b(n3);
            if (n5 == 19) {
                n5 = n4;
            }
            if (n4 == 0) {
                bl3 = true;
                n7 = ku3.c() - 1;
            }
            if (n4 != 1 && n4 != 13) continue;
            bl2 = true;
            n6 = ku3.c() - 1;
        }
        if (this.S) {
            if (bl3 && bl2) {
                throw new jw("The input does not conform to the rules for BiDi code points.", 4, ku3.i(), n6 > n7 ? n6 : n7);
            }
            if (bl2 && (n5 != 1 && n5 != 13 || n4 != 1 && n4 != 13)) {
                throw new jw("The input does not conform to the rules for BiDi code points.", 4, ku3.i(), n6 > n7 ? n6 : n7);
            }
        }
        return stringBuffer2;
    }

    public String a(String string, int n2) {
        StringBuffer stringBuffer = this.a(ku.b(string), n2);
        return stringBuffer.toString();
    }
}

