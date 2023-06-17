/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ak;
import com.ibm.icu.a.eb;
import com.ibm.icu.d.ev;
import com.ibm.icu.d.ew;
import com.ibm.icu.d.ex;
import com.ibm.icu.d.ey;
import com.ibm.icu.util.az;
import java.util.ArrayList;
import java.util.Locale;

public final class et
implements az,
Cloneable {
    public static final int a = -1;
    public static final int b = -2;
    public static final double c = -1.23456789E8;
    private static final int e = 24;
    private ev f;
    private String g;
    private ArrayList h = new ArrayList();
    private ArrayList i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private static final ev n = ev.valueOf(ak.a("com.ibm.icu.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL"));
    private static final ew[] o = ew.values();

    public et() {
        this.f = n;
    }

    public et(ev ev2) {
        this.f = ev2;
    }

    public et(String string) {
        this.f = n;
        this.a(string);
    }

    public et a(String string) {
        this.f(string);
        this.a(0, 0, 0, ew.a);
        this.o();
        return this;
    }

    public et b(String string) {
        this.f(string);
        this.a(0, 0);
        this.o();
        return this;
    }

    public et c(String string) {
        this.f(string);
        this.a(ew.d, 0, 0);
        this.o();
        return this;
    }

    public et d(String string) {
        this.f(string);
        this.a(ew.e, 0, 0);
        this.o();
        return this;
    }

    public void a() {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to clear() a frozen MessagePattern instance.");
        }
        this.g = null;
        this.k = false;
        this.j = false;
        this.l = false;
        this.h.clear();
        if (this.i != null) {
            this.i.clear();
        }
    }

    public void a(ev ev2) {
        this.a();
        this.f = ev2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        et et2 = (et)object;
        return this.f.equals((Object)et2.f) && (this.g == null ? et2.g == null : this.g.equals(et2.g)) && this.h.equals(et2.h);
    }

    public int hashCode() {
        return (this.f.hashCode() * 37 + (this.g != null ? this.g.hashCode() : 0)) * 37 + this.h.hashCode();
    }

    public ev b() {
        return this.f;
    }

    boolean c() {
        return this.f == ev.b;
    }

    public String d() {
        return this.g;
    }

    public boolean e() {
        return this.j;
    }

    public boolean g() {
        return this.k;
    }

    public String toString() {
        return this.g;
    }

    public static int e(String string) {
        if (!eb.a((CharSequence)string)) {
            return -2;
        }
        return et.a(string, 0, string.length());
    }

    public String h() {
        int n2;
        if (!this.l) {
            return this.g;
        }
        StringBuilder stringBuilder = null;
        int n3 = n2 = this.k();
        while (n3 > 0) {
            ex ex2;
            if ((ex2 = this.a(--n3)).a() != ey.d) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(this.g.length() + 10).append(this.g);
            }
            stringBuilder.insert(ex.a(ex2), (char)ex.b(ex2));
        }
        if (stringBuilder == null) {
            return this.g;
        }
        return stringBuilder.toString();
    }

    public int k() {
        return this.h.size();
    }

    public ex a(int n2) {
        return (ex)this.h.get(n2);
    }

    public ey b(int n2) {
        return ex.c((ex)this.h.get(n2));
    }

    public int c(int n2) {
        return ex.a((ex)this.h.get(n2));
    }

    public String a(ex ex2) {
        int n2 = ex.a(ex2);
        return this.g.substring(n2, n2 + ex.d(ex2));
    }

    public boolean a(ex ex2, String string) {
        return this.g.regionMatches(ex.a(ex2), string, 0, ex.d(ex2));
    }

    public double b(ex ex2) {
        ey ey2 = ex.c(ex2);
        if (ey2 == ey.m) {
            return ex.b(ex2);
        }
        if (ey2 == ey.n) {
            return (Double)this.i.get(ex.b(ex2));
        }
        return -1.23456789E8;
    }

    public double d(int n2) {
        ex ex2 = (ex)this.h.get(n2);
        if (ex.c(ex2).a()) {
            return this.b(ex2);
        }
        return 0.0;
    }

    public int e(int n2) {
        int n3 = ex.e((ex)this.h.get(n2));
        if (n3 < n2) {
            return n2;
        }
        return n3;
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.l();
    }

    public et l() {
        et et2;
        try {
            et2 = (et)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        et2.h = (ArrayList)this.h.clone();
        if (this.i != null) {
            et2.i = (ArrayList)this.i.clone();
        }
        et2.m = false;
        return et2;
    }

    public et m() {
        this.m = true;
        return this;
    }

    public boolean f() {
        return this.m;
    }

    private void f(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to parse(" + et.g(string) + ") on frozen MessagePattern instance.");
        }
        this.g = string;
        this.k = false;
        this.j = false;
        this.l = false;
        this.h.clear();
        if (this.i != null) {
            this.i.clear();
        }
    }

    private void o() {
    }

    private int a(int n2, int n3, int n4, ew ew2) {
        if (n4 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int n5 = this.h.size();
        this.a(ey.a, n2, n3, n4);
        n2 += n3;
        block0: while (n2 < this.g.length()) {
            char c2;
            if ((c2 = this.g.charAt(n2++)) == '\'') {
                if (n2 == this.g.length()) {
                    this.a(ey.d, n2, 0, 39);
                    this.l = true;
                    continue;
                }
                c2 = this.g.charAt(n2);
                if (c2 == '\'') {
                    this.a(ey.c, n2++, 1, 0);
                    continue;
                }
                if (this.f == ev.b || c2 == '{' || c2 == '}' || ew2 == ew.c && c2 == '|' || ew2.a() && c2 == '#') {
                    this.a(ey.c, n2 - 1, 1, 0);
                    while ((n2 = this.g.indexOf(39, n2 + 1)) >= 0) {
                        if (n2 + 1 < this.g.length() && this.g.charAt(n2 + 1) == '\'') {
                            this.a(ey.c, ++n2, 1, 0);
                            continue;
                        }
                        this.a(ey.c, n2++, 1, 0);
                        continue block0;
                    }
                    n2 = this.g.length();
                    this.a(ey.d, n2, 0, 39);
                    this.l = true;
                    continue;
                }
                this.a(ey.d, n2, 0, 39);
                this.l = true;
                continue;
            }
            if (ew2.a() && c2 == '#') {
                this.a(ey.e, n2 - 1, 1, 0);
                continue;
            }
            if (c2 == '{') {
                n2 = this.a(n2 - 1, 1, n4);
                continue;
            }
            if ((n4 <= 0 || c2 != '}') && (ew2 != ew.c || c2 != '|')) continue;
            int n6 = ew2 == ew.c && c2 == '}' ? 0 : 1;
            this.a(n5, ey.b, n2 - 1, n6, n4);
            if (ew2 == ew.c) {
                return n2 - 1;
            }
            return n2;
        }
        if (n4 > 0 && !this.a(n4, ew2)) {
            throw new IllegalArgumentException("Unmatched '{' braces in message " + this.p());
        }
        this.a(n5, ey.b, n2, 0, n4);
        return n2;
    }

    private int a(int n2, int n3, int n4) {
        ew ew2;
        int n5;
        block28: {
            int n6;
            int n7;
            int n8;
            int n9;
            block30: {
                block29: {
                    n5 = this.h.size();
                    ew2 = ew.a;
                    this.a(ey.f, n2, n3, ew2.ordinal());
                    n9 = n2 = this.g(n2 + n3);
                    if (n2 == this.g.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message " + this.p());
                    }
                    int n10 = this.b(n9, n2 = this.h(n2));
                    if (n10 >= 0) {
                        n8 = n2 - n9;
                        if (n8 > 65535 || n10 > 32767) {
                            throw new IndexOutOfBoundsException("Argument number too large: " + this.p(n9));
                        }
                        this.k = true;
                        this.a(ey.h, n9, n8, n10);
                    } else if (n10 == -1) {
                        n8 = n2 - n9;
                        if (n8 > 65535) {
                            throw new IndexOutOfBoundsException("Argument name too long: " + this.p(n9));
                        }
                        this.j = true;
                        this.a(ey.i, n9, n8, 0);
                    } else {
                        throw new IllegalArgumentException("Bad argument syntax: " + this.p(n9));
                    }
                    n2 = this.g(n2);
                    if (n2 == this.g.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message " + this.p());
                    }
                    n8 = this.g.charAt(n2);
                    if (n8 == 125) break block28;
                    if (n8 != 44) {
                        throw new IllegalArgumentException("Bad argument syntax: " + this.p(n9));
                    }
                    n7 = n2 = this.g(n2 + 1);
                    while (n2 < this.g.length() && et.j(this.g.charAt(n2))) {
                        ++n2;
                    }
                    n6 = n2 - n7;
                    if ((n2 = this.g(n2)) == this.g.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message " + this.p());
                    }
                    if (n6 == 0) break block29;
                    char c2 = this.g.charAt(n2);
                    n8 = c2;
                    if (c2 == ',' || n8 == 125) break block30;
                }
                throw new IllegalArgumentException("Bad argument syntax: " + this.p(n9));
            }
            if (n6 > 65535) {
                throw new IndexOutOfBoundsException("Argument type name too long: " + this.p(n9));
            }
            ew2 = ew.b;
            if (n6 == 6) {
                if (this.k(n7)) {
                    ew2 = ew.c;
                } else if (this.l(n7)) {
                    ew2 = ew.d;
                } else if (this.m(n7)) {
                    ew2 = ew.e;
                }
            } else if (n6 == 13 && this.m(n7) && this.n(n7 + 6)) {
                ew2 = ew.f;
            }
            ex.a((ex)this.h.get(n5), (short)ew2.ordinal());
            if (ew2 == ew.b) {
                this.a(ey.j, n7, n6, 0);
            }
            if (n8 == 125) {
                if (ew2 != ew.b) {
                    throw new IllegalArgumentException("No style field for complex argument: " + this.p(n9));
                }
            } else {
                ++n2;
                n2 = ew2 == ew.b ? this.f(n2) : (ew2 == ew.c ? this.a(n2, n4) : this.a(ew2, n2, n4));
            }
        }
        this.a(n5, ey.g, n2, 1, ew2.ordinal());
        return n2 + 1;
    }

    private int f(int n2) {
        int n3 = n2;
        int n4 = 0;
        while (n2 < this.g.length()) {
            int n5;
            char c2;
            if ((c2 = this.g.charAt(n2++)) == '\'') {
                if ((n2 = this.g.indexOf(39, n2)) < 0) {
                    throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: " + this.p(n3));
                }
                ++n2;
                continue;
            }
            if (c2 == '{') {
                ++n4;
                continue;
            }
            if (c2 != '}') continue;
            if (n4 > 0) {
                --n4;
                continue;
            }
            if ((n5 = --n2 - n3) > 65535) {
                throw new IndexOutOfBoundsException("Argument style text too long: " + this.p(n3));
            }
            this.a(ey.k, n3, n5, 0);
            return n2;
        }
        throw new IllegalArgumentException("Unmatched '{' braces in message " + this.p());
    }

    private int a(int n2, int n3) {
        int n4 = n2;
        if ((n2 = this.g(n2)) == this.g.length() || this.g.charAt(n2) == '}') {
            throw new IllegalArgumentException("Missing choice argument pattern in " + this.p());
        }
        while (true) {
            int n5 = n2;
            int n6 = (n2 = this.i(n2)) - n5;
            if (n6 == 0) {
                throw new IllegalArgumentException("Bad choice pattern syntax: " + this.p(n4));
            }
            if (n6 > 65535) {
                throw new IndexOutOfBoundsException("Choice number too long: " + this.p(n5));
            }
            this.a(n5, n2, true);
            n2 = this.g(n2);
            if (n2 == this.g.length()) {
                throw new IllegalArgumentException("Bad choice pattern syntax: " + this.p(n4));
            }
            char c2 = this.g.charAt(n2);
            if (c2 != '#' && c2 != '<' && c2 != '\u2264') {
                throw new IllegalArgumentException("Expected choice separator (#<\u2264) instead of '" + c2 + "' in choice pattern " + this.p(n4));
            }
            this.a(ey.l, n2, 1, 0);
            ++n2;
            n2 = this.a(n2, 0, n3 + 1, ew.c);
            if (n2 == this.g.length()) {
                return n2;
            }
            if (this.g.charAt(n2) == '}') {
                if (!this.o(n3)) {
                    throw new IllegalArgumentException("Bad choice pattern syntax: " + this.p(n4));
                }
                return n2;
            }
            n2 = this.g(n2 + 1);
        }
    }

    private int a(ew ew2, int n2, int n3) {
        int n4 = n2;
        boolean bl2 = true;
        boolean bl3 = false;
        while (true) {
            int n5;
            boolean bl4;
            boolean bl5 = bl4 = (n2 = this.g(n2)) == this.g.length();
            if (bl4 || this.g.charAt(n2) == '}') {
                if (bl4 == this.o(n3)) {
                    throw new IllegalArgumentException("Bad " + ew2.toString().toLowerCase(Locale.ENGLISH) + " pattern syntax: " + this.p(n4));
                }
                if (!bl3) {
                    throw new IllegalArgumentException("Missing 'other' keyword in " + ew2.toString().toLowerCase(Locale.ENGLISH) + " pattern in " + this.p());
                }
                return n2;
            }
            int n6 = n2;
            if (ew2.a() && this.g.charAt(n6) == '=') {
                n5 = (n2 = this.i(n2 + 1)) - n6;
                if (n5 == 1) {
                    throw new IllegalArgumentException("Bad " + ew2.toString().toLowerCase(Locale.ENGLISH) + " pattern syntax: " + this.p(n4));
                }
                if (n5 > 65535) {
                    throw new IndexOutOfBoundsException("Argument selector too long: " + this.p(n6));
                }
                this.a(ey.l, n6, n5, 0);
                this.a(n6 + 1, n2, false);
            } else {
                n5 = (n2 = this.h(n2)) - n6;
                if (n5 == 0) {
                    throw new IllegalArgumentException("Bad " + ew2.toString().toLowerCase(Locale.ENGLISH) + " pattern syntax: " + this.p(n4));
                }
                if (ew2.a() && n5 == 6 && n2 < this.g.length() && this.g.regionMatches(n6, "offset:", 0, 7)) {
                    if (!bl2) {
                        throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: " + this.p(n4));
                    }
                    int n7 = this.g(n2 + 1);
                    if ((n2 = this.i(n7)) == n7) {
                        throw new IllegalArgumentException("Missing value for plural 'offset:' " + this.p(n4));
                    }
                    if (n2 - n7 > 65535) {
                        throw new IndexOutOfBoundsException("Plural offset value too long: " + this.p(n7));
                    }
                    this.a(n7, n2, false);
                    bl2 = false;
                    continue;
                }
                if (n5 > 65535) {
                    throw new IndexOutOfBoundsException("Argument selector too long: " + this.p(n6));
                }
                this.a(ey.l, n6, n5, 0);
                if (this.g.regionMatches(n6, "other", 0, n5)) {
                    bl3 = true;
                }
            }
            n2 = this.g(n2);
            if (n2 == this.g.length() || this.g.charAt(n2) != '{') {
                throw new IllegalArgumentException("No message fragment after " + ew2.toString().toLowerCase(Locale.ENGLISH) + " selector: " + this.p(n6));
            }
            n2 = this.a(n2, 1, n3 + 1, ew2);
            bl2 = false;
        }
    }

    private static int a(CharSequence charSequence, int n2, int n3) {
        boolean bl2;
        int n4;
        char c2;
        if (n2 >= n3) {
            return -2;
        }
        if ((c2 = charSequence.charAt(n2++)) == '0') {
            if (n2 == n3) {
                return 0;
            }
            n4 = 0;
            bl2 = true;
        } else if ('1' <= c2 && c2 <= '9') {
            n4 = c2 - 48;
            bl2 = false;
        } else {
            return -1;
        }
        while (n2 < n3) {
            if ('0' <= (c2 = charSequence.charAt(n2++)) && c2 <= '9') {
                if (n4 >= 0xCCCCCCC) {
                    bl2 = true;
                }
                n4 = n4 * 10 + (c2 - 48);
                continue;
            }
            return -1;
        }
        if (bl2) {
            return -2;
        }
        return n4;
    }

    private int b(int n2, int n3) {
        return et.a(this.g, n2, n3);
    }

    private void a(int n2, int n3, boolean bl2) {
        block10: {
            char c2;
            int n4;
            int n5;
            int n6;
            block11: {
                block9: {
                    assert (n2 < n3);
                    n6 = 0;
                    n5 = 0;
                    n4 = n2;
                    if ((c2 = this.g.charAt(n4++)) != '-') break block9;
                    n5 = 1;
                    if (n4 == n3) break block10;
                    c2 = this.g.charAt(n4++);
                    break block11;
                }
                if (c2 != '+') break block11;
                if (n4 == n3) break block10;
                c2 = this.g.charAt(n4++);
            }
            if (c2 == '\u221e') {
                if (bl2 && n4 == n3) {
                    this.a(n5 != 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY, n2, n3 - n2);
                    return;
                }
            } else {
                while ('0' <= c2 && c2 <= '9' && (n6 = n6 * 10 + (c2 - 48)) <= 32767 + n5) {
                    if (n4 == n3) {
                        this.a(ey.m, n2, n3 - n2, n5 != 0 ? -n6 : n6);
                        return;
                    }
                    c2 = this.g.charAt(n4++);
                }
                double d2 = Double.parseDouble(this.g.substring(n2, n3));
                this.a(d2, n2, n3 - n2);
                return;
            }
        }
        throw new NumberFormatException("Bad syntax for numeric value: " + this.g.substring(n2, n3));
    }

    static void a(String string, int n2, int n3, StringBuilder stringBuilder) {
        int n4 = -1;
        while (true) {
            int n5;
            if ((n5 = string.indexOf(39, n2)) < 0 || n5 >= n3) break;
            if (n5 == n4) {
                stringBuilder.append('\'');
                ++n2;
                n4 = -1;
                continue;
            }
            stringBuilder.append(string, n2, n5);
            n4 = n2 = n5 + 1;
        }
        stringBuilder.append(string, n2, n3);
    }

    private int g(int n2) {
        return eb.a(this.g, n2);
    }

    private int h(int n2) {
        return eb.b(this.g, n2);
    }

    private int i(int n2) {
        char c2;
        while (!(n2 >= this.g.length() || (c2 = this.g.charAt(n2)) < '0' && "+-.".indexOf(c2) < 0 || c2 > '9' && c2 != 'e' && c2 != 'E' && c2 != '\u221e')) {
            ++n2;
        }
        return n2;
    }

    private static boolean j(int n2) {
        return 97 <= n2 && n2 <= 122 || 65 <= n2 && n2 <= 90;
    }

    private boolean k(int n2) {
        char c2;
        return !((c2 = this.g.charAt(n2++)) != 'c' && c2 != 'C' || (c2 = this.g.charAt(n2++)) != 'h' && c2 != 'H' || (c2 = this.g.charAt(n2++)) != 'o' && c2 != 'O' || (c2 = this.g.charAt(n2++)) != 'i' && c2 != 'I' || (c2 = this.g.charAt(n2++)) != 'c' && c2 != 'C' || (c2 = this.g.charAt(n2)) != 'e' && c2 != 'E');
    }

    private boolean l(int n2) {
        char c2;
        return !((c2 = this.g.charAt(n2++)) != 'p' && c2 != 'P' || (c2 = this.g.charAt(n2++)) != 'l' && c2 != 'L' || (c2 = this.g.charAt(n2++)) != 'u' && c2 != 'U' || (c2 = this.g.charAt(n2++)) != 'r' && c2 != 'R' || (c2 = this.g.charAt(n2++)) != 'a' && c2 != 'A' || (c2 = this.g.charAt(n2)) != 'l' && c2 != 'L');
    }

    private boolean m(int n2) {
        char c2;
        return !((c2 = this.g.charAt(n2++)) != 's' && c2 != 'S' || (c2 = this.g.charAt(n2++)) != 'e' && c2 != 'E' || (c2 = this.g.charAt(n2++)) != 'l' && c2 != 'L' || (c2 = this.g.charAt(n2++)) != 'e' && c2 != 'E' || (c2 = this.g.charAt(n2++)) != 'c' && c2 != 'C' || (c2 = this.g.charAt(n2)) != 't' && c2 != 'T');
    }

    private boolean n(int n2) {
        char c2;
        return !((c2 = this.g.charAt(n2++)) != 'o' && c2 != 'O' || (c2 = this.g.charAt(n2++)) != 'r' && c2 != 'R' || (c2 = this.g.charAt(n2++)) != 'd' && c2 != 'D' || (c2 = this.g.charAt(n2++)) != 'i' && c2 != 'I' || (c2 = this.g.charAt(n2++)) != 'n' && c2 != 'N' || (c2 = this.g.charAt(n2++)) != 'a' && c2 != 'A' || (c2 = this.g.charAt(n2)) != 'l' && c2 != 'L');
    }

    private boolean o(int n2) {
        return n2 > 0 || ex.c((ex)this.h.get(0)) == ey.a;
    }

    private boolean a(int n2, ew ew2) {
        return n2 == 1 && ew2 == ew.c && ex.c((ex)this.h.get(0)) != ey.a;
    }

    private void a(ey ey2, int n2, int n3, int n4) {
        this.h.add(new ex(ey2, n2, n3, n4, null));
    }

    private void a(int n2, ey ey2, int n3, int n4, int n5) {
        ex.a((ex)this.h.get(n2), this.h.size());
        this.a(ey2, n3, n4, n5);
    }

    private void a(double d2, int n2, int n3) {
        int n4;
        if (this.i == null) {
            this.i = new ArrayList();
            n4 = 0;
        } else {
            n4 = this.i.size();
            if (n4 > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.i.add(d2);
        this.a(ey.n, n2, n3, n4);
    }

    private static String a(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder(44);
        if (n2 == 0) {
            stringBuilder.append("\"");
        } else {
            stringBuilder.append("[at pattern index ").append(n2).append("] \"");
        }
        int n3 = string.length() - n2;
        if (n3 <= 24) {
            stringBuilder.append(n2 == 0 ? string : string.substring(n2));
        } else {
            int n4 = n2 + 24 - 4;
            if (Character.isHighSurrogate(string.charAt(n4 - 1))) {
                --n4;
            }
            stringBuilder.append(string, n2, n4).append(" ...");
        }
        return stringBuilder.append("\"").toString();
    }

    private static String g(String string) {
        return et.a(string, 0);
    }

    private String p(int n2) {
        return et.a(this.g, n2);
    }

    private String p() {
        return et.a(this.g, 0);
    }

    public /* synthetic */ Object i() {
        return this.l();
    }

    public /* synthetic */ Object j() {
        return this.m();
    }

    static /* synthetic */ ew[] n() {
        return o;
    }
}

