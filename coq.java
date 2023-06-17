/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.c.am;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class coq
implements ye {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final DateFormat b = new SimpleDateFormat();
    private static final bpx c = new bpx("textures/misc/unknown_server.png");
    private static final bpx d = new bpx("textures/gui/world_selection.png");
    private final bxy e;
    private final bbb f;
    private final bwp g;
    private final bpx h;
    private final vg i;
    private File j;
    private cze k;
    private long l;

    public coq(vg vg2, bwp bwp2, bxj bxj2) {
        this.i = vg2;
        this.f = vg2.n();
        this.g = bwp2;
        this.e = bxy.B();
        this.h = new bpx("worlds/" + bwp2.a() + "/icon");
        this.j = bxj2.b(bwp2.a(), "icon.png");
        if (!this.j.isFile()) {
            this.j = null;
        }
        this.f();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        String string = this.g.b();
        String string2 = this.g.a() + " (" + b.format(new Date(this.g.e())) + ")";
        String string3 = "";
        if (am.a((CharSequence)string)) {
            string = bf.a("selectWorld.world", new Object[0]) + " " + (n2 + 1);
        }
        if (this.g.d()) {
            string3 = bf.a("selectWorld.conversion", new Object[0]) + " " + string3;
        } else {
            string3 = bf.a("gameMode." + this.g.f().b(), new Object[0]);
            if (this.g.g()) {
                string3 = (Object)((Object)aug.e) + bf.a("gameMode.hardcore", new Object[0]) + (Object)((Object)aug.v);
            }
            if (this.g.h()) {
                string3 = string3 + ", " + bf.a("selectWorld.cheats", new Object[0]);
            }
            String string4 = this.g.i();
            string3 = this.g.j() ? (this.g.k() ? string3 + ", " + bf.a("selectWorld.version", new Object[0]) + " " + (Object)((Object)aug.m) + string4 + (Object)((Object)aug.v) : string3 + ", " + bf.a("selectWorld.version", new Object[0]) + " " + (Object)((Object)aug.u) + string4 + (Object)((Object)aug.v)) : string3 + ", " + bf.a("selectWorld.version", new Object[0]) + " " + string4;
        }
        this.e.k.a(string, n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        this.e.k.a(string2, n3 + 32 + 3, n4 + this.e.k.a + 3, 0x808080);
        this.e.k.a(string3, n3 + 32 + 3, n4 + this.e.k.a + this.e.k.a + 3, 0x808080);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.e.P().a(this.k != null ? this.h : c);
        cja.l();
        alo.a(n3, n4, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        cja.k();
        if (this.e.u.A || bl2) {
            int n9;
            this.e.P().a(d);
            alo.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            int n10 = n7 - n3;
            int n11 = n9 = n10 < 32 ? 32 : 0;
            if (this.g.j()) {
                alo.a(n3, n4, 32.0f, n9, 32, 32, 256.0f, 256.0f);
                if (this.g.k()) {
                    alo.a(n3, n4, 96.0f, n9, 32, 32, 256.0f, 256.0f);
                    if (n10 < 32) {
                        this.f.a((Object)((Object)aug.m) + bf.a("selectWorld.tooltip.fromNewerVersion1", new Object[0]) + "\n" + (Object)((Object)aug.m) + bf.a("selectWorld.tooltip.fromNewerVersion2", new Object[0]));
                    }
                } else {
                    alo.a(n3, n4, 64.0f, n9, 32, 32, 256.0f, 256.0f);
                    if (n10 < 32) {
                        this.f.a((Object)((Object)aug.g) + bf.a("selectWorld.tooltip.snapshot1", new Object[0]) + "\n" + (Object)((Object)aug.g) + bf.a("selectWorld.tooltip.snapshot2", new Object[0]));
                    }
                }
            } else {
                alo.a(n3, n4, 0.0f, n9, 32, 32, 256.0f, 256.0f);
            }
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.i.g(n2);
        if (n6 <= 32 && n6 < 32) {
            this.a();
            return true;
        }
        if (bxy.K() - this.l < 250L) {
            this.a();
            return true;
        }
        this.l = bxy.K();
        return false;
    }

    public void a() {
        if (this.g.k()) {
            this.e.a(new ayi(new pi(this), bf.a("selectWorld.versionQuestion", new Object[0]), bf.a("selectWorld.versionWarning", this.g.i()), bf.a("selectWorld.versionJoinButton", new Object[0]), bf.a("gui.cancel", new Object[0]), 0));
        } else {
            this.e();
        }
    }

    public void b() {
        this.e.a(new ayi(new cdv(this), bf.a("selectWorld.deleteQuestion", new Object[0]), "'" + this.g.b() + "' " + bf.a("selectWorld.deleteWarning", new Object[0]), bf.a("selectWorld.deleteButton", new Object[0]), bf.a("gui.cancel", new Object[0]), 0));
    }

    public void c() {
        this.e.a(new adl(this.f, this.g.a()));
    }

    public void d() {
        this.e.a(new cil());
        clo clo2 = new clo(this.f);
        ajq ajq2 = this.e.i().a(this.g.a(), false);
        cvn cvn2 = ajq2.c();
        ajq2.f();
        clo2.a(cvn2);
        this.e.a(clo2);
    }

    private void e() {
        this.e.W().a(ol.a(dah.gE, 1.0f));
        if (this.e.i().f(this.g.a())) {
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
                this.k = new cze(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.e.P().a(this.h, (dfs)this.k);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.k.c(), 0, bufferedImage.getWidth());
            this.k.b();
        } else if (!bl2) {
            this.e.P().c(this.h);
            this.k = null;
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    static /* synthetic */ void a(coq coq2) {
        coq2.e();
    }

    static /* synthetic */ bbb b(coq coq2) {
        return coq2.f;
    }

    static /* synthetic */ bxy c(coq coq2) {
        return coq2.e;
    }

    static /* synthetic */ bwp d(coq coq2) {
        return coq2.g;
    }

    static /* synthetic */ vg e(coq coq2) {
        return coq2.i;
    }
}

