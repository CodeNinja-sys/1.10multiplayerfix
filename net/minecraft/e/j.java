/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import net.minecraft.e.a;
import net.minecraft.e.l;

public class j
extends a {
    private byte[] b;

    j() {
    }

    public j(byte[] arrby) {
        this.b = arrby;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b.length);
        dataOutput.write(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(192L);
        int n3 = dataInput.readInt();
        l2.a(8 * n3);
        this.b = new byte[n3];
        dataInput.readFully(this.b);
    }

    @Override
    public byte a() {
        return 7;
    }

    @Override
    public String toString() {
        return "[" + this.b.length + " bytes]";
    }

    @Override
    public a b() {
        byte[] arrby = new byte[this.b.length];
        System.arraycopy(this.b, 0, arrby, 0, this.b.length);
        return new j(arrby);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) ? Arrays.equals(this.b, ((j)object).b) : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }

    public byte[] e() {
        return this.b;
    }
}

