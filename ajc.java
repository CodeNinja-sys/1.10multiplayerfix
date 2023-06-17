/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class ajc {
    public static final ajc a = new czh();
    private final boolean[] b = new boolean[kj.values().length];
    private final boolean[] c = new boolean[kj.values().length];
    private boolean d = true;
    private final List e = ov.a();
    private gy f = new gy();
    private bok g;

    public boolean a() {
        return this.d;
    }

    protected void a(kj kj2) {
        this.d = false;
        this.b[kj2.ordinal()] = true;
    }

    public boolean b(kj kj2) {
        return !this.b[kj2.ordinal()];
    }

    public void c(kj kj2) {
        this.c[kj2.ordinal()] = true;
    }

    public boolean d(kj kj2) {
        return this.c[kj2.ordinal()];
    }

    public List b() {
        return this.e;
    }

    public void a(bql bql2) {
        this.e.add(bql2);
    }

    public boolean a(bqk bqk2, bqk bqk3) {
        return this.f.a(bqk2, bqk3);
    }

    public void a(gy gy2) {
        this.f = gy2;
    }

    public bok c() {
        return this.g;
    }

    public void a(bok bok2) {
        this.g = bok2;
    }
}

