/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.eb;
import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.io;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;

final class fl {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = -3;
    public static final int d = -4;
    private long f;
    private int g = 10;
    private short h = 0;
    private String i = null;
    private fn j = null;
    private fn k = null;
    private iu l = null;

    public static Object a(String string, fm fm2, fl fl2, iu iu2) {
        fl fl3 = new fl(iu2);
        string = fl3.a(string);
        int n2 = string.indexOf("[");
        int n3 = string.indexOf("]");
        if (n2 == -1 || n3 == -1 || n2 > n3 || fl3.a() == -3L || fl3.a() == -1L) {
            fl3.i = string;
            fl3.a(fm2, fl2, iu2);
            return fl3;
        }
        fl fl4 = null;
        StringBuilder stringBuilder = new StringBuilder();
        if (fl3.f > 0L && (double)fl3.f % Math.pow(fl3.g, fl3.h) == 0.0 || fl3.f == -2L || fl3.f == -4L) {
            fl4 = new fl(iu2);
            if (fl3.f >= 0L) {
                fl4.f = fl3.f++;
                if (!fm2.b()) {
                    // empty if block
                }
            } else if (fl3.f == -2L) {
                fl4.f = -3L;
            } else if (fl3.f == -4L) {
                fl4.f = fl3.f;
                fl3.f = -2L;
            }
            fl4.g = fl3.g;
            fl4.h = fl3.h;
            stringBuilder.append(string.substring(0, n2));
            if (n3 + 1 < string.length()) {
                stringBuilder.append(string.substring(n3 + 1));
            }
            fl4.i = stringBuilder.toString();
            fl4.a(fm2, fl2, iu2);
        }
        stringBuilder.setLength(0);
        stringBuilder.append(string.substring(0, n2));
        stringBuilder.append(string.substring(n2 + 1, n3));
        if (n3 + 1 < string.length()) {
            stringBuilder.append(string.substring(n3 + 1));
        }
        fl3.i = stringBuilder.toString();
        fl3.a(fm2, fl2, iu2);
        if (fl4 == null) {
            return fl3;
        }
        return new fl[]{fl4, fl3};
    }

    public fl(iu iu2) {
        this.l = iu2;
    }

    private String a(String string) {
        int n2 = string.indexOf(":");
        if (n2 == -1) {
            this.a(0L);
        } else {
            String string2 = string.substring(0, n2);
            ++n2;
            while (n2 < string.length() && eb.c(string.charAt(n2))) {
                ++n2;
            }
            string = string.substring(n2);
            if (string2.equals("-x")) {
                this.a(-1L);
            } else if (string2.equals("x.x")) {
                this.a(-2L);
            } else if (string2.equals("0.x")) {
                this.a(-3L);
            } else if (string2.equals("x.0")) {
                this.a(-4L);
            } else if (string2.charAt(0) >= '0' && string2.charAt(0) <= '9') {
                StringBuilder stringBuilder = new StringBuilder();
                char c2 = ' ';
                for (n2 = 0; n2 < string2.length(); ++n2) {
                    c2 = string2.charAt(n2);
                    if (c2 >= '0' && c2 <= '9') {
                        stringBuilder.append(c2);
                        continue;
                    }
                    if (c2 == 47 || c2 == '>') break;
                    if (eb.c(c2) || c2 == ',' || c2 == '.') continue;
                    throw new IllegalArgumentException("Illegal character in rule descriptor");
                }
                this.a(Long.parseLong(stringBuilder.toString()));
                if (c2 == '/') {
                    stringBuilder.setLength(0);
                    ++n2;
                    while (n2 < string2.length()) {
                        c2 = string2.charAt(n2);
                        if (c2 >= '0' && c2 <= '9') {
                            stringBuilder.append(c2);
                        } else {
                            if (c2 == '>') break;
                            if (!eb.c(c2) && c2 != ',' && c2 != '.') {
                                throw new IllegalArgumentException("Illegal character is rule descriptor");
                            }
                        }
                        ++n2;
                    }
                    this.g = Integer.parseInt(stringBuilder.toString());
                    if (this.g == 0) {
                        throw new IllegalArgumentException("Rule can't have radix of 0");
                    }
                    this.h = this.c();
                }
                if (c2 == '>') {
                    while (n2 < string2.length()) {
                        c2 = string2.charAt(n2);
                        if (c2 != '>' || this.h <= 0) {
                            throw new IllegalArgumentException("Illegal character in rule descriptor");
                        }
                        this.h = (short)(this.h - 1);
                        ++n2;
                    }
                }
            }
        }
        if (string.length() > 0 && string.charAt(0) == '\'') {
            string = string.substring(1);
        }
        return string;
    }

