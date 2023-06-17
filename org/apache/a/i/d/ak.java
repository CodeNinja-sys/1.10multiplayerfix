/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.StringTokenizer;
import org.apache.a.g.a;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.g.p;

public class ak
implements c {
    private static int[] a(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
        int[] arrn = new int[stringTokenizer.countTokens()];
        try {
            int n2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                arrn[n2] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (arrn[n2] < 0) {
                    throw new m("Invalid Port attribute.");
                }
                ++n2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new m("Invalid Port attribute: " + numberFormatException.getMessage());
        }
        return arrn;
    }

    private static boolean a(int n2, int[] arrn) {
        boolean bl2 = false;
        for (int n3 : arrn) {
            if (n2 != n3) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (o2 instanceof p) {
            p p2 = (p)o2;
            if (string != null && string.trim().length() > 0) {
                int[] arrn = ak.a(string);
                p2.a(arrn);
            }
        }
    }

    public void a(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        int n2 = e2.c();
        if (b2 instanceof a && ((a)b2).b("port") && !ak.a(n2, b2.i())) {
            throw new g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    public boolean b(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        int n2 = e2.c();
        if (b2 instanceof a && ((a)b2).b("port")) {
            if (b2.i() == null) {
                return false;
            }
            if (!ak.a(n2, b2.i())) {
                return false;
            }
        }
        return true;
    }
}

