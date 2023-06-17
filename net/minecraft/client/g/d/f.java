/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.d;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.d.e;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f {
    private static final d a = org.apache.logging.log4j.c.c();
    private final List b = ov.a();
    private final List c = ov.a();
    private int d;
    private int e = -1;
    private final List f = ov.a();
    private int g = -1;

    public f(f f2) {
        this();
        for (int i2 = 0; i2 < f2.i(); ++i2) {
            this.a(f2.c(i2));
        }
        this.d = f2.g();
    }

    public f() {
    }

    public void a() {
        this.b.clear();
        this.c.clear();
        this.e = -1;
        this.f.clear();
        this.g = -1;
        this.d = 0;
    }

    public f a(e e2) {
        if (e2.f() && this.k()) {
            a.f("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.b.add(e2);
        this.c.add(this.d);
        switch (e2.b()) {
            case b: {
                this.g = this.d;
                break;
            }
            case c: {
                this.e = this.d;
                break;
            }
            case d: {
                this.f.add(e2.d(), this.d);
            }
        }
        this.d += e2.e();
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
            string = String.valueOf(string) + ((e)this.b.get(i2)).toString();
            if (i2 == this.b.size() - 1) continue;
            string = String.valueOf(string) + " ";
        }
        return string;
    }

    private boolean k() {
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            e e2 = (e)this.b.get(i2);
            if (!e2.f()) continue;
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

    public e c(int n2) {
        return (e)this.b.get(n2);
    }

    public int d(int n2) {
        return (Integer)this.c.get(n2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            f f2 = (f)object;
            return this.d != f2.d ? false : (!this.b.equals(f2.b) ? false : this.c.equals(f2.c));
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

