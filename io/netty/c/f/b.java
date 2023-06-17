/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.a;
import io.netty.channel.bd;

final class b
implements Runnable {
    final bd a;

    b(bd bd2) {
        this.a = bd2;
    }

    @Override
    public void run() {
        if (!this.a.b().G().g() && io.netty.c.f.a.k(this.a)) {
            if (io.netty.c.f.a.f().d()) {
                io.netty.c.f.a.f().b("Channel:" + this.a.b().hashCode() + " Not Unsuspend: " + this.a.b().G().g() + ":" + io.netty.c.f.a.k(this.a));
            }
            this.a.a(io.netty.c.f.a.g()).set(false);
        } else {
            if (io.netty.c.f.a.f().d()) {
                if (this.a.b().G().g() && !io.netty.c.f.a.k(this.a)) {
                    io.netty.c.f.a.f().b("Channel:" + this.a.b().hashCode() + " Unsuspend: " + this.a.b().G().g() + ":" + io.netty.c.f.a.k(this.a));
                } else {
                    io.netty.c.f.a.f().b("Channel:" + this.a.b().hashCode() + " Normal Unsuspend: " + this.a.b().G().g() + ":" + io.netty.c.f.a.k(this.a));
                }
            }
            this.a.a(io.netty.c.f.a.g()).set(false);
            this.a.b().G().a(true);
            this.a.b().o();
        }
        if (io.netty.c.f.a.f().d()) {
            io.netty.c.f.a.f().b("Channel:" + this.a.b().hashCode() + " Unsupsend final status => " + this.a.b().G().g() + ":" + io.netty.c.f.a.k(this.a));
        }
    }
}

