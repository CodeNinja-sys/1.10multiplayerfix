/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class dge
extends azt {
    private byte[] b;

    dge() {
    }

    public dge(byte[] arrby) {
        this.b = arrby;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b.length);
        dataOutput.write(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(192L);
        int n3 = dataInput.readInt();
        cny2.a(8 * n3);
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
    public azt i() {
        byte[] arrby = new byte[this.b.length];
        System.arraycopy(this.b, 0, arrby, 0, this.b.length);
        return new dge(arrby);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return Arrays.equals(this.b, ((dge)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }

    public byte[] b() {
        return this.b;
    }
}

