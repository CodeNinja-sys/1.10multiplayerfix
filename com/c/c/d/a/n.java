/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.a;
import com.c.c.c.b;
import com.c.c.c.c;
import com.c.c.d.a.aa;
import com.c.c.d.a.k;
import com.c.c.d.a.l;
import com.c.c.d.d;

class n
extends d {
    private final a c;
    final /* synthetic */ k b;

    private n(k k2, a a2) {
        this.b = k2;
        this.c = a2;
    }

    @Override
    public void run() {
        this.b(net.minecraft.s.n.f("mco.backup.restoring"));
        for (int i2 = 0; i2 < 6; ++i2) {
            try {
                if (this.b()) {
                    return;
                }
                m m2 = m.a();
                m2.c(k.a((k)this.b).a, this.c.a);
                this.a(1);
                if (this.b()) {
                    return;
                }
                net.minecraft.s.b.a(k.d(this.b).c());
                return;
            }
            catch (c c2) {
                if (this.b()) {
                    return;
                }
                this.a(c2.f);
                continue;
            }
            catch (b b2) {
                if (this.b()) {
                    return;
                }
                k.b().b("Couldn't restore backup");
                net.minecraft.s.b.a(new aa(b2, (net.minecraft.s.n)k.d(this.b)));
                return;
            }
            catch (Exception exception) {
                if (this.b()) {
                    return;
                }
                k.b().b("Couldn't restore backup");
                this.a(exception.getLocalizedMessage());
                return;
            }
        }
    }

    private void a(int n2) {
        try {
            Thread.sleep(n2 * 1000);
        }
        catch (InterruptedException interruptedException) {
            k.b().b((Object)interruptedException);
        }
    }

    /* synthetic */ n(k k2, a a2, l l2) {
        this(k2, a2);
    }
}

