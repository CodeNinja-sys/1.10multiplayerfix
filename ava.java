/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ava {
    private static final d a = org.apache.logging.log4j.c.c();
    private final List b = ov.a();
    private final List c = ov.a();
    private int d;
    private int e = -1;
    private final List f = ov.a();
    private int g = -1;

    public ava(ava ava2) {
        this();
        for (int i2 = 0; i2 < ava2.i(); ++i2) {
            this.a(ava2.c(i2));
        }
        this.d = ava2.g();
    }

    public ava() {
    }

    public void a() {
        this.b.clear();
        this.c.clear();
        this.e = -1;
        this.f.clear();
        this.g = -1;
        this.d = 0;
    }

    public ava a(ctq ctq2) {
        if (ctq2.f() && this.j()) {
            a.f("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.b.add(ctq2);
        this.c.add(this.d);
        switch (ctq2.b()) {
            case b: {
                this.g = this.d;
                break;
            }
            case c: {
                this.e = this.d;
                break;
            }
            case d: {
                this.f.add(ctq2.d(), this.d);
                break;
            }
        }
        this.d += ctq2.e();
        return this;
    }

    public boolean b() {
        return this.g >= 0;
    }

    public int c() {
        return this.g;
    }

    public boolean d() {
        return this.e >= 0;
    }

    public int e() {
        return this.e;
    }

    public boolean a(int n2) {
        return this.f.size() - 1 >= n2;
    }

    public int b(int n2) {
        return (Integer)this.f.get(n2);
    }

    public String toString() {
        String string = "format: " + this.b.size() + " elements: ";
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            string = string + ((ctq)this.b.get(i2)).toString();
            if (i2 == this.b.size() - 1) continue;
            string = string + " ";
        }
        return string;
    }

    private boolean j() {
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ctq ctq2 = (ctq)this.b.get(i2);
            if (!ctq2.f()) continue;
            return true;
        }
        return false;
    }

    public int f() {
        return this.g() / 4;
    }

    public int g() {
        return this.d;
    }

    public List h() {
        return this.b;
    }

    public int i() {
        return this.b.size();
    }

    public ctq c(int n2) {
        return (ctq)this.b.get(n2);
    }

    public int d(int n2) {
        return (Integer)this.c.get(n2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ava ava2 = (ava)object;
        if (this.d != ava2.d) {
            return false;
        }
        if (!this.b.equals(ava2.b)) {
            return false;
        }
        return this.c.equals(ava2.c);
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

