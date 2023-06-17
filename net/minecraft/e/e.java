/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import com.a.a.d.sz;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.e.a;
import net.minecraft.e.aa;
import net.minecraft.e.b;
import net.minecraft.e.d;
import net.minecraft.e.j;
import net.minecraft.e.k;
import net.minecraft.e.l;
import net.minecraft.e.m;
import net.minecraft.e.o;
import net.minecraft.e.q;
import net.minecraft.e.r;
import net.minecraft.e.s;
import net.minecraft.e.t;
import net.minecraft.e.w;
import net.minecraft.e.y;
import net.minecraft.k.i;
import net.minecraft.u.bo;

public class e
extends a {
    private final Map b = sz.c();

    @Override
    void a(DataOutput dataOutput) {
        for (String string : this.b.keySet()) {
            a a2 = (a)this.b.get(string);
            e.a(string, a2, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        byte by2;
        l2.a(384L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.b.clear();
        while ((by2 = e.a(dataInput, l2)) != 0) {
            String string = e.b(dataInput, l2);
            l2.a(224 + 16 * string.length());
            a a2 = e.a(by2, string, dataInput, n2 + 1, l2);
            if (this.b.put(string, a2) == null) continue;
            l2.a(288L);
        }
    }

    public Set e() {
        return this.b.keySet();
    }

    @Override
    public byte a() {
        return 10;
    }

    public int f() {
        return this.b.size();
    }

    public void a(String string, a a2) {
        this.b.put(string, a2);
    }

    public void a(String string, byte by2) {
        this.b.put(string, new aa(by2));
    }

    public void a(String string, short s2) {
        this.b.put(string, new w(s2));
    }

    public void a(String string, int n2) {
        this.b.put(string, new r(n2));
    }

    public void a(String string, long l2) {
        this.b.put(string, new t(l2));
    }

    public void a(String string, UUID uUID) {
        this.a(String.valueOf(string) + "Most", uUID.getMostSignificantBits());
        this.a(String.valueOf(string) + "Least", uUID.getLeastSignificantBits());
    }

    public UUID a(String string) {
        return new UUID(this.i(String.valueOf(string) + "Most"), this.i(String.valueOf(string) + "Least"));
    }

    public boolean b(String string) {
        return this.b(String.valueOf(string) + "Most", 99) && this.b(String.valueOf(string) + "Least", 99);
    }

    public void a(String string, float f2) {
        this.b.put(string, new b(f2));
    }

    public void a(String string, double d2) {
        this.b.put(string, new s(d2));
    }

    public void a(String string, String string2) {
        this.b.put(string, new y(string2));
    }

    public void a(String string, byte[] arrby) {
        this.b.put(string, new j(arrby));
    }

    public void a(String string, int[] arrn) {
        this.b.put(string, new o(arrn));
    }

    public void a(String string, boolean bl2) {
        this.a(string, (byte)(bl2 ? 1 : 0));
    }

    public a c(String string) {
        return (a)this.b.get(string);
    }

    public byte d(String string) {
        a a2 = (a)this.b.get(string);
        return a2 == null ? (byte)0 : a2.a();
    }

    public boolean e(String string) {
        return this.b.containsKey(string);
    }

    public boolean b(String string, int n2) {
        byte by2 = this.d(string);
        return by2 == n2 ? true : (n2 != 99 ? false : by2 == 1 || by2 == 2 || by2 == 3 || by2 == 4 || by2 == 5 || by2 == 6);
    }

    public byte f(String string) {
        try {
            if (this.b(string, 99)) {
                return ((m)this.b.get(string)).i();
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
                return ((m)this.b.get(string)).h();
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
                return ((m)this.b.get(string)).g();
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
                return ((m)this.b.get(string)).f();
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
                return ((m)this.b.get(string)).k();
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
                return ((m)this.b.get(string)).j();
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
                return ((a)this.b.get(string)).d();
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
                return ((j)this.b.get(string)).e();
            }
        }
        catch (ClassCastException classCastException) {
            throw new bo(this.a(string, 7, classCastException));
        }
        return new byte[0];
    }

    public int[] n(String string) {
        try {
            if (this.b(string, 11)) {
                return ((o)this.b.get(string)).f();
            }
        }
        catch (ClassCastException classCastException) {
            throw new bo(this.a(string, 11, classCastException));
        }
        return new int[0];
    }

    public e o(String string) {
        try {
            if (this.b(string, 10)) {
                return (e)this.b.get(string);
            }
        }
        catch (ClassCastException classCastException) {
            throw new bo(this.a(string, 10, classCastException));
        }
        return new e();
    }

    public q c(String string, int n2) {
        try {
            if (this.d(string) == 9) {
                q q2 = (q)this.b.get(string);
                if (!q2.c() && q2.g() != n2) {
                    return new q();
                }
                return q2;
            }
        }
        catch (ClassCastException classCastException) {
            throw new bo(this.a(string, 9, classCastException));
        }
        return new q();
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
    public boolean c() {
        return this.b.isEmpty();
    }

    private net.minecraft.k.a a(String string, int n2, ClassCastException classCastException) {
        net.minecraft.k.a a2 = net.minecraft.k.a.a(classCastException, "Reading NBT data");
        i i2 = a2.a("Corrupt NBT tag", 1);
        i2.a("Tag type found", new k(this, string));
        i2.a("Tag type expected", new d(this, n2));
        i2.a("Tag name", string);
        return a2;
    }

    public e g() {
        e e2 = new e();
        for (String string : this.b.keySet()) {
            e2.a(string, ((a)this.b.get(string)).b());
        }
        return e2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            e e2 = (e)object;
            return this.b.entrySet().equals(e2.b.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    private static void a(String string, a a2, DataOutput dataOutput) {
        dataOutput.writeByte(a2.a());
        if (a2.a() != 0) {
            dataOutput.writeUTF(string);
            a2.a(dataOutput);
        }
    }

    private static byte a(DataInput dataInput, l l2) {
        return dataInput.readByte();
    }

    private static String b(DataInput dataInput, l l2) {
        return dataInput.readUTF();
    }

    static a a(byte by2, String string, DataInput dataInput, int n2, l l2) {
        a a2 = net.minecraft.e.a.a(by2);
        try {
            a2.a(dataInput, n2, l2);
            return a2;
        }
        catch (IOException iOException) {
            net.minecraft.k.a a3 = net.minecraft.k.a.a(iOException, "Loading NBT data");
            i i2 = a3.a("NBT Tag");
            i2.a("Tag name", string);
            i2.a("Tag type", by2);
            throw new bo(a3);
        }
    }

    public void a(e e2) {
        for (String string : e2.b.keySet()) {
            a a2 = (a)e2.b.get(string);
            if (a2.a() == 10) {
                if (this.b(string, 10)) {
                    e e3 = this.o(string);
                    e3.a((e)a2);
                    continue;
                }
                this.a(string, a2.b());
                continue;
            }
            this.a(string, a2.b());
        }
    }

    @Override
    public /* synthetic */ a b() {
        return this.g();
    }

    static /* synthetic */ Map b(e e2) {
        return e2.b;
    }
}

