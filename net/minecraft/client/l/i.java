/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.c.a.e;
import net.minecraft.client.i.a;
import net.minecraft.client.l.c;
import net.minecraft.client.r;
import net.minecraft.u.d.k;
import net.minecraft.u.d.o;
import net.minecraft.x.ak;
import net.minecraft.x.f.b.b;
import net.minecraft.x.v;

class i
implements net.minecraft.x.f.a {
    private boolean b;
    private boolean c;
    private long d;
    final /* synthetic */ c a;
    private final /* synthetic */ ak e;
    private final /* synthetic */ a f;

    i(c c2, ak ak2, a a2) {
        this.a = c2;
        this.e = ak2;
        this.f = a2;
    }

    @Override
    public void a(b b2) {
        if (this.c) {
            this.e.a(new k("Received unrequested status"));
        } else {
            CharSequence charSequence;
            this.c = true;
            v v2 = b2.a();
            this.f.d = v2.a() != null ? v2.a().d() : "";
            if (v2.c() != null) {
                this.f.g = v2.c().a();
                this.f.f = v2.c().b();
            } else {
                this.f.g = "Old";
                this.f.f = 0;
            }
            if (v2.b() != null) {
                this.f.c = (Object)((Object)o.h) + v2.b().b() + (Object)((Object)o.i) + "/" + (Object)((Object)o.h) + v2.b().a();
                if (org.apache.commons.c.c.g(v2.b().c())) {
                    charSequence = new StringBuilder();
                    for (e e2 : v2.b().c()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append(e2.b());
                    }
                    if (v2.b().c().length < v2.b().b()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append("... and ").append(v2.b().b() - v2.b().c().length).append(" more ...");
                    }
                    this.f.i = ((StringBuilder)charSequence).toString();
                }
            } else {
                this.f.c = (Object)((Object)o.i) + "???";
            }
            if (v2.d() != null) {
                charSequence = v2.d();
                if (((String)charSequence).startsWith("data:image/png;base64,")) {
                    this.f.a(((String)charSequence).substring("data:image/png;base64,".length()));
                } else {
                    net.minecraft.client.l.c.c().b("Invalid server icon (unknown format)");
                }
            } else {
                this.f.a((String)null);
            }
            this.d = r.I();
            this.e.a(new net.minecraft.x.f.a.a(this.d));
            this.b = true;
        }
    }

    @Override
    public void a(net.minecraft.x.f.b.a a2) {
        long l2 = this.d;
        long l3 = r.I();
        this.f.e = l3 - l2;
        this.e.a(new k("Finished"));
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        if (!this.b) {
            net.minecraft.client.l.c.c().b("Can't ping {}: {}", this.f.b, a2.c());
            this.f.d = (Object)((Object)o.e) + "Can't connect to server.";
            this.f.c = "";
            net.minecraft.client.l.c.a(this.a, this.f);
        }
    }
}

