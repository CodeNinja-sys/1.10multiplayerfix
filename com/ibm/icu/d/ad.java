/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ae;
import com.ibm.icu.d.ag;
import com.ibm.icu.d.ah;
import com.ibm.icu.d.ai;
import com.ibm.icu.d.aj;
import com.ibm.icu.d.al;
import com.ibm.icu.d.am;
import com.ibm.icu.d.ao;
import com.ibm.icu.d.ap;
import com.ibm.icu.d.ar;
import com.ibm.icu.d.at;
import com.ibm.icu.d.au;
import com.ibm.icu.d.av;
import com.ibm.icu.d.aw;
import com.ibm.icu.d.az;
import com.ibm.icu.d.ba;
import com.ibm.icu.d.bc;
import com.ibm.icu.d.be;
import com.ibm.icu.d.bg;
import com.ibm.icu.d.bi;
import com.ibm.icu.d.bj;
import com.ibm.icu.d.bl;
import com.ibm.icu.d.bn;
import com.ibm.icu.d.bo;
import com.ibm.icu.d.bq;
import com.ibm.icu.d.br;
import com.ibm.icu.d.bs;
import com.ibm.icu.d.bt;
import com.ibm.icu.d.bu;
import com.ibm.icu.d.bx;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ad {
    private static final int j = 8000;
    byte[] a = new byte[8000];
    int b;
    short[] c = new short[256];
    boolean d = false;
    String e;
    byte[] f;
    int g;
    InputStream h;
    boolean i = false;
    private static ArrayList k = ad.f();
    private static String[] l;

    public ad a(String string) {
        this.e = string;
        return this;
    }

    public ad a(byte[] arrby) {
        this.f = arrby;
        this.g = arrby.length;
        return this;
    }

    public ad a(InputStream inputStream) {
        int n2;
        this.h = inputStream;
        this.h.mark(8000);
        this.f = new byte[8000];
        this.g = 0;
        for (int i2 = 8000; i2 > 0 && (n2 = this.h.read(this.f, this.g, i2)) > 0; i2 -= n2) {
            this.g += n2;
        }
        this.h.reset();
        return this;
    }

    public ae a() {
        ae[] arrae = this.b();
        if (arrae == null || arrae.length == 0) {
            return null;
        }
        return arrae[0];
    }

    public ae[] b() {
        ArrayList<ae> arrayList = new ArrayList<ae>();
        this.e();
        for (bx bx2 : k) {
            ae ae2 = bx2.a(this);
            if (ae2 == null) continue;
            arrayList.add(ae2);
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        ae[] arrae = new ae[arrayList.size()];
        arrae = arrayList.toArray(arrae);
        return arrae;
    }

    public Reader a(InputStream inputStream, String string) {
        this.e = string;
        try {
            this.a(inputStream);
            ae ae2 = this.a();
            if (ae2 == null) {
                return null;
            }
            return ae2.a();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public String a(byte[] arrby, String string) {
        this.e = string;
        try {
            this.a(arrby);
            ae ae2 = this.a();
            if (ae2 == null) {
                return null;
            }
            return ae2.a(-1);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static String[] c() {
        return l;
    }

    public boolean d() {
        return this.i;
    }

    public boolean a(boolean bl2) {
        boolean bl3 = this.i;
        this.i = bl2;
        return bl3;
    }

    private void e() {
        int n2;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        int n6 = 0;
        if (this.i) {
            for (n3 = 0; n3 < this.g && n4 < this.a.length; ++n3) {
                byte by2 = this.f[n3];
                if (by2 == 60) {
                    if (bl2) {
                        ++n6;
                    }
                    bl2 = true;
                    ++n5;
                }
                if (!bl2) {
                    this.a[n4++] = by2;
                }
                if (by2 != 62) continue;
                bl2 = false;
            }
            this.b = n4;
        }
        if (n5 < 5 || n5 / 5 < n6 || this.b < 100 && this.g > 600) {
            n2 = this.g;
            if (n2 > 8000) {
                n2 = 8000;
            }
            for (n3 = 0; n3 < n2; ++n3) {
                this.a[n3] = this.f[n3];
            }
            this.b = n3;
        }
        Arrays.fill(this.c, (short)0);
        for (n3 = 0; n3 < this.b; ++n3) {
            int n7 = n2 = this.a[n3] & 0xFF;
            this.c[n7] = (short)(this.c[n7] + 1);
        }
        this.d = false;
        for (n2 = 128; n2 <= 159; ++n2) {
            if (this.c[n2] == 0) continue;
            this.d = true;
            break;
        }
    }

    private static ArrayList f() {
        ArrayList<bx> arrayList = new ArrayList<bx>();
        arrayList.add(new aj());
        arrayList.add(new al());
        arrayList.add(new am());
        arrayList.add(new ao());
        arrayList.add(new ap());
        arrayList.add(new aw());
        arrayList.add(new ah());
        arrayList.add(new ag());
        arrayList.add(new ai());
        arrayList.add(new av());
        arrayList.add(new at());
        arrayList.add(new au());
        arrayList.add(new ar());
        arrayList.add(new az());
        arrayList.add(new ba());
        arrayList.add(new bc());
        arrayList.add(new be());
        arrayList.add(new bg());
        arrayList.add(new bi());
        arrayList.add(new bj());
        arrayList.add(new bt());
        arrayList.add(new bu());
        arrayList.add(new bs());
        arrayList.add(new bl());
        arrayList.add(new br());
        arrayList.add(new bq());
        arrayList.add(new bo());
        arrayList.add(new bn());
        String[] arrstring = new String[arrayList.size()];
        int n2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            String string = ((bx)arrayList.get(i2)).a();
            if (n2 != 0 && string.equals(arrstring[n2 - 1])) continue;
            arrstring[n2++] = string;
        }
        l = new String[n2];
        System.arraycopy(arrstring, 0, l, 0, n2);
        return arrayList;
    }
}

