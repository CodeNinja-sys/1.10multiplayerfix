/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.c.a.c.i;
import io.netty.util.b.ad;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.co;
import net.minecraft.client.k.dd;
import net.minecraft.client.l.a;
import net.minecraft.client.l.g;
import net.minecraft.client.r;
import net.minecraft.u.d.l;
import net.minecraft.u.m;
import net.minecraft.x.ak;
import net.minecraft.x.e.b.b;
import net.minecraft.x.e.b.e;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class q
implements net.minecraft.x.e.a {
    private static final d a = org.apache.logging.log4j.c.c();
    private final r b;
    private final cc c;
    private final ak d;
    private com.c.a.e e;

    public q(ak ak2, r r2, cc cc2) {
        this.d = ak2;
        this.b = r2;
        this.c = cc2;
    }

    @Override
    public void a(e e2) {
        SecretKey secretKey = m.a();
        String string = e2.a();
        PublicKey publicKey = e2.b();
        String string2 = new BigInteger(m.a(string, publicKey, secretKey)).toString(16);
        if (this.b.C() != null && this.b.C().d()) {
            try {
                this.a().a(this.b.K().e(), this.b.K().d(), string2);
            }
            catch (com.c.a.a.a a2) {
                a.f("Couldn't connect to auth servers but will continue to join LAN");
            }
        } else {
            try {
                this.a().a(this.b.K().e(), this.b.K().d(), string2);
            }
            catch (com.c.a.a.b b2) {
                this.d.a(new l("disconnect.loginFailedInfo", new l("disconnect.loginFailedInfo.serversUnavailable", new Object[0])));
                return;
            }
            catch (com.c.a.a.c c2) {
                this.d.a(new l("disconnect.loginFailedInfo", new l("disconnect.loginFailedInfo.invalidSession", new Object[0])));
                return;
            }
            catch (com.c.a.a.a a3) {
                this.d.a(new l("disconnect.loginFailedInfo", a3.getMessage()));
                return;
            }
        }
        this.d.a(new net.minecraft.x.e.a.a(secretKey, publicKey, e2.c()), new a(this, secretKey), new ad[0]);
    }

    private i a() {
        return this.b.X();
    }

    @Override
    public void a(net.minecraft.x.e.b.d d2) {
        this.e = d2.a();
        this.d.a(net.minecraft.x.q.b);
        this.d.a(new g(this.b, this.c, this.d, this.e));
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        if (this.c != null && this.c instanceof dd) {
            this.b.a(new net.minecraft.s.a(((dd)this.c).f(), "connect.failed", a2).o());
        } else {
            this.b.a(new co(this.c, "connect.failed", a2));
        }
    }

    @Override
    public void a(net.minecraft.x.e.b.a a2) {
        this.d.a(a2.a());
    }

    @Override
    public void a(b b2) {
        if (!this.d.c()) {
            this.d.a(b2.a());
        }
    }

    static /* synthetic */ ak a(q q2) {
        return q2.d;
    }
}

