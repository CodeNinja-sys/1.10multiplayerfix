/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import java.io.IOException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class sp
extends ro {
    private static final d c = org.apache.logging.log4j.c.c();
    private final dav d;
    private final bpx e;

    public sp(axb axb2, dav dav2) {
        super(axb2);
        cze cze2;
        this.d = dav2;
        try {
            cze2 = new cze(dav2.a());
        }
        catch (IOException iOException) {
            cze2 = anq.a;
        }
        this.e = this.a.P().a("texturepackicon", cze2);
    }

    @Override
    protected int a() {
        return 2;
    }

    @Override
    protected String b() {
        try {
            cqx cqx2 = (cqx)this.d.a(this.a.R().b, "pack");
            if (cqx2 != null) {
                return cqx2.a().j();
            }
        }
        catch (aa aa2) {
            c.b("Couldn't load metadata info", (Throwable)aa2);
        }
        catch (IOException iOException) {
            c.b("Couldn't load metadata info", (Throwable)iOException);
        }
        return (Object)((Object)aug.m) + "Missing " + "pack.mcmeta" + " :(";
    }

    @Override
    protected boolean f() {
        return false;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    protected String c() {
        return "Server";
    }

    @Override
    protected void d() {
        this.a.P().a(this.e);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public boolean j() {
        return true;
    }
}

