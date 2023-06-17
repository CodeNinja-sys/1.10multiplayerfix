/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;
import net.minecraft.e.m;
import net.minecraft.u.b.n;

public class s
extends m {
    private double b;

    s() {
    }

    public s(double d2) {
        this.b = d2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeDouble(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(128L);
        this.b = dataInput.readDouble();
    }

    @Override
    public byte a() {
        return 6;
    }

    @Override
    public String toString() {
        return this.b + "d";
    }

    public s e() {
        return new s(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            s s2 = (s)object;
            return this.b == s2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        return super.hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public long f() {
        return (long)Math.floor(this.b);
    }

    @Override
    public int g() {
        return n.c(this.b);
    }

    @Override
    public short h() {
        return (short)(n.c(this.b) & 0xFFFF);
    }

    @Override
    public byte i() {
        return (byte)(n.c(this.b) & 0xFF);
    }

    @Override
    public double j() {
        return this.b;
    }

    @Override
    public float k() {
        return (float)this.b;
    }

    @Override
    public /* synthetic */ a b() {
        return this.e();
    }
}

