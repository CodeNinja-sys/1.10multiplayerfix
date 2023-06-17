/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;
import net.minecraft.e.m;

public class t
extends m {
    private long b;

    t() {
    }

    public t(long l2) {
        this.b = l2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeLong(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(128L);
        this.b = dataInput.readLong();
    }

    @Override
    public byte a() {
        return 4;
    }

    @Override
    public String toString() {
        return this.b + "L";
    }

    public t e() {
        return new t(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            t t2 = (t)object;
            return this.b == t2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
    }

    @Override
    public long f() {
        return this.b;
    }

    @Override
    public int g() {
        return (int)(this.b & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short h() {
        return (short)(this.b & 0xFFFFL);
    }

    @Override
    public byte i() {
        return (byte)(this.b & 0xFFL);
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

