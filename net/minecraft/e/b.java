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

public class b
extends m {
    private float b;

    b() {
    }

    public b(float f2) {
        this.b = f2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeFloat(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(96L);
        this.b = dataInput.readFloat();
    }

    @Override
    public byte a() {
        return 5;
    }

    @Override
    public String toString() {
        return this.b + "f";
    }

    public b e() {
        return new b(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            b b2 = (b)object;
            return this.b == b2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.b);
    }

    @Override
    public long f() {
        return (long)this.b;
    }

    @Override
    public int g() {
        return n.d(this.b);
    }

    @Override
    public short h() {
        return (short)(n.d(this.b) & 0xFFFF);
    }

    @Override
    public byte i() {
        return (byte)(n.d(this.b) & 0xFF);
    }

    @Override
    public double j() {
        return this.b;
    }

    @Override
    public float k() {
        return this.b;
    }

    @Override
    public /* synthetic */ a b() {
        return this.e();
    }
}

