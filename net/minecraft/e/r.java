/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;
import net.minecraft.e.m;

public class r
extends m {
    private int b;

    r() {
    }

    public r(int n2) {
        this.b = n2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(96L);
        this.b = dataInput.readInt();
    }

    @Override
    public byte a() {
        return 3;
    }

    @Override
    public String toString() {
        return "" + this.b;
    }

    public r e() {
        return new r(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            r r2 = (r)object;
            return this.b == r2.b;
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
        return (short)(this.b & 0xFFFF);
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

