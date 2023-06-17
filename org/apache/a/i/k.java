/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import org.apache.a.af;
import org.apache.a.am;
import org.apache.a.k.h;
import org.apache.a.k.i;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.v;

public class k
implements v {
    public static final k a = new k();
    private static final String[] b = new String[]{"GET"};
    private static final String[] c = new String[]{"POST", "PUT"};
    private static final String[] d = new String[]{"HEAD", "OPTIONS", "DELETE", "TRACE", "CONNECT"};

    private static boolean a(String[] arrstring, String string) {
        for (String string2 : arrstring) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public u a(am am2) {
        org.apache.a.o.a.a(am2, "Request line");
        String string = am2.a();
        if (k.a(b, string)) {
            return new i(am2);
        }
        if (k.a(c, string)) {
            return new h(am2);
        }
        if (k.a(d, string)) {
            return new i(am2);
        }
        throw new af(string + " method not supported");
    }

    public u a(String string, String string2) {
        if (k.a(b, string)) {
            return new i(string, string2);
        }
        if (k.a(c, string)) {
            return new h(string, string2);
        }
        if (k.a(d, string)) {
            return new i(string, string2);
        }
        throw new af(string + " method not supported");
    }
}

