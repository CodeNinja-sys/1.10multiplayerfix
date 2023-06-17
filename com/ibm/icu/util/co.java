/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.au;
import com.ibm.icu.util.bf;
import com.ibm.icu.util.n;
import java.util.Date;

public class co
implements au {
    private static bf a = new bf();
    private n b = a;
    private int c;
    private int d;
    private int e;

    public co(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.e = 0;
    }

    co(int n2, int n3, n n4) {
        this.c = n2;
        this.d = n3;
        this.e = 0;
        this.b = n4;
    }

    public co(int n2, int n3, int n4, boolean bl2) {
        this.c = n2;
        this.d = n3;
        this.e = bl2 ? n4 : -n4;
    }

    public Date a(Date date) {
        return this.c(date, null);
    }

    public Date a(Date date, Date date2) {
        return this.c(date, date2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(Date date) {
        n n2;
        n n3 = n2 = this.b;
        synchronized (n3) {
            n2.a(date);
            int n4 = n2.b(6);
            n2.a(this.a(n2.b(1), n2));
            return n2.b(6) == n4;
        }
    }

    public boolean b(Date date, Date date2) {
        return this.a(date, date2) != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Date c(Date date, Date date2) {
        n n2;
        n n3 = n2 = this.b;
        synchronized (n3) {
            n2.a(date);
            int n4 = n2.b(1);
            int n5 = n2.b(2);
            if (n5 > this.c) {
                ++n4;
            }
            Date date3 = this.a(n4, n2);
            if (n5 == this.c && date3.before(date)) {
                date3 = this.a(n4 + 1, n2);
            }
            if (date2 != null && date3.after(date2)) {
                return null;
            }
            return date3;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Date a(int n2, n n3) {
        n n4 = n3;
        synchronized (n4) {
            n3.i();
            n3.d(0, n3.n(0));
            n3.d(1, n2);
            n3.d(2, this.c);
            n3.d(5, this.d);
            if (this.e != 0) {
                n3.a(n3.g());
                int n5 = n3.b(7);
                int n6 = 0;
                n6 = this.e > 0 ? (this.e - n5 + 7) % 7 : -((this.e + n5 + 7) % 7);
                n3.f(5, n6);
            }
            return n3.g();
        }
    }
}

