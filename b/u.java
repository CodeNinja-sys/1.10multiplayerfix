/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.aa;
import b.ae;
import b.d;
import b.r;
import b.s;
import b.v;

final class u
extends s {
    final /* synthetic */ boolean a;

    u(boolean bl2) {
        this.a = bl2;
    }

    protected void a(r r2, d d2, v v2) {
        String string;
        block6: {
            string = d2.b();
            try {
                if (aa.c(string)) {
                    r2.f();
                    return;
                }
                if (aa.b(string)) {
                    r2.a(string, d2, v2);
                    return;
                }
                if (aa.a(string)) {
                    r2.b(string, d2, v2);
                    return;
                }
            }
            catch (ae ae2) {
                if (r2.d()) break block6;
                throw ae2;
            }
        }
        if (this.a) {
            r2.f();
        }
        r2.c(string, d2, v2);
    }
}

