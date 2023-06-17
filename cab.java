/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class cab
extends alt {
    private double b;

    cab() {
    }

    public cab(double d2) {
        this.b = d2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeDouble(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(128L);
        this.b = dataInput.readDouble();
    }

    @Override
    public byte a() {
        return 6;
    }

    @Override
    public String toString() {
        return "" + this.b + "d";
    }

    public cab b() {
        return new cab(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            cab cab2 = (cab)object;
            return this.b == cab2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        return super.hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public long c() {
        return (long)Math.floor(this.b);
    }

    @Override
    public int d() {
        return cmk.c(this.b);
    }

    @Override
    public short e() {
        return (short)(cmk.c(this.b) & 0xFFFF);
    }

    @Override
    public byte f() {
        return (byte)(cmk.c(this.b) & 0xFF);
    }

    @Override
    public double g() {
        return this.b;
    }

    @Override
    public float h() {
        return (float)this.b;
    }

    @Override
    public /* synthetic */ azt i() {
        return this.b();
    }
}

