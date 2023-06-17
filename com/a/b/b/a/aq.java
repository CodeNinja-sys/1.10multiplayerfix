/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.Locale;
import java.util.StringTokenizer;

final class aq
extends an {
    aq() {
    }

    public Locale b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        String string = a2.h();
        StringTokenizer stringTokenizer = new StringTokenizer(string, "_");
        String string2 = null;
        String string3 = null;
        String string4 = null;
        if (stringTokenizer.hasMoreElements()) {
            string2 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            string3 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            string4 = stringTokenizer.nextToken();
        }
        if (string3 == null && string4 == null) {
            return new Locale(string2);
        }
        if (string4 == null) {
            return new Locale(string2, string3);
        }
        return new Locale(string2, string3, string4);
    }

    public void a(e e2, Locale locale) {
        e2.b(locale == null ? null : locale.toString());
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

