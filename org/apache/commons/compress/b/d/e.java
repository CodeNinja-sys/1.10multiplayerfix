/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import org.apache.commons.compress.b.d.f;
import org.apache.commons.compress.b.d.g;
import org.apache.commons.compress.b.d.i;

public abstract class e
extends Enum {
    public static final /* enum */ e a = new f();
    public static final /* enum */ e b = new g();
    private static final /* synthetic */ e[] c;

    public static e[] values() {
        return (e[])c.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e() {
        void var2_-1;
        void var1_-1;
    }

    abstract i a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ e(f f2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new e[]{a, b};
    }
}

