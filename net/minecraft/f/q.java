/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import io.netty.b.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.e.e;
import net.minecraft.f.ac;
import net.minecraft.f.an;
import net.minecraft.k.i;
import net.minecraft.n.ae;
import net.minecraft.n.ap;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.u.bo;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.w.a.b;

public abstract class q
implements az {
    private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
    private int b;
    private boolean c = true;
    private a d;
    private String e = "";
    private String f = "@";
    private final ap g = new ap();

    public int a() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public a b() {
        return this.d == null ? new k("") : this.d;
    }

    public e a(e e2) {
        e2.a("Command", this.e);
        e2.a("SuccessCount", this.b);
        e2.a("CustomName", this.f);
        e2.a("TrackOutput", this.c);
        if (this.d != null && this.c) {
            e2.a("LastOutput", net.minecraft.u.d.b.a(this.d));
        }
        this.g.b(e2);
        return e2;
    }

    public void b(e e2) {
        this.e = e2.l("Command");
        this.b = e2.h("SuccessCount");
        if (e2.b("CustomName", 8)) {
            this.f = e2.l("CustomName");
        }
        if (e2.b("TrackOutput", 1)) {
            this.c = e2.p("TrackOutput");
        }
        if (e2.b("LastOutput", 8) && this.c) {
            try {
                this.d = net.minecraft.u.d.b.a(e2.l("LastOutput"));
            }
            catch (Throwable throwable) {
                this.d = new k(throwable.getMessage());
            }
        } else {
            this.d = null;
        }
        this.g.a(e2);
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 2;
    }

    public void a(String string) {
        this.e = string;
        this.b = 0;
    }

    public String c() {
        return this.e;
    }

    public void a(net.minecraft.q.k k2) {
        if (k2.C) {
            this.b = 0;
        } else if ("Searge".equalsIgnoreCase(this.e)) {
            this.d = new k("#itzlipofutzli");
            this.b = 1;
        } else {
            net.minecraft.c.a a2 = this.aS();
            if (a2 != null && a2.W() && a2.ar()) {
                ae ae2 = a2.Y();
                try {
                    this.d = null;
                    this.b = ae2.a(this, this.e);
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a3 = net.minecraft.k.a.a(throwable, "Executing command block");
                    i i2 = a3.a("Command to be executed");
                    i2.a("Command", new ac(this));
                    i2.a("Name", new an(this));
                    throw new bo(a3);
                }
            } else {
                this.b = 0;
            }
        }
    }

    @Override
    public String X() {
        return this.f;
    }

    @Override
    public a aK() {
        return new k(this.X());
    }

    public void b(String string) {
        this.f = string;
    }

    @Override
    public void a(a a2) {
        if (this.c && this.aE() != null && !this.aE().C) {
            this.d = new k("[" + a.format(new Date()) + "] ").a(a2);
            this.d();
        }
    }

    @Override
    public boolean aR() {
        net.minecraft.c.a a2 = this.aS();
        return a2 == null || !a2.W() || a2.d[0].G().b("commandBlockOutput");
    }

    @Override
    public void a(br br2, int n2) {
        this.g.a(this.aS(), this, br2, n2);
    }

    public abstract void d();

    public abstract int e();

    public abstract void a(g var1);

    public void b(a a2) {
        this.d = a2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public boolean f() {
        return this.c;
    }

    public boolean a(b b2) {
        if (!b2.aN()) {
            return false;
        }
        if (b2.aE().C) {
            b2.a(this);
        }
        return true;
    }

    public ap g() {
        return this.g;
    }
}

