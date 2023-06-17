/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import net.minecraft.a.f;
import net.minecraft.client.c.e;
import net.minecraft.client.f.u;
import net.minecraft.client.g.a.m;
import net.minecraft.client.g.a.t;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.aj;
import net.minecraft.client.k.at;
import net.minecraft.client.k.az;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.bv;
import net.minecraft.client.k.cs;
import net.minecraft.client.k.db;
import net.minecraft.client.k.de;
import net.minecraft.client.k.dm;
import net.minecraft.client.k.dp;
import net.minecraft.client.r;
import net.minecraft.q.a.d;
import net.minecraft.q.a.w;
import net.minecraft.q.a.x;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import org.apache.commons.c.am;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;

public class br
implements bo {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final DateFormat b = new SimpleDateFormat();
    private static final bp c = new bp("textures/misc/unknown_server.png");
    private static final bp d = new bp("textures/gui/world_selection.png");
    private final r e;
    private final dm f;
    private final x g;
    private final bp h;
    private final az i;
    private File j;
    private m k;
    private long l;

    public br(az az2, x x2, w w2) {
        this.i = az2;
        this.f = az2.f();
        this.g = x2;
        this.e = r.z();
        this.h = new bp("worlds/" + x2.a() + "/icon");
        this.j = w2.b(x2.a(), "icon.png");
        if (!this.j.isFile()) {
            this.j = null;
        }
        this.f();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        String string = this.g.b();
        String string2 = String.valueOf(this.g.a()) + " (" + b.format(new Date(this.g.e())) + ")";
        String string3 = "";
        if (am.a((CharSequence)string)) {
            string = String.valueOf(u.a("selectWorld.world", new Object[0])) + " " + (n2 + 1);
        }
        if (this.g.d()) {
            string3 = String.valueOf(u.a("selectWorld.conversion", new Object[0])) + " " + string3;
        } else {
            string3 = u.a("gameMode." + this.g.f().b(), new Object[0]);
            if (this.g.g()) {
                string3 = (Object)((Object)o.e) + u.a("gameMode.hardcore", new Object[0]) + (Object)((Object)o.v);
            }
            if (this.g.h()) {
                string3 = String.valueOf(string3) + ", " + u.a("selectWorld.cheats", new Object[0]);
            }
            String string4 = this.g.i();
            string3 = this.g.j() ? (this.g.k() ? String.valueOf(string3) + ", " + u.a("selectWorld.version", new Object[0]) + " " + (Object)((Object)o.m) + string4 + (Object)((Object)o.v) : String.valueOf(string3) + ", " + u.a("selectWorld.version", new Object[0]) + " " + (Object)((Object)o.u) + string4 + (Object)((Object)o.v)) : String.valueOf(string3) + ", " + u.a("selectWorld.version", new Object[0]) + " " + string4;
        }
        this.e.m.a(string, n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        this.e.m.a(string2, n3 + 32 + 3, n4 + this.e.m.a + 3, 0x808080);
        this.e.m.a(string3, n3 + 32 + 3, n4 + this.e.m.a + this.e.m.a + 3, 0x808080);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.e.N().a(this.k != null ? this.h : c);
        bd.l();
        de.a(n3, n4, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        bd.k();
        if (this.e.w.A || bl2) {
            int n9;
            this.e.N().a(d);
            de.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            int n10 = n7 - n3;
            int n11 = n9 = n10 < 32 ? 32 : 0;
            if (this.g.j()) {
                de.a(n3, n4, 32.0f, n9, 32, 32, 256.0f, 256.0f);
                if (this.g.k()) {
                    de.a(n3, n4, 96.0f, n9, 32, 32, 256.0f, 256.0f);
                    if (n10 < 32) {
                        this.f.a((Object)((Object)o.m) + u.a("selectWorld.tooltip.fromNewerVersion1", new Object[0]) + "\n" + (Object)((Object)o.m) + u.a("selectWorld.tooltip.fromNewerVersion2", new Object[0]));
                    }
                } else {
                    de.a(n3, n4, 64.0f, n9, 32, 32, 256.0f, 256.0f);
                    if (n10 < 32) {
                        this.f.a((Object)((Object)o.g) + u.a("selectWorld.tooltip.snapshot1", new Object[0]) + "\n" + (Object)((Object)o.g) + u.a("selectWorld.tooltip.snapshot2", new Object[0]));
                    }
                }
            } else {
                de.a(n3, n4, 0.0f, n9, 32, 32, 256.0f, 256.0f);
            }
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.i.c(n2);
        if (n6 <= 32 && n6 < 32) {
            this.a();
            return true;
        }
        if (r.I() - this.l < 250L) {
            this.a();
            return true;
        }
        this.l = r.I();
        return false;
    }

    public void a() {
        if (this.g.k()) {
            this.e.a(new at(new dp(this), u.a("selectWorld.versionQuestion", new Object[0]), u.a("selectWorld.versionWarning", this.g.i()), u.a("selectWorld.versionJoinButton", new Object[0]), u.a("gui.cancel", new Object[0]), 0));
        } else {
            this.e();
        }
    }

    public void b() {
        this.e.a(new at(new bv(this), u.a("selectWorld.deleteQuestion", new Object[0]), "'" + this.g.b() + "' " + u.a("selectWorld.deleteWarning", new Object[0]), u.a("selectWorld.deleteButton", new Object[0]), u.a("gui.cancel", new Object[0]), 0));
    }

    public void c() {
        this.e.a(new aj(this.f, this.g.a()));
    }

    public void d() {
        this.e.a(new db());
        cs cs2 = new cs(this.f);
        net.minecraft.q.a.u u2 = this.e.g().a(this.g.a(), false);
        d d2 = u2.c();
        u2.f();
        cs2.a(d2);
        this.e.a(cs2);
    }

    private void e() {
        this.e.U().a(net.minecraft.client.c.e.a(net.minecraft.a.f.gE, 1.0f));
        if (this.e.g().f(this.g.a())) {
            this.e.a(this.g.a(), this.g.b(), null);
        }
    }

    private void f() {
        boolean bl2;
        boolean bl3 = bl2 = this.j != null && this.j.isFile();
        if (bl2) {
            BufferedImage bufferedImage;
            try {
                bufferedImage = ImageIO.read(this.j);
                ao.b(bufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                ao.b(bufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            }
            catch (Throwable throwable) {
                a.b("Invalid icon for world {}", this.g.a(), throwable);
                this.j = null;
                return;
            }
            if (this.k == null) {
                this.k = new m(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.e.N().a(this.h, (t)this.k);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.k.b(), 0, bufferedImage.getWidth());
            this.k.a();
        } else if (!bl2) {
            this.e.N().c(this.h);
            this.k = null;
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    static /* synthetic */ void a(br br2) {
        br2.e();
    }

    static /* synthetic */ r b(br br2) {
        return br2.e;
    }

    static /* synthetic */ dm c(br br2) {
        return br2.f;
    }

    static /* synthetic */ x d(br br2) {
        return br2.g;
    }

    static /* synthetic */ az e(br br2) {
        return br2.i;
    }
}

