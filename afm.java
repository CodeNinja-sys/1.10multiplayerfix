/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsScreen
 */
import com.c.a.a.b;
import com.c.a.c.i;
import com.c.a.e;
import io.netty.util.b.ad;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.s.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class afm
implements su {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bxy b;
    private final cjn c;
    private final sz d;
    private e e;

    public afm(sz sz2, bxy bxy2, cjn cjn2) {
        this.d = sz2;
        this.b = bxy2;
        this.c = cjn2;
    }

    @Override
    public void a(cnh cnh2) {
        SecretKey secretKey = sv.a();
        String string = cnh2.a();
        PublicKey publicKey = cnh2.b();
        String string2 = new BigInteger(sv.a(string, publicKey, secretKey)).toString(16);
        if (this.b.E() != null && this.b.E().d()) {
            try {
                this.a().a(this.b.M().e(), this.b.M().d(), string2);
            }
            catch (com.c.a.a.a a2) {
                a.f("Couldn't connect to auth servers but will continue to join LAN");
            }
        } else {
            try {
                this.a().a(this.b.M().e(), this.b.M().d(), string2);
            }
            catch (b b2) {
                this.d.a(new du("disconnect.loginFailedInfo", new du("disconnect.loginFailedInfo.serversUnavailable", new Object[0])));
                return;
            }
            catch (com.c.a.a.c c2) {
                this.d.a(new du("disconnect.loginFailedInfo", new du("disconnect.loginFailedInfo.invalidSession", new Object[0])));
                return;
            }
            catch (com.c.a.a.a a3) {
                this.d.a(new du("disconnect.loginFailedInfo", a3.getMessage()));
                return;
            }
        }
        this.d.a(new dhb(secretKey, publicKey, cnh2.c()), new apy(this, secretKey), new ad[0]);
    }

    private i a() {
        return this.b.Z();
    }

    @Override
    public void a(bxz bxz2) {
        this.e = bxz2.a();
        this.d.a(dfj.b);
        this.d.a(new ut(this.b, this.c, this.d, this.e));
    }

    @Override
    public void a(cbg cbg2) {
        if (this.c != null && this.c instanceof bdr) {
            this.b.a((cjn)((Object)new a((RealmsScreen)((bdr)this.c).f(), "connect.failed", (ey)((Object)cbg2)).getProxy()));
        } else {
            this.b.a(new chp(this.c, "connect.failed", cbg2));
        }
    }

    @Override
    public void a(bmg bmg2) {
        this.d.a(bmg2.a());
    }

    @Override
    public void a(bfj bfj2) {
        if (!this.d.c()) {
            this.d.a(bfj2.a());
        }
    }

    static /* synthetic */ sz a(afm afm2) {
        return afm2.d;
    }
}

