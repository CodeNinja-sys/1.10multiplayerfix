/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.b.aa;
import java.io.IOException;
import net.minecraft.client.f.a.g;
import net.minecraft.client.f.ad;
import net.minecraft.client.f.t;
import net.minecraft.client.g.a.m;
import net.minecraft.client.g.a.p;
import net.minecraft.client.k.i;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ah
extends ad {
    private static final d c = org.apache.logging.log4j.c.c();
    private final t d;
    private final bp e;

    public ah(i i2, t t2) {
        super(i2);
        m m2;
        this.d = t2;
        try {
            m2 = new m(t2.b());
        }
        catch (IOException iOException) {
            m2 = p.a;
        }
        this.e = this.a.N().a("texturepackicon", m2);
    }

    @Override
    protected int a() {
        return 2;
    }

    @Override
    protected String b() {
        try {
            g g2 = (g)this.d.a(this.a.P().b, "pack");
            if (g2 != null) {
                return g2.a().d();
            }
        }
        catch (aa aa2) {
            c.b("Couldn't load metadata info", (Throwable)aa2);
        }
        catch (IOException iOException) {
            c.b("Couldn't load metadata info", (Throwable)iOException);
        }
        return (Object)((Object)o.m) + "Missing " + "pack.mcmeta" + " :(";
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
        this.a.N().a(this.e);
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

