/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;

final class x
extends av {
    final av[] a;

    x(av[] arrav) {
        super(-1, null, null, null);
        this.a = arrav;
    }

    @Override
    av a(int n2, Object object) {
        av[] arrav = this.a;
        block0: while (true) {
            av av2;
            int n3;
            if (object == null || arrav == null || (n3 = arrav.length) == 0 || (av2 = io.netty.util.c.a.a.a(arrav, n3 - 1 & n2)) == null) {
                return null;
            }
            do {
                Object object2;
                int n4;
                if ((n4 = av2.b) == n2 && ((object2 = av2.c) == object || object2 != null && object.equals(object2))) {
                    return av2;
                }
                if (n4 >= 0) continue;
                if (av2 instanceof x) {
                    arrav = ((x)av2).a;
                    continue block0;
                }
                return av2.a(n2, object);
            } while ((av2 = av2.e) != null);
            break;
        }
        return null;
    }
}

