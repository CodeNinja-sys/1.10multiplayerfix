/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.client.l.q;
import net.minecraft.client.r;
import net.minecraft.s.a;
import net.minecraft.s.b;
import net.minecraft.s.h;
import net.minecraft.u.d.l;
import net.minecraft.x.ak;

class i
extends Thread {
    final /* synthetic */ h a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;

    i(h h2, String string, String string2, int n2) {
        this.a = h2;
        this.b = string2;
        this.c = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName(this.b);
            if (h.a(this.a)) {
                return;
            }
            h.a(this.a, ak.a(inetAddress, this.c, r.z().w.f()));
            if (h.a(this.a)) {
                return;
            }
            h.b(this.a).a(new q(h.b(this.a), r.z(), h.c(this.a).o()));
            if (h.a(this.a)) {
                return;
            }
            h.b(this.a).a(new net.minecraft.x.b.a.a(210, this.b, this.c, net.minecraft.x.q.d));
            if (h.a(this.a)) {
                return;
            }
            h.b(this.a).a(new net.minecraft.x.e.a.b(r.z().K().e()));
        }
        catch (UnknownHostException unknownHostException) {
            net.minecraft.s.b.n();
            if (h.a(this.a)) {
                return;
            }
            h.c().b("Couldn't connect to world", (Throwable)unknownHostException);
            net.minecraft.s.b.a(new a(h.c(this.a), "connect.failed", new l("disconnect.genericReason", "Unknown host '" + this.b + "'")));
        }
        catch (Exception exception) {
            net.minecraft.s.b.n();
            if (h.a(this.a)) {
                return;
            }
            h.c().b("Couldn't connect to world", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress + ":" + this.c;
                string = string.replaceAll(string2, "");
            }
            net.minecraft.s.b.a(new a(h.c(this.a), "connect.failed", new l("disconnect.genericReason", string)));
        }
    }
}

