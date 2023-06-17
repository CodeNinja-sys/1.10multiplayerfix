/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.d;
import com.ibm.icu.a.dj;
import com.ibm.icu.a.dk;
import com.ibm.icu.a.dl;
import com.ibm.icu.a.dm;
import com.ibm.icu.a.dn;
import com.ibm.icu.a.do;
import com.ibm.icu.a.dp;
import com.ibm.icu.a.dq;
import com.ibm.icu.a.dr;
import com.ibm.icu.a.ds;
import com.ibm.icu.a.dt;
import com.ibm.icu.d.gm;
import java.io.InputStream;

public final class di {
    public final dt a;
    public final dk b;
    public final dl c;
    public final dm d;
    public final dk e;
    private static d g = new dj();
    public static final dq f = new dq();

    private di(dt dt2) {
        this.a = dt2;
        this.b = new dk(dt2, false);
        this.c = new dl(dt2);
        this.d = new dm(dt2);
        this.e = new dk(dt2, true);
    }

    private static di a(dr dr2) {
        if (dr.a(dr2) != null) {
            throw dr.a(dr2);
        }
        return dr.b(dr2);
    }

    public static di a() {
        return di.a(dn.a());
    }

    public static di b() {
        return di.a(do.a());
    }

    public static di c() {
        return di.a(dp.a());
    }

    public static ds a(int n2) {
        switch (n2) {
            case 0: {
                return di.a().c;
            }
            case 1: {
                return di.b().c;
            }
            case 2: {
                return di.a().b;
            }
            case 3: {
                return di.b().b;
            }
        }
        return null;
    }

    public static di a(InputStream inputStream, String string) {
        dr dr2;
        if (inputStream == null && (dr2 = string.equals("nfc") ? dn.a() : (string.equals("nfkc") ? do.a() : (string.equals("nfkc_cf") ? dp.a() : null))) != null) {
            if (dr.a(dr2) != null) {
                throw dr.a(dr2);
            }
            return dr.b(dr2);
        }
        return (di)g.a(string, inputStream);
    }

    public static gm d() {
        return di.a().d;
    }

    /* synthetic */ di(dt dt2, dj dj2) {
        this(dt2);
    }
}

