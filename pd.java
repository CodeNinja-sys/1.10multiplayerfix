/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.c.a.e;
import io.netty.util.b.ad;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.c.a;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class pd
implements adn,
avf {
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final d c = org.apache.logging.log4j.c.c();
    private static final Random d = new Random();
    private final byte[] e = new byte[4];
    private final a f;
    public final sz a;
    private cra g = cra.a;
    private int h;
    private e i;
    private final String j = "";
    private SecretKey k;
    private czt l;

    public pd(a a2, sz sz2) {
        this.f = a2;
        this.a = sz2;
        d.nextBytes(this.e);
    }

    @Override
    public void a() {
        czt czt2;
        if (this.g == cra.d) {
            this.b();
        } else if (this.g == cra.e && (czt2 = ((cmt)((Object)this.f.al())).a(this.i.a())) == null) {
            this.g = cra.d;
            ((cmt)((Object)this.f.al())).a(this.a, this.l);
            this.l = null;
        }
        if (this.h++ == 600) {
            this.a("Took too long to log in");
        }
    }

    public void a(String string) {
        try {
            c.d("Disconnecting {}: {}", this.c(), string);
            aym aym2 = new aym(string);
            this.a.a(new bmg(aym2));
            this.a.a(aym2);
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
        if ((string = ((cmt)((Object)this.f.al())).a(this.a.b(), this.i)) != null) {
            this.a(string);
        } else {
            this.g = cra.f;
            if (this.f.aF() >= 0 && !this.a.c()) {
                this.a.a(new bfj(this.f.aF()), new bcq(this), new ad[0]);
            }
            this.a.a(new bxz(this.i));
            czt czt2 = ((cmt)((Object)this.f.al())).a(this.i.a());
            if (czt2 != null) {
                this.g = cra.e;
                this.l = ((cmt)((Object)this.f.al())).a(this.i);
            } else {
                ((cmt)((Object)this.f.al())).a(this.a, ((cmt)((Object)this.f.al())).a(this.i));
            }
        }
    }

    @Override
    public void a(cbg cbg2) {
        c.d("{} lost connection: {}", this.c(), cbg2.i());
    }

    public String c() {
        if (this.i != null) {
            return this.i + " (" + this.a.b() + ")";
        }
        return String.valueOf(this.a.b());
    }

    @Override
    public void a(aza aza2) {
        ao.b(this.g == cra.a, "Unexpected hello packet", new Object[0]);
        this.i = aza2.a();
        if (this.f.ab() && !this.a.c()) {
            this.g = cra.b;
            this.a.a(new cnh("", this.f.O().getPublic(), this.e));
        } else {
            this.g = cra.d;
        }
    }

    @Override
    public void a(dhb dhb2) {
        ao.b(this.g == cra.b, "Unexpected key packet", new Object[0]);
        PrivateKey privateKey = this.f.O().getPrivate();
        if (!Arrays.equals(this.e, dhb2.b(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.k = dhb2.a(privateKey);
        this.g = cra.c;
        this.a.a(this.k);
        new tn(this, "User Authenticator #" + b.incrementAndGet()).start();
    }

    protected e a(e e2) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + e2.b()).getBytes(aj.c));
        return new e(uUID, e2.b());
    }

    static /* synthetic */ a a(pd pd2) {
        return pd2.f;
    }

    static /* synthetic */ e b(pd pd2) {
        return pd2.i;
    }

    static /* synthetic */ SecretKey c(pd pd2) {
        return pd2.k;
    }

    static /* synthetic */ e a(pd pd2, e e2) {
        pd2.i = e2;
        return pd2.i;
    }

    static /* synthetic */ d d() {
        return c;
    }

    static /* synthetic */ cra a(pd pd2, cra cra2) {
        pd2.g = cra2;
        return pd2.g;
    }
}

