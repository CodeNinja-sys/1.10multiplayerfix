/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.j.j;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.c;
import net.minecraft.x.p;

public class v
implements p {
    private String a = "";
    private String b = "";
    private int c;
    private c d;

    public v() {
    }

    public v(net.minecraft.j.p p2) {
        this.a = p2.d();
        this.b = p2.c().b();
        this.c = p2.b();
        this.d = net.minecraft.x.d.b.c.a;
    }

    public v(String string) {
        this.a = string;
        this.b = "";
        this.c = 0;
        this.d = net.minecraft.x.d.b.c.b;
    }

    public v(String string, j j2) {
        this.a = string;
        this.b = j2.b();
        this.c = 0;
        this.d = net.minecraft.x.d.b.c.b;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(40);
        this.d = (c)a2.a(c.class);
        this.b = a2.e(16);
        if (this.d != net.minecraft.x.d.b.c.b) {
            this.c = a2.e();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.d);
        a2.a(this.b);
        if (this.d != net.minecraft.x.d.b.c.b) {
            a2.d(this.c);
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

    public int c() {
        return this.c;
    }

    public c d() {
        return this.d;
    }
}

