/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.b.b;
import org.apache.a.b.d;
import org.apache.a.b.j;
import org.apache.a.b.k;
import org.apache.a.b.n;
import org.apache.a.b.o;
import org.apache.a.f;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

abstract class g
implements w {
    final a a = c.b(this.getClass());

    void a(j j2, u u2, org.apache.a.n.g g2) {
        block13: {
            Object object;
            d d2 = j2.c();
            o o2 = j2.d();
            switch (j2.b()) {
                case d: {
                    return;
                }
                case e: {
                    this.a(d2);
                    if (!d2.c()) break;
                    return;
                }
                case b: {
                    object = j2.e();
                    if (object != null) {
                        while (!object.isEmpty()) {
                            b b2 = (b)object.remove();
                            d2 = b2.a();
                            o2 = b2.b();
                            j2.a(d2, o2);
                            if (this.a.a()) {
                                this.a.b("Generating response to an authentication challenge using " + d2.a() + " scheme");
                            }
                            try {
                                f f2 = this.a(d2, o2, u2, g2);
                                u2.a(f2);
                                break;
                            }
                            catch (k k2) {
                                if (!this.a.f()) continue;
                                this.a.d(d2 + " authentication error: " + k2.getMessage());
                            }
                        }
                        return;
                    }
                    this.a(d2);
                }
            }
            if (d2 != null) {
                try {
                    object = this.a(d2, o2, u2, g2);
                    u2.a((f)object);
                }
                catch (k k3) {
                    if (!this.a.b()) break block13;
                    this.a.e(d2 + " authentication error: " + k3.getMessage());
                }
            }
        }
    }

    private void a(d d2) {
        org.apache.a.o.b.a(d2, "Auth scheme");
    }

    private f a(d d2, o o2, u u2, org.apache.a.n.g g2) {
        org.apache.a.o.b.a(d2, "Auth scheme");
        if (d2 instanceof n) {
            return ((n)d2).a(o2, u2, g2);
        }
        return d2.a(o2, u2);
    }
}

