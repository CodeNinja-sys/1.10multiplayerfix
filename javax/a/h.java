/*
 * Decompiled with CFR 0.150.
 */
package javax.a;

import javax.a.b.f;
import javax.a.b.g;

public class h
implements f {
    public g a(javax.a.g g2, Object object) {
        boolean bl2;
        if (!(object instanceof Number)) {
            return g.d;
        }
        Number number = (Number)object;
        if (number instanceof Long) {
            bl2 = number.longValue() < 0L;
        } else if (number instanceof Double) {
            bl2 = number.doubleValue() < 0.0;
        } else if (number instanceof Float) {
            bl2 = number.floatValue() < 0.0f;
        } else {
            boolean bl3 = bl2 = number.intValue() < 0;
        }
        if (bl2) {
            return g.d;
        }
        return g.a;
    }
}

