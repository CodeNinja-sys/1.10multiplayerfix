/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.c;

import com.a.a.b.aj;
import io.netty.util.b.ad;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.c.a;
import net.minecraft.c.c.d;
import net.minecraft.c.c.e;
import net.minecraft.c.c.f;
import net.minecraft.u.aw;
import net.minecraft.u.d.k;
import net.minecraft.w.a.g;
import net.minecraft.x.ak;
import net.minecraft.x.e.a.b;
import org.apache.commons.c.ao;

public class c
implements aw,
net.minecraft.x.e.b {
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();
    private static final Random d = new Random();
    private final byte[] e = new byte[4];
    private final a f;
    public final ak a;
    private d g = net.minecraft.c.c.d.a;
    private int h;
    private com.c.a.e i;
    private final String j = "";
    private SecretKey k;
    private g l;

    public c(a a2, ak ak2) {
        this.f = a2;
        this.a = ak2;
        d.nextBytes(this.e);
    }

    @Override
    public void a() {
        g g2;
        if (this.g == net.minecraft.c.c.d.d) {
            this.b();
        } else if (this.g == net.minecraft.c.c.d.e && (g2 = this.f.av().a(this.i.a())) == null) {
            this.g = net.minecraft.c.c.d.d;
            this.f.av().a(this.a, this.l);
            this.l = null;
        }
        if (this.h++ == 600) {
            this.a("Took too long to log in");
        }
    }

    public void a(String string) {
        try {
            c.d("Disconnecting {}: {}", this.c(), string);
            k k2 = new k(string);
            this.a.a(new net.minecraft.x.e.b.a(k2));
            this.a.a(k2);
        }
        catch (Exception exception) {
            c.b("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public void b() {
        String string;
        if (!this.i.d()) {
            this.i = this.a(this.i);
        }
        if ((string = this.f.av().a(this.a.b(), this.i)) != null) {
            this.a(string);
        } else {
            this.g = net.minecraft.c.c.d.f;
            if (this.f.aV() >= 0 && !this.a.c()) {
                this.a.a(new net.minecraft.x.e.b.b(this.f.aV()), new f(this), new ad[0]);
            }
            this.a.a(new net.minecraft.x.e.b.d(this.i));
            g g2 = this.f.av().a(this.i.a());
            if (g2 != null) {
                this.g = net.minecraft.c.c.d.e;
                this.l = this.f.av().a(this.i);
            } else {
                this.f.av().a(this.a, this.f.av().a(this.i));
            }
        }
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        c.d("{} lost connection: {}", this.c(), a2.c());
    }

    public String c() {
        return this.i != null ? this.i + " (" + this.a.b() + ")" : String.valueOf(this.a.b());
    }

    @Override
    public void a(b b2) {
        ao.b(this.g == net.minecraft.c.c.d.a, "Unexpected hello packet", new Object[0]);
        this.i = b2.a();
        if (this.f.al() && !this.a.c()) {
            this.g = net.minecraft.c.c.d.b;
            this.a.a(new net.minecraft.x.e.b.e("", this.f.Z().getPublic(), this.e));
        } else {
            this.g = net.minecraft.c.c.d.d;
        }
    }

    @Override
    public void a(net.minecraft.x.e.a.a a2) {
        ao.b(this.g == net.minecraft.c.c.d.b, "Unexpected key packet", new Object[0]);
        PrivateKey privateKey = this.f.Z().getPrivate();
        if (!Arrays.equals(this.e, a2.b(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.k = a2.a(privateKey);
        this.g = net.minecraft.c.c.d.c;
        this.a.a(this.k);
        new e(this, "User Authenticator #" + b.incrementAndGet()).start();
    }

    protected com.c.a.e a(com.c.a.e e2) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + e2.b()).getBytes(aj.c));
        return new com.c.a.e(uUID, e2.b());
    }

    static /* synthetic */ a a(c c2) {
        return c2.f;
    }

    static /* synthetic */ com.c.a.e b(c c2) {
        return c2.i;
    }

    static /* synthetic */ SecretKey c(c c2) {
        return c2.k;
    }

    static /* synthetic */ void a(c c2, com.c.a.e e2) {
        c2.i = e2;
    }

    static /* synthetic */ org.apache.logging.log4j.d d() {
        return c;
    }

    static /* synthetic */ void a(c c2, d d2) {
        c2.g = d2;
    }
}

