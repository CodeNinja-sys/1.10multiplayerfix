/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.jd;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;

public class ec {
    private lf i = new lf();
    private lf j = new lf();
    private lf k = new lf();
    private lf l = new lf();
    private boolean m = false;
    private boolean n = false;
    private transient lf o = null;
    private int p;
    private int q;
    private String r;
    public static final char a = '\'';
    public static final char b = '\\';
    private static int s = -1;
    private static int t = -2;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    private static final int u = -1;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 4;

    public lf a() {
        return (lf)this.i.clone();
    }

    public ec a(lf lf2) {
        this.i = (lf)lf2.clone();
        this.o = null;
        return this;
    }

    public lf b() {
        return (lf)this.j.clone();
    }

    public lf c() {
        return (lf)this.k.clone();
    }

    public ec b(lf lf2) {
        this.j = (lf)lf2.clone();
        this.o = null;
        return this;
    }

    public ec c(lf lf2) {
        this.k = (lf)lf2.clone();
        this.o = null;
        return this;
    }

    public lf d() {
        return (lf)this.l.clone();
    }

    public ec d(lf lf2) {
        this.l = (lf)lf2.clone();
        return this;
    }

    public boolean e() {
        return this.n;
    }

    public ec a(boolean bl2) {
        this.n = bl2;
        this.o = null;
        return this;
    }

    public boolean f() {
        return this.m;
    }

    public ec b(boolean bl2) {
        this.m = bl2;
        this.o = null;
        return this;
    }

    public int g() {
        return this.q;
    }

    public ec a(int n2) {
        this.q = n2;
        return this;
    }

    public int h() {
        return this.p;
    }

    public ec b(int n2) {
        this.p = n2;
        return this;
    }

    public ec a(CharSequence charSequence) {
        return this.a(((Object)charSequence).toString());
    }

    public ec a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Inconsistent arguments");
        }
        this.p = 0;
        this.q = string.length();
        this.r = string;
        return this;
    }

    public String b(CharSequence charSequence) {
        return this.b(((Object)charSequence).toString());
    }

    public String b(String string) {
        int n2;
        if (this.o == null) {
            this.o = new lf().f(this.j).f(this.i).f(this.k);
            if (this.m) {
                this.o.e(92);
            }
            if (this.n) {
                this.o.e(39);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = s;
        for (int i2 = 0; i2 < string.length(); i2 += kx.a(n2)) {
            n2 = kx.a(string, i2);
            if (this.l.b(n2)) {
                if (n3 == t) {
                    stringBuffer.append('\'');
                    n3 = s;
                }
                this.a(stringBuffer, n2);
                continue;
            }
            if (this.o.b(n2)) {
                if (n3 == t) {
                    kx.f(stringBuffer, n2);
                    if (!this.n || n2 != 39) continue;
                    stringBuffer.append('\'');
                    continue;
                }
                if (this.m) {
                    stringBuffer.append('\\');
                    kx.f(stringBuffer, n2);
                    continue;
                }
                if (this.n) {
                    if (n2 == 39) {
                        stringBuffer.append('\'');
                        stringBuffer.append('\'');
                        continue;
                    }
                    stringBuffer.append('\'');
                    kx.f(stringBuffer, n2);
                    n3 = t;
                    continue;
                }
                this.a(stringBuffer, n2);
                continue;
            }
            if (n3 == t) {
                stringBuffer.append('\'');
                n3 = s;
            }
            kx.f(stringBuffer, n2);
        }
        if (n3 == t) {
            stringBuffer.append('\'');
        }
        return stringBuffer.toString();
    }

    private void a(StringBuffer stringBuffer, int n2) {
        if (n2 <= 65535) {
            stringBuffer.append("\\u").append(jd.a((long)n2, 4));
        } else {
            stringBuffer.append("\\U").append(jd.a((long)n2, 8));
        }
    }

    public String i() {
        int n2 = this.p;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            stringBuffer2.setLength(0);
            int n3 = this.a(stringBuffer2);
            if (n3 == 0) {
                this.p = n2;
                return stringBuffer.toString();
            }
            if (n3 != 1) {
                stringBuffer.append(this.b(stringBuffer2));
                continue;
            }
            stringBuffer.append(stringBuffer2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(StringBuffer stringBuffer) {
        int n2;
        if (this.p >= this.q) {
            return 0;
        }
        int n3 = 5;
        int n4 = 5;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        block21: for (int i2 = this.p; i2 < this.q; i2 += kx.a(n2)) {
            n2 = kx.a(this.r, i2);
            switch (n5) {
                case 3: {
                    switch (n2) {
                        case 117: {
                            n5 = 4;
                            n6 = 4;
                            n7 = 0;
                            continue block21;
                        }
                        case 85: {
                            n5 = 4;
                            n6 = 8;
                            n7 = 0;
                            continue block21;
                        }
                        default: {
                            if (this.m) {
                                kx.f(stringBuffer, n2);
                                n5 = 0;
                                continue block21;
                            }
                            stringBuffer.append('\\');
                            n5 = 0;
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    n7 <<= 4;
                    n7 += n2;
                    switch (n2) {
                        case 48: 
                        case 49: 
                        case 50: 
                        case 51: 
                        case 52: 
                        case 53: 
                        case 54: 
                        case 55: 
                        case 56: 
                        case 57: {
                            n7 -= 48;
                            break;
                        }
                        case 97: 
                        case 98: 
                        case 99: 
                        case 100: 
                        case 101: 
                        case 102: {
                            n7 -= 87;
                            break;
                        }
                        case 65: 
                        case 66: 
                        case 67: 
                        case 68: 
                        case 69: 
                        case 70: {
                            n7 -= 55;
                            break;
                        }
                        default: {
                            this.p = i2;
                            return 4;
                        }
                    }
                    if (--n6 != 0) continue block21;
                    n5 = 0;
                    kx.f(stringBuffer, n7);
                    continue block21;
                }
                case -1: {
                    if (n2 == n4) {
                        kx.f(stringBuffer, n2);
                        n5 = 2;
                        continue block21;
                    }
                    n5 = 0;
                    break;
                }
                case 1: {
                    if (n2 == n4) {
                        kx.f(stringBuffer, n2);
                        n5 = 0;
                        continue block21;
                    }
                    kx.f(stringBuffer, n2);
                    n5 = 2;
                    continue block21;
                }
                case 2: {
                    if (n2 == n4) {
                        n5 = -1;
                        continue block21;
                    }
                    kx.f(stringBuffer, n2);
                    continue block21;
                }
            }
            if (this.i.b(n2)) continue;
            if (this.j.b(n2)) {
                if (n3 == 5) {
                    kx.f(stringBuffer, n2);
                    this.p = i2 + kx.a(n2);
                    return 1;
                }
                this.p = i2;
                return n3;
            }
            n3 = 2;
            if (n2 == 92) {
                n5 = 3;
                continue;
            }
            if (this.n && n2 == 39) {
                n4 = n2;
                n5 = 1;
                continue;
            }
            kx.f(stringBuffer, n2);
        }
        this.p = this.q;
        switch (n5) {
            case 4: {
                return 4;
            }
            case 3: {
                if (this.m) {
                    return 4;
                }
                stringBuffer.append('\\');
                return n3;
            }
            case 1: 
            case 2: {
                return 3;
            }
        }
        return n3;
    }
}

