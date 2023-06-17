/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.c.c;
import com.c.c.d.a.s;
import com.c.c.d.d;
import com.c.c.e.f;
import net.minecraft.s.b;
import net.minecraft.s.n;

public class h
extends d {
    private final i b;
    private final n c;
    private final boolean d;
    private final n e;

    public h(i i2, n n2, n n3, boolean bl2) {
        this.b = i2;
        this.c = n2;
        this.d = bl2;
        this.e = n3;
    }

    @Override
    public void run() {
        this.b(n.f("mco.configure.world.opening"));
        m m2 = m.a();
        for (int i2 = 0; i2 < 25; ++i2) {
            if (this.b()) {
                return;
            }
            try {
                boolean bl2 = m2.f(this.b.a);
                if (!bl2) continue;
                if (this.c instanceof s) {
                    ((s)this.c).b();
                }
                this.b.e = l.b;
                if (this.d) {
                    ((a)this.e).a(this.b);
                    break;
                }
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
                f.a().b("Failed to open server", (Throwable)exception);
                this.a("Failed to open the server");
            }
        }
    }
}

