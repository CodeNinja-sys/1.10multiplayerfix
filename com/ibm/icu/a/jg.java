/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ex;
import com.ibm.icu.a.je;
import com.ibm.icu.a.jf;
import com.ibm.icu.util.cq;

class jg
extends ex {
    static final /* synthetic */ boolean a;

    private jg() {
    }

    protected cq a(Integer n2, int[] arrn) {
        if (!a && arrn.length != 4) {
            throw new AssertionError();
        }
        if (!a && arrn[0] != 1 && arrn[0] != -1) {
            throw new AssertionError();
        }
        if (!(a || arrn[1] >= 0 && arrn[1] <= 23)) {
            throw new AssertionError();
        }
        if (!(a || arrn[2] >= 0 && arrn[2] <= 59)) {
            throw new AssertionError();
        }
        if (!(a || arrn[3] >= 0 && arrn[3] <= 59)) {
            throw new AssertionError();
        }
        String string = je.a(arrn[1], arrn[2], arrn[3], arrn[0] < 0);
        int n3 = arrn[0] * ((arrn[1] * 60 + arrn[2]) * 60 + arrn[3]) * 1000;
        cq cq2 = new cq(n3, string);
        cq2.g();
        return cq2;
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((Integer)object, (int[])object2);
    }

    /* synthetic */ jg(jf jf2) {
        this();
    }

    static {
        a = !je.class.desiredAssertionStatus();
    }
}

