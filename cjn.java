/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.a.j;

public abstract class cjn
extends alo
implements awn {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final Set b = aad.a("http", "https");
    private static final dg c = dg.a('\n');
    protected bxy u;
    protected bth v;
    public int w;
    public int x;
    protected List y = ov.a();
    protected List z = ov.a();
    public boolean A;
    protected deb B;
    private cwv d;
    private int e;
    private long f;
    private int g;
    private URI h;

    public void a(int n2, int n3, float f2) {
        int n4;
        for (n4 = 0; n4 < this.y.size(); ++n4) {
            ((cwv)this.y.get(n4)).c(this.u, n2, n3);
        }
        for (n4 = 0; n4 < this.z.size(); ++n4) {
            ((arw)this.z.get(n4)).a(this.u, n2, n3);
        }
    }

    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.u.a((cjn)null);
            if (this.u.m == null) {
                this.u.q();
            }
        }
    }

    protected cwv b(cwv cwv2) {
        this.y.add(cwv2);
        return cwv2;
    }

    public static String l() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    public static void d(String string) {
        if (am.a((CharSequence)string)) {
            return;
        }
        try {
            StringSelection stringSelection = new StringSelection(string);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected void a(bhl bhl2, int n2, int n3) {
        List list = bhl2.a(this.u.h, this.u.u.y);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 == 0) {
                list.set(i2, (Object)((Object)bhl2.u().e) + (String)list.get(i2));
                continue;
            }
            list.set(i2, (Object)((Object)aug.h) + (String)list.get(i2));
        }
        this.a(list, n2, n3);
    }

    protected void a(String string, int n2, int n3) {
        this.a(Arrays.asList(string), n2, n3);
    }

    protected void a(List list, int n2, int n3) {
        int n4;
        if (list.isEmpty()) {
            return;
        }
        cja.B();
        bjr.a();
        cja.f();
        cja.i();
        int n5 = 0;
        for (String string : list) {
            n4 = this.B.a(string);
            if (n4 <= n5) continue;
            n5 = n4;
        }
        int n6 = n2 + 12;
        int n7 = n3 - 12;
        n4 = n5;
        int n8 = 8;
        if (list.size() > 1) {
            n8 += 2 + (list.size() - 1) * 10;
        }
        if (n6 + n5 > this.w) {
            n6 -= 28 + n5;
        }
        if (n7 + n8 + 6 > this.x) {
            n7 = this.x - n8 - 6;
        }
        this.q = 300.0f;
        this.v.a = 300.0f;
        int n9 = -267386864;
        this.b(n6 - 3, n7 - 4, n6 + n4 + 3, n7 - 3, -267386864, -267386864);
        this.b(n6 - 3, n7 + n8 + 3, n6 + n4 + 3, n7 + n8 + 4, -267386864, -267386864);
        this.b(n6 - 3, n7 - 3, n6 + n4 + 3, n7 + n8 + 3, -267386864, -267386864);
        this.b(n6 - 4, n7 - 3, n6 - 3, n7 + n8 + 3, -267386864, -267386864);
        this.b(n6 + n4 + 3, n7 - 3, n6 + n4 + 4, n7 + n8 + 3, -267386864, -267386864);
        int n10 = 0x505000FF;
        int n11 = 1344798847;
        this.b(n6 - 3, n7 - 3 + 1, n6 - 3 + 1, n7 + n8 + 3 - 1, 0x505000FF, 1344798847);
        this.b(n6 + n4 + 2, n7 - 3 + 1, n6 + n4 + 3, n7 + n8 + 3 - 1, 0x505000FF, 1344798847);
        this.b(n6 - 3, n7 - 3, n6 + n4 + 3, n7 - 3 + 1, 0x505000FF, 0x505000FF);
        this.b(n6 - 3, n7 + n8 + 2, n6 + n4 + 3, n7 + n8 + 3, 1344798847, 1344798847);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            this.B.a(string, (float)n6, (float)n7, -1);
            if (i2 == 0) {
                n7 += 2;
            }
            n7 += 10;
        }
        this.q = 0.0f;
        this.v.a = 0.0f;
        cja.e();
        cja.j();
        bjr.b();
        cja.A();
    }

    protected void a(cbg cbg2, int n2, int n3) {
        block21: {
            if (cbg2 == null || cbg2.h().i() == null) {
                return;
            }
            dex dex2 = cbg2.h().i();
            if (dex2.a() == km.c) {
                bhl bhl2 = null;
                try {
                    bvp bvp2 = bdg.a(dex2.b().i());
                    if (bvp2 instanceof bvp) {
                        bhl2 = bhl.a(bvp2);
                    }
                }
                catch (aoo aoo2) {
                    // empty catch block
                }
                if (bhl2 != null) {
                    this.a(bhl2, n2, n3);
                } else {
                    this.a((Object)((Object)aug.m) + "Invalid Item!", n2, n3);
                }
            } else if (dex2.a() == km.d) {
                if (this.u.u.y) {
                    try {
                        bvp bvp3 = bdg.a(dex2.b().i());
                        if (bvp3 instanceof bvp) {
                            ArrayList arrayList = ov.a();
                            bvp bvp4 = bvp3;
                            arrayList.add(bvp4.l("name"));
                            if (bvp4.b("type", 8)) {
                                String string = bvp4.l("type");
                                arrayList.add("Type: " + string + " (" + vb.a(string) + ")");
                            }
                            arrayList.add(bvp4.l("id"));
                            this.a(arrayList, n2, n3);
                            break block21;
                        }
                        this.a((Object)((Object)aug.m) + "Invalid Entity!", n2, n3);
                    }
                    catch (aoo aoo3) {
                        this.a((Object)((Object)aug.m) + "Invalid Entity!", n2, n3);
                    }
                }
            } else if (dex2.a() == km.a) {
                this.a(c.b(dex2.b().j()), n2, n3);
            } else if (dex2.a() == km.b) {
                cyd cyd2 = bpv.a(dex2.b().i());
                if (cyd2 != null) {
                    cbg cbg3 = cyd2.f();
                    du du2 = new du("stats.tooltip.type." + (cyd2.e() ? "achievement" : "statistic"), new Object[0]);
                    du2.h().b(true);
                    String string = cyd2 instanceof box ? ((box)cyd2).g() : null;
                    ArrayList arrayList = ov.a(cbg3.j(), du2.j());
                    if (string != null) {
                        arrayList.addAll(this.B.c(string, 150));
                    }
                    this.a(arrayList, n2, n3);
                } else {
                    this.a((Object)((Object)aug.m) + "Invalid statistic/achievement!", n2, n3);
                }
            }
        }
        cja.f();
    }

    protected void a(String string, boolean bl2) {
    }

    protected boolean a(cbg cbg2) {
        if (cbg2 == null) {
            return false;
        }
        cxk cxk2 = cbg2.h().h();
        if (cjn.o()) {
            if (cbg2.h().j() != null) {
                this.a(cbg2.h().j(), false);
            }
        } else if (cxk2 != null) {
            block19: {
                if (cxk2.a() == nc.a) {
                    if (!this.u.u.p) {
                        return false;
                    }
                    try {
                        URI uRI = new URI(cxk2.b());
                        String string = uRI.getScheme();
                        if (string == null) {
                            throw new URISyntaxException(cxk2.b(), "Missing protocol");
                        }
                        if (!b.contains(string.toLowerCase())) {
                            throw new URISyntaxException(cxk2.b(), "Unsupported protocol: " + string.toLowerCase());
                        }
                        if (this.u.u.q) {
                            this.h = uRI;
                            this.u.a(new cdr((awn)this, cxk2.b(), 31102009, false));
                            break block19;
                        }
                        this.a(uRI);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        a.b("Can't open url for {}", cxk2, uRISyntaxException);
                    }
                } else if (cxk2.a() == nc.b) {
                    URI uRI = new File(cxk2.b()).toURI();
                    this.a(uRI);
                } else if (cxk2.a() == nc.d) {
                    this.a(cxk2.b(), true);
                } else if (cxk2.a() == nc.c) {
                    this.b(cxk2.b(), false);
                } else {
                    a.b("Don't know how to handle {}", cxk2);
                }
            }
            return true;
        }
        return false;
    }

    public void e(String string) {
        this.b(string, true);
    }

    public void b(String string, boolean bl2) {
        if (bl2) {
            this.u.r.c().a(string);
        }
        this.u.h.a(string);
    }

    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                cwv cwv2 = (cwv)this.y.get(i2);
                if (!cwv2.b(this.u, n2, n3)) continue;
                this.d = cwv2;
                cwv2.a(this.u.W());
                this.a(cwv2);
            }
        }
    }

    protected void b(int n2, int n3, int n4) {
        if (this.d != null && n4 == 0) {
            this.d.a(n2, n3);
            this.d = null;
        }
    }

    protected void a(int n2, int n3, int n4, long l2) {
    }

    protected void a(cwv cwv2) {
    }

    public void a(bxy bxy2, int n2, int n3) {
        this.u = bxy2;
        this.v = bxy2.ae();
        this.B = bxy2.k;
        this.w = n2;
        this.x = n3;
        this.y.clear();
        this.cH_();
    }

    public void b(int n2, int n3) {
        this.w = n2;
        this.x = n3;
    }

    public void cH_() {
    }

    public void m() {
        if (j.e()) {
            while (j.h()) {
                this.p_();
            }
        }
        if (org.lwjgl.a.g.b()) {
            while (org.lwjgl.a.g.f()) {
                this.k();
            }
        }
    }

    public void p_() {
        int n2 = j.m() * this.w / this.u.d;
        int n3 = this.x - j.n() * this.x / this.u.e - 1;
        int n4 = j.i();
        if (j.j()) {
            if (this.u.u.A && this.g++ > 0) {
                return;
            }
            this.e = n4;
            this.f = bxy.K();
            this.a(n2, n3, this.e);
        } else if (n4 != -1) {
            if (this.u.u.A && --this.g > 0) {
                return;
            }
            this.e = -1;
            this.b(n2, n3, n4);
        } else if (this.e != -1 && this.f > 0L) {
            long l2 = bxy.K() - this.f;
            this.a(n2, n3, this.e, l2);
        }
    }

    public void k() {
        char c2 = org.lwjgl.a.g.i();
        if (org.lwjgl.a.g.j() == 0 && c2 >= ' ' || org.lwjgl.a.g.k()) {
            this.a(c2, org.lwjgl.a.g.j());
        }
        this.u.Y();
    }

    public void d() {
    }

    public void aG_() {
    }

    public void aH_() {
        this.a_(0);
    }

    public void a_(int n2) {
        if (this.u.f != null) {
            this.b(0, 0, this.w, this.x, -1072689136, -804253680);
        } else {
            this.c(n2);
        }
    }

    public void c(int n2) {
        cja.f();
        cja.o();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.u.P().a(n);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)this.x, 0.0).a(0.0, (float)this.x / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        bix2.b((double)this.w, (double)this.x, 0.0).a((float)this.w / 32.0f, (float)this.x / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        bix2.b((double)this.w, 0.0, 0.0).a((float)this.w / 32.0f, (double)n2).b(64, 64, 64, 255).d();
        bix2.b(0.0, 0.0, 0.0).a(0.0, (double)n2).b(64, 64, 64, 255).d();
        bha2.b();
    }

    public boolean q_() {
        return true;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 31102009) {
            if (bl2) {
                this.a(this.h);
            }
            this.h = null;
            this.u.a(this);
        }
    }

    private void a(URI uRI) {
        try {
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            class_.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            a.b("Couldn't open link: {}", throwable2 == null ? "<UNKNOWN>" : throwable2.getMessage());
        }
    }

    public static boolean n() {
        if (bxy.a) {
            return org.lwjgl.a.g.a(219) || org.lwjgl.a.g.a(220);
        }
        return org.lwjgl.a.g.a(29) || org.lwjgl.a.g.a(157);
    }

    public static boolean o() {
        return org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54);
    }

    public static boolean p() {
        return org.lwjgl.a.g.a(56) || org.lwjgl.a.g.a(184);
    }

    public static boolean d(int n2) {
        return n2 == 45 && cjn.n() && !cjn.o() && !cjn.p();
    }

    public static boolean e(int n2) {
        return n2 == 47 && cjn.n() && !cjn.o() && !cjn.p();
    }

    public static boolean f(int n2) {
        return n2 == 46 && cjn.n() && !cjn.o() && !cjn.p();
    }

    public static boolean g(int n2) {
        return n2 == 30 && cjn.n() && !cjn.o() && !cjn.p();
    }

    public void b(bxy bxy2, int n2, int n3) {
        this.a(bxy2, n2, n3);
    }
}

