/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class af
implements y {
    private final cu[] a;
    private final int b;
    private final int c;
    private final aq d;

    public af(aq aq2, int n2, int n3) {
        int n4 = n2 * n3;
        this.a = new cu[n4];
        this.d = aq2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public int e() {
        return this.a.length;
    }

    @Override
    public cu a(int n2) {
        return n2 >= this.e() ? null : this.a[n2];
    }

    public cu c(int n2, int n3) {
        return n2 >= 0 && n2 < this.b && n3 >= 0 && n3 <= this.c ? this.a(n2 + n3 * this.b) : null;
    }

    @Override
    public String X() {
        return "container.crafting";
    }

    @Override
    public boolean bO_() {
        return false;
    }

    @Override
    public a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }

    @Override
    public cu b(int n2) {
        return v.a(this.a, n2);
    }

    @Override
    public cu a(int n2, int n3) {
        cu cu2 = v.a(this.a, n2, n3);
        if (cu2 != null) {
            this.d.a(this);
        }
        return cu2;
    }

    @Override
    public void a(int n2, cu cu2) {
        this.a[n2] = cu2;
        this.d.a(this);
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public void C() {
    }

    @Override
    public boolean a_(b b2) {
        return true;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
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
    public void j() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = null;
        }
    }

    public int a() {
        return this.c;
    }

    public int c() {
        return this.b;
    }
}

