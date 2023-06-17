/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class ph
extends alt {
    private short b;

    public ph() {
    }

    public ph(short s2) {
        this.b = s2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(80L);
        this.b = dataInput.readShort();
    }

    @Override
    public byte a() {
        return 2;
    }

    @Override
    public String toString() {
        return "" + this.b + "s";
    }

    public ph b() {
        return new ph(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            ph ph2 = (ph)object;
            return this.b == ph2.b;
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
        return (byte)(this.b & 0xFF);
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

