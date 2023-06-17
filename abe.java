/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class abe {
    private final float a;
    private final alj b;
    private final baz c;
    private final cpk d;
    private final bdl e;
    private final ahy f;
    private final Set g = aad.c();

    public abe(float f2, alj alj2, baz baz2, cpk cpk2, bdl bdl2, ahy ahy2) {
        this.a = f2;
        this.b = alj2;
        this.c = baz2;
        this.d = cpk2;
        this.e = bdl2;
        this.f = ahy2;
    }

    public cpk a() {
        return this.d;
    }

    public cpk b() {
        return this.e;
    }

    public cpk c() {
        return this.f == null ? null : this.f.b();
    }

    public boolean a(cse cse2) {
        return this.g.add(cse2);
    }

    public void b(cse cse2) {
        this.g.remove(cse2);
    }

    public baz d() {
        return this.c;
    }

    public float e() {
        return this.a;
    }

    public cpk a(bak bak2) {
        switch (bak2) {
            case a: {
                return this.a();
            }
            case b: {
                return this.c();
            }
            case c: {
                return this.b();
            }
        }
        return null;
    }
}

