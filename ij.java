/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class ij
extends alt {
    private long b;

    ij() {
    }

    public ij(long l2) {
        this.b = l2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeLong(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(128L);
        this.b = dataInput.readLong();
    }

    @Override
    public byte a() {
        return 4;
    }

    @Override
    public String toString() {
        return "" + this.b + "L";
    }

    public ij b() {
        return new ij(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            ij ij2 = (ij)object;
            return this.b == ij2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public int d() {
        return (int)(this.b & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short e() {
        return (short)(this.b & 0xFFFFL);
    }

    @Override
    public byte f() {
        return (byte)(this.b & 0xFFL);
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

