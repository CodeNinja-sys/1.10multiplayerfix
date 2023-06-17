/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.au;
import com.ibm.icu.util.cg;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ch
implements au {
    List a = new ArrayList(2);

    public void a(au au2) {
        this.a(new Date(Long.MIN_VALUE), au2);
    }

    public void a(Date date, au au2) {
        this.a.add(new cg(date, au2));
    }

    public Date a(Date date) {
        int n2 = this.c(date);
        if (n2 == this.a.size()) {
            n2 = 0;
        }
        Date date2 = null;
        cg cg2 = this.a(n2);
        cg cg3 = this.a(n2 + 1);
        if (cg2 != null && cg2.b != null) {
            date2 = cg3 != null ? cg2.b.a(date, cg3.a) : cg2.b.a(date);
        }
        return date2;
    }

    public Date a(Date date, Date date2) {
        if (date2 == null) {
            return this.a(date);
        }
        int n2 = this.c(date);
        Date date3 = null;
        cg cg2 = this.a(n2);
        while (date3 == null && cg2 != null && !cg2.a.after(date2)) {
            cg cg3 = cg2;
            cg2 = this.a(n2 + 1);
            if (cg3.b == null) continue;
            Date date4 = cg2 != null && !cg2.a.after(date2) ? cg2.a : date2;
            date3 = cg3.b.a(date, date4);
        }
        return date3;
    }

    public boolean b(Date date) {
        cg cg2 = this.a(this.c(date));
        return cg2 != null && cg2.b != null && cg2.b.b(date);
    }

    public boolean b(Date date, Date date2) {
        return this.a(date, date2) == null;
    }

    private int c(Date date) {
        int n2 = this.a.size();
        int n3 = 0;
        while (n3 < this.a.size()) {
            cg cg2 = (cg)this.a.get(n3);
            if (date.before(cg2.a)) break;
            n2 = n3++;
        }
        return n2;
    }

    private cg a(int n2) {
        return n2 < this.a.size() ? (cg)this.a.get(n2) : null;
    }
}

