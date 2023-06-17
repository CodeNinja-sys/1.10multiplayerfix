/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import org.apache.logging.log4j.core.a.c.f;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.h;

public final class b
implements v {
    private final v[] a;

    private b(v ... arrv) {
        this.a = arrv;
    }

    @Override
    public void a(f f2) {
        for (v v2 : this.a) {
            v2.a(f2);
        }
    }

    @Override
    public boolean a(h h2) {
        for (v v2 : this.a) {
            if (!v2.a(h2)) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompositeTriggeringPolicy{");
        boolean bl2 = true;
        for (v v2 : this.a) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(v2.toString());
            bl2 = false;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static b a(v ... arrv) {
        return new b(arrv);
    }
}

