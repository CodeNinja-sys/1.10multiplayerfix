/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;
import net.minecraft.e.m;

public class w
extends m {
    private short b;

    public w() {
    }

    public w(short s2) {
        this.b = s2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(80L);
        this.b = dataInput.readShort();
    }

    @Override
    public byte a() {
        return 2;
    }

    @Override
    public String toString() {
        return this.b + "s";
    }

    public w e() {
        return new w(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            w w2 = (w)object;
            return this.b == w2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    @Override
    public long f() {
        return this.b;
    }

    @Override
    public int g() {
        return this.b;
    }

    @Override
    public short h() {
        return this.b;
    }

    @Override
    public byte i() {
        return (byte)(this.b & 0xFF);
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

