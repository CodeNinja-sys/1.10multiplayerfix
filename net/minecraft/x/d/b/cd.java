/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.d.ov;
import java.util.Collection;
import net.minecraft.j.b;
import net.minecraft.j.d;
import net.minecraft.j.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class cd
implements p {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e;
    private String f;
    private int g;
    private final Collection h;
    private int i;
    private int j;

    public cd() {
        this.e = n.a.e;
        this.f = net.minecraft.j.b.a.e;
        this.g = -1;
        this.h = ov.a();
    }

    public cd(d d2, int n2) {
        this.e = n.a.e;
        this.f = net.minecraft.j.b.a.e;
        this.g = -1;
        this.h = ov.a();
        this.a = d2.a();
        this.i = n2;
        if (n2 == 0 || n2 == 2) {
            this.b = d2.b();
            this.c = d2.d();
            this.d = d2.e();
            this.j = d2.k();
            this.e = d2.h().e;
            this.f = d2.j().e;
            this.g = d2.l().a();
        }
        if (n2 == 0) {
            this.h.addAll(d2.c());
        }
    }

    public cd(d d2, Collection collection, int n2) {
        this.e = n.a.e;
        this.f = net.minecraft.j.b.a.e;
        this.g = -1;
        this.h = ov.a();
        if (n2 != 3 && n2 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.i = n2;
        this.a = d2.a();
        this.h.addAll(collection);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(16);
        this.i = a2.E();
        if (this.i == 0 || this.i == 2) {
            this.b = a2.e(32);
            this.c = a2.e(16);
            this.d = a2.e(16);
            this.j = a2.E();
            this.e = a2.e(32);
            this.f = a2.e(32);
            this.g = a2.E();
        }
        if (this.i == 0 || this.i == 3 || this.i == 4) {
            int n2 = a2.e();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.h.add(a2.e(40));
            }
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.B(this.i);
        if (this.i == 0 || this.i == 2) {
            a2.a(this.b);
            a2.a(this.c);
            a2.a(this.d);
            a2.B(this.j);
            a2.a(this.e);
            a2.a(this.f);
            a2.B(this.g);
        }
        if (this.i == 0 || this.i == 3 || this.i == 4) {
            a2.d(this.h.size());
            for (String string : this.h) {
                a2.a(string);
            }
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Collection e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.g;
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }
}

