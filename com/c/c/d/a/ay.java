/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.ac;
import com.c.c.b.ae;
import com.c.c.b.m;
import com.c.c.d.a.av;
import com.c.c.d.a.az;
import com.c.c.d.a.ba;
import com.c.c.d.e;
import com.c.c.e.s;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class ay
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "realms:textures/gui/realms/link_icons.png";
    private static final String c = "realms:textures/gui/realms/trailer_icons.png";
    private static final String d = "realms:textures/gui/realms/slot_frame.png";
    private final av e;
    private ac s;
    private final List t = new ArrayList();
    private ba u;
    private int v = -1;
    private String w;
    private static final int x = 0;
    private static final int y = 1;
    private f z;
    private String A = null;
    private String B = null;
    private m C;
    private int D = 0;
    private String E = null;
    private String F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private ae J;
    private boolean K = false;
    private boolean L = false;

    public ay(av av2, ac ac2, m m2) {
        this.e = av2;
        this.s = ac2;
        this.C = m2;
        String string = this.w = this.C == com.c.c.b.m.b ? ay.f("mco.template.title.minigame") : ay.f("mco.template.title");
        if (this.J == null) {
            this.J = new ae();
            this.J.c = 10;
        }
        if (this.J.c == 0) {
            this.J.c = 10;
        }
    }

    public ay(av av2, ac ac2, m m2, ae ae2) {
        this(av2, ac2, m2);
        this.I = true;
        this.t.addAll(ae2 == null ? new ArrayList() : ae2.a);
        this.J = ae2;
        if (this.J.c == 0) {
            this.J.c = 10;
        }
    }

    public void a(String string) {
        this.w = string;
    }

    public void b(String string) {
        this.E = string;
        this.G = true;
    }

    public void c(String string) {
        this.F = string;
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.H && this.F != null) {
            com.c.c.e.s.a("https://beta.minecraft.net/realms/adventure-maps-in-1-9");
        }
    }

    @Override
    public void a() {
        super.a();
        this.u.h();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.u = new ba(this);
        if (!this.I && this.t.isEmpty()) {
            this.J.b = 0;
            this.J.c = 10;
            this.f();
        }
        this.b(ay.a(0, this.r() / 2 + 6, this.s() - 32, 153, 20, this.C == com.c.c.b.m.b ? ay.f("gui.cancel") : ay.f("gui.back")));
        this.z = ay.a(1, this.r() / 2 - 154, this.s() - 32, 153, 20, ay.f("mco.template.button.select"));
        this.b(this.z);
        this.z.b(false);
    }

    @Override
    public void g() {
        super.g();
        --this.D;
        if (this.D < 0) {
            this.D = 0;
        }
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 0: {
                this.c();
                break;
            }
            case 1: {
                this.e();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        switch (n2) {
            case 1: {
                this.c();
                break;
            }
            case 200: {
                if (this.v != -1) {
                    int n3 = this.v;
                    if (n3 == 0) {
                        this.u.b(0 - this.u.i());
                        return;
                    }
                    int n4 = n3 - 1;
                    if (n4 > -1) {
                        this.v = n4;
                        int n5 = Math.max(0, this.u.b() - (this.s() - 40 - (this.G ? com.c.c.d.e.a(1) : 32) - 4));
                        int n6 = (int)Math.floor((this.s() - 40 - (this.G ? com.c.c.d.e.a(1) : 32)) / 46);
                        int n7 = this.u.i();
                        int n8 = (int)Math.ceil((float)n7 / 46.0f);
                        int n9 = n5 / this.t.size();
                        int n10 = n9 * n4;
                        int n11 = n10 - this.u.i();
                        if (n4 < n8 || n4 > n8 + n6) {
                            this.u.b(n11);
                        }
                        return;
                    }
                }
                this.v = 0;
                this.u.b(0 - this.u.i());
                break;
            }
            case 208: {
                if (this.v != -1) {
                    int n12 = this.v;
                    int n13 = Math.max(0, this.u.b() - (this.s() - 40 - (this.G ? com.c.c.d.e.a(1) : 32)));
                    if (n12 == this.t.size() - 1) {
                        this.u.b(n13 - this.u.i() + 46);
                        return;
                    }
                    int n14 = n12 + 1;
                    if (n14 == this.t.size() - 1) {
                        this.v = n14;
                        this.u.b(n13 - this.u.i() + 46);
                        return;
                    }
                    if (n14 < this.t.size()) {
                        this.v = n14;
                        int n15 = (int)Math.floor((this.s() - 40 - (this.G ? com.c.c.d.e.a(1) : 32)) / 46);
                        int n16 = this.u.i();
                        int n17 = (int)Math.ceil((float)n16 / 46.0f);
                        int n18 = n13 / this.t.size();
                        int n19 = n18 * n14;
                        int n20 = n19 - this.u.i();
                        if (n20 > 0) {
                            n20 += n18;
                        }
                        if (n14 < n17 || n14 >= n17 + n15) {
                            this.u.b(n20);
                        }
                        return;
                    }
                }
                this.v = 0;
                this.u.b(-(this.u.a() * 46));
                break;
            }
            case 28: 
            case 156: {
                this.e();
            }
        }
    }

    private void c() {
        this.e.a((Object)null);
        net.minecraft.s.b.a(this.e);
    }

    private void e() {
        if (this.v >= 0 && this.v < this.t.size()) {
            ac ac2 = (ac)this.t.get(this.v);
            ac2.a(this.C == com.c.c.b.m.b);
            this.e.a(ac2);
        }
    }

    private void f() {
        if (!this.K && !this.L) {
            this.K = true;
            new az(this, "realms-template-fetcher").start();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.A = null;
        this.B = null;
        this.H = false;
        if (!this.J.a()) {
            this.f();
        }
        this.p();
        this.u.a(n2, n3, f2);
        this.a(this.w, this.r() / 2, 13, 0xFFFFFF);
        if (this.G) {
            int n4;
            int n5;
            String[] arrstring = this.E.split("\\\\n");
            for (n5 = 0; n5 < arrstring.length; ++n5) {
                int n6 = this.e(arrstring[n5]);
                n4 = this.r() / 2 - n6 / 2;
                int n7 = com.c.c.d.e.a(-1 + n5);
                if (n2 < n4 || n2 > n4 + n6 || n3 < n7 || n3 > n7 + this.t()) continue;
                this.H = true;
            }
            for (n5 = 0; n5 < arrstring.length; ++n5) {
                String string = arrstring[n5];
                n4 = 0xA0A0A0;
                if (this.F != null) {
                    if (this.H) {
                        n4 = 7107012;
                        string = "\u00a7n" + string;
                    } else {
                        n4 = 0x3366BB;
                    }
                }
                this.a(string, this.r() / 2, com.c.c.d.e.a(-1 + n5), n4);
            }
        }
        super.a(n2, n3, f2);
        if (this.A != null) {
            this.a(this.A, n2, n3);
        }
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.e(string);
        this.b(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.c(string, n4, n5, 0xFFFFFF);
    }

    static /* synthetic */ ae a(ay ay2, ae ae2) {
        ay2.J = ae2;
        return ay2.J;
    }

    static /* synthetic */ ae a(ay ay2) {
        return ay2.J;
    }

    static /* synthetic */ m b(ay ay2) {
        return ay2.C;
    }

    static /* synthetic */ List c(ay ay2) {
        return ay2.t;
    }

    static /* synthetic */ boolean a(ay ay2, boolean bl2) {
        ay2.L = bl2;
        return ay2.L;
    }

    static /* synthetic */ d b() {
        return a;
    }

    static /* synthetic */ boolean b(ay ay2, boolean bl2) {
        ay2.K = bl2;
        return ay2.K;
    }

    static /* synthetic */ boolean d(ay ay2) {
        return ay2.G;
    }

    static /* synthetic */ f e(ay ay2) {
        return ay2.z;
    }

    static /* synthetic */ int a(ay ay2, int n2) {
        ay2.v = n2;
        return ay2.v;
    }

    static /* synthetic */ ac a(ay ay2, ac ac2) {
        ay2.s = ac2;
        return ay2.s;
    }

    static /* synthetic */ int f(ay ay2) {
        return ay2.D;
    }

    static /* synthetic */ int b(ay ay2, int n2) {
        ay2.D = n2;
        return ay2.D;
    }

    static /* synthetic */ void g(ay ay2) {
        ay2.e();
    }

    static /* synthetic */ ac h(ay ay2) {
        return ay2.s;
    }

    static /* synthetic */ int i(ay ay2) {
        return ay2.v;
    }

    static /* synthetic */ String j(ay ay2) {
        return ay2.B;
    }

    static /* synthetic */ String a(ay ay2, String string) {
        ay2.A = string;
        return ay2.A;
    }

    static /* synthetic */ String b(ay ay2, String string) {
        ay2.B = string;
        return ay2.B;
    }
}

