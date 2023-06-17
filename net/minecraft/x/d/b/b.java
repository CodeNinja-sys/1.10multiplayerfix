/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class b
implements p {
    private net.minecraft.u.d.a a;
    private byte b;

    public b() {
    }

    public b(net.minecraft.u.d.a a2) {
        this(a2, 1);
    }

    public b(net.minecraft.u.d.a a2, byte by2) {
        this.a = a2;
        this.b = by2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.d();
        this.b = a2.E();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.B(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public net.minecraft.u.d.a a() {
        return this.a;
    }

    public boolean b() {
        return this.b == 1 || this.b == 2;
    }

    public byte c() {
        return this.b;
    }
}

