/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a;

import java.io.Serializable;
import org.apache.a.ak;

public final class ac
extends ak
implements Serializable {
    private static final long h = -5856653513894415344L;
    public static final String a = "HTTP";
    public static final ac b = new ac(0, 9);
    public static final ac c = new ac(1, 0);
    public static final ac d = new ac(1, 1);

    public ac(int n2, int n3) {
        super(a, n2, n3);
    }

    public ak a(int n2, int n3) {
        if (n2 == this.f && n3 == this.g) {
            return this;
        }
        if (n2 == 1) {
            if (n3 == 0) {
                return c;
            }
            if (n3 == 1) {
                return d;
            }
        }
        if (n2 == 0 && n3 == 9) {
            return b;
        }
        return new ac(n2, n3);
    }
}

