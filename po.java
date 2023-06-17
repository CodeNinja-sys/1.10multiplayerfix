/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class po
extends alt {
    private float b;

    po() {
    }

    public po(float f2) {
        this.b = f2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeFloat(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(96L);
        this.b = dataInput.readFloat();
    }

    @Override
    public byte a() {
        return 5;
    }

    @Override
    public String toString() {
        return "" + this.b + "f";
    }

    public po b() {
        return new po(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            po po2 = (po)object;
            return this.b == po2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.b);
    }

    @Override
    public long c() {
        return (long)this.b;
    }

    @Override
    public int d() {
        return cmk.d(this.b);
    }

    @Override
    public short e() {
        return (short)(cmk.d(this.b) & 0xFFFF);
    }

    @Override
    public byte f() {
        return (byte)(cmk.d(this.b) & 0xFF);
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

