/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.io.Serializable;

public class k
implements Serializable {
    private static final long a = 4743255148794846612L;
    private final Class b;
    private final String c;
    private final boolean d;
    private final boolean e;

    public k(Class class_, String string, boolean bl2, boolean bl3) {
        this.b = class_;
        this.c = string;
        this.d = bl2;
        this.e = bl3;
    }

    public Class a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

