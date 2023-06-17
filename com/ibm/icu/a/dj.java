/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.di;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.ex;
import java.io.InputStream;

final class dj
extends ex {
    dj() {
    }

    protected di a(String string, InputStream inputStream) {
        dt dt2 = inputStream == null ? new dt().a("data/icudt51b/" + string + ".nrm") : new dt().a(inputStream);
        return new di(dt2, null);
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((String)object, (InputStream)object2);
    }
}

