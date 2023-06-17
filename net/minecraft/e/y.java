/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.a;
import net.minecraft.e.l;

public class y
extends a {
    private String b;

    public y() {
        this.b = "";
    }

    public y(String string) {
        this.b = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(288L);
        this.b = dataInput.readUTF();
        l2.a(16 * this.b.length());
    }

    @Override
    public byte a() {
        return 8;
    }

    @Override
    public String toString() {
        return "\"" + this.b.replace("\"", "\\\"") + "\"";
    }

    public y e() {
        return new y(this.b);
    }

    @Override
    public boolean c() {
        return this.b.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        y y2 = (y)object;
        return this.b == null && y2.b == null || this.b != null && this.b.equals(y2.b);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public /* synthetic */ a b() {
        return this.e();
    }
}

