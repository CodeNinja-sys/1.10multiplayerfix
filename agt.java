/*
 * Decompiled with CFR 0.150.
 */
public class agt {
    private final ahy a;
    private final int b;
    private final float c;
    private final float d;
    private final String e;
    private final float f;

    public agt(ahy ahy2, int n2, float f2, float f3, String string, float f4) {
        this.a = ahy2;
        this.b = n2;
        this.c = f3;
        this.d = f2;
        this.e = string;
        this.f = f4;
    }

    public ahy a() {
        return this.a;
    }

    public float b() {
        return this.c;
    }

    public boolean c() {
        return this.a.b() instanceof bga;
    }

    public String d() {
        return this.e;
    }

    public cbg e() {
        return this.a().b() == null ? null : this.a().b().v();
    }

    public float f() {
        if (this.a == ahy.l) {
            return Float.MAX_VALUE;
        }
        return this.f;
    }
}

