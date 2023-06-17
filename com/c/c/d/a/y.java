/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.a;
import com.c.c.d.a.x;
import java.util.concurrent.TimeUnit;
import net.minecraft.s.n;

class y
extends Thread {
    final /* synthetic */ x a;

    y(x x2) {
        this.a = x2;
    }

    @Override
    public void run() {
        try {
            if (!x.b().tryLock(1L, TimeUnit.SECONDS)) {
                return;
            }
            x.a(this.a, n.f("mco.download.preparing"));
            if (x.a(this.a)) {
                x.b(this.a);
                return;
            }
            x.a(this.a, n.a("mco.download.downloading", x.c(this.a)));
            a a2 = new a();
            a2.a(x.d((x)this.a).a);
            a2.a(x.d(this.a), x.c(this.a), x.e(this.a), this.a.x());
            while (!a2.b()) {
                if (a2.c()) {
                    a2.a();
                    x.b(this.a, n.f("mco.download.failed"));
                    x.f(this.a).a(n.f("gui.done"));
                    return;
                }
                if (a2.d()) {
                    x.a(this.a, true);
                }
                if (x.a(this.a)) {
                    a2.a();
                    x.b(this.a);
                    return;
                }
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {
                    x.c().b("Failed to check Realms backup download status");
                }
            }
            x.b(this.a, true);
            x.a(this.a, n.f("mco.download.done"));
            x.f(this.a).a(n.f("gui.done"));
        }
        catch (InterruptedException interruptedException) {
            x.c().b("Could not acquire upload lock");
        }
        catch (Exception exception) {
            x.b(this.a, n.f("mco.download.failed"));
            exception.printStackTrace();
        }
        finally {
            if (!x.b().isHeldByCurrentThread()) {
                return;
            }
            x.b().unlock();
            x.c(this.a, false);
            x.b(this.a, true);
        }
    }
}

