/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.minecraft.client.b.a;
import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.k.bl;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;

public class da
extends cc {
    private final cc a;
    private final a b;
    private final List c = ov.a();
    private final List d = ov.a();
    private String e;
    private String[] f;
    private bl g;
    private ch h;

    public da(cc cc2, a a2) {
        this.a = cc2;
        this.b = a2;
    }

    @Override
    public void ct_() {
        this.e = net.minecraft.client.f.u.a("options.snooper.title", new Object[0]);
        String string = net.minecraft.client.f.u.a("options.snooper.desc", new Object[0]);
        ArrayList arrayList = ov.a();
        for (String string2 : this.u.c(string, this.p - 30)) {
            arrayList.add(string2);
        }
        this.f = arrayList.toArray(new String[arrayList.size()]);
        this.c.clear();
        this.d.clear();
        this.h = this.b(new ch(1, this.p / 2 - 152, this.q - 30, 150, 20, this.b.c(net.minecraft.client.b.e.u)));
        this.r.add(new ch(2, this.p / 2 + 2, this.q - 30, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        boolean bl2 = this.n.F() != null && this.n.F().aB() != null;
        for (Map.Entry entry : new TreeMap(this.n.H().c()).entrySet()) {
            this.c.add(String.valueOf(bl2 ? "C " : "") + (String)entry.getKey());
            this.d.add(this.u.a((String)entry.getValue(), this.p - 220));
        }
        if (bl2) {
            for (Map.Entry entry : new TreeMap(this.n.F().aB().c()).entrySet()) {
                this.c.add("S " + (String)entry.getKey());
                this.d.add(this.u.a((String)entry.getValue(), this.p - 220));
            }
        }
        this.g = new bl(this);
    }

    @Override
    public void cp_() {
        super.cp_();
        this.g.cr_();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 2) {
                this.b.b();
                this.b.b();
                this.n.a(this.a);
            }
            if (ch2.j == 1) {
                this.b.a(net.minecraft.client.b.e.u, 1);
                this.h.i = this.b.c(net.minecraft.client.b.e.u);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.g.a(n2, n3, f2);
        this.a(this.u, this.e, this.p / 2, 8, 0xFFFFFF);
        int n4 = 22;
        String[] arrstring = this.f;
        int n5 = this.f.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            String string = arrstring[i2];
            this.a(this.u, string, this.p / 2, n4, 0x808080);
            n4 += this.u.a;
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ List a(da da2) {
        return da2.c;
    }

    static /* synthetic */ List b(da da2) {
        return da2.d;
    }
}

