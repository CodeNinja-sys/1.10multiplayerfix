/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public abstract class bds {
    private final UUID h;
    protected cbg a;
    protected float b;
    protected jd c;
    protected abo d;
    protected boolean e;
    protected boolean f;
    protected boolean g;

    public bds(UUID uUID, cbg cbg2, jd jd2, abo abo2) {
        this.h = uUID;
        this.a = cbg2;
        this.c = jd2;
        this.d = abo2;
        this.b = 1.0f;
    }

    public UUID a() {
        return this.h;
    }

    public cbg b() {
        return this.a;
    }

    public void a(cbg cbg2) {
        this.a = cbg2;
    }

    public float c() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public jd d() {
        return this.c;
    }

    public void a(jd jd2) {
        this.c = jd2;
    }

    public abo e() {
        return this.d;
    }

    public void a(abo abo2) {
        this.d = abo2;
    }

    public boolean f() {
        return this.e;
    }

    public bds a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public boolean g() {
        return this.f;
    }

    public bds b(boolean bl2) {
        this.f = bl2;
        return this;
    }

    public bds c(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public boolean h() {
        return this.g;
    }
}