    private void a(fm fm2, fl fl2, iu iu2) {
        this.j = this.b(fm2, fl2, iu2);
        this.k = this.b(fm2, fl2, iu2);
    }

    private fn b(fm fm2, fl fl2, iu iu2) {
        int n2;
        fn fn2 = null;
        int n3 = this.a(new String[]{"<<", "<%", "<#", "<0", ">>", ">%", ">#", ">0", "=%", "=#", "=0"});
        if (n3 == -1) {
            return fn.a(this.i.length(), this, fl2, fm2, iu2, "");
        }
        if (this.i.substring(n3).startsWith(">>>")) {
            n2 = n3 + 2;
        } else {
            char c2 = this.i.charAt(n3);
            n2 = this.i.indexOf(c2, n3 + 1);
            if (c2 == '<' && n2 != -1 && n2 < this.i.length() - 1 && this.i.charAt(n2 + 1) == c2) {
                ++n2;
            }
        }
        if (n2 == -1) {
            return fn.a(this.i.length(), this, fl2, fm2, iu2, "");
        }
        fn2 = fn.a(n3, this, fl2, fm2, iu2, this.i.substring(n3, n2 + 1));
        this.i = this.i.substring(0, n3) + this.i.substring(n2 + 1);
        return fn2;
    }

    public final void a(long l2) {
        this.f = l2;
        if (this.f >= 1L) {
            this.g = 10;
            this.h = this.c();
            if (this.j != null) {
                this.j.a(this.g, this.h);
            }
            if (this.k != null) {
                this.k.a(this.g, this.h);
            }
        } else {
            this.g = 10;
            this.h = 0;
        }
    }

    private short c() {
        if (this.g == 0 || this.f < 1L) {
            return 0;
        }
        short s2 = (short)(Math.log(this.f) / Math.log(this.g));
        if (Math.pow(this.g, s2 + 1) <= (double)this.f) {
            return (short)(s2 + 1);
        }
        return s2;
    }

