/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.g;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.a.g.b;

public class d
implements Serializable,
Comparator {
    private static final long a = 4466565437490631532L;

    public int a(b b2, b b3) {
        String string;
        String string2;
        int n2 = b2.a().compareTo(b3.a());
        if (n2 == 0) {
            string2 = b2.g();
            if (string2 == null) {
                string2 = "";
            } else if (string2.indexOf(46) == -1) {
                string2 = string2 + ".local";
            }
            string = b3.g();
            if (string == null) {
                string = "";
            } else if (string.indexOf(46) == -1) {
                string = string + ".local";
            }
            n2 = string2.compareToIgnoreCase(string);
        }
        if (n2 == 0) {
            string2 = b2.h();
            if (string2 == null) {
                string2 = "/";
            }
            if ((string = b3.h()) == null) {
                string = "/";
            }
            n2 = string2.compareTo(string);
        }
        return n2;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((b)object, (b)object2);
    }
}

