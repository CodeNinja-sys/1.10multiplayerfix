/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.au;
import com.ibm.icu.util.bf;
import java.util.Date;

class ax
implements au {
    private static bf a = new bf();
    private static bf b = new bf();
    private int c;
    private bf d = a;

    public ax(int n2, boolean bl2) {
        this.c = n2;
        if (bl2) {
            b.c(new Date(Long.MAX_VALUE));
            this.d = b;
        }
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
        bf bf2 = this.d;
        synchronized (bf2) {
            this.d.a(date);
            int n2 = this.d.b(6);
            this.d.a(this.a(this.d.g(), this.d));
            return this.d.b(6) == n2;
        }
    }

    public boolean b(Date date, Date date2) {
        return this.a(date, date2) != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Date c(Date date, Date date2) {
        bf bf2 = this.d;
        synchronized (bf2) {
            Date date3 = this.a(date, this.d);
            if (date3.before(date)) {
                this.d.a(date);
                this.d.b(1);
                this.d.f(1, 1);
                date3 = this.a(this.d.g(), this.d);
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
    private Date a(Date date, bf bf2) {
        if (bf2 == null) {
            bf2 = this.d;
        }
        bf bf3 = bf2;
        synchronized (bf3) {
            int n2;
            int n3;
            bf2.a(date);
            int n4 = bf2.b(1);
            int n5 = n4 % 19;
            int n6 = 0;
            int n7 = 0;
            if (bf2.g().after(bf2.c())) {
                n3 = n4 / 100;
                n2 = (n3 - n3 / 4 - (8 * n3 + 13) / 25 + 19 * n5 + 15) % 30;
                n6 = n2 - n2 / 28 * (1 - n2 / 28 * (29 / (n2 + 1)) * ((21 - n5) / 11));
                n7 = (n4 + n4 / 4 + n6 + 2 - n3 + n3 / 4) % 7;
            } else {
                n6 = (19 * n5 + 15) % 30;
                n7 = (n4 + n4 / 4 + n6) % 7;
            }
            n3 = n6 - n7;
            n2 = 3 + (n3 + 40) / 44;
            int n8 = n3 + 28 - 31 * (n2 / 4);
            bf2.i();
            bf2.d(0, 1);
            bf2.d(1, n4);
            bf2.d(2, n2 - 1);
            bf2.d(5, n8);
            bf2.g();
            bf2.f(5, this.c);
            return bf2.g();
        }
    }
}

