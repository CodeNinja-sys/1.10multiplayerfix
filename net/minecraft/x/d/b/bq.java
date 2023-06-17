/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.j.j;
import net.minecraft.j.l;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bq
implements p {
    private String a;
    private String b;
    private l c;
    private int d;

    public bq() {
    }

    public bq(j j2, int n2) {
        this.a = j2.b();
        this.b = j2.d();
        this.c = j2.c().b();
        this.d = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(16);
        this.d = a2.E();
        if (this.d == 0 || this.d == 2) {
            this.b = a2.e(32);
            this.c = l.a(a2.e(16));
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.B(this.d);
        if (this.d == 0 || this.d == 2) {
            a2.a(this.b);
            a2.a(this.c.a());
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
        return this.d;
    }

    public l d() {
        return this.c;
    }
}