    private int a(String[] arrstring) {
        int n2 = -1;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            int n3 = this.i.indexOf(arrstring[i2]);
            if (n3 == -1 || n2 != -1 && n3 >= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object instanceof fl) {
            fl fl2 = (fl)object;
            return this.f == fl2.f && this.g == fl2.g && this.h == fl2.h && this.i.equals(fl2.i) && this.j.equals(fl2.j) && this.k.equals(fl2.k);
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f == -1L) {
            stringBuilder.append("-x: ");
        } else if (this.f == -2L) {
            stringBuilder.append("x.x: ");
        } else if (this.f == -3L) {
            stringBuilder.append("0.x: ");
        } else if (this.f == -4L) {
            stringBuilder.append("x.0: ");
        } else {
            stringBuilder.append(String.valueOf(this.f));
            if (this.g != 10) {
                stringBuilder.append('/');
                stringBuilder.append(String.valueOf(this.g));
            }
            int n2 = this.c() - this.h;
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append('>');
            }
            stringBuilder.append(": ");
        }
        if (this.i.startsWith(" ") && (this.j == null || this.j.c() != 0)) {
            stringBuilder.append("'");
        }
        StringBuilder stringBuilder2 = new StringBuilder(this.i);
        stringBuilder2.insert(this.k.c(), this.k.toString());
        stringBuilder2.insert(this.j.c(), this.j.toString());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(';');
        return stringBuilder.toString();
    }

    public final long a() {
        return this.f;
    }

    public double b() {
        return Math.pow(this.g, this.h);
    }

    public void a(long l2, StringBuffer stringBuffer, int n2) {
        stringBuffer.insert(n2, this.i);
        this.k.a(l2, stringBuffer, n2);
        this.j.a(l2, stringBuffer, n2);
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        stringBuffer.insert(n2, this.i);
        this.k.a(d2, stringBuffer, n2);
        this.j.a(d2, stringBuffer, n2);
    }

    public boolean a(double d2) {
        if (this.j.b() || this.k.b()) {
            return d2 % Math.pow(this.g, this.h) == 0.0 && (double)this.f % Math.pow(this.g, this.h) != 0.0;
        }
        return false;
    }

    public Number a(String string, ParsePosition parsePosition, boolean bl2, double d2) {
        ParsePosition parsePosition2 = new ParsePosition(0);
        String string2 = this.a(string, this.i.substring(0, this.j.c()), parsePosition2);
        int n2 = string.length() - string2.length();
        if (parsePosition2.getIndex() == 0 && this.j.c() != 0) {
            return 0L;
        }
        int n3 = 0;
        double d3 = 0.0;
        int n4 = 0;
        double d4 = Math.max(0L, this.f);
        do {
            parsePosition2.setIndex(0);
            double d5 = this.a(string2, n4, d4, this.i.substring(this.j.c(), this.k.c()), parsePosition2, this.j, d2).doubleValue();
            if (parsePosition2.getIndex() == 0 && !this.j.d()) continue;
            n4 = parsePosition2.getIndex();
            String string3 = string2.substring(parsePosition2.getIndex());
            ParsePosition parsePosition3 = new ParsePosition(0);
            d5 = this.a(string3, 0, d5, this.i.substring(this.k.c()), parsePosition3, this.k, d2).doubleValue();
            if (parsePosition3.getIndex() == 0 && !this.k.d() || n2 + parsePosition2.getIndex() + parsePosition3.getIndex() <= n3) continue;
            n3 = n2 + parsePosition2.getIndex() + parsePosition3.getIndex();
            d3 = d5;
        } while (this.j.c() != this.k.c() && parsePosition2.getIndex() > 0 && parsePosition2.getIndex() < string2.length() && parsePosition2.getIndex() != n4);
        parsePosition.setIndex(n3);
        if (bl2 && n3 > 0 && this.j.d()) {
            d3 = 1.0 / d3;
        }
        if (d3 == (double)((long)d3)) {
            return (long)d3;
        }
        return new Double(d3);
    }

    private String a(String string, String string2, ParsePosition parsePosition) {
        if (string2.length() == 0) {
            return string;
        }
        int n2 = this.a(string, string2);
        if (n2 != 0) {
            parsePosition.setIndex(parsePosition.getIndex() + n2);
            return string.substring(n2);
        }
        return string;
    }

    private Number a(String string, int n2, double d2, String string2, ParsePosition parsePosition, fn fn2, double d3) {
        if (!this.b(string2)) {
            ParsePosition parsePosition2 = new ParsePosition(0);
            int[] arrn = this.a(string, string2, n2);
            int n3 = arrn[0];
            int n4 = arrn[1];
            while (n3 >= 0) {
                String string3 = string.substring(0, n3);
                if (string3.length() > 0) {
                    Number number = fn2.a(string3, parsePosition2, d2, d3, this.l.f());
                    if (parsePosition2.getIndex() == n3) {
                        parsePosition.setIndex(n3 + n4);
                        return number;
                    }
                }
                parsePosition2.setIndex(0);
                arrn = this.a(string, string2, n3 + n4);
                n3 = arrn[0];
                n4 = arrn[1];
            }
            parsePosition.setIndex(0);
            return 0L;
        }
        ParsePosition parsePosition3 = new ParsePosition(0);
        Number number = 0L;
        Number number2 = fn2.a(string, parsePosition3, d2, d3, this.l.f());
        if (parsePosition3.getIndex() != 0 || fn2.d()) {
            parsePosition.setIndex(parsePosition3.getIndex());
            if (number2 != null) {
                number = number2;
            }
        }
        return number;
    }

    private int a(String string, String string2) {
        if (string2.length() == 0) {
            return 0;
        }
        io io2 = this.l.k();
        if (io2 != null) {
            return io2.a(string, string2);
        }
        if (string.startsWith(string2)) {
            return string2.length();
        }
        return 0;
    }

    private int[] a(String string, String string2, int n2) {
        io io2 = this.l.k();
        if (io2 == null) {
            return new int[]{string.indexOf(string2, n2), string2.length()};
        }
        return io2.a(string, string2, n2);
    }

    private boolean b(String string) {
        if (string.length() == 0) {
            return true;
        }
        io io2 = this.l.k();
        if (io2 != null) {
            return io2.a(string);
        }
        return false;
    }
}

