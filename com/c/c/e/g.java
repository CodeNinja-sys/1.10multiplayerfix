/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.c.c;
import com.c.c.d.a.s;
import com.c.c.d.d;
import com.c.c.e.f;
import net.minecraft.s.b;
import net.minecraft.s.n;

public class g
extends d {
    private final i b;
    private final s c;

    public g(i i2, s s2) {
        this.b = i2;
        this.c = s2;
    }

    @Override
    public void run() {
        this.b(n.f("mco.configure.world.closing"));
        m m2 = m.a();
        for (int i2 = 0; i2 < 25; ++i2) {
            if (this.b()) {
                return;
            }
            try {
                boolean bl2 = m2.g(this.b.a);
                if (!bl2) continue;
                this.c.b();
                this.b.e = l.a;
                net.minecraft.s.b.a(this.c);
                break;
            }
            catch (c c2) {
                if (this.b()) {
                    return;
                }
                f.a(c2.f);
                continue;
            }
            catch (Exception exception) {
                if (this.b()) {
                    return;
                }
                f.a().b("Failed to close server", (Throwable)exception);
                this.a("Failed to close the server");
            }
        }
    }
}

