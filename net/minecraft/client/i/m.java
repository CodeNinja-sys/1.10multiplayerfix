/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.client.i.n;
import net.minecraft.client.k.co;
import net.minecraft.client.l.q;
import net.minecraft.u.d.l;
import net.minecraft.x.ak;
import net.minecraft.x.b.a.a;
import net.minecraft.x.e.a.b;

class m
extends Thread {
    final /* synthetic */ n a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;

    m(n n2, String string, String string2, int n3) {
        this.a = n2;
        this.b = string2;
        this.c = n3;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (n.a(this.a)) {
                return;
            }
            inetAddress = InetAddress.getByName(this.b);
            n.a(this.a, ak.a(inetAddress, this.c, n.b((n)this.a).w.f()));
            n.c(this.a).a(new q(n.c(this.a), n.b(this.a), n.d(this.a)));
            n.c(this.a).a(new a(210, this.b, this.c, net.minecraft.x.q.d));
            n.c(this.a).a(new b(n.b(this.a).K().e()));
        }
        catch (UnknownHostException unknownHostException) {
            if (n.a(this.a)) {
                return;
            }
            n.c().b("Couldn't connect to server", (Throwable)unknownHostException);
            n.b(this.a).a(new co(n.d(this.a), "connect.failed", new l("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (n.a(this.a)) {
                return;
            }
            n.c().b("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress + ":" + this.c;
                string = string.replaceAll(string2, "");
            }
            n.b(this.a).a(new co(n.d(this.a), "connect.failed", new l("disconnect.genericReason", string)));
        }
    }
}

