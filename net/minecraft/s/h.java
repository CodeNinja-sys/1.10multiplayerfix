/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.s.b;
import net.minecraft.s.i;
import net.minecraft.s.n;
import net.minecraft.u.d.l;
import net.minecraft.x.ak;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class h {
    private static final d a = org.apache.logging.log4j.c.c();
    private final n b;
    private volatile boolean c;
    private ak d;

    public h(n n2) {
        this.b = n2;
    }

    public void a(String string, int n2) {
        net.minecraft.s.b.a(true);
        new i(this, "Realms-connect-task", string, n2).start();
    }

    public void a() {
        this.c = true;
        if (this.d != null && this.d.e()) {
            this.d.a(new l("disconnect.genericReason", new Object[0]));
            this.d.j();
        }
    }

    public void b() {
        if (this.d != null) {
            if (this.d.e()) {
                this.d.a();
            } else {
                this.d.j();
            }
        }
    }

    static /* synthetic */ boolean a(h h2) {
        return h2.c;
    }

    static /* synthetic */ void a(h h2, ak ak2) {
        h2.d = ak2;
    }

    static /* synthetic */ ak b(h h2) {
        return h2.d;
    }

    static /* synthetic */ n c(h h2) {
        return h2.b;
    }

    static /* synthetic */ d c() {
        return a;
    }
}

