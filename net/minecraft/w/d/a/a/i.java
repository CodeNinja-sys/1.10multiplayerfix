/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.e;
import net.minecraft.w.d.a.a.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class i {
    private static final d a = org.apache.logging.log4j.c.c();
    private final a b;
    private final e[] c = new e[j.c()];
    private e d;

    public i(a a2) {
        this.b = a2;
        this.a(j.k);
    }

    public void a(j j2) {
        if (this.d == null || j2 != this.d.g()) {
            if (this.d != null) {
                this.d.i();
            }
            this.d = this.b(j2);
            if (!this.b.aQ.C) {
                this.b.cc().b(net.minecraft.w.d.a.a, j2.b());
            }
            a.a("Dragon is now in phase {} on the {}", j2, this.b.aQ.C ? "client" : "server");
            this.d.e();
        }
    }

    public e a() {
        return this.d;
    }

    public e b(j j2) {
        int n2 = j2.b();
        if (this.c[n2] == null) {
            this.c[n2] = j2.a(this.b);
        }
        return this.c[n2];
    }
}

