/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import com.a.a.d.ov;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.List;
import net.minecraft.e.a;
import net.minecraft.e.b;
import net.minecraft.e.e;
import net.minecraft.e.g;
import net.minecraft.e.l;
import net.minecraft.e.o;
import net.minecraft.e.r;
import net.minecraft.e.s;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class q
extends a {
    private static final d b = org.apache.logging.log4j.c.c();
    private List c = ov.a();
    private byte d = 0;

    @Override
    void a(DataOutput dataOutput) {
        this.d = this.c.isEmpty() ? (byte)0 : ((a)this.c.get(0)).a();
        dataOutput.writeByte(this.d);
        dataOutput.writeInt(this.c.size());
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            ((a)this.c.get(i2)).a(dataOutput);
        }
    }

    @Override
    void a(DataInput dataInput, int n2, l l2) {
        l2.a(296L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.d = dataInput.readByte();
        int n3 = dataInput.readInt();
        if (this.d == 0 && n3 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        l2.a(32L * (long)n3);
        this.c = ov.b(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            a a2 = net.minecraft.e.a.a(this.d);
            a2.a(dataInput, n2 + 1, l2);
            this.c.add(a2);
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

    public void a(a a2) {
        if (a2.a() == 0) {
            b.f("Invalid TagEnd added to ListTag");
        } else {
            if (this.d == 0) {
                this.d = a2.a();
            } else if (this.d != a2.a()) {
                b.f("Adding mismatching tag types to tag list");
                return;
            }
            this.c.add(a2);
        }
    }

    public void a(int n2, a a2) {
        if (a2.a() == 0) {
            b.f("Invalid TagEnd added to ListTag");
        } else if (n2 >= 0 && n2 < this.c.size()) {
            if (this.d == 0) {
                this.d = a2.a();
            } else if (this.d != a2.a()) {
                b.f("Adding mismatching tag types to tag list");
                return;
            }
            this.c.set(n2, a2);
        } else {
            b.f("index out of bounds to set tag in tag list");
        }
    }

    public a a(int n2) {
        return (a)this.c.remove(n2);
    }

    @Override
    public boolean c() {
        return this.c.isEmpty();
    }

    public e b(int n2) {
        a a2;
        if (n2 >= 0 && n2 < this.c.size() && (a2 = (a)this.c.get(n2)).a() == 10) {
            return (e)a2;
        }
        return new e();
    }

    public int c(int n2) {
        a a2;
        if (n2 >= 0 && n2 < this.c.size() && (a2 = (a)this.c.get(n2)).a() == 3) {
            return ((r)a2).g();
        }
        return 0;
    }

    public int[] d(int n2) {
        a a2;
        if (n2 >= 0 && n2 < this.c.size() && (a2 = (a)this.c.get(n2)).a() == 11) {
            return ((o)a2).f();
        }
        return new int[0];
    }

    public double e(int n2) {
        a a2;
        if (n2 >= 0 && n2 < this.c.size() && (a2 = (a)this.c.get(n2)).a() == 6) {
            return ((s)a2).j();
        }
        return 0.0;
    }

    public float f(int n2) {
        a a2;
        if (n2 >= 0 && n2 < this.c.size() && (a2 = (a)this.c.get(n2)).a() == 5) {
            return ((b)a2).k();
        }
        return 0.0f;
    }

    public String g(int n2) {
        if (n2 >= 0 && n2 < this.c.size()) {
            a a2 = (a)this.c.get(n2);
            return a2.a() == 8 ? a2.d() : a2.toString();
        }
        return "";
    }

    public a h(int n2) {
        return n2 >= 0 && n2 < this.c.size() ? (a)this.c.get(n2) : new g();
    }

    public int e() {
        return this.c.size();
    }

    public q f() {
        q q2 = new q();
        q2.d = this.d;
        for (a a2 : this.c) {
            a a3 = a2.b();
            q2.c.add(a3);
        }
        return q2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            q q2 = (q)object;
            if (this.d == q2.d) {
                return this.c.equals(q2.c);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    public int g() {
        return this.d;
    }

    @Override
    public /* synthetic */ a b() {
        return this.f();
    }
}

