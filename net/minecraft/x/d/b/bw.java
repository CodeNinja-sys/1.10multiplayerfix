/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.d.c;
import net.minecraft.d.j;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bw
implements p {
    private int a;
    private byte b;
    private byte c;
    private int d;
    private byte e;

    public bw() {
    }

    public bw(int n2, j j2) {
        this.a = n2;
        this.b = (byte)(net.minecraft.d.c.a(j2.a()) & 0xFF);
        this.c = (byte)(j2.c() & 0xFF);
        this.d = j2.b() > 32767 ? 32767 : j2.b();
        this.e = 0;
        if (j2.d()) {
            this.e = (byte)(this.e | 1);
        }
        if (j2.e()) {
            this.e = (byte)(this.e | 2);
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.E();
        this.c = a2.E();
        this.d = a2.e();
        this.e = a2.E();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(this.b);
        a2.B(this.c);
        a2.d(this.d);
        a2.B(this.e);
    }

    public boolean a() {
        return this.d == 32767;
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public boolean g() {
        return (this.e & 1) == 1;
    }
}

