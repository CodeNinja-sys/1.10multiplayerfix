/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.cp;
import java.util.Date;

public final class cr {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    private static final cr f = new cr(null, null, Long.MIN_VALUE, Long.MAX_VALUE, false);

    private cr(String string, String string2, long l2, long l3, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = bl2;
    }

    public static cr a() {
        return f;
    }

    public static cr b() {
        return f.b(new Date());
    }

    public static cr a(String string) {
        return f.c(string);
    }

    public static cr b(String string) {
        return f.d(string);
    }

    public static cr a(Date date) {
        return f.b(date);
    }

    public static cr a(Date date, Date date2) {
        return f.b(date, date2);
    }

    public static cr a(long l2) {
        return f.b(l2);
    }

    public static cr a(long l2, long l3) {
        return f.b(l2, l3);
    }

    public static cr c() {
        return f.d();
    }

    public cr c(String string) {
        return new cr(string, this.b, this.c, this.d, this.e);
    }

    public cr d(String string) {
        return new cr(this.a, string, this.c, this.d, this.e);
    }

    public cr b(Date date) {
        return new cr(this.a, this.b, date.getTime(), date.getTime(), this.e);
    }

    public cr b(Date date, Date date2) {
        long l2 = date == null ? Long.MIN_VALUE : date.getTime();
        long l3 = date2 == null ? Long.MAX_VALUE : date2.getTime();
        return new cr(this.a, this.b, l2, l3, this.e);
    }

    public cr b(long l2) {
        return new cr(this.a, this.b, l2, l2, this.e);
    }

    public cr b(long l2, long l3) {
        return new cr(this.a, this.b, l2, l3, this.e);
    }

    public cr d() {
        return new cr(this.a, this.b, this.c, this.d, true);
    }

    public boolean equals(Object object) {
        return object instanceof cr && this.a((cr)object);
    }

    public boolean a(cr cr2) {
        return this == cr2 || cr2 != null && cr.a(this.a, cr2.a) && cr.a(this.b, cr2.b) && this.c == cr2.c && this.d == cr2.d && this.e == cr2.e;
    }

    public int hashCode() {
        int n2 = 0;
        if (this.a != null) {
            n2 = this.a.hashCode();
        }
        if (this.b != null) {
            n2 = n2 * 31 + this.b.hashCode();
        }
        n2 = n2 * 31 + (int)this.c;
        n2 = n2 * 31 + (int)(this.c >>> 32);
        n2 = n2 * 31 + (int)this.d;
        n2 = n2 * 31 + (int)(this.d >>> 32);
        n2 = n2 * 31 + (this.e ? 1 : 0);
        return n2;
    }

    public String toString() {
        return cp.a(this);
    }

    private static boolean a(String string, String string2) {
        return string == string2 || string != null && string.equals(string2);
    }
}

