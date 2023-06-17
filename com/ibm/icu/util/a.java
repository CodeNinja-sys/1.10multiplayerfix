/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.util.av;
import com.ibm.icu.util.dl;
import java.util.Date;

public class a
extends dl {
    private static final long b = -8870666707791230688L;
    public static final int a = Integer.MAX_VALUE;
    private final av c;
    private final int d;
    private final int e;

    public a(String string, int n2, int n3, av av2, int n4, int n5) {
        super(string, n2, n3);
        this.c = av2;
        this.d = n4;
        this.e = n5 > Integer.MAX_VALUE ? Integer.MAX_VALUE : n5;
    }

    public av a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public Date a(int n2, int n3, int n4) {
        long l2;
        if (n2 < this.d || n2 > this.e) {
            return null;
        }
        int n5 = this.c.a();
        if (n5 == 0) {
            l2 = af.a(n2, this.c.b(), this.c.c());
        } else {
            int n6;
            int n7;
            boolean bl2 = true;
            if (n5 == 1) {
                n7 = this.c.e();
                if (n7 > 0) {
                    l2 = af.a(n2, this.c.b(), 1);
                    l2 += (long)(7 * (n7 - 1));
                } else {
                    bl2 = false;
                    l2 = af.a(n2, this.c.b(), af.a(n2, this.c.b()));
                    l2 += (long)(7 * (n7 + 1));
                }
            } else {
                n7 = this.c.b();
                n6 = this.c.c();
                if (n5 == 3) {
                    bl2 = false;
                    if (n7 == 1 && n6 == 29 && !af.a(n2)) {
                        --n6;
                    }
                }
                l2 = af.a(n2, n7, n6);
            }
            n7 = af.a(l2);
            n6 = this.c.d() - n7;
            n6 = bl2 ? (n6 < 0 ? n6 + 7 : n6) : (n6 > 0 ? n6 - 7 : n6);
            l2 += (long)n6;
        }
        long l3 = l2 * 86400000L + (long)this.c.g();
        if (this.c.f() != 2) {
            l3 -= (long)n3;
        }
        if (this.c.f() == 0) {
            l3 -= (long)n4;
        }
        return new Date(l3);
    }

    public Date a(int n2, int n3) {
        return this.a(this.d, n2, n3);
    }

    public Date b(int n2, int n3) {
        if (this.e == Integer.MAX_VALUE) {
            return null;
        }
        return this.a(this.e, n2, n3);
    }

    public Date a(long l2, int n2, int n3, boolean bl2) {
        int[] arrn = af.b(l2, null);
        int n4 = arrn[0];
        if (n4 < this.d) {
            return this.a(n2, n3);
        }
        Date date = this.a(n4, n2, n3);
        if (date != null && (date.getTime() < l2 || !bl2 && date.getTime() == l2)) {
            date = this.a(n4 + 1, n2, n3);
        }
        return date;
    }

    public Date b(long l2, int n2, int n3, boolean bl2) {
        int[] arrn = af.b(l2, null);
        int n4 = arrn[0];
        if (n4 > this.e) {
            return this.b(n2, n3);
        }
        Date date = this.a(n4, n2, n3);
        if (date != null && (date.getTime() > l2 || !bl2 && date.getTime() == l2)) {
            date = this.a(n4 - 1, n2, n3);
        }
        return date;
    }

    public boolean a(dl dl2) {
        if (!(dl2 instanceof a)) {
            return false;
        }
        a a2 = (a)dl2;
        if (this.d == a2.d && this.e == a2.e && this.c.equals(a2.c)) {
            return super.a(dl2);
        }
        return false;
    }

    public boolean d() {
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", rule={" + this.c + "}");
        stringBuilder.append(", startYear=" + this.d);
        stringBuilder.append(", endYear=");
        if (this.e == Integer.MAX_VALUE) {
            stringBuilder.append("max");
        } else {
            stringBuilder.append(this.e);
        }
        return stringBuilder.toString();
    }
}

