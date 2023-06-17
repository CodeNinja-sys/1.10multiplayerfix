/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.io.IOException;
import java.security.PrivilegedAction;
import org.apache.commons.d.c;

final class g
implements PrivilegedAction {
    private final ClassLoader a;
    private final String b;

    g(ClassLoader classLoader, String string) {
        this.a = classLoader;
        this.b = string;
    }

    public Object run() {
        try {
            if (this.a != null) {
                return this.a.getResources(this.b);
            }
            return ClassLoader.getSystemResources(this.b);
        }
        catch (IOException iOException) {
            if (c.g()) {
                c.g("Exception while trying to find configuration file " + this.b + ":" + iOException.getMessage());
            }
            return null;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return null;
        }
    }
}

