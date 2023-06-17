/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class m
implements y {
    private final cu[] a = new cu[1];

    @Override
    public int e() {
        return 1;
    }

    @Override
    public cu a(int n2) {
        return this.a[0];
    }

    @Override
    public String X() {
        return "Result";
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
    public cu a(int n2, int n3) {
        return v.a(this.a, 0);
    }

    @Override
    public cu b(int n2) {
        return v.a(this.a, 0);
    }

    @Override
    public void a(int n2, cu cu2) {
        this.a[0] = cu2;
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
}

