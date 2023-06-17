/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.w;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.al;
import net.minecraft.q.an;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class f
implements al {
    private final String a;
    private final al b;
    private final al c;

    public f(String string, al al2, al al3) {
        this.a = string;
        if (al2 == null) {
            al2 = al3;
        }
        if (al3 == null) {
            al3 = al2;
        }
        this.b = al2;
        this.c = al3;
        if (al2.q()) {
            al3.a(al2.r());
        } else if (al3.q()) {
            al2.a(al3.r());
        }
    }

    @Override
    public int e() {
        return this.b.e() + this.c.e();
    }

    public boolean a(y y2) {
        return this.b == y2 || this.c == y2;
    }

    @Override
    public String X() {
        return this.b.bO_() ? this.b.X() : (this.c.bO_() ? this.c.X() : this.a);
    }

    @Override
    public boolean bO_() {
        return this.b.bO_() || this.c.bO_();
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }

    @Override
    public cu a(int n2) {
        return n2 >= this.b.e() ? this.c.a(n2 - this.b.e()) : this.b.a(n2);
    }

    @Override
    public cu a(int n2, int n3) {
        return n2 >= this.b.e() ? this.c.a(n2 - this.b.e(), n3) : this.b.a(n2, n3);
    }

    @Override
    public cu b(int n2) {
        return n2 >= this.b.e() ? this.c.b(n2 - this.b.e()) : this.b.b(n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        if (n2 >= this.b.e()) {
            this.c.a(n2 - this.b.e(), cu2);
        } else {
            this.b.a(n2, cu2);
        }
    }

    @Override
    public int g() {
        return this.b.g();
    }

    @Override
    public void C() {
        this.b.C();
        this.c.C();
    }

    @Override
    public boolean a_(b b2) {
        return this.b.a_(b2) && this.c.a_(b2);
    }

    @Override
    public void b(b b2) {
        this.b.b(b2);
        this.c.b(b2);
    }

    @Override
    public void c(b b2) {
        this.b.c(b2);
        this.c.c(b2);
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public boolean q() {
        return this.b.q() || this.c.q();
    }

    @Override
    public void a(an an2) {
        this.b.a(an2);
        this.c.a(an2);
    }

    @Override
    public an r() {
        return this.b.r();
    }

    @Override
    public String h() {
        return this.b.h();
    }

    @Override
    public aq a(a a2, b b2) {
        return new w(a2, this, b2);
    }

    @Override
    public void j() {
        this.b.j();
        this.c.j();
    }
}

