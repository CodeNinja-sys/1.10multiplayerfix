/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class aya
extends azt {
    private int[] b;

    aya() {
    }

    public aya(int[] arrn) {
        this.b = arrn;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b.length);
        for (int n2 : this.b) {
            dataOutput.writeInt(n2);
        }
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(192L);
        int n3 = dataInput.readInt();
        cny2.a(32 * n3);
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
        for (int n2 : this.b) {
            string = string + n2 + ",";
        }
        return string + "]";
    }

    public aya b() {
        int[] arrn = new int[this.b.length];
        System.arraycopy(this.b, 0, arrn, 0, this.b.length);
        return new aya(arrn);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return Arrays.equals(this.b, ((aya)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }

    public int[] c() {
        return this.b;
    }

    @Override
    public /* synthetic */ azt i() {
        return this.b();
    }
}

