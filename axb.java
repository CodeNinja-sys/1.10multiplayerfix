/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class axb
extends cjn {
    private final cjn a;
    private List b;
    private List c;
    private aow d;
    private zx e;
    private boolean f;

    public axb(cjn cjn2) {
        this.a = cjn2;
    }

    @Override
    public void cH_() {
        this.y.add(new bcy(2, this.w / 2 - 154, this.x - 48, bf.a("resourcePack.openFolder", new Object[0])));
        this.y.add(new bcy(1, this.w / 2 + 4, this.x - 48, bf.a("gui.done", new Object[0])));
        if (!this.f) {
            this.b = ov.a();
            this.c = ov.a();
            hh hh2 = this.u.R();
            hh2.b();
            ArrayList arrayList = ov.a((Iterable)hh2.d());
            arrayList.removeAll(hh2.e());
            for (Object object : arrayList) {
                this.b.add(new cch(this, (cdg)object));
            }
            cdg cdg2 = hh2.c();
            if (cdg2 != null) {
                this.c.add(new sp(this, hh2.g()));
            }
            for (cdg cdg3 : ov.b(hh2.e())) {
                this.c.add(new cch(this, cdg3));
            }
            this.c.add(new cpq(this));
        }
        this.d = new aow(this.u, 200, this.x, this.b);
        this.d.f(this.w / 2 - 4 - 200);
        this.d.d(7, 8);
        this.e = new zx(this.u, 200, this.x, this.c);
        this.e.f(this.w / 2 + 4);
        this.e.d(7, 8);
    }

    @Override
    public void p_() {
        super.p_();
        this.e.i();
        this.d.i();
    }

    public boolean a(ro ro2) {
        return this.c.contains(ro2);
    }

    public List b(ro ro2) {
        if (this.a(ro2)) {
            return this.c;
        }
        return this.b;
    }

    public List f() {
        return this.b;
    }

    public List g() {
        return this.c;
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 2) {
            File file = this.u.R().f();
            cjg.a(file);
        } else if (cwv2.j == 1) {
            if (this.f) {
                ArrayList arrayList = ov.a();
                for (Object object : this.c) {
                    if (!(object instanceof cch)) continue;
                    arrayList.add(((cch)object).k());
                }
                Collections.reverse(arrayList);
                this.u.R().a(arrayList);
                this.u.u.l.clear();
                this.u.u.m.clear();
                for (Object object : arrayList) {
                    this.u.u.l.add(((cdg)object).d());
                    if (((cdg)object).f() == 2) continue;
                    this.u.u.m.add(((cdg)object).d());
                }
                this.u.u.b();
                this.u.h();
            }
            this.u.a(this.a);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.d.b(n2, n3, n4);
        this.e.b(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.c(0);
        this.d.a(n2, n3, f2);
        this.e.a(n2, n3, f2);
        this.a(this.B, bf.a("resourcePack.title", new Object[0]), this.w / 2, 16, 0xFFFFFF);
        this.a(this.B, bf.a("resourcePack.folderInfo", new Object[0]), this.w / 2 - 77, this.x - 26, 0x808080);
        super.a(n2, n3, f2);
    }

    public void h() {
        this.f = true;
    }
}

