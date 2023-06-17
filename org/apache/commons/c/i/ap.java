/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import org.apache.commons.c.i.an;
import org.apache.commons.c.i.aq;
import org.apache.commons.c.i.ar;
import org.apache.commons.c.i.as;
import org.apache.commons.c.i.at;

abstract class ap
extends Enum {
    public static final /* enum */ ap a = new aq();
    public static final /* enum */ ap b = new ar();
    public static final /* enum */ ap c = new as();
    public static final /* enum */ ap d = new at();
    private static final /* synthetic */ ap[] e;

    public static ap[] values() {
        return (ap[])e.clone();
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(ap.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ap() {
        void var2_-1;
        void var1_-1;
    }

    abstract boolean a();

    abstract boolean b();

    abstract boolean c();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ ap(an an2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        e = new ap[]{a, b, c, d};
    }
}

