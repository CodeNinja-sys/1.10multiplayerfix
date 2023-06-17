/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.am;
import com.ibm.icu.a.as;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ce;
import com.ibm.icu.d.it;
import com.ibm.icu.d.u;
import com.ibm.icu.d.w;
import com.ibm.icu.d.y;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.io.IOException;
import java.io.InputStream;
import java.text.StringCharacterIterator;
import java.util.Locale;
import java.util.MissingResourceException;

final class x
extends w {
    static final as a = new y();
    private static final String[] b = new String[]{"grapheme", "word", "line", "sentence", "title"};

    x() {
    }

    public Object a(u u2, dn dn2, int n2) {
        u2.a(new StringCharacterIterator(""));
        return a.a((Object)u2, dn2, n2);
    }

    public boolean a(Object object) {
        if (a.j()) {
            return false;
        }
        return a.b((ce)object);
    }

    public Locale[] a() {
        if (a == null) {
            return bc.f();
        }
        return a.a();
    }

    public dn[] b() {
        if (a == null) {
            return bc.e();
        }
        return a.b();
    }

    public u a(dn dn2, int n2) {
        if (a.j()) {
            return x.c(dn2, n2);
        }
        dn[] arrdn = new dn[1];
        u u2 = (u)a.a(dn2, n2, arrdn);
        u2.a(arrdn[0], arrdn[0]);
        return u2;
    }

    private static u c(dn dn2, int n2) {
        Object object;
        it it2 = null;
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b/brkitr", dn2);
        InputStream inputStream = null;
        try {
            object = b[n2];
            String string = bc2.f("boundaries/" + (String)object);
            String string2 = "data/icudt51b/brkitr/" + string;
            inputStream = am.b(string2);
        }
        catch (Exception exception) {
            throw new MissingResourceException(exception.toString(), "", "");
        }
        try {
            it2 = it.a(inputStream);
        }
        catch (IOException iOException) {
            com.ibm.icu.a.a.a(iOException);
        }
        object = dn.a(bc2.getLocale());
        it2.a((dn)object, (dn)object);
        it2.e(n2);
        return it2;
    }

    static /* synthetic */ u b(dn dn2, int n2) {
        return x.c(dn2, n2);
    }
}

