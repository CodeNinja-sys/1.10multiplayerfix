/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public abstract class aak
extends awm {
    protected final bxy a;
    protected final List b;

    public aak(bxy bxy2, int n2, int n3, List list) {
        super(bxy2, n2, n3, 32, n3 - 55 + 4, 36);
        this.a = bxy2;
        this.b = list;
        this.m = false;
        this.a(true, (int)((float)bxy2.k.a * 1.5f));
    }

    @Override
    protected void a(int n2, int n3, bha bha2) {
        String string = (Object)((Object)aug.t) + "" + (Object)((Object)aug.r) + this.l();
        this.a.k.a(string, n2 + this.d / 2 - this.a.k.a(string) / 2, Math.min(this.f + 3, n3), 0xFFFFFF);
    }

    protected abstract String l();

    public List m() {
        return this.b;
    }

    @Override
    protected int a() {
        return this.m().size();
    }

    public ro b(int n2) {
        return (ro)this.m().get(n2);
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    protected int c() {
        return this.h - 6;
    }

    @Override
    public /* synthetic */ ye c(int n2) {
        return this.b(n2);
    }
}

