/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;
import net.minecraft.e.m;

public class aa
extends m {
    private byte b;

    aa() {
    }

    public aa(byte by2) {
        this.b = by2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeByte(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(72L);
        this.b = dataInput.readByte();
    }

    @Override
    public byte a() {
        return 1;
    }

    @Override
    public String toString() {
        return this.b + "b";
    }

    public aa e() {
        return new aa(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aa aa2 = (aa)object;
            return this.b == aa2.b;
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
        return this.b;
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

