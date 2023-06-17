/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.di;
import com.ibm.icu.a.eb;
import com.ibm.icu.a.ev;
import com.ibm.icu.a.fa;
import com.ibm.icu.a.gx;
import com.ibm.icu.a.ha;
import com.ibm.icu.a.hk;
import com.ibm.icu.a.jb;
import com.ibm.icu.a.jd;
import com.ibm.icu.b.a;
import com.ibm.icu.b.b;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.jy;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lc;
import com.ibm.icu.d.lg;
import com.ibm.icu.d.lh;
import com.ibm.icu.d.li;
import com.ibm.icu.d.lj;
import com.ibm.icu.d.lk;
import com.ibm.icu.d.ll;
import com.ibm.icu.d.lm;
import com.ibm.icu.d.ln;
import com.ibm.icu.d.lo;
import com.ibm.icu.d.lp;
import com.ibm.icu.d.lq;
import com.ibm.icu.d.u;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.az;
import com.ibm.icu.util.dn;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class lf
extends lc
implements az,
Comparable,
Iterable {
    public static final lf a = new lf().l();
    public static final lf f = new lf(0, 0x10FFFF).l();
    private static lp n = null;
    private static final int o = 0;
    private static final int p = 0x110000;
    public static final int g = 0;
    public static final int h = 0x10FFFF;
    private int q;
    private int[] r;
    private int[] s;
    private int[] t;
    TreeSet i = new TreeSet();
    private String u = null;
    private static final int v = 16;
    private static final int w = 16;
    private static final String x = "ANY";
    private static final String y = "ASCII";
    private static final String z = "Assigned";
    private static lf[] A = null;
    private com.ibm.icu.a.b B;
    private jb C;
    private static final VersionInfo D = VersionInfo.a(0, 0, 0, 0);
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 2;
    public static final int m = 4;

    public lf() {
        this.r = new int[17];
        this.r[this.q++] = 0x110000;
    }

    public lf(lf lf2) {
        this.b(lf2);
    }

    public lf(int n2, int n3) {
        this();
        this.f(n2, n3);
    }

    public lf(int ... arrn) {
        if ((arrn.length & 1) != 0) {
            throw new IllegalArgumentException("Must have even number of integers");
        }
        this.r = new int[arrn.length + 1];
        this.q = this.r.length;
        int n2 = -1;
        int n3 = 0;
        while (n3 < arrn.length) {
            int n4 = arrn[n3];
            if (n2 >= n4) {
                throw new IllegalArgumentException("Must be monotonically increasing.");
            }
            this.r[n3++] = n2 = n4;
            int n5 = arrn[n3] + 1;
            if (n2 >= n5) {
                throw new IllegalArgumentException("Must be monotonically increasing.");
            }
            this.r[n3++] = n2 = n5;
        }
        this.r[n3] = 0x110000;
    }

    public lf(String string) {
        this();
        this.a(string, null, null, 1);
    }

    public lf(String string, boolean bl2) {
        this();
        this.a(string, null, null, bl2 ? 1 : 0);
    }

    public lf(String string, int n2) {
        this();
        this.a(string, null, null, n2);
    }

    public lf(String string, ParsePosition parsePosition, jy jy2) {
        this();
        this.a(string, parsePosition, jy2, 1);
    }

    public lf(String string, ParsePosition parsePosition, jy jy2, int n2) {
        this();
        this.a(string, parsePosition, jy2, n2);
    }

    public Object clone() {
        lf lf2 = new lf(this);
        lf2.B = this.B;
        lf2.C = this.C;
        return lf2;
    }

    public lf a(int n2, int n3) {
        this.q();
        this.g();
        this.f(n2, n3);
        return this;
    }

    public lf b(lf lf2) {
        this.q();
        this.r = (int[])lf2.r.clone();
        this.q = lf2.q;
        this.u = lf2.u;
        this.i = new TreeSet(lf2.i);
        return this;
    }

    public final lf a(String string) {
        this.q();
        return this.a(string, null, null, 1);
    }

    public lf a(String string, boolean bl2) {
        this.q();
        return this.a(string, null, null, bl2 ? 1 : 0);
    }

    public lf a(String string, int n2) {
        this.q();
        return this.a(string, null, null, n2);
    }

    public static boolean b(String string, int n2) {
        return n2 + 1 < string.length() && string.charAt(n2) == '[' || lf.e(string, n2);
    }

    private static void a(StringBuffer stringBuffer, String string, boolean bl2) {
        int n2;
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(n2)) {
            n2 = string.codePointAt(i2);
            lf.a(stringBuffer, n2, bl2);
        }
    }

    private static void a(StringBuffer stringBuffer, int n2, boolean bl2) {
        if (bl2 && jd.a(n2) && jd.a(stringBuffer, n2)) {
            return;
        }
        switch (n2) {
            case 36: 
            case 38: 
            case 45: 
            case 58: 
            case 91: 
            case 92: 
            case 93: 
            case 94: 
            case 123: 
            case 125: {
                stringBuffer.append('\\');
                break;
            }
            default: {
                if (!eb.c(n2)) break;
                stringBuffer.append('\\');
            }
        }
        kx.f(stringBuffer, n2);
    }

    public String a(boolean bl2) {
        StringBuffer stringBuffer = new StringBuffer();
        return this.b(stringBuffer, bl2).toString();
    }

    private StringBuffer b(StringBuffer stringBuffer, boolean bl2) {
        if (this.u != null) {
            int n2 = 0;
            int n3 = 0;
            while (n3 < this.u.length()) {
                int n4 = kx.a(this.u, n3);
                n3 += kx.a(n4);
                if (bl2 && jd.a(n4)) {
                    if (n2 % 2 != 0) {
                        stringBuffer.setLength(stringBuffer.length() - 1);
                    }
                    jd.a(stringBuffer, n4);
                    n2 = 0;
                    continue;
                }
                kx.f(stringBuffer, n4);
                if (n4 == 92) {
                    ++n2;
                    continue;
                }
                n2 = 0;
            }
            return stringBuffer;
        }
        return this.a(stringBuffer, bl2, true);
    }

    public StringBuffer a(StringBuffer stringBuffer, boolean bl2) {
        return this.a(stringBuffer, bl2, true);
    }

    public StringBuffer a(StringBuffer stringBuffer, boolean bl2, boolean bl3) {
        int n2;
        int n3;
        int n4;
        stringBuffer.append('[');
        int n5 = this.h();
        if (n5 > 1 && this.i(0) == 0 && this.j(n5 - 1) == 0x10FFFF) {
            stringBuffer.append('^');
            for (n4 = 1; n4 < n5; ++n4) {
                n3 = this.j(n4 - 1) + 1;
                n2 = this.i(n4) - 1;
                lf.a(stringBuffer, n3, bl2);
                if (n3 == n2) continue;
                if (n3 + 1 != n2) {
                    stringBuffer.append('-');
                }
                lf.a(stringBuffer, n2, bl2);
            }
        } else {
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = this.i(n4);
                n2 = this.j(n4);
                lf.a(stringBuffer, n3, bl2);
                if (n3 == n2) continue;
                if (n3 + 1 != n2) {
                    stringBuffer.append('-');
                }
                lf.a(stringBuffer, n2, bl2);
            }
        }
        if (bl3 && this.i.size() > 0) {
            for (String string : this.i) {
                stringBuffer.append('{');
                lf.a(stringBuffer, string, bl2);
                stringBuffer.append('}');
            }
        }
        return stringBuffer.append(']');
    }

    public int a() {
        int n2 = 0;
        int n3 = this.h();
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 += this.j(i2) - this.i(i2) + 1;
        }
        return n2 + this.i.size();
    }

    public boolean b() {
        return this.q == 1 && this.i.size() == 0;
    }

    public boolean a(int n2) {
        int n3;
        for (int i2 = 0; i2 < this.h(); ++i2) {
            int n4 = this.i(i2);
            if (!((n4 & 0xFFFFFF00) == ((n3 = this.j(i2)) & 0xFFFFFF00) ? (n4 & 0xFF) <= n2 && n2 <= (n3 & 0xFF) : (n4 & 0xFF) <= n2 || n2 <= (n3 & 0xFF))) continue;
            return true;
        }
        if (this.i.size() != 0) {
            for (String string : this.i) {
                n3 = kx.a(string, 0);
                if ((n3 & 0xFF) != n2) continue;
                return true;
            }
        }
        return false;
    }

    public int a(iq iq2, int[] arrn, int n2, boolean bl2) {
        if (arrn[0] == n2) {
            if (this.b(65535)) {
                return bl2 ? 1 : 2;
            }
            return 0;
        }
        if (this.i.size() != 0) {
            boolean bl3 = arrn[0] < n2;
            char c2 = iq2.a(arrn[0]);
            int n3 = 0;
            for (String string : this.i) {
                char c3 = string.charAt(bl3 ? 0 : string.length() - 1);
                if (bl3 && c3 > c2) break;
                if (c3 != c2) continue;
                int n4 = lf.a(iq2, arrn[0], n2, string);
                if (bl2) {
                    int n5;
                    int n6 = n5 = bl3 ? n2 - arrn[0] : arrn[0] - n2;
                    if (n4 == n5) {
                        return 1;
                    }
                }
                if (n4 != string.length()) continue;
                if (n4 > n3) {
                    n3 = n4;
                }
                if (!bl3 || n4 >= n3) continue;
                break;
            }
            if (n3 != 0) {
                arrn[0] = arrn[0] + (bl3 ? n3 : -n3);
                return 2;
            }
        }
        return super.a(iq2, arrn, n2, bl2);
    }

    private static int a(iq iq2, int n2, int n3, String string) {
        int n4;
        int n5 = string.length();
        if (n2 < n3) {
            n4 = n3 - n2;
            if (n4 > n5) {
                n4 = n5;
            }
            for (int i2 = 1; i2 < n4; ++i2) {
                if (iq2.a(n2 + i2) == string.charAt(i2)) continue;
                return 0;
            }
        } else {
            n4 = n2 - n3;
            if (n4 > n5) {
                n4 = n5;
            }
            --n5;
            for (int i3 = 1; i3 < n4; ++i3) {
                if (iq2.a(n2 - i3) == string.charAt(n5 - i3)) continue;
                return 0;
            }
        }
        return n4;
    }

    public int a(CharSequence charSequence, int n2) {
        int n3;
        int n4;
        block4: {
            n4 = -1;
            if (this.i.size() != 0) {
                int n5;
                n3 = charSequence.charAt(n2);
                String string = null;
                Iterator iterator = this.i.iterator();
                while (iterator.hasNext()) {
                    string = (String)iterator.next();
                    n5 = string.charAt(0);
                    if (n5 < n3 || n5 <= n3) continue;
                    break block4;
                }
                while (n4 <= (n5 = lf.a(charSequence, n2, string))) {
                    n4 = n5;
                    if (!iterator.hasNext()) break;
                    string = (String)iterator.next();
                }
            }
        }
        if (n4 < 2 && this.b(n3 = kx.a(charSequence, n2))) {
            n4 = kx.a(n3);
        }
        return n2 + n4;
    }

    private static int a(CharSequence charSequence, int n2, CharSequence charSequence2) {
        int n3 = charSequence2.length();
        int n4 = charSequence.length();
        if (n4 + n2 > n3) {
            return -1;
        }
        int n5 = 0;
        int n6 = n2;
        while (n5 < n3) {
            char c2;
            char c3 = charSequence2.charAt(n5);
            if (c3 != (c2 = charSequence.charAt(n6))) {
                return -1;
            }
            ++n5;
            ++n6;
        }
        return n5;
    }

    public void a(lf lf2) {
        lf2.f(this);
    }

    public int c(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        int n3 = 0;
        int n4 = 0;
        int n5;
        while (n2 >= (n5 = this.r[n3++])) {
            int n6;
            if (n2 < (n6 = this.r[n3++])) {
                return n4 + n2 - n5;
            }
            n4 += n6 - n5;
        }
        return -1;
    }

    public int d(int n2) {
        if (n2 >= 0) {
            int n3 = this.q & 0xFFFFFFFE;
            int n4 = 0;
            while (n4 < n3) {
                int n5;
                int n6;
                if (n2 < (n6 = this.r[n4++] - (n5 = this.r[n4++]))) {
                    return n5 + n2;
                }
                n2 -= n6;
            }
        }
        return -1;
    }

    public lf b(int n2, int n3) {
        this.q();
        return this.k(n2, n3);
    }

    public lf c(int n2, int n3) {
        this.q();
        return this.k(n2, n3);
    }

    private lf k(int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        if (n2 < n3) {
            this.b(this.l(n2, n3), 2, 0);
        } else if (n2 == n3) {
            this.e(n2);
        }
        return this;
    }

    public final lf e(int n2) {
        this.q();
        return this.l(n2);
    }

    private final lf l(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        int n3 = this.m(n2);
        if ((n3 & 1) != 0) {
            return this;
        }
        if (n2 == this.r[n3] - 1) {
            this.r[n3] = n2;
            if (n2 == 0x10FFFF) {
                this.n(this.q + 1);
                this.r[this.q++] = 0x110000;
            }
            if (n3 > 0 && n2 == this.r[n3 - 1]) {
                System.arraycopy(this.r, n3 + 1, this.r, n3 - 1, this.q - n3 - 1);
                this.q -= 2;
            }
        } else if (n3 > 0 && n2 == this.r[n3 - 1]) {
            int n4 = n3 - 1;
            this.r[n4] = this.r[n4] + 1;
        } else {
            if (this.q + 2 > this.r.length) {
                int[] arrn = new int[this.q + 2 + 16];
                if (n3 != 0) {
                    System.arraycopy(this.r, 0, arrn, 0, n3);
                }
                System.arraycopy(this.r, n3, arrn, n3 + 2, this.q - n3);
                this.r = arrn;
            } else {
                System.arraycopy(this.r, n3, this.r, n3 + 2, this.q - n3);
            }
            this.r[n3] = n2;
            this.r[n3 + 1] = n2 + 1;
            this.q += 2;
        }
        this.u = null;
        return this;
    }

    public final lf a(CharSequence charSequence) {
        this.q();
        int n2 = lf.d(charSequence);
        if (n2 < 0) {
            this.i.add(((Object)charSequence).toString());
            this.u = null;
        } else {
            this.k(n2, n2);
        }
        return this;
    }

    private static int d(CharSequence charSequence) {
        if (charSequence.length() < 1) {
            throw new IllegalArgumentException("Can't use zero-length strings in UnicodeSet");
        }
        if (charSequence.length() > 2) {
            return -1;
        }
        if (charSequence.length() == 1) {
            return charSequence.charAt(0);
        }
        int n2 = kx.a(charSequence, 0);
        if (n2 > 65535) {
            return n2;
        }
        return -1;
    }

    public final lf b(CharSequence charSequence) {
        int n2;
        this.q();
        for (int i2 = 0; i2 < charSequence.length(); i2 += kx.a(n2)) {
            n2 = kx.a(charSequence, i2);
            this.k(n2, n2);
        }
        return this;
    }

    public final lf b(String string) {
        return this.g(lf.f(string));
    }

    public final lf c(String string) {
        return this.i(lf.f(string));
    }

    public final lf d(String string) {
        return this.h(lf.f(string));
    }

    public final lf c() {
        this.q();
        if (this.i.size() != 0) {
            this.i.clear();
            this.u = null;
        }
        return this;
    }

    public static lf e(String string) {
        return new lf().a((CharSequence)string);
    }

    public static lf f(String string) {
        return new lf().b((CharSequence)string);
    }

    public lf d(int n2, int n3) {
        this.q();
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        if (n2 <= n3) {
            this.c(this.l(n2, n3), 2, 0);
        } else {
            this.g();
        }
        return this;
    }

    public final lf f(int n2) {
        return this.d(n2, n2);
    }

    public final lf g(String string) {
        int n2 = lf.d(string);
        if (n2 < 0) {
            boolean bl2 = this.i.contains(string);
            if (bl2 && this.a() == 1) {
                return this;
            }
            this.g();
            this.i.add(string);
            this.u = null;
        } else {
            this.d(n2, n2);
        }
        return this;
    }

    public lf e(int n2, int n3) {
        this.q();
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        if (n2 <= n3) {
            this.c(this.l(n2, n3), 2, 2);
        }
        return this;
    }

    public final lf g(int n2) {
        return this.e(n2, n2);
    }

    public final lf h(String string) {
        int n2 = lf.d(string);
        if (n2 < 0) {
            this.i.remove(string);
            this.u = null;
        } else {
            this.e(n2, n2);
        }
        return this;
    }

    public lf f(int n2, int n3) {
        this.q();
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        if (n2 <= n3) {
            this.a(this.l(n2, n3), 2, 0);
        }
        this.u = null;
        return this;
    }

    public final lf h(int n2) {
        return this.f(n2, n2);
    }

    public lf d() {
        this.q();
        if (this.r[0] == 0) {
            System.arraycopy(this.r, 1, this.r, 0, this.q - 1);
            --this.q;
        } else {
            this.n(this.q + 1);
            System.arraycopy(this.r, 0, this.r, 1, this.q);
            this.r[0] = 0;
            ++this.q;
        }
        this.u = null;
        return this;
    }

    public final lf i(String string) {
        this.q();
        int n2 = lf.d(string);
        if (n2 < 0) {
            if (this.i.contains(string)) {
                this.i.remove(string);
            } else {
                this.i.add(string);
            }
            this.u = null;
        } else {
            this.f(n2, n2);
        }
        return this;
    }

    public boolean b(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (this.B != null) {
            return this.B.a(n2);
        }
        if (this.C != null) {
            return this.C.a(n2);
        }
        int n3 = this.m(n2);
        return (n3 & 1) != 0;
    }

    private final int m(int n2) {
        if (n2 < this.r[0]) {
            return 0;
        }
        if (this.q >= 2 && n2 >= this.r[this.q - 2]) {
            return this.q - 1;
        }
        int n3 = 0;
        int n4 = this.q - 1;
        int n5;
        while ((n5 = n3 + n4 >>> 1) != n3) {
            if (n2 < this.r[n5]) {
                n4 = n5;
                continue;
            }
            n3 = n5;
        }
        return n4;
    }

    public boolean g(int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        int n4 = this.m(n2);
        return (n4 & 1) != 0 && n3 < this.r[n4];
    }

    public final boolean j(String string) {
        int n2 = lf.d(string);
        if (n2 < 0) {
            return this.i.contains(string);
        }
        return this.b(n2);
    }

    public boolean c(lf lf2) {
        block6: {
            int[] arrn = lf2.r;
            boolean bl2 = true;
            boolean bl3 = true;
            int n2 = 0;
            int n3 = 0;
            int n4 = this.q - 1;
            int n5 = lf2.q - 1;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            while (true) {
                if (bl2) {
                    if (n2 >= n4) {
                        if (!bl3 || n3 < n5) {
                            return false;
                        }
                        break block6;
                    }
                    n6 = this.r[n2++];
                    n8 = this.r[n2++];
                }
                if (bl3) {
                    if (n3 >= n5) break block6;
                    n7 = arrn[n3++];
                    n9 = arrn[n3++];
                }
                if (n7 >= n8) {
                    bl2 = true;
                    bl3 = false;
                    continue;
                }
                if (n7 < n6 || n9 > n8) break;
                bl2 = false;
                bl3 = true;
            }
            return false;
        }
        return this.i.containsAll(lf2.i);
    }

    public boolean k(String string) {
        int n2;
        for (int i2 = 0; i2 < string.length(); i2 += kx.a(n2)) {
            n2 = kx.a(string, i2);
            if (this.b(n2)) continue;
            if (this.i.size() == 0) {
                return false;
            }
            return this.d(string, 0);
        }
        return true;
    }

    private boolean d(String string, int n2) {
        if (n2 >= string.length()) {
            return true;
        }
        int n3 = kx.a(string, n2);
        if (this.b(n3) && this.d(string, n2 + kx.a(n3))) {
            return true;
        }
        for (String string2 : this.i) {
            if (!string.startsWith(string2, n2) || !this.d(string, n2 + string2.length())) continue;
            return true;
        }
        return false;
    }

    public String e() {
        if (this.i.size() == 0) {
            return this.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("(?:");
        this.a(stringBuffer, true, false);
        for (String string : this.i) {
            stringBuffer.append('|');
            lf.a(stringBuffer, string, true);
        }
        return stringBuffer.append(")").toString();
    }

    public boolean h(int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n2, 6));
        }
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point U+" + jd.a((long)n3, 6));
        }
        int n4 = -1;
        while (n2 >= this.r[++n4]) {
        }
        return (n4 & 1) == 0 && n3 < this.r[n4];
    }

    public boolean d(lf lf2) {
        block4: {
            int[] arrn = lf2.r;
            boolean bl2 = true;
            boolean bl3 = true;
            int n2 = 0;
            int n3 = 0;
            int n4 = this.q - 1;
            int n5 = lf2.q - 1;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            while (true) {
                if (bl2) {
                    if (n2 >= n4) break block4;
                    n6 = this.r[n2++];
                    n8 = this.r[n2++];
                }
                if (bl3) {
                    if (n3 >= n5) break block4;
                    n7 = arrn[n3++];
                    n9 = arrn[n3++];
                }
                if (n7 >= n8) {
                    bl2 = true;
                    bl3 = false;
                    continue;
                }
                if (n6 < n9) break;
                bl2 = false;
                bl3 = true;
            }
            return false;
        }
        return fa.a(this.i, 5, lf2.i);
    }

    public boolean l(String string) {
        return this.a((CharSequence)string, lm.a) == string.length();
    }

    public final boolean i(int n2, int n3) {
        return !this.h(n2, n3);
    }

    public final boolean e(lf lf2) {
        return !this.d(lf2);
    }

    public final boolean m(String string) {
        return !this.l(string);
    }

    public lf f(lf lf2) {
        this.q();
        this.b(lf2.r, lf2.q, 0);
        this.i.addAll(lf2.i);
        return this;
    }

    public lf g(lf lf2) {
        this.q();
        this.c(lf2.r, lf2.q, 0);
        this.i.retainAll(lf2.i);
        return this;
    }

    public lf h(lf lf2) {
        this.q();
        this.c(lf2.r, lf2.q, 2);
        this.i.removeAll(lf2.i);
        return this;
    }

    public lf i(lf lf2) {
        this.q();
        this.a(lf2.r, lf2.q, 0);
        fa.b(this.i, 5, lf2.i);
        return this;
    }

    public lf g() {
        this.q();
        this.r[0] = 0x110000;
        this.q = 1;
        this.u = null;
        this.i.clear();
        return this;
    }

    public int h() {
        return this.q / 2;
    }

    public int i(int n2) {
        return this.r[n2 * 2];
    }

    public int j(int n2) {
        return this.r[n2 * 2 + 1] - 1;
    }

    public lf k() {
        this.q();
        if (this.q != this.r.length) {
            int[] arrn = new int[this.q];
            System.arraycopy(this.r, 0, arrn, 0, this.q);
            this.r = arrn;
        }
        this.s = null;
        this.t = null;
        return this;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        try {
            lf lf2 = (lf)object;
            if (this.q != lf2.q) {
                return false;
            }
            for (int i2 = 0; i2 < this.q; ++i2) {
                if (this.r[i2] == lf2.r[i2]) continue;
                return false;
            }
            if (!this.i.equals(lf2.i)) {
                return false;
            }
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.q;
        for (int i2 = 0; i2 < this.q; ++i2) {
            n2 *= 1000003;
            n2 += this.r[i2];
        }
        return n2;
    }

    public String toString() {
        return this.a(true);
    }

    public lf a(String string, ParsePosition parsePosition, jy jy2, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = parsePosition == null;
        if (bl2) {
            parsePosition = new ParsePosition(0);
        }
        StringBuffer stringBuffer = new StringBuffer();
        ev ev2 = new ev(string, jy2, parsePosition);
        this.a(ev2, jy2, stringBuffer, n2);
        if (ev2.c()) {
            lf.a(ev2, "Extra chars in variable value");
        }
        this.u = stringBuffer.toString();
        if (bl2) {
            int n3 = parsePosition.getIndex();
            if ((n2 & 1) != 0) {
                n3 = eb.a(string, n3);
            }
            if (n3 != string.length()) {
                throw new IllegalArgumentException("Parse of \"" + string + "\" failed at " + n3);
            }
        }
        return this;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    void a(ev var1_1, jy var2_2, StringBuffer var3_3, int var4_4) {
        var5_5 = 3;
        if ((var4_4 & 1) != 0) {
            var5_5 |= 4;
        }
        var6_6 = new StringBuffer();
        var7_7 = null;
        var8_8 = false;
        var9_9 = null;
        var10_10 = null;
        var11_11 = '\u0000';
        var12_12 = 0;
        var13_13 = 0;
        var14_14 = '\u0000';
        var15_15 = false;
        this.g();
        block25: while (var13_13 != 2 && !var1_1.a()) {
            block68: {
                block67: {
                    var16_16 = 0;
                    var17_17 = false;
                    var18_18 = null;
                    var19_19 = 0;
                    if (!lf.a(var1_1, var5_5)) break block67;
                    var19_19 = 2;
                    break block68;
                }
                var10_10 = var1_1.a(var10_10);
                var16_16 = var1_1.a(var5_5);
                var17_17 = var1_1.b();
                if (var16_16 != 91 || var17_17) ** GOTO lbl51
                if (var13_13 == 1) {
                    var1_1.b(var10_10);
                    var19_19 = 1;
                } else {
                    var13_13 = 1;
                    var6_6.append('[');
                    var10_10 = var1_1.a(var10_10);
                    var16_16 = var1_1.a(var5_5);
                    var17_17 = var1_1.b();
                    if (var16_16 == 94 && !var17_17) {
                        var15_15 = true;
                        var6_6.append('^');
                        var10_10 = var1_1.a(var10_10);
                        var16_16 = var1_1.a(var5_5);
                        var17_17 = var1_1.b();
                    }
                    if (var16_16 == 45) {
                        var17_17 = true;
                    } else {
                        var1_1.b(var10_10);
                        continue;
lbl51:
                        // 1 sources

                        if (var2_2 != null && (var20_20 = var2_2.a(var16_16)) != null) {
                            try {
                                var18_18 = (lf)var20_20;
                                var19_19 = 3;
                            }
                            catch (ClassCastException var21_22) {
                                lf.a(var1_1, "Syntax error");
                            }
                        }
                    }
                }
            }
            if (var19_19 != 0) {
                if (var11_11 == '\u0001') {
                    if (var14_14 != '\u0000') {
                        lf.a(var1_1, "Char expected after operator");
                    }
                    this.k(var12_12, var12_12);
                    lf.a(var6_6, var12_12, false);
                    var14_14 = '\u0000';
                    var11_11 = '\u0000';
                }
                if (var14_14 == '-' || var14_14 == '&') {
                    var6_6.append(var14_14);
                }
                if (var18_18 == null) {
                    if (var9_9 == null) {
                        var9_9 = new lf();
                    }
                    var18_18 = var9_9;
                }
                switch (var19_19) {
                    case 1: {
                        var18_18.a(var1_1, var2_2, var6_6, var4_4);
                        break;
                    }
                    case 2: {
                        var1_1.b(var5_5);
                        var18_18.a(var1_1, var6_6, var2_2);
                        break;
                    }
                    case 3: {
                        var18_18.b(var6_6, false);
                        break;
                    }
                }
                var8_8 = true;
                if (var13_13 == 0) {
                    this.b(var18_18);
                    var13_13 = 2;
                    break;
                }
                switch (var14_14) {
                    case '-': {
                        this.h(var18_18);
                        break;
                    }
                    case '&': {
                        this.g(var18_18);
                        break;
                    }
                    case '\u0000': {
                        this.f(var18_18);
                        break;
                    }
                }
                var14_14 = '\u0000';
                var11_11 = '\u0002';
                continue;
            }
            if (var13_13 == 0) {
                lf.a(var1_1, "Missing '['");
            }
            if (!var17_17) {
                switch (var16_16) {
                    case 93: {
                        if (var11_11 == '\u0001') {
                            this.k(var12_12, var12_12);
                            lf.a(var6_6, var12_12, false);
                        }
                        if (var14_14 == '-') {
                            this.k(var14_14, var14_14);
                            var6_6.append(var14_14);
                        } else if (var14_14 == '&') {
                            lf.a(var1_1, "Trailing '&'");
                        }
                        var6_6.append(']');
                        var13_13 = 2;
                        continue block25;
                    }
                    case 45: {
                        if (var14_14 == '\u0000') {
                            if (var11_11 != '\u0000') {
                                var14_14 = (char)var16_16;
                                continue block25;
                            }
                            this.k(var16_16, var16_16);
                            var16_16 = var1_1.a(var5_5);
                            var17_17 = var1_1.b();
                            if (var16_16 == 93 && !var17_17) {
                                var6_6.append("-]");
                                var13_13 = 2;
                                continue block25;
                            }
                        }
                        lf.a(var1_1, "'-' not after char or set");
                        break;
                    }
                    case 38: {
                        if (var11_11 == '\u0002' && var14_14 == '\u0000') {
                            var14_14 = (char)var16_16;
                            continue block25;
                        }
                        lf.a(var1_1, "'&' not after set");
                        break;
                    }
                    case 94: {
                        lf.a(var1_1, "'^' not after '['");
                        break;
                    }
                    case 123: {
                        if (var14_14 != '\u0000') {
                            lf.a(var1_1, "Missing operand after operator");
                        }
                        if (var11_11 == '\u0001') {
                            this.k(var12_12, var12_12);
                            lf.a(var6_6, var12_12, false);
                        }
                        var11_11 = '\u0000';
                        if (var7_7 == null) {
                            var7_7 = new StringBuffer();
                        } else {
                            var7_7.setLength(0);
                        }
                        var20_21 = false;
                        while (!var1_1.a()) {
                            var16_16 = var1_1.a(var5_5);
                            var17_17 = var1_1.b();
                            if (var16_16 == 125 && !var17_17) {
                                var20_21 = true;
                                break;
                            }
                            kx.f(var7_7, var16_16);
                        }
                        if (var7_7.length() < 1 || !var20_21) {
                            lf.a(var1_1, "Invalid multicharacter string");
                        }
                        this.a((CharSequence)var7_7.toString());
                        var6_6.append('{');
                        lf.a(var6_6, var7_7.toString(), false);
                        var6_6.append('}');
                        continue block25;
                    }
                    case 36: {
                        var10_10 = var1_1.a(var10_10);
                        var16_16 = var1_1.a(var5_5);
                        var17_17 = var1_1.b();
                        v0 = var21_23 = var16_16 == 93 && var17_17 == false;
                        if (var2_2 == null && !var21_23) {
                            var16_16 = 36;
                            var1_1.b(var10_10);
                            break;
                        }
                        if (var21_23 && var14_14 == '\u0000') {
                            if (var11_11 == '\u0001') {
                                this.k(var12_12, var12_12);
                                lf.a(var6_6, var12_12, false);
                            }
                            this.l(65535);
                            var8_8 = true;
                            var6_6.append('$').append(']');
                            var13_13 = 2;
                            continue block25;
                        }
                        lf.a(var1_1, "Unquoted '$'");
                        break;
                    }
                }
            }
            switch (var11_11) {
                case '\u0000': {
                    var11_11 = '\u0001';
                    var12_12 = var16_16;
                    break;
                }
                case '\u0001': {
                    if (var14_14 == '-') {
                        if (var12_12 >= var16_16) {
                            lf.a(var1_1, "Invalid range");
                        }
                        this.k(var12_12, var16_16);
                        lf.a(var6_6, var12_12, false);
                        var6_6.append(var14_14);
                        lf.a(var6_6, var16_16, false);
                        var14_14 = '\u0000';
                        var11_11 = '\u0000';
                        break;
                    }
                    this.k(var12_12, var12_12);
                    lf.a(var6_6, var12_12, false);
                    var12_12 = var16_16;
                    break;
                }
                case '\u0002': {
                    if (var14_14 != '\u0000') {
                        lf.a(var1_1, "Set expected after operator");
                    }
                    var12_12 = var16_16;
                    var11_11 = '\u0001';
                    continue block25;
                }
            }
        }
        if (var13_13 != 2) {
            lf.a(var1_1, "Missing ']'");
        }
        var1_1.b(var5_5);
        if ((var4_4 & 2) != 0) {
            this.k(2);
        }
        if (var15_15) {
            this.d();
        }
        if (var8_8) {
            var3_3.append(var6_6.toString());
            return;
        }
        this.a(var3_3, false, true);
    }

    private static void a(ev ev2, String string) {
        throw new IllegalArgumentException("Error: " + string + " at \"" + jd.g(ev2.toString()) + '\"');
    }

    public Collection a(Collection collection) {
        return lf.a((Iterable)this, collection);
    }

    public String[] a(String[] arrstring) {
        return (String[])lf.a((Iterable)this, arrstring);
    }

    public static String[] j(lf lf2) {
        return (String[])lf.a((Iterable)lf2, new String[lf2.a()]);
    }

    public lf b(Collection collection) {
        return this.c(collection);
    }

    public lf c(Collection collection) {
        this.q();
        for (Object e2 : collection) {
            this.a((CharSequence)e2.toString());
        }
        return this;
    }

    private void n(int n2) {
        if (n2 <= this.r.length) {
            return;
        }
        int[] arrn = new int[n2 + 16];
        System.arraycopy(this.r, 0, arrn, 0, this.q);
        this.r = arrn;
    }

    private void o(int n2) {
        if (this.t != null && n2 <= this.t.length) {
            return;
        }
        this.t = new int[n2 + 16];
    }

    private int[] l(int n2, int n3) {
        if (this.s == null) {
            this.s = new int[]{n2, n3 + 1, 0x110000};
        } else {
            this.s[0] = n2;
            this.s[1] = n3 + 1;
        }
        return this.s;
    }

    private lf a(int[] arrn, int n2, int n3) {
        int n4;
        this.o(this.q + n2);
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = this.r[n5++];
        if (n3 == 1 || n3 == 2) {
            n4 = 0;
            if (arrn[n6] == 0) {
                n4 = arrn[++n6];
            }
        } else {
            n4 = arrn[n6++];
        }
        while (true) {
            if (n8 < n4) {
                this.t[n7++] = n8;
                n8 = this.r[n5++];
                continue;
            }
            if (n4 < n8) {
                this.t[n7++] = n4;
                n4 = arrn[n6++];
                continue;
            }
            if (n8 == 0x110000) break;
            n8 = this.r[n5++];
            n4 = arrn[n6++];
        }
        this.t[n7++] = 0x110000;
        this.q = n7;
        int[] arrn2 = this.r;
        this.r = this.t;
        this.t = arrn2;
        this.u = null;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lf b(int[] arrn, int n2, int n3) {
        this.o(this.q + n2);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = this.r[n4++];
        int n8 = arrn[n5++];
        block6: while (true) {
            switch (n3) {
                case 0: {
                    if (n7 < n8) {
                        if (n6 > 0 && n7 <= this.t[n6 - 1]) {
                            n7 = lf.m(this.r[n4], this.t[--n6]);
                        } else {
                            this.t[n6++] = n7;
                            n7 = this.r[n4];
                        }
                        ++n4;
                        n3 ^= 1;
                        break;
                    }
                    if (n8 < n7) {
                        if (n6 > 0 && n8 <= this.t[n6 - 1]) {
                            n8 = lf.m(arrn[n5], this.t[--n6]);
                        } else {
                            this.t[n6++] = n8;
                            n8 = arrn[n5];
                        }
                        ++n5;
                        n3 ^= 2;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    if (n6 > 0 && n7 <= this.t[n6 - 1]) {
                        n7 = lf.m(this.r[n4], this.t[--n6]);
                    } else {
                        this.t[n6++] = n7;
                        n7 = this.r[n4];
                    }
                    ++n4;
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 3: {
                    if (n8 <= n7) {
                        if (n7 == 0x110000) break block6;
                        this.t[n6++] = n7;
                    } else {
                        if (n8 == 0x110000) break block6;
                        this.t[n6++] = n8;
                    }
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 1: {
                    if (n7 < n8) {
                        this.t[n6++] = n7;
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n8 < n7) {
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 2: {
                    if (n8 < n7) {
                        this.t[n6++] = n8;
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 < n8) {
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                }
            }
        }
        this.t[n6++] = 0x110000;
        this.q = n6;
        int[] arrn2 = this.r;
        this.r = this.t;
        this.t = arrn2;
        this.u = null;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lf c(int[] arrn, int n2, int n3) {
        this.o(this.q + n2);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = this.r[n4++];
        int n8 = arrn[n5++];
        block6: while (true) {
            switch (n3) {
                case 0: {
                    if (n7 < n8) {
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n8 < n7) {
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    this.t[n6++] = n7;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 3: {
                    if (n7 < n8) {
                        this.t[n6++] = n7;
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n8 < n7) {
                        this.t[n6++] = n8;
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    this.t[n6++] = n7;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 1: {
                    if (n7 < n8) {
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n8 < n7) {
                        this.t[n6++] = n8;
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                    break;
                }
                case 2: {
                    if (n8 < n7) {
                        n8 = arrn[n5++];
                        n3 ^= 2;
                        break;
                    }
                    if (n7 < n8) {
                        this.t[n6++] = n7;
                        n7 = this.r[n4++];
                        n3 ^= 1;
                        break;
                    }
                    if (n7 == 0x110000) break block6;
                    n7 = this.r[n4++];
                    n3 ^= 1;
                    n8 = arrn[n5++];
                    n3 ^= 2;
                }
            }
        }
        this.t[n6++] = 0x110000;
        this.q = n6;
        int[] arrn2 = this.r;
        this.r = this.t;
        this.t = arrn2;
        this.u = null;
        return this;
    }

    private static final int m(int n2, int n3) {
        return n2 > n3 ? n2 : n3;
    }

    private static synchronized lf p(int n2) {
        if (A == null) {
            A = new lf[12];
        }
        if (A[n2] == null) {
            lf lf2 = new lf();
            switch (n2) {
                case 1: {
                    hk.a.a(lf2);
                    break;
                }
                case 2: {
                    hk.a.b(lf2);
                    break;
                }
                case 6: {
                    hk.a.a(lf2);
                    hk.a.b(lf2);
                    break;
                }
                case 7: {
                    di.a().a.a(lf2);
                    ha.h.a(lf2);
                    break;
                }
                case 8: {
                    di.a().a.a(lf2);
                    break;
                }
                case 9: {
                    di.b().a.a(lf2);
                    break;
                }
                case 10: {
                    di.c().a.a(lf2);
                    break;
                }
                case 11: {
                    di.a().a.b(lf2);
                    break;
                }
                case 4: {
                    ha.h.a(lf2);
                    break;
                }
                case 5: {
                    gx.a.a(lf2);
                    break;
                }
                default: {
                    throw new IllegalStateException("UnicodeSet.getInclusions(unknown src " + n2 + ")");
                }
            }
            lf.A[n2] = lf2;
        }
        return A[n2];
    }

    private lf a(lh lh2, int n2) {
        this.g();
        int n3 = -1;
        lf lf2 = lf.p(n2);
        int n4 = lf2.h();
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = lf2.i(i2);
            int n6 = lf2.j(i2);
            for (int i3 = n5; i3 <= n6; ++i3) {
                if (lh2.a(i3)) {
                    if (n3 >= 0) continue;
                    n3 = i3;
                    continue;
                }
                if (n3 < 0) continue;
                this.k(n3, i3 - 1);
                n3 = -1;
            }
        }
        if (n3 >= 0) {
            this.k(n3, 0x10FFFF);
        }
        return this;
    }

    private static String n(String string) {
        string = eb.a(string);
        StringBuilder stringBuilder = null;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n2 = string.charAt(i2);
            if (eb.c(n2)) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder().append(string, 0, i2);
                } else if (stringBuilder.charAt(stringBuilder.length() - 1) == ' ') continue;
                n2 = 32;
            }
            if (stringBuilder == null) continue;
            stringBuilder.append((char)n2);
        }
        return stringBuilder == null ? string : stringBuilder.toString();
    }

    public lf j(int n2, int n3) {
        this.q();
        if (n2 == 8192) {
            this.a(new li(n3), 1);
        } else if (n2 == 28672) {
            this.a(new ll(n3), 2);
        } else {
            this.a(new lj(n2, n3), hk.a.e(n2));
        }
        return this;
    }

    public lf a(String string, String string2) {
        return this.a(string, string2, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public lf a(String var1_1, String var2_2, jy var3_3) {
        block23: {
            block21: {
                block22: {
                    this.q();
                    var6_4 = false;
                    var7_5 = false;
                    if (var3_3 != null && var3_3 instanceof lp && ((lp)var3_3).a(var1_1, var2_2, this)) {
                        return this;
                    }
                    if (lf.n != null && lf.n.a(var1_1, var2_2, this)) {
                        return this;
                    }
                    if (var2_2.length() <= 0) break block21;
                    var4_6 = b.a((CharSequence)var1_1);
                    if (var4_6 == 4101) {
                        var4_6 = 8192;
                    }
                    if (!(var4_6 >= 0 && var4_6 < 57 || var4_6 >= 4096 && var4_6 < 4117) && (var4_6 < 8192 || var4_6 >= 8193)) break block22;
                    try {
                        var5_7 = b.a(var4_6, (CharSequence)var2_2);
                    }
                    catch (IllegalArgumentException var8_8) {
                        if (var4_6 != 4098 && var4_6 != 4112) {
                            if (var4_6 != 4113) throw var8_8;
                        }
                        if ((var5_7 = Integer.parseInt(eb.a(var2_2))) < 0) throw var8_8;
                        if (var5_7 <= 255) ** GOTO lbl75
                        throw var8_8;
                    }
                }
                switch (var4_6) {
                    case 12288: {
                        var8_9 = Double.parseDouble(eb.a(var2_2));
                        this.a(new lk(var8_9), 1);
                        return this;
                    }
                    case 16389: {
                        var8_10 = lf.n(var2_2);
                        var9_13 = b.d(var8_10);
                        if (var9_13 == -1) {
                            throw new IllegalArgumentException("Invalid character name");
                        }
                        this.g();
                        this.l(var9_13);
                        return this;
                    }
                    case 16395: {
                        throw new IllegalArgumentException("Unicode_1_Name (na1) not supported");
                    }
                    case 16384: {
                        var8_11 = VersionInfo.a(lf.n(var2_2));
                        this.a(new lo(var8_11), 2);
                        return this;
                    }
                    case 28672: {
                        var5_7 = b.a(4106, (CharSequence)var2_2);
                        break block23;
                    }
                    default: {
                        throw new IllegalArgumentException("Unsupported property");
                    }
                }
            }
            var8_12 = com.ibm.icu.a.iq.a;
            var4_6 = 8192;
            var5_7 = var8_12.a(var4_6, (CharSequence)var1_1);
            if (var5_7 == -1 && (var5_7 = var8_12.a(var4_6 = 4106, (CharSequence)var1_1)) == -1) {
                var4_6 = var8_12.a(var1_1);
                if (var4_6 == -1) {
                    var4_6 = -1;
                }
                if (var4_6 >= 0 && var4_6 < 57) {
                    var5_7 = 1;
                } else {
                    if (var4_6 != -1) throw new IllegalArgumentException("Missing property value");
                    if (0 == com.ibm.icu.a.iq.a("ANY", var1_1)) {
                        this.a(0, 0x10FFFF);
                        return this;
                    }
                    if (0 == com.ibm.icu.a.iq.a("ASCII", var1_1)) {
                        this.a(0, 127);
                        return this;
                    }
                    if (0 != com.ibm.icu.a.iq.a("Assigned", var1_1)) throw new IllegalArgumentException("Invalid property alias: " + var1_1 + "=" + var2_2);
                    var4_6 = 8192;
                    var5_7 = 1;
                    var7_5 = true;
                }
            }
        }
        this.j(var4_6, var5_7);
        if (var7_5) {
            this.d();
        }
        if (var6_4 == false) return this;
        if (this.b() == false) return this;
        throw new IllegalArgumentException("Invalid property value");
    }

    private static boolean e(String string, int n2) {
        if (n2 + 5 > string.length()) {
            return false;
        }
        return string.regionMatches(n2, "[:", 0, 2) || string.regionMatches(true, n2, "\\p", 0, 2) || string.regionMatches(n2, "\\N", 0, 2);
    }

    private static boolean a(ev ev2, int n2) {
        boolean bl2 = false;
        Object object = ev2.a(null);
        int n3 = ev2.a(n2 &= 0xFFFFFFFD);
        if (n3 == 91 || n3 == 92) {
            int n4 = ev2.a(n2 & 0xFFFFFFFB);
            bl2 = n3 == 91 ? n4 == 58 : n4 == 78 || n4 == 112 || n4 == 80;
        }
        ev2.b(object);
        return bl2;
    }

    private lf a(String string, ParsePosition parsePosition, jy jy2) {
        String string2;
        String string3;
        int n2;
        int n3 = parsePosition.getIndex();
        if (n3 + 5 > string.length()) {
            return null;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (string.regionMatches(n3, "[:", 0, 2)) {
            bl2 = true;
            if ((n3 = eb.a(string, n3 + 2)) < string.length() && string.charAt(n3) == '^') {
                ++n3;
                bl4 = true;
            }
        } else if (string.regionMatches(true, n3, "\\p", 0, 2) || string.regionMatches(n3, "\\N", 0, 2)) {
            n2 = string.charAt(n3 + 1);
            bl4 = n2 == 80;
            bl3 = n2 == 78;
            n3 = eb.a(string, n3 + 2);
            if (n3 == string.length() || string.charAt(n3++) != '{') {
                return null;
            }
        } else {
            return null;
        }
        if ((n2 = string.indexOf(bl2 ? ":]" : "}", n3)) < 0) {
            return null;
        }
        int n4 = string.indexOf(61, n3);
        if (n4 >= 0 && n4 < n2 && !bl3) {
            string3 = string.substring(n3, n4);
            string2 = string.substring(n4 + 1, n2);
        } else {
            string3 = string.substring(n3, n2);
            string2 = "";
            if (bl3) {
                string2 = string3;
                string3 = "na";
            }
        }
        this.a(string3, string2, jy2);
        if (bl4) {
            this.d();
        }
        parsePosition.setIndex(n2 + (bl2 ? 2 : 1));
        return this;
    }

    private void a(ev ev2, StringBuffer stringBuffer, jy jy2) {
        String string = ev2.d();
        ParsePosition parsePosition = new ParsePosition(0);
        this.a(string, parsePosition, jy2);
        if (parsePosition.getIndex() == 0) {
            lf.a(ev2, "Invalid property pattern");
        }
        ev2.c(parsePosition.getIndex());
        stringBuffer.append(string.substring(0, parsePosition.getIndex()));
    }

    private static final void a(lf lf2, int n2, StringBuilder stringBuilder) {
        if (n2 >= 0) {
            if (n2 > 31) {
                lf2.e(n2);
            } else {
                lf2.a((CharSequence)stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
    }

    public lf k(int n2) {
        this.q();
        if ((n2 & 6) != 0) {
            ha ha2 = ha.h;
            lf lf2 = new lf(this);
            dn dn2 = dn.v;
            if ((n2 & 2) != 0) {
                lf2.i.clear();
            }
            int n3 = this.h();
            StringBuilder stringBuilder = new StringBuilder();
            int[] arrn = new int[1];
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                int n5 = this.i(i2);
                int n6 = this.j(i2);
                if ((n2 & 2) != 0) {
                    for (n4 = n5; n4 <= n6; ++n4) {
                        ha2.a(n4, lf2);
                    }
                    continue;
                }
                for (n4 = n5; n4 <= n6; ++n4) {
                    int n7 = ha2.a(n4, null, stringBuilder, dn2, arrn);
                    lf.a(lf2, n7, stringBuilder);
                    n7 = ha2.c(n4, null, stringBuilder, dn2, arrn);
                    lf.a(lf2, n7, stringBuilder);
                    n7 = ha2.b(n4, null, stringBuilder, dn2, arrn);
                    lf.a(lf2, n7, stringBuilder);
                    n7 = ha2.a(n4, stringBuilder, 0);
                    lf.a(lf2, n7, stringBuilder);
                }
            }
            if (!this.i.isEmpty()) {
                if ((n2 & 2) != 0) {
                    for (String string : this.i) {
                        String string2 = b.a(string, 0);
                        if (ha2.a(string2, lf2)) continue;
                        lf2.a((CharSequence)string2);
                    }
                } else {
                    u u2 = com.ibm.icu.d.u.a(dn2);
                    for (String string : this.i) {
                        lf2.a((CharSequence)b.b(dn2, string));
                        lf2.a((CharSequence)b.a(dn2, string, u2));
                        lf2.a((CharSequence)b.a(dn2, string));
                        lf2.a((CharSequence)b.a(string, 0));
                    }
                }
            }
            this.b(lf2);
        }
        return this;
    }

    public boolean f() {
        return this.B != null || this.C != null;
    }

    public lf l() {
        if (!this.f()) {
            this.t = null;
            if (this.r.length > this.q + 16) {
                int n2 = this.q == 0 ? 1 : this.q;
                int[] arrn = this.r;
                this.r = new int[n2];
                int n3 = n2;
                while (n3-- > 0) {
                    this.r[n3] = arrn[n3];
                }
            }
            if (!this.i.isEmpty()) {
                this.C = new jb(this, new ArrayList(this.i), 63);
                if (!this.C.a()) {
                    this.C = null;
                }
            }
            if (this.C == null) {
                this.B = new com.ibm.icu.a.b(this.r, this.q);
            }
        }
        return this;
    }

    public int a(CharSequence charSequence, lm lm2) {
        return this.a(charSequence, 0, lm2);
    }

    public int a(CharSequence charSequence, int n2, lm lm2) {
        int n3;
        int n4;
        jb jb2;
        int n5 = charSequence.length();
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 >= n5) {
            return n5;
        }
        if (this.B != null) {
            return n2 + this.B.a(charSequence, n2, n5, lm2);
        }
        int n6 = n5 - n2;
        if (this.C != null) {
            return n2 + this.C.a(charSequence, n2, n6, lm2);
        }
        if (!this.i.isEmpty() && (jb2 = new jb(this, new ArrayList(this.i), n4 = lm2 == lm.a ? 41 : 42)).a()) {
            return n2 + jb2.a(charSequence, n2, n6, lm2);
        }
        n4 = lm2 != lm.a ? 1 : 0;
        int n7 = n2;
        while (n4 == this.b(n3 = Character.codePointAt(charSequence, n7)) && (n7 = Character.offsetByCodePoints(charSequence, n7, 1)) < n5) {
        }
        return n7;
    }

    public int b(CharSequence charSequence, lm lm2) {
        return this.b(charSequence, charSequence.length(), lm2);
    }

    public int b(CharSequence charSequence, int n2, lm lm2) {
        int n3;
        int n4;
        jb jb2;
        if (n2 <= 0) {
            return 0;
        }
        if (n2 > charSequence.length()) {
            n2 = charSequence.length();
        }
        if (this.B != null) {
            return this.B.a(charSequence, n2, lm2);
        }
        if (this.C != null) {
            return this.C.a(charSequence, n2, lm2);
        }
        if (!this.i.isEmpty() && (jb2 = new jb(this, new ArrayList(this.i), n4 = lm2 == lm.a ? 25 : 26)).a()) {
            return jb2.a(charSequence, n2, lm2);
        }
        n4 = lm2 != lm.a ? 1 : 0;
        int n5 = n2;
        while (n4 == this.b(n3 = Character.codePointBefore(charSequence, n5)) && (n5 = Character.offsetByCodePoints(charSequence, n5, -1)) > 0) {
        }
        return n5;
    }

    public lf m() {
        lf lf2 = (lf)this.clone();
        lf2.B = null;
        lf2.C = null;
        return lf2;
    }

    private void q() {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
    }

    public Iterator iterator() {
        return new ln(this);
    }

    public boolean d(Collection collection) {
        for (String string : collection) {
            if (this.j(string)) continue;
            return false;
        }
        return true;
    }

    public boolean e(Collection collection) {
        for (String string : collection) {
            if (!this.j(string)) continue;
            return false;
        }
        return true;
    }

    public final boolean f(Collection collection) {
        return !this.e(collection);
    }

    public lf b(String ... arrstring) {
        this.q();
        for (String string : arrstring) {
            this.a((CharSequence)string);
        }
        return this;
    }

    public lf g(Collection collection) {
        this.q();
        for (String string : collection) {
            this.h(string);
        }
        return this;
    }

    public lf h(Collection collection) {
        this.q();
        lf lf2 = new lf();
        lf2.c(collection);
        this.g(lf2);
        return this;
    }

    public int k(lf lf2) {
        return this.a(lf2, lg.a);
    }

    public int a(lf lf2, lg lg2) {
        int n2;
        if (lg2 != lg.b && (n2 = this.a() - lf2.a()) != 0) {
            return n2 < 0 == (lg2 == lg.a) ? -1 : 1;
        }
        int n3 = 0;
        while (true) {
            if (0 != (n2 = this.r[n3] - lf2.r[n3])) {
                if (this.r[n3] == 0x110000) {
                    if (this.i.isEmpty()) {
                        return 1;
                    }
                    String string = (String)this.i.first();
                    return lf.c(string, lf2.r[n3]);
                }
                if (lf2.r[n3] == 0x110000) {
                    if (lf2.i.isEmpty()) {
                        return -1;
                    }
                    String string = (String)lf2.i.first();
                    return -lf.c(string, this.r[n3]);
                }
                return (n3 & 1) == 0 ? n2 : -n2;
            }
            if (this.r[n3] == 0x110000) break;
            ++n3;
        }
        return lf.a((Iterable)this.i, (Iterable)lf2.i);
    }

    public int a(Iterable iterable) {
        return lf.a((Iterable)this, iterable);
    }

    public static int c(String string, int n2) {
        return com.ibm.icu.b.a.b((CharSequence)string, n2);
    }

    public static int a(int n2, String string) {
        return -com.ibm.icu.b.a.b((CharSequence)string, n2);
    }

    public static int a(Iterable iterable, Iterable iterable2) {
        return lf.a(iterable.iterator(), iterable2.iterator());
    }

    public static int a(Iterator iterator, Iterator iterator2) {
        Comparable comparable;
        Comparable comparable2;
        int n2;
        do {
            if (!iterator.hasNext()) {
                return iterator2.hasNext() ? -1 : 0;
            }
            if (iterator2.hasNext()) continue;
            return 1;
        } while ((n2 = (comparable2 = (Comparable)iterator.next()).compareTo(comparable = (Comparable)iterator2.next())) == 0);
        return n2;
    }

    public static int a(Collection collection, Collection collection2, lg lg2) {
        int n2;
        if (lg2 != lg.b && (n2 = collection.size() - collection2.size()) != 0) {
            return n2 < 0 == (lg2 == lg.a) ? -1 : 1;
        }
        return lf.a((Iterable)collection, (Iterable)collection2);
    }

    public static Collection a(Iterable iterable, Collection collection) {
        for (Object t2 : iterable) {
            collection.add(t2);
        }
        return collection;
    }

    public static Object[] a(Iterable iterable, Object[] arrobject) {
        int n2 = 0;
        for (Object t2 : iterable) {
            arrobject[n2++] = t2;
        }
        return arrobject;
    }

    public Iterable n() {
        return Collections.unmodifiableSortedSet(this.i);
    }

    public static int c(CharSequence charSequence) {
        return com.ibm.icu.b.a.b(charSequence);
    }

    public lf l(lf lf2) {
        lf lf3 = new lf(this).d();
        lq lq2 = new lq(lf3);
        while (lq2.b()) {
            if (lq2.b == 0 || lq2.b == lq.a || lq2.c == 0x10FFFF || !lf2.g(lq2.b, lq2.c)) continue;
            this.b(lq2.b, lq2.c);
        }
        return this;
    }

    public int a(CharSequence charSequence, int n2, boolean bl2) {
        int n3;
        while (n2 < charSequence.length() && this.b(n3 = kx.a(charSequence, n2)) == bl2) {
            n2 += kx.a(n3);
        }
        return n2;
    }

    public int b(CharSequence charSequence, int n2, boolean bl2) {
        int n3;
        --n2;
        while (n2 >= 0 && this.b(n3 = kx.a(charSequence, n2)) == bl2) {
            n2 -= kx.a(n3);
        }
        return n2 < 0 ? -1 : n2;
    }

    public String a(CharSequence charSequence, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < charSequence.length()) {
            int n3 = this.a(charSequence, n2, !bl2);
            stringBuilder.append(charSequence.subSequence(n2, n3));
            n2 = this.a(charSequence, n3, bl2);
        }
        return stringBuilder.toString();
    }

    public static lp o() {
        return n;
    }

    public static void a(lp lp2) {
        n = lp2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.k((lf)object);
    }

    public /* synthetic */ Object i() {
        return this.m();
    }

    public /* synthetic */ Object j() {
        return this.l();
    }

    static /* synthetic */ VersionInfo p() {
        return D;
    }

    static /* synthetic */ int m(lf lf2) {
        return lf2.q;
    }

    static /* synthetic */ int[] n(lf lf2) {
        return lf2.r;
    }
}

