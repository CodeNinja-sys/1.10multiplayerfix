/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.a.g.b;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.i.d.f;
import org.apache.a.o.a;

public class x
extends f {
    public void a(b b2, e e2) {
        super.a(b2, e2);
        String string = e2.a();
        String string2 = b2.g();
        if (string.contains(".")) {
            int n2 = new StringTokenizer(string2, ".").countTokens();
            if (x.a(string2)) {
                if (n2 < 2) {
                    throw new g("Domain attribute \"" + string2 + "\" violates the Netscape cookie specification for " + "special domains");
                }
            } else if (n2 < 3) {
                throw new g("Domain attribute \"" + string2 + "\" violates the Netscape cookie specification");
            }
        }
    }

    private static boolean a(String string) {
        String string2 = string.toUpperCase(Locale.ENGLISH);
        return string2.endsWith(".COM") || string2.endsWith(".EDU") || string2.endsWith(".NET") || string2.endsWith(".GOV") || string2.endsWith(".MIL") || string2.endsWith(".ORG") || string2.endsWith(".INT");
    }

    public boolean b(b b2, e e2) {
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        String string = e2.a();
        String string2 = b2.g();
        if (string2 == null) {
            return false;
        }
        return string.endsWith(string2);
    }
}

