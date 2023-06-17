/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.eb;
import com.ibm.icu.a.jd;
import com.ibm.icu.d.fl;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;
import java.util.ArrayList;

final class fm {
    private String b;
    private fl[] c;
    private fl d = null;
    private fl[] e = new fl[3];
    private boolean f = false;
    private boolean g = true;
    private int h = 0;
    private static final int i = 50;

    public fm(String[] arrstring, int n2) {
        String string = arrstring[n2];
        if (string.length() == 0) {
            throw new IllegalArgumentException("Empty rule set description");
        }
        if (string.charAt(0) == '%') {
            int n3 = string.indexOf(58);
            if (n3 == -1) {
                throw new IllegalArgumentException("Rule set name doesn't end in colon");
            }
            this.b = string.substring(0, n3);
            while (n3 < string.length() && eb.c(string.charAt(++n3))) {
            }
            arrstring[n2] = string = string.substring(n3);
        } else {
            this.b = "%default";
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException("Empty rule set description");
        }
        if (this.b.endsWith("@noparse")) {
            this.b = this.b.substring(0, this.b.length() - 8);
            this.g = false;
        }
    }

    public void a(String string, iu iu2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 0;
        int n3 = string.indexOf(59);
        while (n2 != -1) {
            if (n3 != -1) {
                arrayList.add(string.substring(n2, n3));
                n2 = n3 + 1;
            } else {
                if (n2 < string.length()) {
                    arrayList.add(string.substring(n2));
                }
                n2 = n3;
            }
            n3 = string.indexOf(59, n3 + 1);
        }
        ArrayList<fl> arrayList2 = new ArrayList<fl>();
        fl fl2 = null;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            Object object = fl.a((String)arrayList.get(i2), this, fl2, iu2);
            if (object instanceof fl) {
                arrayList2.add((fl)object);
                fl2 = (fl)object;
                continue;
            }
            if (!(object instanceof fl[])) continue;
            fl[] arrfl = (fl[])object;
            for (int i3 = 0; i3 < arrfl.length; ++i3) {
                arrayList2.add(arrfl[i3]);
                fl2 = arrfl[i3];
            }
        }
        arrayList = null;
        long l2 = 0L;
        int n4 = 0;
        block10: while (n4 < arrayList2.size()) {
            fl fl3 = (fl)arrayList2.get(n4);
            switch ((int)fl3.a()) {
                case 0: {
                    fl3.a(l2);
                    if (!this.f) {
                        ++l2;
                    }
                    ++n4;
                    continue block10;
                }
                case -1: {
                    this.d = fl3;
                    arrayList2.remove(n4);
                    continue block10;
                }
                case -2: {
                    this.e[0] = fl3;
                    arrayList2.remove(n4);
                    continue block10;
                }
                case -3: {
                    this.e[1] = fl3;
                    arrayList2.remove(n4);
                    continue block10;
                }
                case -4: {
                    this.e[2] = fl3;
                    arrayList2.remove(n4);
                    continue block10;
                }
            }
            if (fl3.a() < l2) {
                throw new IllegalArgumentException("Rules are not in order, base: " + fl3.a() + " < " + l2);
            }
            l2 = fl3.a();
            if (!this.f) {
                ++l2;
            }
            ++n4;
        }
        this.c = new fl[arrayList2.size()];
        arrayList2.toArray(this.c);
    }

    public void a() {
        this.f = true;
    }

    public boolean equals(Object object) {
        if (!(object instanceof fm)) {
            return false;
        }
        fm fm2 = (fm)object;
        if (!(this.b.equals(fm2.b) && jd.b(this.d, fm2.d) && jd.b(this.e[0], fm2.e[0]) && jd.b(this.e[1], fm2.e[1]) && jd.b(this.e[2], fm2.e[2]) && this.c.length == fm2.c.length && this.f == fm2.f)) {
            return false;
        }
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (this.c[i2].equals(fm2.c[i2])) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b + ":\n");
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            stringBuilder.append("    " + this.c[i2].toString() + "\n");
        }
        if (this.d != null) {
            stringBuilder.append("    " + this.d.toString() + "\n");
        }
        if (this.e[0] != null) {
            stringBuilder.append("    " + this.e[0].toString() + "\n");
        }
        if (this.e[1] != null) {
            stringBuilder.append("    " + this.e[1].toString() + "\n");
        }
        if (this.e[2] != null) {
            stringBuilder.append("    " + this.e[2].toString() + "\n");
        }
        return stringBuilder.toString();
    }

    public boolean b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return !this.b.startsWith("%%");
    }

    public boolean e() {
        return this.g;
    }

    public void a(long l2, StringBuffer stringBuffer, int n2) {
        fl fl2 = this.a(l2);
        if (++this.h >= 50) {
            this.h = 0;
            throw new IllegalStateException("Recursion limit exceeded when applying ruleSet " + this.b);
        }
        fl2.a(l2, stringBuffer, n2);
        --this.h;
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        fl fl2 = this.a(d2);
        if (++this.h >= 50) {
            this.h = 0;
            throw new IllegalStateException("Recursion limit exceeded when applying ruleSet " + this.b);
        }
        fl2.a(d2, stringBuffer, n2);
        --this.h;
    }

    private fl a(double d2) {
        if (this.f) {
            return this.b(d2);
        }
        if (d2 < 0.0) {
            if (this.d != null) {
                return this.d;
            }
            d2 = -d2;
        }
        if (d2 != Math.floor(d2)) {
            if (d2 < 1.0 && this.e[1] != null) {
                return this.e[1];
            }
            if (this.e[0] != null) {
                return this.e[0];
            }
        }
        if (this.e[2] != null) {
            return this.e[2];
        }
        return this.a(Math.round(d2));
    }

    private fl a(long l2) {
        if (this.f) {
            return this.b(l2);
        }
        if (l2 < 0L) {
            if (this.d != null) {
                return this.d;
            }
            l2 = -l2;
        }
        int n2 = 0;
        int n3 = this.c.length;
        if (n3 > 0) {
            while (n2 < n3) {
                int n4 = n2 + n3 >>> 1;
                if (this.c[n4].a() == l2) {
                    return this.c[n4];
                }
                if (this.c[n4].a() > l2) {
                    n3 = n4;
                    continue;
                }
                n2 = n4 + 1;
            }
            if (n3 == 0) {
                throw new IllegalStateException("The rule set " + this.b + " cannot format the value " + l2);
            }
            fl fl2 = this.c[n3 - 1];
            if (fl2.a((double)l2)) {
                if (n3 == 1) {
                    throw new IllegalStateException("The rule set " + this.b + " cannot roll back from the rule '" + fl2 + "'");
                }
                fl2 = this.c[n3 - 2];
            }
            return fl2;
        }
        return this.e[2];
    }

    private fl b(double d2) {
        long l2 = this.c[0].a();
        for (int i2 = 1; i2 < this.c.length; ++i2) {
            l2 = fm.a(l2, this.c[i2].a());
        }
        long l3 = Math.round(d2 * (double)l2);
        long l4 = Long.MAX_VALUE;
        int n2 = 0;
        for (int i3 = 0; i3 < this.c.length; ++i3) {
            long l5 = l3 * this.c[i3].a() % l2;
            if (l2 - l5 < l5) {
                l5 = l2 - l5;
            }
            if (l5 >= l4) continue;
            l4 = l5;
            n2 = i3;
            if (l4 == 0L) break;
        }
        if (n2 + 1 < this.c.length && this.c[n2 + 1].a() == this.c[n2].a() && (Math.round(d2 * (double)this.c[n2].a()) < 1L || Math.round(d2 * (double)this.c[n2].a()) >= 2L)) {
            ++n2;
        }
        return this.c[n2];
    }

    private static long a(long l2, long l3) {
        long l4 = l2;
        long l5 = l3;
        int n2 = 0;
        while ((l4 & 1L) == 0L && (l5 & 1L) == 0L) {
            ++n2;
            l4 >>= 1;
            l5 >>= 1;
        }
        long l6 = (l4 & 1L) == 1L ? -l5 : l4;
        while (l6 != 0L) {
            while ((l6 & 1L) == 0L) {
                l6 >>= 1;
            }
            if (l6 > 0L) {
                l4 = l6;
            } else {
                l5 = -l6;
            }
            l6 = l4 - l5;
        }
        long l7 = l4 << n2;
        return l2 / l7 * l3;
    }

    public Number a(String string, ParsePosition parsePosition, double d2) {
        int n2;
        ParsePosition parsePosition2 = new ParsePosition(0);
        Number number = 0L;
        Number number2 = null;
        if (string.length() == 0) {
            return number;
        }
        if (this.d != null) {
            number2 = this.d.a(string, parsePosition, false, d2);
            if (parsePosition.getIndex() > parsePosition2.getIndex()) {
                number = number2;
                parsePosition2.setIndex(parsePosition.getIndex());
            }
            parsePosition.setIndex(0);
        }
        for (n2 = 0; n2 < 3; ++n2) {
            if (this.e[n2] == null) continue;
            number2 = this.e[n2].a(string, parsePosition, false, d2);
            if (parsePosition.getIndex() > parsePosition2.getIndex()) {
                number = number2;
                parsePosition2.setIndex(parsePosition.getIndex());
            }
            parsePosition.setIndex(0);
        }
        for (n2 = this.c.length - 1; n2 >= 0 && parsePosition2.getIndex() < string.length(); --n2) {
            if (!this.f && (double)this.c[n2].a() >= d2) continue;
            number2 = this.c[n2].a(string, parsePosition, this.f, d2);
            if (parsePosition.getIndex() > parsePosition2.getIndex()) {
                number = number2;
                parsePosition2.setIndex(parsePosition.getIndex());
            }
            parsePosition.setIndex(0);
        }
        parsePosition.setIndex(parsePosition2.getIndex());
        return number;
    }
}

