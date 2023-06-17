/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aa;
import com.a.a.b.ab;
import com.a.a.b.ac;
import com.a.a.b.ad;
import com.a.a.b.af;
import com.a.a.b.ag;
import com.a.a.b.ah;
import com.a.a.b.ai;
import com.a.a.b.ck;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.df;
import com.a.a.b.n;
import com.a.a.b.o;
import com.a.a.b.p;
import com.a.a.b.q;
import com.a.a.b.r;
import com.a.a.b.s;
import com.a.a.b.t;
import com.a.a.b.u;
import com.a.a.b.v;
import com.a.a.b.w;
import com.a.a.b.x;
import com.a.a.b.y;
import com.a.a.b.z;
import java.util.Arrays;
import java.util.BitSet;

public abstract class m
implements cm {
    public static final m a = new n();
    public static final m b = com.a.a.b.m.a('\u0000', '\u007f', "CharMatcher.ASCII");
    private static final String s = "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10";
    private static final String t;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    final String n;
    private static final int u = 65536;
    static final String o = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";
    static final int p = 1682554634;
    static final int q;
    public static final m r;

    private static String d(char c2) {
        String string = "0123456789ABCDEF";
        char[] arrc = new char[]{'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for (int i2 = 0; i2 < 4; ++i2) {
            arrc[5 - i2] = string.charAt(c2 & 0xF);
            c2 = (char)(c2 >> 4);
        }
        return String.copyValueOf(arrc);
    }

    public static m a(char c2) {
        String string = "CharMatcher.is('" + com.a.a.b.m.d(c2) + "')";
        return new ab(string, c2);
    }

    public static m b(char c2) {
        String string = "CharMatcher.isNot('" + com.a.a.b.m.d(c2) + "')";
        return new o(string, c2);
    }

    public static m a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0: {
                return m;
            }
            case 1: {
                return com.a.a.b.m.a(charSequence.charAt(0));
            }
            case 2: {
                return com.a.a.b.m.b(charSequence.charAt(0), charSequence.charAt(1));
            }
        }
        char[] arrc = charSequence.toString().toCharArray();
        Arrays.sort(arrc);
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c2 : arrc) {
            stringBuilder.append(com.a.a.b.m.d(c2));
        }
        stringBuilder.append("\")");
        return new p(stringBuilder.toString(), arrc);
    }

    private static m b(char c2, char c3) {
        String string = "CharMatcher.anyOf(\"" + com.a.a.b.m.d(c2) + com.a.a.b.m.d(c3) + "\")";
        return new q(string, c2, c3);
    }

    public static m b(CharSequence charSequence) {
        return com.a.a.b.m.a(charSequence).a();
    }

    public static m a(char c2, char c3) {
        cl.a(c3 >= c2);
        String string = "CharMatcher.inRange('" + com.a.a.b.m.d(c2) + "', '" + com.a.a.b.m.d(c3) + "')";
        return com.a.a.b.m.a(c2, c3, string);
    }

    static m a(char c2, char c3, String string) {
        return new r(string, c2, c3);
    }

    public static m a(cm cm2) {
        cl.a(cm2);
        if (cm2 instanceof m) {
            return (m)cm2;
        }
        String string = "CharMatcher.forPredicate(" + cm2 + ")";
        return new s(string, cm2);
    }

    m(String string) {
        this.n = string;
    }

    protected m() {
        this.n = super.toString();
    }

    public abstract boolean c(char var1);

    public m a() {
        return new ag(this);
    }

    public m a(m m2) {
        return new ac(this, (m)cl.a(m2));
    }

    public m b(m m2) {
        return new ah(this, (m)cl.a(m2));
    }

    public m b() {
        return ck.a(this);
    }

    m a(String string) {
        throw new UnsupportedOperationException();
    }

    m c() {
        BitSet bitSet = new BitSet();
        this.a(bitSet);
        int n2 = bitSet.cardinality();
        if (n2 * 2 <= 65536) {
            return com.a.a.b.m.a(n2, bitSet, this.n);
        }
        bitSet.flip(0, 65536);
        int n3 = 65536 - n2;
        String string = ".negate()";
        String string2 = this.n.endsWith(string) ? this.n.substring(0, this.n.length() - string.length()) : this.n + string;
        return new af(this.toString(), com.a.a.b.m.a(n3, bitSet, string2));
    }

    private static m a(int n2, BitSet bitSet, String string) {
        switch (n2) {
            case 0: {
                return m;
            }
            case 1: {
                return com.a.a.b.m.a((char)bitSet.nextSetBit(0));
            }
            case 2: {
                char c2 = (char)bitSet.nextSetBit(0);
                char c3 = (char)bitSet.nextSetBit(c2 + '\u0001');
                return com.a.a.b.m.b(c2, c3);
            }
        }
        return com.a.a.b.m.a(n2, bitSet.length()) ? df.a(bitSet, string) : new ad(bitSet, string, null);
    }

    private static boolean a(int n2, int n3) {
        return n2 <= 1023 && n3 > n2 * 4 * 16;
    }

    void a(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; --i2) {
            if (!this.c((char)i2)) continue;
            bitSet.set(i2);
        }
    }

    public boolean c(CharSequence charSequence) {
        return !this.e(charSequence);
    }

    public boolean d(CharSequence charSequence) {
        for (int i2 = charSequence.length() - 1; i2 >= 0; --i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public boolean e(CharSequence charSequence) {
        return this.f(charSequence) == -1;
    }

    public int f(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            return i2;
        }
        return -1;
    }

    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        cl.b(n2, n3);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            return i2;
        }
        return -1;
    }

    public int g(CharSequence charSequence) {
        for (int i2 = charSequence.length() - 1; i2 >= 0; --i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            return i2;
        }
        return -1;
    }

    public int h(CharSequence charSequence) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (!this.c(charSequence.charAt(i2))) continue;
            ++n2;
        }
        return n2;
    }

    public String i(CharSequence charSequence) {
        String string = charSequence.toString();
        int n2 = this.f(string);
        if (n2 == -1) {
            return string;
        }
        char[] arrc = string.toCharArray();
        int n3 = 1;
        block0: while (true) {
            ++n2;
            while (n2 != arrc.length) {
                if (!this.c(arrc[n2])) {
                    arrc[n2 - n3] = arrc[n2];
                    ++n2;
                    continue;
                }
                ++n3;
                continue block0;
            }
            break;
        }
        return new String(arrc, 0, n2 - n3);
    }

    public String j(CharSequence charSequence) {
        return this.a().i(charSequence);
    }

    public String a(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int n2 = this.f(string);
        if (n2 == -1) {
            return string;
        }
        char[] arrc = string.toCharArray();
        arrc[n2] = c2;
        for (int i2 = n2 + 1; i2 < arrc.length; ++i2) {
            if (!this.c(arrc[i2])) continue;
            arrc[i2] = c2;
        }
        return new String(arrc);
    }

    public String a(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence2.length();
        if (n2 == 0) {
            return this.i(charSequence);
        }
        if (n2 == 1) {
            return this.a(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int n3 = this.f(string);
        if (n3 == -1) {
            return string;
        }
        int n4 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n4 * 3 / 2 + 16);
        int n5 = 0;
        do {
            stringBuilder.append(string, n5, n3);
            stringBuilder.append(charSequence2);
        } while ((n3 = this.a((CharSequence)string, n5 = n3 + 1)) != -1);
        stringBuilder.append(string, n5, n4);
        return stringBuilder.toString();
    }

    public String k(CharSequence charSequence) {
        int n2;
        int n3;
        int n4 = charSequence.length();
        for (n3 = 0; n3 < n4 && this.c(charSequence.charAt(n3)); ++n3) {
        }
        for (n2 = n4 - 1; n2 > n3 && this.c(charSequence.charAt(n2)); --n2) {
        }
        return charSequence.subSequence(n3, n2 + 1).toString();
    }

    public String l(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return charSequence.subSequence(i2, n2).toString();
        }
        return "";
    }

    public String m(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (this.c(charSequence.charAt(i2))) continue;
            return charSequence.subSequence(0, i2 + 1).toString();
        }
        return "";
    }

    public String b(CharSequence charSequence, char c2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c3 = charSequence.charAt(i2);
            if (!this.c(c3)) continue;
            if (!(c3 != c2 || i2 != n2 - 1 && this.c(charSequence.charAt(i2 + 1)))) {
                ++i2;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder(n2).append(charSequence.subSequence(0, i2)).append(c2);
            return this.a(charSequence, i2 + 1, n2, c2, stringBuilder, true);
        }
        return charSequence.toString();
    }

    public String c(CharSequence charSequence, char c2) {
        int n2;
        int n3;
        int n4 = charSequence.length();
        for (n3 = 0; n3 < n4 && this.c(charSequence.charAt(n3)); ++n3) {
        }
        for (n2 = n4 - 1; n2 > n3 && this.c(charSequence.charAt(n2)); --n2) {
        }
        return n3 == 0 && n2 == n4 - 1 ? this.b(charSequence, c2) : this.a(charSequence, n3, n2 + 1, c2, new StringBuilder(n2 + 1 - n3), false);
    }

    private String a(CharSequence charSequence, int n2, int n3, char c2, StringBuilder stringBuilder, boolean bl2) {
        for (int i2 = n2; i2 < n3; ++i2) {
            char c3 = charSequence.charAt(i2);
            if (this.c(c3)) {
                if (bl2) continue;
                stringBuilder.append(c2);
                bl2 = true;
                continue;
            }
            stringBuilder.append(c3);
            bl2 = false;
        }
        return stringBuilder.toString();
    }

    public boolean a(Character c2) {
        return this.c(c2.charValue());
    }

    public String toString() {
        return this.n;
    }

    static {
        StringBuilder stringBuilder = new StringBuilder("0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".length());
        for (int i2 = 0; i2 < "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".length(); ++i2) {
            stringBuilder.append((char)("0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".charAt(i2) + 9));
        }
        t = stringBuilder.toString();
        c = new ai("CharMatcher.DIGIT", "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10".toCharArray(), t.toCharArray());
        d = new u("CharMatcher.JAVA_DIGIT");
        e = new v("CharMatcher.JAVA_LETTER");
        f = new w("CharMatcher.JAVA_LETTER_OR_DIGIT");
        g = new x("CharMatcher.JAVA_UPPER_CASE");
        h = new y("CharMatcher.JAVA_LOWER_CASE");
        i = com.a.a.b.m.a('\u0000', '\u001f').b(com.a.a.b.m.a('\u007f', '\u009f')).a("CharMatcher.JAVA_ISO_CONTROL");
        j = new ai("CharMatcher.INVISIBLE", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u1680\u180e\u2000\u2028\u205f\u2066\u2067\u2068\u2069\u206a\u3000\ud800\ufeff\ufff9\ufffa".toCharArray(), " \u00a0\u00ad\u0604\u061c\u06dd\u070f\u1680\u180e\u200f\u202f\u2064\u2066\u2067\u2068\u2069\u206f\u3000\uf8ff\ufeff\ufff9\ufffb".toCharArray());
        k = new ai("CharMatcher.SINGLE_WIDTH", "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(), "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
        l = new z("CharMatcher.ANY");
        m = new aa("CharMatcher.NONE");
        q = Integer.numberOfLeadingZeros("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".length() - 1);
        r = new t("WHITESPACE");
    }
}

