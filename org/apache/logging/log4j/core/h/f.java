/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import java.util.Map;
import org.apache.logging.log4j.a.j;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;

public class f
implements g {
    private final Map a;

    public f(Map map) {
        this.a = map;
    }

    public f() {
        this.a = null;
    }

    @Override
    public String a(String string) {
        if (this.a == null) {
            return null;
        }
        String string2 = (String)this.a.get(string);
        if (string2 == null) {
            return null;
        }
        return string2;
    }

    @Override
    public String a(h h2, String string) {
        String string2;
        if (this.a == null && !(h2.d() instanceof j)) {
            return null;
        }
        if (this.a != null && this.a.containsKey(string) && (string2 = (String)this.a.get(string)) != null) {
            return string2;
        }
        if (h2.d() instanceof j) {
            return ((j)h2.d()).a(string);
        }
        return null;
    }
}

