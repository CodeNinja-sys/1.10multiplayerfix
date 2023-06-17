/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.e.f;
import org.apache.a.o.a;

public final class g {
    private final Map a = new HashMap();

    public static g a() {
        return new g();
    }

    g() {
    }

    public g a(String string, Object object) {
        org.apache.a.o.a.a(string, "ID");
        org.apache.a.o.a.a(object, "Item");
        this.a.put(string.toLowerCase(Locale.US), object);
        return this;
    }

    public f b() {
        return new f(this.a);
    }

    public String toString() {
        return this.a.toString();
    }
}

