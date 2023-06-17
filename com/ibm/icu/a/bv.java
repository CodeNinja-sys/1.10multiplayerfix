/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.am;
import com.ibm.icu.a.bp;
import com.ibm.icu.a.bq;
import com.ibm.icu.a.bw;
import com.ibm.icu.a.ex;
import java.io.InputStream;

class bv
extends ex {
    private bv() {
    }

    protected bp a(bw bw2, bw bw3) {
        String string = bp.a(bw3.a, bw3.b);
        InputStream inputStream = am.a(bw3.c, string);
        if (inputStream == null) {
            return bp.e();
        }
        return new bp(inputStream, bw3.a, bw3.b, bw3.c, null);
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((bw)object, (bw)object2);
    }

    /* synthetic */ bv(bq bq2) {
        this();
    }
}

