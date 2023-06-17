/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class xg
extends alt {
    private byte b;

    xg() {
    }

    public xg(byte by2) {
        this.b = by2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeByte(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(72L);
        this.b = dataInput.readByte();
    }

    @Override
    public byte a() {
        return 1;
    }

    @Override
    public String toString() {
        return "" + this.b + "b";
    }

    public xg b() {
        return new xg(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            xg xg2 = (xg)object;
            return this.b == xg2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public short e() {
        return this.b;
    }

    @Override
    public byte f() {
        return this.b;
    }

    @Override
    public double g() {
        return this.b;
    }

    @Override
    public float h() {
        return this.b;
    }

    @Override
    public /* synthetic */ azt i() {
        return this.b();
    }
}

