/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class bvp
extends azt {
    private final Map b = sz.c();

    @Override
    void a(DataOutput dataOutput) {
        for (String string : this.b.keySet()) {
            azt azt2 = (azt)this.b.get(string);
            bvp.a(string, azt2, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        byte by2;
        cny2.a(384L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.b.clear();
        while ((by2 = bvp.a(dataInput, cny2)) != 0) {
            String string = bvp.b(dataInput, cny2);
            cny2.a(224 + 16 * string.length());
            azt azt2 = bvp.a(by2, string, dataInput, n2 + 1, cny2);
            if (this.b.put(string, azt2) == null) continue;
            cny2.a(288L);
        }
    }

    public Set b() {
        return this.b.keySet();
    }

    @Override
    public byte a() {
        return 10;
    }

    public int c() {
        return this.b.size();
    }

    public void a(String string, azt azt2) {
        this.b.put(string, azt2);
    }

    public void a(String string, byte by2) {
        this.b.put(string, new xg(by2));
    }

    public void a(String string, short s2) {
        this.b.put(string, new ph(s2));
    }

    public void a(String string, int n2) {
        this.b.put(string, new iq(n2));
    }

    public void a(String string, long l2) {
        this.b.put(string, new ij(l2));
    }

    public void a(String string, UUID uUID) {
        this.a(string + "Most", uUID.getMostSignificantBits());
        this.a(string + "Least", uUID.getLeastSignificantBits());
    }

    public UUID a(String string) {
        return new UUID(this.i(string + "Most"), this.i(string + "Least"));
    }

    public boolean b(String string) {
        return this.b(string + "Most", 99) && this.b(string + "Least", 99);
    }

    public void a(String string, float f2) {
        this.b.put(string, new po(f2));
    }

    public void a(String string, double d2) {
        this.b.put(string, new cab(d2));
    }

    public void a(String string, String string2) {
        this.b.put(string, new byh(string2));
    }

    public void a(String string, byte[] arrby) {
        this.b.put(string, new dge(arrby));
    }

    public void a(String string, int[] arrn) {
        this.b.put(string, new aya(arrn));
    }

    public void a(String string, boolean bl2) {
        this.a(string, bl2 ? (byte)1 : 0);
    }

    public azt c(String string) {
        return (azt)this.b.get(string);
    }

    public byte d(String string) {
        azt azt2 = (azt)this.b.get(string);
        if (azt2 == null) {
            return 0;
        }
        return azt2.a();
    }

    public boolean e(String string) {
        return this.b.containsKey(string);
    }

    public boolean b(String string, int n2) {
        byte by2 = this.d(string);
        if (by2 == n2) {
            return true;
        }
        if (n2 == 99) {
            return by2 == 1 || by2 == 2 || by2 == 3 || by2 == 4 || by2 == 5 || by2 == 6;
        }
        return false;
    }

    public byte f(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).f();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public short g(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).e();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public int h(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).d();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public long i(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).c();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0L;
    }

    public float j(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).h();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0f;
    }

    public double k(String string) {
        try {
            if (this.b(string, 99)) {
                return ((alt)this.b.get(string)).g();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0;
    }

    public String l(String string) {
        try {
            if (this.b(string, 8)) {
                return ((azt)this.b.get(string)).k();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return "";
    }

    public byte[] m(String string) {
        try {
            if (this.b(string, 7)) {
                return ((dge)this.b.get(string)).b();
            }
        }
        catch (ClassCastException classCastException) {
            throw new oz(this.a(string, 7, classCastException));
        }
        return new byte[0];
    }

    public int[] n(String string) {
        try {
            if (this.b(string, 11)) {
                return ((aya)this.b.get(string)).c();
            }
        }
        catch (ClassCastException classCastException) {
            throw new oz(this.a(string, 11, classCastException));
        }
        return new int[0];
    }

    public bvp o(String string) {
        try {
            if (this.b(string, 10)) {
                return (bvp)this.b.get(string);
            }
        }
        catch (ClassCastException classCastException) {
            throw new oz(this.a(string, 10, classCastException));
        }
        return new bvp();
    }

    public bmh c(String string, int n2) {
        try {
            if (this.d(string) == 9) {
                bmh bmh2 = (bmh)this.b.get(string);
                if (bmh2.j() || bmh2.d() == n2) {
                    return bmh2;
                }
                return new bmh();
            }
        }
        catch (ClassCastException classCastException) {
            throw new oz(this.a(string, 9, classCastException));
        }
        return new bmh();
    }

    public boolean p(String string) {
        return this.f(string) != 0;
    }

    public void q(String string) {
        this.b.remove(string);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry entry : this.b.entrySet()) {
            if (stringBuilder.length() != 1) {
                stringBuilder.append(',');
            }
            stringBuilder.append((String)entry.getKey()).append(':').append(entry.getValue());
        }
        return stringBuilder.append('}').toString();
    }

    @Override
    public boolean j() {
        return this.b.isEmpty();
    }

    private cet a(String string, int n2, ClassCastException classCastException) {
        cet cet2 = cet.a(classCastException, "Reading NBT data");
        sx sx2 = cet2.a("Corrupt NBT tag", 1);
        sx2.a("Tag type found", new abq(this, string));
        sx2.a("Tag type expected", new bkt(this, n2));
        sx2.a("Tag name", string);
        return cet2;
    }

    public bvp d() {
        bvp bvp2 = new bvp();
        for (String string : this.b.keySet()) {
            bvp2.a(string, ((azt)this.b.get(string)).i());
        }
        return bvp2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            bvp bvp2 = (bvp)object;
            return this.b.entrySet().equals(bvp2.b.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    private static void a(String string, azt azt2, DataOutput dataOutput) {
        dataOutput.writeByte(azt2.a());
        if (azt2.a() == 0) {
            return;
        }
        dataOutput.writeUTF(string);
        azt2.a(dataOutput);
    }

    private static byte a(DataInput dataInput, cny cny2) {
        return dataInput.readByte();
    }

    private static String b(DataInput dataInput, cny cny2) {
        return dataInput.readUTF();
    }

    static azt a(byte by2, String string, DataInput dataInput, int n2, cny cny2) {
        azt azt2 = azt.a(by2);
        try {
            azt2.a(dataInput, n2, cny2);
        }
        catch (IOException iOException) {
            cet cet2 = cet.a(iOException, "Loading NBT data");
            sx sx2 = cet2.a("NBT Tag");
            sx2.a("Tag name", string);
            sx2.a("Tag type", by2);
            throw new oz(cet2);
        }
        return azt2;
    }

    public void a(bvp bvp2) {
        for (String string : bvp2.b.keySet()) {
            azt azt2 = (azt)bvp2.b.get(string);
            if (azt2.a() == 10) {
                if (this.b(string, 10)) {
                    bvp bvp3 = this.o(string);
                    bvp3.a((bvp)azt2);
                    continue;
                }
                this.a(string, azt2.i());
                continue;
            }
            this.a(string, azt2.i());
        }
    }

    @Override
    public /* synthetic */ azt i() {
        return this.d();
    }

    static /* synthetic */ Map b(bvp bvp2) {
        return bvp2.b;
    }
}

