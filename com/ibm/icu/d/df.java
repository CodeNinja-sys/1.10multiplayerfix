/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.jd;
import com.ibm.icu.d.dd;
import com.ibm.icu.d.de;
import com.ibm.icu.d.dg;
import com.ibm.icu.d.dh;
import com.ibm.icu.d.dl;

class df
implements Comparable {
    private int[] a = new int[16];
    private String[] b = new String[16];
    private String[] c = new String[16];

    private df() {
    }

    public String a(int n2) {
        return this.b[n2];
    }

    public boolean b(int n2) {
        return this.a[n2] > 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 16; ++i2) {
            if (this.b[i2].length() == 0) continue;
            stringBuilder.append(this.b[i2]);
        }
        return stringBuilder.toString();
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        block0: for (int i2 = 0; i2 < 16; ++i2) {
            if (this.b[i2].length() == 0) continue;
            for (int i3 = 0; i3 < dd.k().length; ++i3) {
                int[] arrn = dd.k()[i3];
                if (arrn[1] != i2) continue;
                char c2 = this.b[i2].charAt(0);
                char c3 = c2 == 'h' || c2 == 'K' ? (char)'h' : (char)arrn[0];
                stringBuilder.append(jd.b(String.valueOf(c3), this.b[i2].length()));
                continue block0;
            }
        }
        return stringBuilder.toString();
    }

    String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 16; ++i2) {
            if (this.c[i2].length() == 0) continue;
            stringBuilder.append(this.c[i2]);
        }
        return stringBuilder.toString();
    }

    df a(String string, dh dh2, boolean bl2) {
        for (int i2 = 0; i2 < 16; ++i2) {
            this.a[i2] = 0;
            this.b[i2] = "";
            this.c[i2] = "";
        }
        dh2.a(string);
        for (Object e2 : dh2.a()) {
            dl dl2;
            String string2;
            if (!(e2 instanceof dl) || (string2 = (dl2 = (dl)e2).toString()).charAt(0) == 'a') continue;
            int n2 = dl.a(dl2);
            int[] arrn = dd.k()[n2];
            int n3 = arrn[1];
            if (this.b[n3].length() != 0) {
                if (bl2) continue;
                throw new IllegalArgumentException("Conflicting fields:\t" + this.b[n3] + ", " + string2 + "\t in " + string);
            }
            this.b[n3] = string2;
            char c2 = (char)arrn[0];
            int n4 = arrn[3];
            if ("GEzvQ".indexOf(c2) >= 0) {
                n4 = 1;
            }
            this.c[n3] = jd.b(String.valueOf(c2), n4);
            int n5 = arrn[2];
            if (n5 > 0) {
                n5 += string2.length();
            }
            this.a[n3] = n5;
        }
        return this;
    }

    int c() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == 0) continue;
            n2 |= 1 << i2;
        }
        return n2;
    }

    void a(df df2, int n2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if ((n2 & 1 << i2) != 0) {
                this.a[i2] = df2.a[i2];
                this.b[i2] = df2.b[i2];
                continue;
            }
            this.a[i2] = 0;
            this.b[i2] = "";
        }
    }

    int a(df df2, int n2, dg dg2) {
        int n3 = 0;
        dg2.a();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n4;
            int n5 = (n2 & 1 << i2) == 0 ? 0 : this.a[i2];
            if (n5 == (n4 = df2.a[i2])) continue;
            if (n5 == 0) {
                n3 += 65536;
                dg2.b(i2);
                continue;
            }
            if (n4 == 0) {
                n3 += 4096;
                dg2.a(i2);
                continue;
            }
            n3 += Math.abs(n5 - n4);
        }
        return n3;
    }

    public int a(df df2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            int n2 = this.b[i2].compareTo(df2.b[i2]);
            if (n2 == 0) continue;
            return -n2;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof df)) {
            return false;
        }
        df df2 = (df)object;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2].equals(df2.b[i2])) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            n2 ^= this.b[i2].hashCode();
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((df)object);
    }

    /* synthetic */ df(de de2) {
        this();
    }

    static /* synthetic */ String[] b(df df2) {
        return df2.b;
    }

    static /* synthetic */ int[] c(df df2) {
        return df2.a;
    }
}

