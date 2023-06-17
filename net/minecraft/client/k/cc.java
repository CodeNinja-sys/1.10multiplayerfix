/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

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
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.t;
import net.minecraft.client.k.bj;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.cf;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.l.k;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;
import net.minecraft.w.h;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.j;

public abstract class cc
extends de
implements bu {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final Set b = aad.a("http", "https");
    private static final dg c = dg.a('\n');
    protected r n;
    protected t o;
    public int p;
    public int q;
    protected List r = ov.a();
    protected List s = ov.a();
    public boolean t;
    protected ce u;
    private ch d;
    private int e;
    private long f;
    private int g;
    private URI h;

    public void a(int n2, int n3, float f2) {
        int n4;
        for (n4 = 0; n4 < this.r.size(); ++n4) {
            ((ch)this.r.get(n4)).c(this.n, n2, n3);
        }
        for (n4 = 0; n4 < this.s.size(); ++n4) {
            ((cf)this.s.get(n4)).a(this.n, n2, n3);
        }
        while (k.d) {
        }
    }

    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.n.a((cc)null);
            if (this.n.o == null) {
                this.n.o();
            }
        }
    }

    protected ch b(ch ch2) {
        this.r.add(ch2);
        return ch2;
    }

    public static String j() {
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
        if (!org.apache.commons.c.am.a((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    protected void a(cu cu2, int n2, int n3) {
        List list = cu2.a(this.n.j, this.n.w.y);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 == 0) {
                list.set(i2, (Object)((Object)cu2.u().e) + (String)list.get(i2));
                continue;
            }
            list.set(i2, (Object)((Object)net.minecraft.u.d.o.h) + (String)list.get(i2));
        }
        this.a(list, n2, n3);
    }

    protected void a(String string, int n2, int n3) {
        this.a(Arrays.asList(string), n2, n3);
    }

    protected void a(List list, int n2, int n3) {
        if (!list.isEmpty()) {
            int n4;
            bd.B();
            am.a();
            bd.f();
            bd.i();
            int n5 = 0;
            for (String string : list) {
                n4 = this.u.a(string);
                if (n4 <= n5) continue;
                n5 = n4;
            }
            int n6 = n2 + 12;
            int n7 = n3 - 12;
            n4 = 8;
            if (list.size() > 1) {
                n4 += 2 + (list.size() - 1) * 10;
            }
            if (n6 + n5 > this.p) {
                n6 -= 28 + n5;
            }
            if (n7 + n4 + 6 > this.q) {
                n7 = this.q - n4 - 6;
            }
            this.B = 300.0f;
            this.o.a = 300.0f;
            int n8 = -267386864;
            this.b(n6 - 3, n7 - 4, n6 + n5 + 3, n7 - 3, -267386864, -267386864);
            this.b(n6 - 3, n7 + n4 + 3, n6 + n5 + 3, n7 + n4 + 4, -267386864, -267386864);
            this.b(n6 - 3, n7 - 3, n6 + n5 + 3, n7 + n4 + 3, -267386864, -267386864);
            this.b(n6 - 4, n7 - 3, n6 - 3, n7 + n4 + 3, -267386864, -267386864);
            this.b(n6 + n5 + 3, n7 - 3, n6 + n5 + 4, n7 + n4 + 3, -267386864, -267386864);
            int n9 = 0x505000FF;
            int n10 = 1344798847;
            this.b(n6 - 3, n7 - 3 + 1, n6 - 3 + 1, n7 + n4 + 3 - 1, 0x505000FF, 1344798847);
            this.b(n6 + n5 + 2, n7 - 3 + 1, n6 + n5 + 3, n7 + n4 + 3 - 1, 0x505000FF, 1344798847);
            this.b(n6 - 3, n7 - 3, n6 + n5 + 3, n7 - 3 + 1, 0x505000FF, 0x505000FF);
            this.b(n6 - 3, n7 + n4 + 2, n6 + n5 + 3, n7 + n4 + 3, 1344798847, 1344798847);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                String string = (String)list.get(i2);
                this.u.a(string, (float)n6, (float)n7, -1);
                if (i2 == 0) {
                    n7 += 2;
                }
                n7 += 10;
            }
            this.B = 0.0f;
            this.o.a = 0.0f;
            bd.e();
            bd.j();
            am.b();
            bd.A();
        }
    }

    protected void a(a a2, int n2, int n3) {
        if (a2 != null && a2.a().i() != null) {
            block21: {
                net.minecraft.u.d.a.c c2 = a2.a().i();
                if (c2.a() == net.minecraft.u.d.a.d.c) {
                    cu cu2 = null;
                    try {
                        e e2 = net.minecraft.e.n.a(c2.b().c());
                        if (e2 instanceof e) {
                            cu2 = cu.a(e2);
                        }
                    }
                    catch (i i2) {
                        // empty catch block
                    }
                    if (cu2 != null) {
                        this.a(cu2, n2, n3);
                    } else {
                        this.a((Object)((Object)net.minecraft.u.d.o.m) + "Invalid Item!", n2, n3);
                    }
                } else if (c2.a() == net.minecraft.u.d.a.d.d) {
                    if (this.n.w.y) {
                        try {
                            e e3 = net.minecraft.e.n.a(c2.b().c());
                            if (e3 instanceof e) {
                                ArrayList arrayList = ov.a();
                                e e4 = e3;
                                arrayList.add(e4.l("name"));
                                if (e4.b("type", 8)) {
                                    String string = e4.l("type");
                                    arrayList.add("Type: " + string + " (" + net.minecraft.w.h.a(string) + ")");
                                }
                                arrayList.add(e4.l("id"));
                                this.a(arrayList, n2, n3);
                                break block21;
                            }
                            this.a((Object)((Object)net.minecraft.u.d.o.m) + "Invalid Entity!", n2, n3);
                        }
                        catch (i i3) {
                            this.a((Object)((Object)net.minecraft.u.d.o.m) + "Invalid Entity!", n2, n3);
                        }
                    }
                } else if (c2.a() == net.minecraft.u.d.a.d.a) {
                    this.a(c.b(c2.b().d()), n2, n3);
                } else if (c2.a() == net.minecraft.u.d.a.d.b) {
                    net.minecraft.r.k k2 = net.minecraft.r.o.a(c2.b().c());
                    if (k2 != null) {
                        a a3 = k2.e();
                        l l2 = new l("stats.tooltip.type." + (k2.d() ? "achievement" : "statistic"), new Object[0]);
                        l2.a().b(true);
                        String string = k2 instanceof net.minecraft.r.d ? ((net.minecraft.r.d)k2).f() : null;
                        ArrayList arrayList = ov.a(a3.d(), l2.d());
                        if (string != null) {
                            arrayList.addAll(this.u.c(string, 150));
                        }
                        this.a(arrayList, n2, n3);
                    } else {
                        this.a((Object)((Object)net.minecraft.u.d.o.m) + "Invalid statistic/achievement!", n2, n3);
                    }
                }
            }
            bd.f();
        }
    }

    protected void a(String string, boolean bl2) {
    }

    protected boolean a(a a2) {
        if (a2 == null) {
            return false;
        }
        net.minecraft.u.d.a.a a3 = a2.a().h();
        if (cc.o()) {
            if (a2.a().j() != null) {
                this.a(a2.a().j(), false);
            }
        } else if (a3 != null) {
            block19: {
                if (a3.a() == net.minecraft.u.d.a.b.a) {
                    if (!this.n.w.p) {
                        return false;
                    }
                    try {
                        URI uRI = new URI(a3.b());
                        String string = uRI.getScheme();
                        if (string == null) {
                            throw new URISyntaxException(a3.b(), "Missing protocol");
                        }
                        if (!b.contains(string.toLowerCase())) {
                            throw new URISyntaxException(a3.b(), "Unsupported protocol: " + string.toLowerCase());
                        }
                        if (this.n.w.q) {
                            this.h = uRI;
                            this.n.a(new bj((bu)this, a3.b(), 31102009, false));
                            break block19;
                        }
                        this.a(uRI);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        a.b("Can't open url for {}", a3, uRISyntaxException);
                    }
                } else if (a3.a() == net.minecraft.u.d.a.b.b) {
                    URI uRI = new File(a3.b()).toURI();
                    this.a(uRI);
                } else if (a3.a() == net.minecraft.u.d.a.b.d) {
                    this.a(a3.b(), true);
                } else if (a3.a() == net.minecraft.u.d.a.b.c) {
                    this.b(a3.b(), false);
                } else {
                    a.b("Don't know how to handle {}", a3);
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
            this.n.t.c().a(string);
        }
        this.n.j.b(string);
    }

    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            for (int i2 = 0; i2 < this.r.size(); ++i2) {
                ch ch2 = (ch)this.r.get(i2);
                if (!ch2.a(this.n, n2, n3)) continue;
                this.d = ch2;
                ch2.a(this.n.U());
                this.a(ch2);
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

    protected void a(ch ch2) {
    }

    public void a(r r2, int n2, int n3) {
        this.n = r2;
        this.o = r2.ac();
        this.u = r2.m;
        this.p = n2;
        this.q = n3;
        this.r.clear();
        this.ct_();
    }

    public void a(int n2, int n3) {
        this.p = n2;
        this.q = n3;
    }

    public void ct_() {
    }

    public void k() {
        if (j.e()) {
            while (j.h()) {
                this.cp_();
            }
        }
        if (org.lwjgl.a.g.b()) {
            while (org.lwjgl.a.g.f()) {
                this.l();
            }
        }
    }

    public void cp_() {
        int n2 = j.m() * this.p / this.n.e;
        int n3 = this.q - j.n() * this.q / this.n.f - 1;
        int n4 = j.i();
        if (j.j()) {
            if (this.n.w.A && this.g++ > 0) {
                return;
            }
            this.e = n4;
            this.f = net.minecraft.client.r.I();
            this.a(n2, n3, this.e);
        } else if (n4 != -1) {
            if (this.n.w.A && --this.g > 0) {
                return;
            }
            this.e = -1;
            this.b(n2, n3, n4);
        } else if (this.e != -1 && this.f > 0L) {
            long l2 = net.minecraft.client.r.I() - this.f;
            this.a(n2, n3, this.e, l2);
        }
    }

    public void l() {
        char c2 = org.lwjgl.a.g.i();
        if (org.lwjgl.a.g.j() == 0 && c2 >= ' ' || org.lwjgl.a.g.k()) {
            this.a(c2, org.lwjgl.a.g.j());
        }
        this.n.W();
    }

    public void bY_() {
    }

    public void cs_() {
    }

    public void m() {
        this.b(0);
    }

    public void b(int n2) {
        if (this.n.h != null) {
            this.b(0, 0, this.p, this.q, -1072689136, -804253680);
        } else {
            this.c(n2);
        }
    }

    public void c(int n2) {
        bd.f();
        bd.o();
        ci ci2 = ci.a();
        g g2 = ci2.c();
        this.n.N().a(y);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        g2.a(7, net.minecraft.client.g.d.b.i);
        g2.b(0.0, (double)this.q, 0.0).a(0.0, (float)this.q / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        g2.b((double)this.p, (double)this.q, 0.0).a((float)this.p / 32.0f, (float)this.q / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        g2.b((double)this.p, 0.0, 0.0).a((float)this.p / 32.0f, (double)n2).b(64, 64, 64, 255).d();
        g2.b(0.0, 0.0, 0.0).a(0.0, (double)n2).b(64, 64, 64, 255).d();
        ci2.b();
    }

    public boolean cq_() {
        return true;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 31102009) {
            if (bl2) {
                this.a(this.h);
            }
            this.h = null;
            this.n.a(this);
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
        return net.minecraft.client.r.b ? org.lwjgl.a.g.a(219) || org.lwjgl.a.g.a(220) : org.lwjgl.a.g.a(29) || org.lwjgl.a.g.a(157);
    }

    public static boolean o() {
        return org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54);
    }

    public static boolean p() {
        return org.lwjgl.a.g.a(56) || org.lwjgl.a.g.a(184);
    }

    public static boolean d(int n2) {
        return n2 == 45 && cc.n() && !cc.o() && !cc.p();
    }

    public static boolean e(int n2) {
        return n2 == 47 && cc.n() && !cc.o() && !cc.p();
    }

    public static boolean f(int n2) {
        return n2 == 46 && cc.n() && !cc.o() && !cc.p();
    }

    public static boolean g(int n2) {
        return n2 == 30 && cc.n() && !cc.o() && !cc.p();
    }

    public void b(r r2, int n2, int n3) {
        this.a(r2, n2, n3);
    }
}

