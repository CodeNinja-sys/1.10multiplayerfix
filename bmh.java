/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bmh
extends azt {
    private static final d b = org.apache.logging.log4j.c.c();
    private List c = ov.a();
    private byte d = 0;

    @Override
    void a(DataOutput dataOutput) {
        this.d = this.c.isEmpty() ? (byte)0 : ((azt)this.c.get(0)).a();
        dataOutput.writeByte(this.d);
        dataOutput.writeInt(this.c.size());
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            ((azt)this.c.get(i2)).a(dataOutput);
        }
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(296L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.d = dataInput.readByte();
        int n3 = dataInput.readInt();
        if (this.d == 0 && n3 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        cny2.a(32L * (long)n3);
        this.c = ov.b(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            azt azt2 = azt.a(this.d);
            azt2.a(dataInput, n2 + 1, cny2);
            this.c.add(azt2);
        }
    }

    @Override
    public byte a() {
        return 9;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(i2).append(':').append(this.c.get(i2));
        }
        return stringBuilder.append(']').toString();
    }

    public void a(azt azt2) {
        if (azt2.a() == 0) {
            b.f("Invalid TagEnd added to ListTag");
            return;
        }
        if (this.d == 0) {
            this.d = azt2.a();
        } else if (this.d != azt2.a()) {
            b.f("Adding mismatching tag types to tag list");
            return;
        }
        this.c.add(azt2);
    }

    public void a(int n2, azt azt2) {
        if (azt2.a() == 0) {
            b.f("Invalid TagEnd added to ListTag");
            return;
        }
        if (n2 < 0 || n2 >= this.c.size()) {
            b.f("index out of bounds to set tag in tag list");
            return;
        }
        if (this.d == 0) {
            this.d = azt2.a();
        } else if (this.d != azt2.a()) {
            b.f("Adding mismatching tag types to tag list");
            return;
        }
        this.c.set(n2, azt2);
    }

    public azt a(int n2) {
        return (azt)this.c.remove(n2);
    }

    @Override
    public boolean j() {
        return this.c.isEmpty();
    }

    public bvp b(int n2) {
        azt azt2;
        if (n2 >= 0 && n2 < this.c.size() && (azt2 = (azt)this.c.get(n2)).a() == 10) {
            return (bvp)azt2;
        }
        return new bvp();
    }

    public int c(int n2) {
        azt azt2;
        if (n2 >= 0 && n2 < this.c.size() && (azt2 = (azt)this.c.get(n2)).a() == 3) {
            return ((iq)azt2).d();
        }
        return 0;
    }

    public int[] d(int n2) {
        azt azt2;
        if (n2 >= 0 && n2 < this.c.size() && (azt2 = (azt)this.c.get(n2)).a() == 11) {
            return ((aya)azt2).c();
        }
        return new int[0];
    }

    public double e(int n2) {
        azt azt2;
        if (n2 >= 0 && n2 < this.c.size() && (azt2 = (azt)this.c.get(n2)).a() == 6) {
            return ((cab)azt2).g();
        }
        return 0.0;
    }

    public float f(int n2) {
        azt azt2;
        if (n2 >= 0 && n2 < this.c.size() && (azt2 = (azt)this.c.get(n2)).a() == 5) {
            return ((po)azt2).h();
        }
        return 0.0f;
    }

    public String g(int n2) {
        if (n2 < 0 || n2 >= this.c.size()) {
            return "";
        }
        azt azt2 = (azt)this.c.get(n2);
        if (azt2.a() == 8) {
            return azt2.k();
        }
        return azt2.toString();
    }

    public azt h(int n2) {
        if (n2 < 0 || n2 >= this.c.size()) {
            return new bqf();
        }
        return (azt)this.c.get(n2);
    }

    public int b() {
        return this.c.size();
    }

    public bmh c() {
        bmh bmh2 = new bmh();
        bmh2.d = this.d;
        for (azt azt2 : this.c) {
            azt azt3 = azt2.i();
            bmh2.c.add(azt3);
        }
        return bmh2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            bmh bmh2 = (bmh)object;
            if (this.d == bmh2.d) {
                return this.c.equals(bmh2.c);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    public int d() {
        return this.d;
    }

    @Override
    public /* synthetic */ azt i() {
        return this.c();
    }
}

