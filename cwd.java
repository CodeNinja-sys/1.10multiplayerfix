/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class cwd
extends bql {
    private int a;
    private bmh b;
    private boolean c;
    private List d;
    private List e;
    private String f;

    public void a(bhl bhl2) {
        this.b = null;
        if (bhl2.n() && bhl2.o().b("BlockEntityTag", 10)) {
            bvp bvp2 = bhl2.o().o("BlockEntityTag");
            if (bvp2.e("Patterns")) {
                this.b = bvp2.c("Patterns", 10).c();
            }
            this.a = bvp2.b("Base", 99) ? bvp2.h("Base") : bhl2.h() & 0xF;
        } else {
            this.a = bhl2.h() & 0xF;
        }
        this.d = null;
        this.e = null;
        this.f = "";
        this.c = true;
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        cwd.a(bvp2, this.a, this.b);
        return bvp2;
    }

    public static void a(bvp bvp2, int n2, bmh bmh2) {
        bvp2.a("Base", n2);
        if (bmh2 != null) {
            bvp2.a("Patterns", bmh2);
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bvp2.h("Base");
        this.b = bvp2.c("Patterns", 10);
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = true;
    }

    @Override
    public hv a_() {
        return new hv(this.l, 6, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    public int f() {
        return this.a;
    }

    public static int b(bhl bhl2) {
        bvp bvp2 = bhl2.a("BlockEntityTag", false);
        if (bvp2 != null && bvp2.e("Base")) {
            return bvp2.h("Base");
        }
        return bhl2.h();
    }

    public static int c(bhl bhl2) {
        bvp bvp2 = bhl2.a("BlockEntityTag", false);
        if (bvp2 != null && bvp2.e("Patterns")) {
            return bvp2.c("Patterns", 10).b();
        }
        return 0;
    }

    public List g() {
        this.o();
        return this.d;
    }

    public bmh h() {
        return this.b;
    }

    public List k() {
        this.o();
        return this.e;
    }

    public String n() {
        this.o();
        return this.f;
    }

    private void o() {
        if (this.d != null && this.e != null && this.f != null) {
            return;
        }
        if (!this.c) {
            this.f = "";
            return;
        }
        this.d = ov.a();
        this.e = ov.a();
        this.d.add(auv.a);
        this.e.add(dck.a(this.a));
        this.f = "b" + this.a;
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.b(); ++i2) {
                bvp bvp2 = this.b.b(i2);
                auv auv2 = auv.a(bvp2.l("Pattern"));
                if (auv2 == null) continue;
                this.d.add(auv2);
                int n2 = bvp2.h("Color");
                this.e.add(dck.a(n2));
                this.f = this.f + auv2.b() + n2;
            }
        }
    }

    public static void a(bhl bhl2, dck dck2) {
        bvp bvp2 = bhl2.a("BlockEntityTag", true);
        bvp2.a("Base", dck2.c());
    }

    public static void d(bhl bhl2) {
        bvp bvp2 = bhl2.a("BlockEntityTag", false);
        if (bvp2 == null || !bvp2.b("Patterns", 9)) {
            return;
        }
        bmh bmh2 = bvp2.c("Patterns", 10);
        if (bmh2.b() <= 0) {
            return;
        }
        bmh2.a(bmh2.b() - 1);
        if (bmh2.j()) {
            bhl2.o().q("BlockEntityTag");
            if (bhl2.o().j()) {
                bhl2.d((bvp)null);
            }
        }
    }
}

