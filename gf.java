/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gf
implements bzj {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public gf(List list, int n2, int n3, int n4, boolean bl2) {
        this.a = list;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = bl2;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a.size();
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    private cfo d(int n2) {
        return (cfo)this.a.get(n2);
    }

    public int a(int n2) {
        cfo cfo2 = this.d(n2);
        if (cfo2.a()) {
            return this.d;
        }
        return cfo2.b();
    }

    public boolean b(int n2) {
        return !((cfo)this.a.get(n2)).a();
    }

    public int c(int n2) {
        return ((cfo)this.a.get(n2)).c();
    }

    public Set f() {
        HashSet hashSet = aad.a();
        for (cfo cfo2 : this.a) {
            hashSet.add(cfo2.c());
        }
        return hashSet;
    }
}

