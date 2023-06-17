/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.di;
import com.ibm.icu.a.dj;
import com.ibm.icu.a.dt;

final class dr {
    private di a;
    private RuntimeException b;

    private dr(String string) {
        try {
            dt dt2 = new dt().a("data/icudt51b/" + string + ".nrm");
            this.a = new di(dt2, null);
        }
        catch (RuntimeException runtimeException) {
            this.b = runtimeException;
        }
    }

    static /* synthetic */ RuntimeException a(dr dr2) {
        return dr2.b;
    }

    static /* synthetic */ di b(dr dr2) {
        return dr2.a;
    }

    /* synthetic */ dr(String string, dj dj2) {
        this(string);
    }
}

