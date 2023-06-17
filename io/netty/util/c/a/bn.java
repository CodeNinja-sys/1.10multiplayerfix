/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;

final class bn
extends av {
    bn a;
    bn f;
    bn g;
    bn h;
    boolean i;

    bn(int n2, Object object, Object object2, av av2, bn bn2) {
        super(n2, object, object2, av2);
        this.a = bn2;
    }

    @Override
    av a(int n2, Object object) {
        return this.a(n2, object, null);
    }

    final bn a(int n2, Object object, Class class_) {
        if (object != null) {
            bn bn2 = this;
            do {
                bn bn3;
                int n3;
                bn bn4 = bn2.f;
                bn bn5 = bn2.g;
                int n4 = bn2.b;
                if (n4 > n2) {
                    bn2 = bn4;
                    continue;
                }
                if (n4 < n2) {
                    bn2 = bn5;
                    continue;
                }
                Object object2 = bn2.c;
                if (object2 == object || object2 != null && object.equals(object2)) {
                    return bn2;
                }
                if (bn4 == null && bn5 == null) break;
                if ((class_ != null || (class_ = io.netty.util.c.a.a.a(object)) != null) && (n3 = io.netty.util.c.a.a.a(class_, object, object2)) != 0) {
                    bn2 = n3 < 0 ? bn4 : bn5;
                    continue;
                }
                if (bn4 == null) {
                    bn2 = bn5;
                    continue;
                }
                if (bn5 == null || (bn3 = bn5.a(n2, object, class_)) == null) {
                    bn2 = bn4;
                    continue;
                }
                return bn3;
            } while (bn2 != null);
        }
        return null;
    }
}

