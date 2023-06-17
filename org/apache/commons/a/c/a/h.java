/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.Set;
import org.apache.commons.a.c.a.e;
import org.apache.commons.a.c.a.i;

public abstract class h {
    public static h a(Set set) {
        return set.isEmpty() ? e.b : new i(set, null);
    }

    public abstract boolean a(String var1);

    public abstract String a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract h a(h var1);
}

