/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.f.ad;
import net.minecraft.client.f.ah;
import net.minecraft.client.f.aj;
import net.minecraft.client.f.al;
import net.minecraft.client.f.g;
import net.minecraft.client.f.u;
import net.minecraft.client.g.ay;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cm;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.v;
import net.minecraft.client.r;

public class i
extends cc {
    private final cc a;
    private List b;
    private List c;
    private cm d;
    private v e;
    private boolean f;

    public i(cc cc2) {
        this.a = cc2;
    }

    @Override
    public void ct_() {
        this.r.add(new cp(2, this.p / 2 - 154, this.q - 48, net.minecraft.client.f.u.a("resourcePack.openFolder", new Object[0])));
        this.r.add(new cp(1, this.p / 2 + 4, this.q - 48, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        if (!this.f) {
            net.minecraft.client.f.i i22;
            this.b = ov.a();
            this.c = ov.a();
            g g2 = this.n.P();
            g2.b();
            ArrayList arrayList = ov.a((Iterable)g2.d());
            arrayList.removeAll(g2.e());
            for (net.minecraft.client.f.i i22 : arrayList) {
                this.b.add(new al(this, i22));
            }
            i22 = g2.c();
            if (i22 != null) {
                this.c.add(new ah(this, g2.g()));
            }
            for (Object object : ov.b(g2.e())) {
                this.c.add(new al(this, (net.minecraft.client.f.i)object));
            }
            this.c.add(new aj(this));
        }
        this.d = new cm(this.n, 200, this.q, this.b);
        this.d.h(this.p / 2 - 4 - 200);
        this.d.d(7, 8);
        this.e = new v(this.n, 200, this.q, this.c);
        this.e.h(this.p / 2 + 4);
        this.e.d(7, 8);
    }

    @Override
    public void cp_() {
        super.cp_();
        this.e.cr_();
        this.d.cr_();
    }

    public boolean a(ad ad2) {
        return this.c.contains(ad2);
    }

    public List b(ad ad2) {
        return this.a(ad2) ? this.c : this.b;
    }

    public List e() {
        return this.b;
    }

    public List f() {
        return this.c;
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 2) {
                File file = this.n.P().f();
                ay.a(file);
            } else if (ch2.j == 1) {
                if (this.f) {
                    ArrayList arrayList = ov.a();
                    for (Object object : this.c) {
                        if (!(object instanceof al)) continue;
                        arrayList.add(((al)object).k());
                    }
                    Collections.reverse(arrayList);
                    this.n.P().a(arrayList);
                    this.n.w.l.clear();
                    this.n.w.m.clear();
                    for (Object object : arrayList) {
                        this.n.w.l.add(((net.minecraft.client.f.i)object).d());
                        if (((net.minecraft.client.f.i)object).f() == 2) continue;
                        this.n.w.m.add(((net.minecraft.client.f.i)object).d());
                    }
                    this.n.w.b();
                    this.n.f();
                }
                this.n.a(this.a);
            }
        }
    }

    public static void a(String string) {
        Object object2;
        ArrayList<al> arrayList = new ArrayList<al>();
        g g2 = net.minecraft.client.r.z().P();
        g2.b();
        ArrayList arrayList2 = ov.a((Iterable)g2.d());
        arrayList2.removeAll(g2.e());
        for (Object object2 : arrayList2) {
            if (!((net.minecraft.client.f.i)object2).d().equals(string)) continue;
            arrayList.add(new al(null, (net.minecraft.client.f.i)object2));
        }
        object2 = ov.a();
        for (ad ad2 : arrayList) {
            if (!(ad2 instanceof al)) continue;
            object2.add(((al)ad2).k());
        }
        Collections.reverse(object2);
        net.minecraft.client.r.z().P().a((List)object2);
        net.minecraft.client.r.z().w.l.clear();
        net.minecraft.client.r.z().w.m.clear();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            net.minecraft.client.f.i i2 = (net.minecraft.client.f.i)iterator.next();
            net.minecraft.client.r.z().w.l.add(i2.d());
            if (i2.f() == 2) continue;
            net.minecraft.client.r.z().w.m.add(i2.d());
        }
        net.minecraft.client.r.z().w.b();
        net.minecraft.client.r.z().f();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.d.a(n2, n3, n4);
        this.e.a(n2, n3, n4);
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
        this.a(this.u, net.minecraft.client.f.u.a("resourcePack.title", new Object[0]), this.p / 2, 16, 0xFFFFFF);
        this.a(this.u, net.minecraft.client.f.u.a("resourcePack.folderInfo", new Object[0]), this.p / 2 - 77, this.q - 26, 0x808080);
        super.a(n2, n3, f2);
    }

    public void g() {
        this.f = true;
    }
}

