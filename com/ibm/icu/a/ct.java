/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cq;
import com.ibm.icu.a.cr;
import com.ibm.icu.d.dv;
import com.ibm.icu.d.el;
import com.ibm.icu.d.em;
import com.ibm.icu.util.dn;

class ct {
    private dn a;
    private em b;
    private dv c;
    private el d;

    private ct() {
    }

    public el a(dn dn2, em em2) {
        if (em2 != this.b || dv.c != this.c || !dn2.equals(this.a)) {
            this.a = dn2;
            this.b = em2;
            this.c = dv.c;
            this.d = new cq(dn2, em2);
        }
        return this.d;
    }

    public el a(dn dn2, dv ... arrdv) {
        em em2 = em.a;
        dv dv2 = dv.c;
        block4: for (dv dv3 : arrdv) {
            switch (dv3.a()) {
                case a: {
                    em2 = dv3.b() == dv.a.b() ? em.a : em.b;
                    continue block4;
                }
                case b: {
                    dv2 = dv3;
                    continue block4;
                }
            }
        }
        if (em2 != this.b || dv2 != this.c || !dn2.equals(this.a)) {
            this.a = dn2;
            this.b = em2;
            this.c = dv2;
            this.d = new cq(dn2, arrdv);
        }
        return this.d;
    }

    /* synthetic */ ct(cr cr2) {
        this();
    }
}

