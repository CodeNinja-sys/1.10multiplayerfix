/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.di;
import com.ibm.icu.a.ds;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.dy;
import com.ibm.icu.a.ha;
import com.ibm.icu.b.b;
import com.ibm.icu.d.fq;
import com.ibm.icu.d.fr;
import com.ibm.icu.d.ft;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.fy;
import com.ibm.icu.d.gb;
import com.ibm.icu.d.ge;
import com.ibm.icu.d.gf;
import com.ibm.icu.d.gh;
import com.ibm.icu.d.gj;
import com.ibm.icu.d.gk;
import com.ibm.icu.d.gm;
import com.ibm.icu.d.ku;
import com.ibm.icu.d.kx;
import java.nio.CharBuffer;
import java.text.CharacterIterator;

public final class fo
implements Cloneable {
    private ku y;
    private gm z;
    private fv A;
    private int B;
    private int C;
    private int D;
    private StringBuilder E;
    private int F;
    public static final int a = 32;
    public static final int b = -1;
    public static final fv c = new gj(null);
    public static final fv d = new gb(null);
    public static final fv e = new gh(null);
    public static final fv f;
    public static final fv g;
    public static final fv h;
    public static final fv i;
    public static final fv j;
    public static final fv k;
    public static final fv l;
    public static final fv m;
    public static final fv n;
    public static final int o = 1;
    public static final gk p;
    public static final gk q;
    public static final gk r;
    public static final int s = 0;
    public static final int t = 131072;
    public static final int u = 65536;
    public static final int v = 32768;
    public static final int w = 1;
    public static final int x = 20;
    private static final int G = 524288;

    public fo(String string, fv fv2, int n2) {
        this.y = ku.b(string);
        this.A = fv2;
        this.B = n2;
        this.z = fv2.a(n2);
        this.E = new StringBuilder();
    }

    public fo(CharacterIterator characterIterator, fv fv2, int n2) {
        this.y = ku.a((CharacterIterator)characterIterator.clone());
        this.A = fv2;
        this.B = n2;
        this.z = fv2.a(n2);
        this.E = new StringBuilder();
    }

    public fo(ku ku2, fv fv2, int n2) {
        try {
            this.y = (ku)ku2.clone();
            this.A = fv2;
            this.B = n2;
            this.z = fv2.a(n2);
            this.E = new StringBuilder();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException.toString());
        }
    }

    public Object clone() {
        try {
            fo fo2 = (fo)super.clone();
            fo2.y = (ku)this.y.clone();
            fo2.A = this.A;
            fo2.B = this.B;
            fo2.z = this.z;
            fo2.E = new StringBuilder(this.E);
            fo2.F = this.F;
            fo2.C = this.C;
            fo2.D = this.D;
            return fo2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    private static final gm a(boolean bl2, int n2) {
        return (bl2 ? h : f).a(n2);
    }

    private static final gm b(boolean bl2, int n2) {
        return (bl2 ? e : d).a(n2);
    }

    public static String a(String string, boolean bl2) {
        return fo.a(string, bl2, 0);
    }

    public static String a(String string, boolean bl2, int n2) {
        return fo.a(bl2, n2).d(string);
    }

    public static int a(char[] arrc, char[] arrc2, boolean bl2, int n2) {
        return fo.a(arrc, 0, arrc.length, arrc2, 0, arrc2.length, bl2, n2);
    }

    public static int a(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5, boolean bl2, int n6) {
        CharBuffer charBuffer = CharBuffer.wrap(arrc, n2, n3 - n2);
        fq fq2 = new fq(arrc2, n4, n5);
        fo.a(bl2, n6).a((CharSequence)charBuffer, fq2);
        return fq2.a();
    }

    public static String b(String string, boolean bl2) {
        return fo.b(string, bl2, 0);
    }

    public static String b(String string, boolean bl2, int n2) {
        return fo.b(bl2, n2).d(string);
    }

    public static int b(char[] arrc, char[] arrc2, boolean bl2, int n2) {
        return fo.b(arrc, 0, arrc.length, arrc2, 0, arrc2.length, bl2, n2);
    }

    public static int b(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5, boolean bl2, int n6) {
        CharBuffer charBuffer = CharBuffer.wrap(arrc, n2, n3 - n2);
        fq fq2 = new fq(arrc2, n4, n5);
        fo.b(bl2, n6).a((CharSequence)charBuffer, fq2);
        return fq2.a();
    }

    public static String a(String string, fv fv2, int n2) {
        return fv2.a(n2).d(string);
    }

    public static String a(String string, fv fv2) {
        return fo.a(string, fv2, 0);
    }

    public static int a(char[] arrc, char[] arrc2, fv fv2, int n2) {
        return fo.a(arrc, 0, arrc.length, arrc2, 0, arrc2.length, fv2, n2);
    }

    public static int a(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5, fv fv2, int n6) {
        CharBuffer charBuffer = CharBuffer.wrap(arrc, n2, n3 - n2);
        fq fq2 = new fq(arrc2, n4, n5);
        fv2.a(n6).a((CharSequence)charBuffer, fq2);
        return fq2.a();
    }

    public static String a(int n2, fv fv2, int n3) {
        if (fv2 == d && n3 == 0) {
            String string = di.a().a.k(n2);
            if (string == null) {
                string = kx.d(n2);
            }
            return string;
        }
        return fo.a(kx.d(n2), fv2, n3);
    }

    public static String a(int n2, fv fv2) {
        return fo.a(n2, fv2, 0);
    }

    public static gk b(String string, fv fv2) {
        return fo.b(string, fv2, 0);
    }

    public static gk b(String string, fv fv2, int n2) {
        return fv2.a(n2).b(string);
    }

    public static gk a(char[] arrc, fv fv2, int n2) {
        return fo.a(arrc, 0, arrc.length, fv2, n2);
    }

    public static gk a(char[] arrc, int n2, int n3, fv fv2, int n4) {
        CharBuffer charBuffer = CharBuffer.wrap(arrc, n2, n3 - n2);
        return fv2.a(n4).b(charBuffer);
    }

    public static boolean b(char[] arrc, int n2, int n3, fv fv2, int n4) {
        CharBuffer charBuffer = CharBuffer.wrap(arrc, n2, n3 - n2);
        return fv2.a(n4).a(charBuffer);
    }

    public static boolean c(String string, fv fv2, int n2) {
        return fv2.a(n2).a(string);
    }

    public static boolean b(int n2, fv fv2, int n3) {
        return fo.c(kx.d(n2), fv2, n3);
    }

    public static int a(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5, int n6) {
        if (arrc == null || n2 < 0 || n3 < 0 || arrc2 == null || n4 < 0 || n5 < 0 || n3 < n2 || n5 < n4) {
            throw new IllegalArgumentException();
        }
        return fo.b(CharBuffer.wrap(arrc, n2, n3 - n2), CharBuffer.wrap(arrc2, n4, n5 - n4), n6);
    }

    public static int a(String string, String string2, int n2) {
        return fo.b((CharSequence)string, string2, n2);
    }

    public static int a(char[] arrc, char[] arrc2, int n2) {
        return fo.b(CharBuffer.wrap(arrc), CharBuffer.wrap(arrc2), n2);
    }

    public static int a(int n2, int n3, int n4) {
        return fo.b((CharSequence)kx.d(n2), kx.d(n3), n4 | 0x20000);
    }

    public static int a(int n2, String string, int n3) {
        return fo.b((CharSequence)kx.d(n2), string, n3);
    }

    public static int a(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5, char[] arrc3, int n6, int n7, fv fv2, int n8) {
        if (arrc3 == null) {
            throw new IllegalArgumentException();
        }
        if (arrc2 == arrc3 && n4 < n7 && n6 < n5) {
            throw new IllegalArgumentException("overlapping right and dst ranges");
        }
        StringBuilder stringBuilder = new StringBuilder(n3 - n2 + n5 - n4 + 16);
        stringBuilder.append(arrc, n2, n3 - n2);
        CharBuffer charBuffer = CharBuffer.wrap(arrc2, n4, n5 - n4);
        fv2.a(n8).b(stringBuilder, charBuffer);
        int n9 = stringBuilder.length();
        if (n9 <= n7 - n6) {
            stringBuilder.getChars(0, n9, arrc3, n6);
            return n9;
        }
        throw new IndexOutOfBoundsException(Integer.toString(n9));
    }

    public static String b(char[] arrc, char[] arrc2, fv fv2, int n2) {
        StringBuilder stringBuilder = new StringBuilder(arrc.length + arrc2.length + 16).append(arrc);
        return fv2.a(n2).b(stringBuilder, CharBuffer.wrap(arrc2)).toString();
    }

    public static String a(String string, String string2, fv fv2, int n2) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + string2.length() + 16).append(string);
        return fv2.a(n2).b(stringBuilder, string2).toString();
    }

    public static int a(int n2, char[] arrc) {
        String string = fo.a(n2);
        int n3 = string.length();
        if (n3 != 0 && arrc != null && n3 <= arrc.length) {
            string.getChars(0, n3, arrc, 0);
        }
        return n3;
    }

    public static String a(int n2) {
        Object object;
        gm gm2 = fw.a(gf.a());
        ha ha2 = ha.h;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = ha2.a(n2, stringBuilder, 0);
        if (n3 < 0) {
            object = ((ds)gm2).a;
            if (((dt)object).b(((dt)object).a(n2)) != 0) {
                return "";
            }
            stringBuilder.appendCodePoint(n2);
        } else if (n3 > 31) {
            stringBuilder.appendCodePoint(n3);
        }
        object = gm2.d(stringBuilder);
        String string = gm2.d(com.ibm.icu.b.b.a((String)object, 0));
        if (((String)object).equals(string)) {
            return "";
        }
        return string;
    }

    public int a() {
        if (this.F < this.E.length() || this.p()) {
            return this.E.codePointAt(this.F);
        }
        return -1;
    }

    public int b() {
        if (this.F < this.E.length() || this.p()) {
            int n2 = this.E.codePointAt(this.F);
            this.F += Character.charCount(n2);
            return n2;
        }
        return -1;
    }

    public int c() {
        if (this.F > 0 || this.q()) {
            int n2 = this.E.codePointBefore(this.F);
            this.F -= Character.charCount(n2);
            return n2;
        }
        return -1;
    }

    public void d() {
        this.y.l();
        this.D = 0;
        this.C = 0;
        this.o();
    }

    public void b(int n2) {
        this.y.a(n2);
        this.C = this.D = n2;
        this.o();
    }

    public int c(int n2) {
        this.b(n2);
        return this.a();
    }

    public int e() {
        return 0;
    }

    public int f() {
        return this.k();
    }

    public int g() {
        this.d();
        return this.b();
    }

    public int h() {
        this.y.f();
        this.C = this.D = this.y.c();
        this.o();
        return this.c();
    }

    public int i() {
        if (this.F < this.E.length()) {
            return this.C;
        }
        return this.D;
    }

    public int j() {
        return 0;
    }

    public int k() {
        return this.y.b();
    }

    public void a(fv fv2) {
        this.A = fv2;
        this.z = this.A.a(this.B);
    }

    public fv l() {
        return this.A;
    }

    public void a(int n2, boolean bl2) {
        this.B = bl2 ? (this.B |= n2) : (this.B &= ~n2);
        this.z = this.A.a(this.B);
    }

    public int d(int n2) {
        if ((this.B & n2) != 0) {
            return 1;
        }
        return 0;
    }

    public int a(char[] arrc) {
        return this.y.b(arrc);
    }

    public int m() {
        return this.y.b();
    }

    public String n() {
        return this.y.i();
    }

    public void a(StringBuffer stringBuffer) {
        ku ku2 = ku.a(stringBuffer);
        if (ku2 == null) {
            throw new IllegalStateException("Could not create a new UCharacterIterator");
        }
        this.y = ku2;
        this.d();
    }

    public void b(char[] arrc) {
        ku ku2 = ku.a(arrc);
        if (ku2 == null) {
            throw new IllegalStateException("Could not create a new UCharacterIterator");
        }
        this.y = ku2;
        this.d();
    }

    public void a(String string) {
        ku ku2 = ku.b(string);
        if (ku2 == null) {
            throw new IllegalStateException("Could not create a new UCharacterIterator");
        }
        this.y = ku2;
        this.d();
    }

    public void a(CharacterIterator characterIterator) {
        ku ku2 = ku.a(characterIterator);
        if (ku2 == null) {
            throw new IllegalStateException("Could not create a new UCharacterIterator");
        }
        this.y = ku2;
        this.d();
    }

    public void a(ku ku2) {
        try {
            ku ku3 = (ku)ku2.clone();
            if (ku3 == null) {
                throw new IllegalStateException("Could not create a new UCharacterIterator");
            }
            this.y = ku3;
            this.d();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException("Could not clone the UCharacterIterator");
        }
    }

    private void o() {
        this.E.setLength(0);
        this.F = 0;
    }

    private boolean p() {
        this.o();
        this.C = this.D;
        this.y.a(this.D);
        int n2 = this.y.j();
        if (n2 < 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder().appendCodePoint(n2);
        while ((n2 = this.y.j()) >= 0) {
            if (this.z.b(n2)) {
                this.y.c(-1);
                break;
            }
            stringBuilder.appendCodePoint(n2);
        }
        this.D = this.y.c();
        this.z.a((CharSequence)stringBuilder, this.E);
        return this.E.length() != 0;
    }

    private boolean q() {
        int n2;
        this.o();
        this.D = this.C;
        this.y.a(this.C);
        StringBuilder stringBuilder = new StringBuilder();
        while ((n2 = this.y.k()) >= 0) {
            if (n2 <= 65535) {
                stringBuilder.insert(0, (char)n2);
            } else {
                stringBuilder.insert(0, Character.toChars(n2));
            }
            if (!this.z.b(n2)) continue;
        }
        this.C = this.y.c();
        this.z.a((CharSequence)stringBuilder, this.E);
        this.F = this.E.length();
        return this.E.length() != 0;
    }

    private static int b(CharSequence charSequence, CharSequence charSequence2, int n2) {
        int n3 = n2 >>> 20;
        if (((n2 |= 0x80000) & 0x20000) == 0 || (n2 & 1) != 0) {
            StringBuilder stringBuilder;
            gm gm2 = (n2 & 1) != 0 ? d.a(n3) : i.a(n3);
            int n4 = gm2.c(charSequence);
            int n5 = gm2.c(charSequence2);
            if (n4 < charSequence.length()) {
                stringBuilder = new StringBuilder(charSequence.length() + 16).append(charSequence, 0, n4);
                charSequence = gm2.a(stringBuilder, charSequence.subSequence(n4, charSequence.length()));
            }
            if (n5 < charSequence2.length()) {
                stringBuilder = new StringBuilder(charSequence2.length() + 16).append(charSequence2, 0, n5);
                charSequence2 = gm2.a(stringBuilder, charSequence2.subSequence(n5, charSequence2.length()));
            }
        }
        return fo.a(charSequence, charSequence2, n2);
    }

    private static final fr[] r() {
        return new fr[]{new fr(null), new fr(null)};
    }

    static int a(CharSequence charSequence, CharSequence charSequence2, int n2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        ha ha2;
        fr[] arrfr = null;
        fr[] arrfr2 = null;
        dt dt2 = (n2 & 0x80000) != 0 ? di.a().a : null;
        if ((n2 & 0x10000) != 0) {
            ha2 = ha.h;
            stringBuilder2 = new StringBuilder();
            stringBuilder = new StringBuilder();
        } else {
            ha2 = null;
            stringBuilder = null;
            stringBuilder2 = null;
        }
        int n3 = 0;
        int n4 = charSequence.length();
        int n5 = 0;
        int n6 = charSequence2.length();
        int n7 = 0;
        int n8 = 0;
        int n9 = -1;
        int n10 = -1;
        while (true) {
            String string;
            String string2;
            int n11;
            char c2;
            if (n10 < 0) {
                while (true) {
                    if (n3 == n4) {
                        if (n8 == 0) {
                            n10 = -1;
                            break;
                        }
                    } else {
                        n10 = charSequence.charAt(n3++);
                        break;
                    }
                    while ((charSequence = arrfr[--n8].a) == null) {
                    }
                    n3 = arrfr[n8].b;
                    n4 = charSequence.length();
                }
            }
            if (n9 < 0) {
                while (true) {
                    if (n5 == n6) {
                        if (n7 == 0) {
                            n9 = -1;
                            break;
                        }
                    } else {
                        n9 = charSequence2.charAt(n5++);
                        break;
                    }
                    while ((charSequence2 = arrfr2[--n7].a) == null) {
                    }
                    n5 = arrfr2[n7].b;
                    n6 = charSequence2.length();
                }
            }
            if (n10 == n9) {
                if (n10 < 0) {
                    return 0;
                }
                n9 = -1;
                n10 = -1;
                continue;
            }
            if (n10 < 0) {
                return -1;
            }
            if (n9 < 0) {
                return 1;
            }
            int n12 = n10;
            if (kx.a((char)n10)) {
                if (dy.a(n10)) {
                    if (n3 != n4 && Character.isLowSurrogate(c2 = charSequence.charAt(n3))) {
                        n12 = Character.toCodePoint((char)n10, c2);
                    }
                } else if (0 <= n3 - 2 && Character.isHighSurrogate(c2 = charSequence.charAt(n3 - 2))) {
                    n12 = Character.toCodePoint(c2, (char)n10);
                }
            }
            int n13 = n9;
            if (kx.a((char)n9)) {
                if (dy.a(n9)) {
                    if (n5 != n6 && Character.isLowSurrogate(c2 = charSequence2.charAt(n5))) {
                        n13 = Character.toCodePoint((char)n9, c2);
                    }
                } else if (0 <= n5 - 2 && Character.isHighSurrogate(c2 = charSequence2.charAt(n5 - 2))) {
                    n13 = Character.toCodePoint(c2, (char)n9);
                }
            }
            if (n8 == 0 && (n2 & 0x10000) != 0 && (n11 = ha2.a(n12, stringBuilder2, n2)) >= 0) {
                if (kx.a((char)n10)) {
                    if (dy.a(n10)) {
                        ++n3;
                    } else {
                        n9 = charSequence2.charAt(--n5 - 1);
                    }
                }
                if (arrfr == null) {
                    arrfr = fo.r();
                }
                arrfr[0].a = charSequence;
                arrfr[0].b = n3;
                ++n8;
                if (n11 <= 31) {
                    stringBuilder2.delete(0, stringBuilder2.length() - n11);
                } else {
                    stringBuilder2.setLength(0);
                    stringBuilder2.appendCodePoint(n11);
                }
                charSequence = stringBuilder2;
                n3 = 0;
                n4 = stringBuilder2.length();
                n10 = -1;
                continue;
            }
            if (n7 == 0 && (n2 & 0x10000) != 0 && (n11 = ha2.a(n13, stringBuilder, n2)) >= 0) {
                if (kx.a((char)n9)) {
                    if (dy.a(n9)) {
                        ++n5;
                    } else {
                        n10 = charSequence.charAt(--n3 - 1);
                    }
                }
                if (arrfr2 == null) {
                    arrfr2 = fo.r();
                }
                arrfr2[0].a = charSequence2;
                arrfr2[0].b = n5;
                ++n7;
                if (n11 <= 31) {
                    stringBuilder.delete(0, stringBuilder.length() - n11);
                } else {
                    stringBuilder.setLength(0);
                    stringBuilder.appendCodePoint(n11);
                }
                charSequence2 = stringBuilder;
                n5 = 0;
                n6 = stringBuilder.length();
                n9 = -1;
                continue;
            }
            if (n8 < 2 && (n2 & 0x80000) != 0 && (string2 = dt2.k(n12)) != null) {
                if (kx.a((char)n10)) {
                    if (dy.a(n10)) {
                        ++n3;
                    } else {
                        n9 = charSequence2.charAt(--n5 - 1);
                    }
                }
                if (arrfr == null) {
                    arrfr = fo.r();
                }
                arrfr[n8].a = charSequence;
                arrfr[n8].b = n3;
                if (++n8 < 2) {
                    arrfr[n8++].a = null;
                }
                charSequence = string2;
                n3 = 0;
                n4 = string2.length();
                n10 = -1;
                continue;
            }
            if (n7 >= 2 || (n2 & 0x80000) == 0 || (string = dt2.k(n13)) == null) break;
            if (kx.a((char)n9)) {
                if (dy.a(n9)) {
                    ++n5;
                } else {
                    n10 = charSequence.charAt(--n3 - 1);
                }
            }
            if (arrfr2 == null) {
                arrfr2 = fo.r();
            }
            arrfr2[n7].a = charSequence2;
            arrfr2[n7].b = n5;
            if (++n7 < 2) {
                arrfr2[n7++].a = null;
            }
            charSequence2 = string;
            n5 = 0;
            n6 = string.length();
            n9 = -1;
        }
        if (n10 >= 55296 && n9 >= 55296 && (n2 & 0x8000) != 0) {
            if (!(n10 <= 56319 && n3 != n4 && Character.isLowSurrogate(charSequence.charAt(n3)) || Character.isLowSurrogate((char)n10) && 0 != n3 - 1 && Character.isHighSurrogate(charSequence.charAt(n3 - 2)))) {
                n10 -= 10240;
            }
            if (!(n9 <= 56319 && n5 != n6 && Character.isLowSurrogate(charSequence2.charAt(n5)) || Character.isLowSurrogate((char)n9) && 0 != n5 - 1 && Character.isHighSurrogate(charSequence2.charAt(n5 - 2)))) {
                n9 -= 10240;
            }
        }
        return n10 - n9;
    }

    static {
        g = f = new fy(null);
        h = new ge(null);
        i = new ft(null);
        j = c;
        k = f;
        l = h;
        m = d;
        n = e;
        p = new gk(0, null);
        q = new gk(1, null);
        r = new gk(2, null);
    }
}

