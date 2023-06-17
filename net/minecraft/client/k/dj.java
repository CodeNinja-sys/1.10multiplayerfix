/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import com.a.b.aa;
import io.netty.b.bi;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ac;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.y;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.ct;
import net.minecraft.m.cu;
import net.minecraft.u.bp;
import net.minecraft.u.d.k;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class dj
extends cc {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bp b = new bp("textures/gui/book.png");
    private final b c;
    private final cu d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private final int i = 192;
    private final int j = 192;
    private int k = 1;
    private int l;
    private q m;
    private String v = "";
    private List w;
    private int x = -1;
    private ac C;
    private ac D;
    private ch E;
    private ch F;
    private ch G;
    private ch H;

    public dj(b b2, cu cu2, boolean bl2) {
        this.c = b2;
        this.d = cu2;
        this.e = bl2;
        if (cu2.n()) {
            e e2 = cu2.o();
            this.m = e2.c("pages", 8);
            if (this.m != null) {
                this.m = this.m.f();
                this.k = this.m.e();
                if (this.k < 1) {
                    this.k = 1;
                }
            }
        }
        if (this.m == null && bl2) {
            this.m = new q();
            this.m.a(new net.minecraft.e.y(""));
            this.k = 1;
        }
    }

    @Override
    public void bY_() {
        super.bY_();
        ++this.h;
    }

    @Override
    public void ct_() {
        this.r.clear();
        org.lwjgl.a.g.a(true);
        if (this.e) {
            this.F = this.b(new ch(3, this.p / 2 - 100, 196, 98, 20, net.minecraft.client.f.u.a("book.signButton", new Object[0])));
            this.E = this.b(new ch(0, this.p / 2 + 2, 196, 98, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
            this.G = this.b(new ch(5, this.p / 2 - 100, 196, 98, 20, net.minecraft.client.f.u.a("book.finalizeButton", new Object[0])));
            this.H = this.b(new ch(4, this.p / 2 + 2, 196, 98, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        } else {
            this.E = this.b(new ch(0, this.p / 2 - 100, 196, 200, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        }
        int n2 = (this.p - 192) / 2;
        int n3 = 2;
        this.C = (ac)this.b(new ac(1, n2 + 120, 156, true));
        this.D = (ac)this.b(new ac(2, n2 + 38, 156, false));
        this.g();
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    private void g() {
        this.C.l = !this.g && (this.l < this.k - 1 || this.e);
        this.D.l = !this.g && this.l > 0;
        boolean bl2 = this.E.l = !this.e || !this.g;
        if (this.e) {
            this.F.l = !this.g;
            this.H.l = this.g;
            this.G.l = this.g;
            this.G.k = !this.v.trim().isEmpty();
        }
    }

    private void a(boolean bl2) {
        if (this.e && this.f && this.m != null) {
            Object object;
            while (this.m.e() > 1) {
                object = this.m.g(this.m.e() - 1);
                if (!((String)object).isEmpty()) break;
                this.m.a(this.m.e() - 1);
            }
            if (this.d.n()) {
                object = this.d.o();
                ((e)object).a("pages", this.m);
            } else {
                this.d.a("pages", this.m);
            }
            object = "MC|BEdit";
            if (bl2) {
                object = "MC|BSign";
                this.d.a("author", new net.minecraft.e.y(this.c.X()));
                this.d.a("title", new net.minecraft.e.y(this.v.trim()));
            }
            a a2 = new a(bi.a());
            a2.a(this.d);
            this.n.v().a(new j((String)object, a2));
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 0) {
                this.n.a((cc)null);
                this.a(false);
            } else if (ch2.j == 3 && this.e) {
                this.g = true;
            } else if (ch2.j == 1) {
                if (this.l < this.k - 1) {
                    ++this.l;
                } else if (this.e) {
                    this.h();
                    if (this.l < this.k - 1) {
                        ++this.l;
                    }
                }
            } else if (ch2.j == 2) {
                if (this.l > 0) {
                    --this.l;
                }
            } else if (ch2.j == 5 && this.g) {
                this.a(true);
                this.n.a((cc)null);
            } else if (ch2.j == 4 && this.g) {
                this.g = false;
            }
            this.g();
        }
    }

    private void h() {
        if (this.m != null && this.m.e() < 50) {
            this.m.a(new net.minecraft.e.y(""));
            ++this.k;
            this.f = true;
        }
    }

    @Override
    protected void a(char c2, int n2) {
        super.a(c2, n2);
        if (this.e) {
            if (this.g) {
                this.c(c2, n2);
            } else {
                this.b(c2, n2);
            }
        }
    }

    private void b(char c2, int n2) {
        if (cc.e(n2)) {
            this.b(cc.j());
        } else {
            switch (n2) {
                case 14: {
                    String string = this.i();
                    if (!string.isEmpty()) {
                        this.a(string.substring(0, string.length() - 1));
                    }
                    return;
                }
                case 28: 
                case 156: {
                    this.b("\n");
                    return;
                }
            }
            if (net.minecraft.u.d.a(c2)) {
                this.b(Character.toString(c2));
            }
        }
    }

    private void c(char c2, int n2) {
        switch (n2) {
            case 14: {
                if (!this.v.isEmpty()) {
                    this.v = this.v.substring(0, this.v.length() - 1);
                    this.g();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.v.isEmpty()) {
                    this.a(true);
                    this.n.a((cc)null);
                }
                return;
            }
        }
        if (this.v.length() < 16 && net.minecraft.u.d.a(c2)) {
            this.v = String.valueOf(this.v) + Character.toString(c2);
            this.g();
            this.f = true;
        }
    }

    private String i() {
        return this.m != null && this.l >= 0 && this.l < this.m.e() ? this.m.g(this.l) : "";
    }

    private void a(String string) {
        if (this.m != null && this.l >= 0 && this.l < this.m.e()) {
            this.m.a(this.l, new net.minecraft.e.y(string));
            this.f = true;
        }
    }

    private void b(String string) {
        String string2 = this.i();
        String string3 = String.valueOf(string2) + string;
        int n2 = this.u.b(String.valueOf(string3) + (Object)((Object)net.minecraft.u.d.o.a) + "_", 118);
        if (n2 <= 128 && string3.length() < 256) {
            this.a(string3);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(b);
        int n4 = (this.p - 192) / 2;
        int n5 = 2;
        this.a_(n4, 2, 0, 0, 192, 192);
        if (this.g) {
            String string = this.v;
            if (this.e) {
                string = this.h / 6 % 2 == 0 ? String.valueOf(string) + (Object)((Object)net.minecraft.u.d.o.a) + "_" : String.valueOf(string) + (Object)((Object)net.minecraft.u.d.o.h) + "_";
            }
            String string2 = net.minecraft.client.f.u.a("book.editTitle", new Object[0]);
            int n6 = this.u.a(string2);
            this.u.a(string2, n4 + 36 + (116 - n6) / 2, 34, 0);
            int n7 = this.u.a(string);
            this.u.a(string, n4 + 36 + (116 - n7) / 2, 50, 0);
            String string3 = net.minecraft.client.f.u.a("book.byAuthor", this.c.X());
            int n8 = this.u.a(string3);
            this.u.a((Object)((Object)net.minecraft.u.d.o.i) + string3, n4 + 36 + (116 - n8) / 2, 60, 0);
            String string4 = net.minecraft.client.f.u.a("book.finalizeWarning", new Object[0]);
            this.u.a(string4, n4 + 36, 82, 116, 0);
        } else {
            String string = net.minecraft.client.f.u.a("book.pageIndicator", this.l + 1, this.k);
            String string5 = "";
            if (this.m != null && this.l >= 0 && this.l < this.m.e()) {
                string5 = this.m.g(this.l);
            }
            if (this.e) {
                string5 = this.u.b() ? String.valueOf(string5) + "_" : (this.h / 6 % 2 == 0 ? String.valueOf(string5) + (Object)((Object)net.minecraft.u.d.o.a) + "_" : String.valueOf(string5) + (Object)((Object)net.minecraft.u.d.o.h) + "_");
            } else if (this.x != this.l) {
                net.minecraft.u.d.a a2;
                if (ct.b(this.d.o())) {
                    try {
                        a2 = net.minecraft.u.d.b.a(string5);
                        this.w = a2 != null ? net.minecraft.client.k.y.a(a2, 116, this.u, true, true) : null;
                    }
                    catch (aa aa2) {
                        this.w = null;
                    }
                } else {
                    a2 = new k((Object)((Object)net.minecraft.u.d.o.e) + "* Invalid book tag *");
                    this.w = ov.a(a2);
                }
                this.x = this.l;
            }
            int n9 = this.u.a(string);
            this.u.a(string, n4 - n9 + 192 - 44, 18, 0);
            if (this.w == null) {
                this.u.a(string5, n4 + 36, 34, 116, 0);
            } else {
                int n10 = Math.min(128 / this.u.a, this.w.size());
                for (int i2 = 0; i2 < n10; ++i2) {
                    net.minecraft.u.d.a a3 = (net.minecraft.u.d.a)this.w.get(i2);
                    this.u.a(a3.c(), n4 + 36, 34 + i2 * this.u.a, 0);
                }
                net.minecraft.u.d.a a4 = this.b(n2, n3);
                if (a4 != null) {
                    this.a(a4, n2, n3);
                }
            }
        }
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        net.minecraft.u.d.a a2;
        if (n4 == 0 && (a2 = this.b(n2, n3)) != null && this.a(a2)) {
            return;
        }
        super.a(n2, n3, n4);
    }

    @Override
    protected boolean a(net.minecraft.u.d.a a2) {
        net.minecraft.u.d.a.a a3 = a2.a().h();
        if (a3 == null) {
            return false;
        }
        if (a3.a() == net.minecraft.u.d.a.b.e) {
            String string = a3.b();
            try {
                int n2 = Integer.parseInt(string) - 1;
                if (n2 >= 0 && n2 < this.k && n2 != this.l) {
                    this.l = n2;
                    this.g();
                    return true;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return false;
        }
        boolean bl2 = super.a(a2);
        if (bl2 && a3.a() == net.minecraft.u.d.a.b.c) {
            this.n.a((cc)null);
        }
        return bl2;
    }

    public net.minecraft.u.d.a b(int n2, int n3) {
        if (this.w == null) {
            return null;
        }
        int n4 = n2 - (this.p - 192) / 2 - 36;
        int n5 = n3 - 2 - 16 - 16;
        if (n4 >= 0 && n5 >= 0) {
            int n6 = Math.min(128 / this.u.a, this.w.size());
            if (n4 <= 116 && n5 < this.n.m.a * n6 + n6) {
                int n7 = n5 / this.n.m.a;
                if (n7 >= 0 && n7 < this.w.size()) {
                    net.minecraft.u.d.a a2 = (net.minecraft.u.d.a)this.w.get(n7);
                    int n8 = 0;
                    for (net.minecraft.u.d.a a3 : a2) {
                        if (!(a3 instanceof k) || (n8 += this.n.m.a(((k)a3).g())) <= n4) continue;
                        return a3;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    static /* synthetic */ bp f() {
        return b;
    }
}

