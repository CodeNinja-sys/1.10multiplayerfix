/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.Map;
import java.util.Properties;
import org.apache.commons.c.h.j;

public abstract class i {
    private static final i a = new j(null);
    private static final i b;

    public static i a() {
        return a;
    }

    public static i b() {
        return b;
    }

    public static i a(Map map) {
        return new j(map);
    }

    protected i() {
    }

    public abstract String a(String var1);

    static {
        i i2 = null;
        try {
            Properties properties;
            Properties properties2 = properties = System.getProperties();
            i2 = new j(properties2);
        }
        catch (SecurityException securityException) {
            i2 = a;
        }
        b = i2;
    }
}

