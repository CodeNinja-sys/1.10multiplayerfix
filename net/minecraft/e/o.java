/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import net.minecraft.e.a;
import net.minecraft.e.l;

public class o
extends a {
    private int[] b;

    o() {
    }

    public o(int[] arrn) {
        this.b = arrn;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b.length);
        int[] arrn = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn[i2];
            dataOutput.writeInt(n3);
        }
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(192L);
        int n3 = dataInput.readInt();
        l2.a(32 * n3);
        this.b = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b[i2] = dataInput.readInt();
        }
    }

    @Override
    public byte a() {
        return 11;
    }

    @Override
    public String toString() {
        String string = "[";
        int[] arrn = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn[i2];
            string = String.valueOf(string) + n3 + ",";
        }
        return String.valueOf(string) + "]";
    }

    public o e() {
        int[] arrn = new int[this.b.length];
        System.arraycopy(this.b, 0, arrn, 0, this.b.length);
        return new o(arrn);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) ? Arrays.equals(this.b, ((o)object).b) : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }

    public int[] f() {
        return this.b;
    }

    @Override
    public /* synthetic */ a b() {
        return this.e();
    }
}

