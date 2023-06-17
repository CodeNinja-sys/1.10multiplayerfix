/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.g;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.a.g.b;

public class f
implements Serializable,
Comparator {
    private static final long a = 7523645369616405818L;

    private String a(b b2) {
        String string = b2.h();
        if (string == null) {
            string = "/";
        }
        if (!string.endsWith("/")) {
            string = string + '/';
        }
        return string;
    }

    public int a(b b2, b b3) {
        String string;
        String string2 = this.a(b2);
        if (string2.equals(string = this.a(b3))) {
            return 0;
        }
        if (string2.startsWith(string)) {
            return -1;
        }
        if (string.startsWith(string2)) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((b)object, (b)object2);
    }
}

